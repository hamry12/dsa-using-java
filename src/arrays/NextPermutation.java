package arrays;

import java.util.ArrayList;
import java.util.List;

public class NextPermutation {
    public static void main(String[] args) {
        int[] numArray= {1,2,3};
        List<List<Integer>> permute = findPermute(numArray);
        System.out.println("Permute\t"+permute);
    }

    private static List<List<Integer>> findPermute(int[] numArray) {
        List<List<Integer>> arrayList= new ArrayList<>();
        backTrack(arrayList, new ArrayList<>(), numArray);
        return arrayList;
    }

    private static void backTrack(List<List<Integer>> arrayList, List<Integer>tempList, int[] numArray) {
        System.out.println("Temp List\t"+tempList);
        if(tempList.size() == numArray.length){
            arrayList.add(new ArrayList<>(tempList));
            System.out.println("Nested Array List\t"+arrayList);
            return;
        }
        for (int i : numArray) {
            if (tempList.contains(i))
                continue;
            System.out.println("Element to be pushed in temp list\t"+i);
            tempList.add(i);
            backTrack(arrayList, tempList, numArray);
            tempList.remove(tempList.size() - 1);
        }

    }
}
