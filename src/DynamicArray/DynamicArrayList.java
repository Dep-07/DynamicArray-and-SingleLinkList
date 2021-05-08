package DynamicArray;

import DynamicArray.DynamicArray;

public class DynamicArrayList {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray();
       /* dynamicArray.add(10);
        dynamicArray.add(20);
        dynamicArray.add(30);
        dynamicArray.add(40);
        dynamicArray.add(50);
        dynamicArray.print();*/
        dynamicArray.add(3,100);
        dynamicArray.add(4,20);
        dynamicArray.print();
       dynamicArray.remove(2);

       dynamicArray.print();
        System.out.println(dynamicArray.get(3));


    }



}
