package org.test;

/**
 * @author jianghm
 * @date 2015/4/17
 */
public class Soon {

    public static void quicksort(int n[], int left, int right) {
        int dp;
        if (left < right) {
            dp = partition(n, left, right);
            quicksort(n, left, dp - 1);
            quicksort(n, dp + 1, right);
        }
    }

    public static int partition(int n[], int left, int right) {
        int pivot = n[left];
        while (left < right) {
            while (left < right && n[right] >= pivot)
                right--;
            if (left < right)
                n[left++] = n[right];
            while (left < right && n[left] <= pivot)
                left++;
            if (left < right)
                n[right--] = n[left];
        }
        n[left] = pivot;
        return left;
    }

    public static void main(String[] args) {
        int[] data = {2, 1, 3, 5, 4, 7, 6};
        quicksort(data, 0, 6);
        for (int a : data) {
            System.out.println(a);
        }
    }
}
