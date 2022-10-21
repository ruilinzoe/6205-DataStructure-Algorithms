package assignment3;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {
    private static List<String> result= new ArrayList<>();
    public static List<String> generateParenthesis(int n) {
        if(n <= 0) return result;
        dfs("", n, n);
        return result;
    }
    private static void dfs(String cur, int left, int right){
        if(left == 0 && right == 0) result.add(new String(cur));
        else{
            if(left > 0) dfs(cur + "(", left - 1, right);
            if(right > left) dfs(cur + ")", left, right - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println(generateParenthesis(2));
    }
}
