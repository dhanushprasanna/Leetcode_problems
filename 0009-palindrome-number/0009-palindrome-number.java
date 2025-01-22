class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;
        }
        int rev=0;
        int a=x;
        while(x!=0)
        {
            int d=x%10;
            rev=rev*10+d;
            int rem=x/10;
            x=rem;
        }
            if(a==rev)
            {
                return true;
            }

            else
            {
                return false;
            }
        
    }
}