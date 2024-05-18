class Solution {
    public boolean isPalindrome(int x) {
        int num=x;
        int rev=0;
        int rem=0;

        while(x>0){
        rem=x%10;
        rev=rev*10+rem;
        x=x/10;
        
    }
    if(num==rev)
    return true;
    else
    return false;
}

}