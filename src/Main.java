import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        list = findPositive(list);
        list = findEven(list);
        Collections.sort(list);
        System.out.println(list.toString());
    }
    public static List<Integer> findPositive(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>();
        for (int i : list) {
            if (i > 0) {
                integerList.add(i);
            }
        }
        return integerList;
    }

    public static List<Integer> findEven(List<Integer> list) {
        List<Integer> integerList = new ArrayList<>();
        for (int i : list) {
            if (i % 2 == 0) {
                integerList.add(i);
            }
        }
        return integerList;
    }
}