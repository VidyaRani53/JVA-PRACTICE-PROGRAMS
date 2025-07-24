package practivejava;

import java.util.Arrays;
public class Answerit {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int i = 0;
        for (int num : arr) {
            arr[i++] = arr[num % arr.length] * 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}


