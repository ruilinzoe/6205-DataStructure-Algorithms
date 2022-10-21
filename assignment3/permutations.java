package assignment3;

import java.util.ArrayList;
import java.util.List;

public class permutations {
    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        backtrack(nums, new ArrayList(), res);
        return res;
    }

    private static void backtrack(int[] nums, List<Integer> curr, List<List<Integer>> res){
        if(curr.size()==nums.length){
            res.add(new ArrayList(curr));
            return;
        }
        for(int num: nums){
            if(curr.contains(num)){
                continue;
            }
            curr.add(num);
            backtrack(nums, curr, res);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums={1,2,3};
        System.out.println(permute(nums));
    }
}
