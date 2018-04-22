import java.util.ArrayList;

public class Decoder {
    static String encoding = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    private String data;

    static byte decode64(char c) {
        return (byte) encoding.indexOf((byte) c);
    }

    ArrayList<Integer> res;

    private void decode() {
        // BASE64 decoding
        String binary = "";
        for (char c : data.toCharArray()) {
            binary += String.format("%6s", Integer.toBinaryString(decode64(c))).replace(' ', '0');
        }
        // VLQ decoding
        res = new ArrayList<>();
        int ptr = 0;
        byte sign;
        while (ptr != binary.length()) {
            String str = "";
            str += binary.substring(ptr + 1, ptr + 5);
            sign = (byte) binary.charAt(ptr + 5);
            while (binary.charAt(ptr) == '1') {
                ptr += 6;
                str = binary.substring(ptr + 1, ptr + 6) + str;
            }
            str = sign == '1' ? '-' + str : str;
            res.add(Integer.parseInt(str, 2));
            ptr += 6;
        }

    }

    public Decoder(String s) {
        data = s;
    }

    public ArrayList<Integer> getRes () {
        decode();
        return res;
    }
}
