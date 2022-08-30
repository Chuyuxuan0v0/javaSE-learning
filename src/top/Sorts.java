package src.top;

import jdk.nashorn.internal.objects.NativeJSON;

public class Sorts {

    public static void main(String[] args) {
        int[] arrs = {5, 65, 34, 235, 76, 23, 4, 56, 8, 89, 91};
        BubbleSort(arrs);

        for (int arr : arrs) {
            System.out.print(arr + " ,");
        }

    }

    public static void BubbleSort(int... arr) {
        // 数组多长，循环多少次
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    ;

}
