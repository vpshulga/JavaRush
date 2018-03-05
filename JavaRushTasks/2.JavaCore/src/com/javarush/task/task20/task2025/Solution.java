package com.javarush.task.task20.task2025;

import java.util.*;

/*
Алгоритмы-числа
*/


public class Solution {
    private static int N;
    private static int[] digitsMultiSet;
    private static int[] testMultiSet;

    private static List<Long> results;
    private static long maxPow;
    private static long minPow;

    private static long[][] pows;

    private static void genPows(int N) {
        if (N > 20) throw new IllegalArgumentException();
        pows = new long[10][N + 1];
        for (int i = 0; i < pows.length; i++) {
            long p = 1;
            for (int j = 0; j < pows[i].length; j++) {
                pows[i][j] = p;
                p *= i;
            }
        }
    }

    private static boolean check(long pow) {
        if (pow >= maxPow) return false;
        if (pow < minPow) return false;

        for (int i = 0; i < 10; i++) {
            testMultiSet[i] = 0;
        }

        while (pow > 0) {
            int i = (int) (pow % 10);
            testMultiSet[i]++;
            if (testMultiSet[i] > digitsMultiSet[i]) return false;
            pow = pow / 10;
        }

        for (int i = 0; i < 10; i++) {
            if (testMultiSet[i] != digitsMultiSet[i]) return false;
        }

        return true;
    }

    private static void search(int digit, int unused, long pow) {
        if (pow >= maxPow) return;

        if (digit == -1) {
            if (check(pow)) results.add(pow);
            return;
        }

        if (digit == 0) {
            digitsMultiSet[digit] = unused;
            search(digit - 1, 0, pow + unused * pows[digit][N]);
        } else {
            // Check if we can generate more than minimum
            if (pow + unused * pows[digit][N] < minPow) return;

            long p = pow;
            for (int i = 0; i <= unused; i++) {
                digitsMultiSet[digit] = i;
                search(digit - 1, unused - i, p);
                if (i != unused) {
                    p += pows[digit][N];
                    // Check maximum and break the loop - doesn't help
                    // if (p >= maxPow) break;
                }
            }
        }
    }

    public static List<Long> generate(int maxN) {
        if (maxN > 20) throw new IllegalArgumentException();

        genPows(maxN);
        results = new ArrayList<>();
        digitsMultiSet = new int[10];
        testMultiSet = new int[10];

        for (N = 1; N <= maxN; N++) {
            minPow = (long) Math.pow(10, N - 1);
            maxPow = (long) Math.pow(10, N);

            search(9, N, 0);
        }

        Collections.sort(results);

        return results;
    }

    public static long[] getNumbers(long N) {
        int count = 0;
        final long M = N;
        while (N > 0){
            N = N / 10;
            count++;
        }
        List<Long> list = generate(count);

        System.out.println(list);
        list.removeIf(x -> x >= M);
        long[] result = new long[list.size()];
        for (int i = 0; i < result.length; i++) {
                result[i] = list.get(i);
        }


        return result;
    }

    public static void main(String[] args) {
        long[] arr = getNumbers(Long.MAX_VALUE);
        System.out.println(Arrays.toString(arr));


    }
}


//public class Solution {
//    public static long[] getNumbers(long N) {
//        long[] result;
//        int count = 0;
//        ArrayList<Long> list = new ArrayList<>();
//        for (long i = 0; i < N; i++) {
//            if (sum(getDid(i)) == i){
//                list.add(i);
//                count++;
//            }
//        }
//        result = new long[count];
//
//        for (int i = 0; i < result.length; i++) {
//            result[i] = list.get(i);
//        }
//
//
//
//        return result;
//    }
//
//
//    static int[] getDid(long N){
//        int count = 0;
//        long M = N;
//        while (M > 0){
//            M = M / 10;
//            count++;
//        }
//        int[] arr = new int[count];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] =(int) N % 10;
//            N = N /10;
//        }
//        return arr;
//    }
//
//    static long sum(int[] arr){
//        long sum = 0;
//        for (int i : arr) {
//            sum += Math.pow(i, arr.length);
//        }
//        return sum;
//    }
//
//
//
//    public static void main(String[] args) {
//        long[] arr = getNumbers(9999999);
//        for (long l : arr) {
//            System.out.println(l);
//        }
//    }
//}
