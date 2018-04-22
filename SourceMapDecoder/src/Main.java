
import com.google.gson.JsonArray;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) throws IOException {
        String path = new File("").getAbsolutePath() + "/simple_programm.min.js.map";
        MyJsonParser parser = new MyJsonParser(path);
        JsonArray sources = parser.getSources();
        String[] mappings = parser.getMappings();
        JsonArray names = parser.getNames();
        int lastOutputIndex = 0;
        int lastInputIndex = 0;
        int lastInputColumn = 0;
        int lastFile = 0;
        int lastName = 0;
        for (String s : mappings) {
            Decoder decoder = new Decoder(s);
            ArrayList<Integer> res = decoder.getRes();
            lastOutputIndex += res.get(0);
            lastFile += res.get(1);
            lastInputColumn += res.get(2);
            lastInputIndex += res.get(3);
            if (res.size() == 5) {
                lastName += res.get(4);
            }
            System.out.println("Symbol " + lastOutputIndex + " maps to column " + lastInputColumn + ", symbol " + lastInputIndex + " in file " + sources.get(lastFile).getAsString() + " and belongs to " + names.get(lastName).getAsString());
        }

    }
}
