package com.volkodav4ik;

import java.util.Arrays;

public class MyList {

    private static int[] arr;

    public MyList(int[] arr) {
        this.arr = arr;
    }

    public static int get(int index) {
        int tmp = 0;
        try {
            tmp = arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
        return tmp;
    }

    public static void set(int index, int value) {
        try {
            arr[index] = value;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
    }

    public static void add(int value) {
        int[] tmp = new int[arr.length + 1];
        System.arraycopy(arr, 0, tmp, 0, arr.length);
        tmp[tmp.length - 1] = value;
        arr = tmp;
    }

    public static void clear() {
        int[] tmp = new int[0];
        arr = tmp;
    }

    public static int size() {
        return arr.length;
    }

    public static boolean isEmpty() {
        return size() == 0;
    }

    public static void addPosition(int position, int value) {
        try {
            int[] tmp = new int[arr.length + 1];
            System.arraycopy(arr, 0, tmp, 0, position);
            tmp[position] = value;
            System.arraycopy(arr, position, tmp, position + 1, arr.length - position);
            arr = tmp;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
    }

    public static void remove(int index) {
        try {
            int[] tmp = new int[arr.length - 1];
            System.arraycopy(arr, 0, tmp, 0, index);
            System.arraycopy(arr, index + 1, tmp, index, arr.length - index - 2);
            arr = tmp;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds.");
        }
    }

    public static void removeByValue(int value) {
        Integer tmp = null;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                tmp = i;
                break;
            }
        }
        try {
            remove(tmp);
        } catch (Exception e) {
            System.out.println("There is no value " + value + " in this array");
        }
    }

    public static int[] toArray() {
        return arr;
    }

    public static void sort() {
        Arrays.sort(arr);
    }

    @Override

    public String toString() {
        return "MyList{" +
                "arr=" + Arrays.toString(arr) +
                '}';
    }
}
