package midterm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class startIndex {

    public static int[] findStart(int[] first, int[] second){

        if (first==null || second==null) return null;
        if (second.length>first.length) return null;
        int[] res=new int[second.length];
        Arrays.fill(res, -1);
        for (int i=0; i<second.length; i++){
            for (int j=0; j<first.length; j++){
                if (first[j]==second[i]) {
                    res[i]=j;
                    break;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] first=new int[]{1,1,2,3,3,8};
        int[] second=new int[] {3,4,1,3,3};
        System.out.println(Arrays.toString(findStart(first, second)));
    }

    //time is O(n^2)
    //there is two for loop
}
