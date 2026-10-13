
package com.Array;

public class SecondLArge {
    public static void main(String[] args) {

        int[] arr = {10, 20, 50, 69, 98, 76};

        int flar = Integer.MIN_VALUE;
        int slar = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > flar) {
                slar = flar;
                flar = arr[i];
            }
            else if (arr[i] > slar && arr[i] < flar) {
                slar = arr[i];
            }
        }

        System.out.println("Second Large: " + slar);
    }
}
