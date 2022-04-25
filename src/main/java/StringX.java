public class StringX {
    public String stringX(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != 'x' || i == 0 || i == str.length() - 1) {
                result += str.charAt(i);
            }
        }
        return result;
    }


}
