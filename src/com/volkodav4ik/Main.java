package com.volkodav4ik;

public class Main {

    public static void main(String[] args) {

        MyList array = new MyList(new int[]{4, 5, 7, 124, 151, 123, 12});
        System.out.println(array);

        int index = MyList.get(3);
        System.out.println(index);

        MyList.set(2, 66);
        System.out.println(array);

        MyList.add(144);
        System.out.println(array);

        MyList.clear();
        System.out.println(array);

        MyList nextArr = new MyList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0});
        System.out.println(nextArr);
        int size = MyList.size();
        System.out.println(size);

        System.out.println(MyList.isEmpty());

        MyList.addPosition(2, 55);
        System.out.println(nextArr);

        MyList.remove(2);
        System.out.println(nextArr);

        MyList.removeByValue(50);
        System.out.println(nextArr);

        MyList newArr = new MyList(MyList.toArray());
        System.out.println(newArr);

        MyList unsortArr = new MyList(new int[]{125, -124, 1, 7, 2, 0, -2, 556});
        MyList.sort();
        System.out.println(unsortArr);
    }
}
