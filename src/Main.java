import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        getNumbers(intList);
    }

    private static void getNumbers(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 && list.get(i) % 2 == 0) newList.add(list.get(i));
        }
        int[] result = new int[newList.size()];
        for (int i = 0; i < newList.size(); i++) {
            result[i] = newList.get(i);
        }
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length - 1; j++) {
                if (result[j] > result[j + 1]) {
                    int swap = result[j + 1];
                    result[j + 1] = result[j];
                    result[j] = swap;
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
