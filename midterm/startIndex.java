package midterm;

import java.util.ArrayList;
import java.util.List;

public class startIndex {
    static List<Integer> list=new ArrayList<>();
    public static List<Integer> findStart(int[] first, int[] second){

        if (first==null || second==null) return null;
        if (second.length>first.length) return null;
        for (int i=0; i<second.length; i++){
            for (int j=0; j<first.length; j++){
                if (first[j]==second[i]){
                    list.add(i, j);
                }if (first[j]!=second[i] && j== first.length-1){
                    list.add(i, -1);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] first=new int[]{1,2,3};
        int[] second=new int[] {3,4,1};
        System.out.printf((findStart(first, second).toString()));
    }
}
