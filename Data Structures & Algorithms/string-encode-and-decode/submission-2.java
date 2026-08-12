class Solution {

    public String encode(List<String> strs) {
        String encoded_string = "";
        for(String str: strs)
            encoded_string += str.length() + ":" + str;
        return encoded_string;
    }

    public List<String> decode(String str) {
        List<String> decoded_strs = new ArrayList();
        System.out.println(str);
        for(int i = 0; i < str.length(); i++) {
            int delim = str.indexOf(":", i);
            int length = Integer.parseInt(str.substring(i, delim));
            decoded_strs.add(str.substring(delim + 1, delim + length + 1));
            i = delim + length;
        }
        return decoded_strs;
    }
}
