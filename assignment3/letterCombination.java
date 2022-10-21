package assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class letterCombination {
    private static List<String> res=new ArrayList();
    private static Map<Character, String> map = Map.of(
            '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
            '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    public static List<String> letterCombinations(String digits) {
        if(digits.length()==0) return res;
        helper(new StringBuilder(), 0, digits);
        return res;
    }

    private static void helper(StringBuilder sb, int index, String digits){
        if(sb.length()==digits.length()){
            res.add(sb.toString());
            return;
        }

        String possibleC=map.get(digits.charAt(index));
        for(char c: possibleC.toCharArray()){
            sb.append(c);
            helper(sb, index+1, digits);
            sb.deleteCharAt(sb.length()-1);
        }
    }

    public static void main(String[] args) {
        String digits="45";
        System.out.println(letterCombinations(digits));
    }
}
