class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;

        for(int i = 0; i < s.length(); i++) {
            for(int step = i + 1; step <= s.length(); step++) {

                String str = s.substring(i, step);

                if(isbalanced(str)) {
                    count++;
                    i = step - 1; 
                    break;
                }
            }
        }
        return count;
    }

    boolean isbalanced(String s) {
        int R = 0;
        int L = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R') {
                R++;
            }
            else if(s.charAt(i) == 'L') {
                L++;
            }
        }
        return R == L;
    }
}
