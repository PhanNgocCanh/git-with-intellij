package general.static_key;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public String licenseKeyFormatting(String s, int k) {
        int firstIndex = s.indexOf("-");
        String firstGroup = s.substring(0,firstIndex)+"-";
        String secondGroup = s.substring(firstIndex+1);
        List<String> list = new ArrayList<>();
        for(int i = 0;i < secondGroup.length();i++) list.add(secondGroup.charAt(i)+"");
        list.removeIf(n->n.equals("-"));
        StringBuilder builder = new StringBuilder();
        int total = 0;
        for(int i = 0 ;i < list.size();i++){
            if(total<k){
                builder.append(list.get(i).toUpperCase());
                total++;
            }else{
                if(i!=list.size()){
                    builder.append("-"+list.get(i).toUpperCase());
                }else{
                    builder.append(list.get(i).toUpperCase());
                }
                total = 0;
            }
        }
        return firstGroup+builder.toString();

    }
}
