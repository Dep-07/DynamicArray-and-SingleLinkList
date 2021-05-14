package Dequeue;

import Queue.Queue;

public class Dequeue extends Queue {

    public void deQueueFront(){
        if(empty()){
            System.err.println("Cant pop up from empty array");
            return;

        }else if(numbers.length ==1) {
            numbers =null;
            return;
        }
        int[] temp = new int[numbers.length-1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = numbers[i];
        }
        numbers=temp;

    }
    public void enQueueRear(int number){
        if (empty()){
            numbers = new int[1];
            numbers[0]=number;

        }else {
            int[] temp = new int[numbers.length+1];
            temp[0] = number;
            for (int i = 1; i <=numbers.length ; i++) {
                temp[i]= numbers[i-1];
            }
            numbers =temp;

        }


    }
}
