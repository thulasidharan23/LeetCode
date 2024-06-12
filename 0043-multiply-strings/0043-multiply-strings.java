import java.math.*;
class Solution {
    public String multiply(String num1, String num2) {
        BigInteger n=new BigInteger(num1);
       BigInteger m=new BigInteger(num2);
        BigInteger ans=n.multiply(m);
        String a=ans.toString();
        return a;
    }
}