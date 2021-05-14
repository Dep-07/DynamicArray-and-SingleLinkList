package Queue;

import jdk.internal.dynalink.beans.StaticClass;

public class Queue {

    protected int[] numbers;

    public void enQueue(int number){

        if (empty()) {
            numbers = new int[1];
            numbers[0] = number;
        }else {
            int[] temp = new int[numbers.length +1];
            for (int i = 0; i < numbers.length ; i++) {
                temp[i] = numbers[i];
            }
            temp[temp.length-1]=number;
            numbers = temp;
        }

    }

    public void dQueue(){
        if (empty()) {
            System.err.println("Array is empty");
        }else {
            int[] temp = new int[numbers.length-1];
            for (int i = 0; i < temp.length; i++) {
                temp[i]= numbers[i+1];

            }
            numbers = temp;

        }

    }
    public int peek(){
        if (empty()) {
            System.err.println("Array is empty");
        }
            return numbers[numbers.length-1];

    }
    public void print(){
        if (empty()){
            System.out.println("[]");
        }else {
            System.out.print("[");
            for (int i = 0; i < numbers.length ; i++) {
                System.out.print(numbers[i]+", ");
            }
            System.out.println("\b\b]");
        }

    }
    public boolean contain(int number){
        if(empty()){
            return false;
        }
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]==number){
                return true;
            }
        }
        return false;
    }
    public boolean empty(){
        return numbers == null ? true : false;
    }
    public int size(){
        return numbers == null ? 0 : numbers.length;

    }
    public void clear(){
        numbers = null;

    }

}
