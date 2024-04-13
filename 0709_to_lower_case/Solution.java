class Solution {
    public String toLowerCase(String s) {
        StringBuilder ans = new StringBuilder();

        for(char c : s.toCharArray()){
            if(c >= 'A' && c <= 'Z') c = (char) ((int) c + 32);
            ans.append(c);
        }

        return ans.toString();
    }
}
