package assignment3;

import java.util.ArrayList;
import java.util.List;

public class subSets {
    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList();
        backtrack(res, 0, new ArrayList(), nums);
        return res;
    }

    private static void backtrack(List<List<Integer>> res, int index, List<Integer> curr, int[] nums){
        res.add(new ArrayList(curr));
        for(int i=index; i<nums.length; i++){
            curr.add(nums[i]);
            backtrack(res, i+1, curr, nums);
            curr.remove(curr.size()-1);
        }
    }

    public static void main(String[] args) {
        int[] nums= {1, 2, 3};
        System.out.println(subsets(nums));
    }
}
