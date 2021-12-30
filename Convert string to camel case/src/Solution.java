class Solution {

    static String toCamelCase(String s){

        StringBuilder sb = new StringBuilder();

        boolean isDash = false;

        for (int i = 0; i < s.length(); i++) {

            char temp = s.charAt(i);

            if (temp == '-' || temp == '_') {
                isDash = true;
            } else if (isDash) {
                sb.append(Character.toUpperCase(temp));
                isDash = false;
            } else {
                sb.append(temp);
            }
        }
        return sb.toString();
    }
}
