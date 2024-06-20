import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result=new ArrayList<>();
        String sep="\\"+separator;
        for (String word:words)
        {
            String[]arr=word.split(sep);
            for(String str:arr)
            {
                if(str!=""){
                    result.add(str);
                }
            }
        }
        return result;
    }
}
