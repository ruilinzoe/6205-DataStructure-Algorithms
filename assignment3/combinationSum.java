package assignment3;

import java.util.ArrayList;
import java.util.List;

public class combinationSum {
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList();
        backtrack(candidates, 0, target, new ArrayList(), result);
        return result;
    }

    private static void backtrack(int[] candid, int start, int target, List<Integer> list, List<List<Integer>> result){
        if(target<0){
            return ;
        }
        if(target==0){
            result.add(new ArrayList(list));
        }
        for(int i=start; i<candid.length; i++){
            list.add(candid[i]);
            backtrack(candid, i, target-candid[i], list, result);
            list.remove(list.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={2,3,6,7};
        int k=7;
        System.out.println(combinationSum(nums, k));
    }

}
