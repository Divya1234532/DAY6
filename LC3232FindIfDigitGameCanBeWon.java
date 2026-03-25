class Solution {
    public boolean canAliceWin(int[] nums) {
        int al_single=0;
        int al_double=0;
        int bob=0;
        for(int n:nums)
        {
            if(n>=10 && n<=99 || n<=-10 && n>=-99)
            {
                al_double+=n;
            }
            else if(n<=9&&n>=-9)
            {
                al_single+=n;
            }
            else
            {
                bob+=n;
            }
        }
        int max=Math.max(al_single,al_double);
        bob+=(al_single+al_double)-max;
        return max>bob;
        
    }
}
