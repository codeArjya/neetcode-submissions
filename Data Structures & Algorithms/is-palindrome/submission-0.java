class Solution {
    public boolean isPalindrome(String s) {
        String concat = "";
        for(char c: s.toCharArray()) {
            if(Character.isLetterOrDigit(c))
                concat += Character.toLowerCase(c);
        }

        int back = concat.length() - 1;
        for(int i = 0; i <= back; i++) {
            if(concat.charAt(i) != concat.charAt(back))
                return false;
            back--;
        }
        return true;
    }
}
