/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
    int srt=1;
    int end=n;
    while(srt<end){
      int mid=srt+(end-srt)/2;
      if(isBadVersion(mid))
        end=mid;
      else
        srt=mid+1;
        }
    return srt;
    }
}