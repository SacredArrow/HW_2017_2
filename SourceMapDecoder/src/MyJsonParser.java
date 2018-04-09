import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonPrimitive;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

public class MyJsonParser {
    private JsonArray names;
    private JsonArray sources;
    private String[] mappings;

    public JsonArray getNames() {
        return names;
    }

    public JsonArray getSources() {
        return sources;
    }

    public String[] getMappings() {
        return mappings;
    }

    static String readFile(String path, Charset encoding) throws IOException {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }

    public MyJsonParser(String path) throws IOException {
        String content = readFile(path, Charset.defaultCharset());
        JsonParser parser = new JsonParser();
        JsonObject mainObject = parser.parse(content).getAsJsonObject();
        names = mainObject.getAsJsonArray("names");
        sources = mainObject.getAsJsonArray("sources");
        JsonPrimitive pItem = mainObject.getAsJsonPrimitive("mappings");
        mappings = pItem.getAsString().split(",");

    }

}
