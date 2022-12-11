package finalexam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class anagram {
    public static List<List<String>> anagrams(String[] strs) {
        List<List<String>> res=new ArrayList();
        HashMap<String, List<String>> map=new HashMap();
        for(String str: strs){
            char[] c=str.toCharArray();
            Arrays.sort(c);
            String sorted=new String(c);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList());
            }
            map.get(sorted).add(str);
        }
        res.addAll(map.values());
        return res;
    }

    public static void main(String[] args) {
        String[] strs=new String[]{"app", "ppa", "ab", "ba"};
        System.out.println(anagrams(strs));
    }
    //Time:O(NKlogK) sorting used O(KLogK), K is the max length of string in strs[], N is length of strs[]
    //Space: O(NK) have used hashmap
}
