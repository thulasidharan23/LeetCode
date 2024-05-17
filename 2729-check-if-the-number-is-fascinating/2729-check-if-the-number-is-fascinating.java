class Solution {
  public boolean isFascinating(int n) {
    String s=Integer.toString(n)+Integer.toString(2*n)+Integer.toString(3*n);
    char ch[]=s.toCharArray();
    Arrays.sort(ch);
    return new String(ch).equals("123456789");
  }
}