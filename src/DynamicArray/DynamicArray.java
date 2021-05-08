package DynamicArray;

import java.util.Arrays;

public class DynamicArray {
    int[] numbers;

       public void add(int number){
           if(numbers==null){
               numbers = new int[1];
               numbers[0] = number;
           }else{
               int[] temp = new int[numbers.length +1];
               for (int i = 0; i <numbers.length ; i++) {
                   temp[i] = numbers[i];
               }
               temp[temp.length-1] = number;
               numbers = temp;
           }

       }
       public void add(int index,int number){
           if(index>size()||index<0){
               throw new RuntimeException("Array index is invalid");
           }
           int[] temp = new int[numbers.length+1];
           for (int i = 0; i <index; i++) {
               temp[i] = numbers[i];
           }
           temp[index] = number;
           for (int i = index+1; i <temp.length ; i++) {
               temp[i] = numbers[i-1];
           }
           numbers = temp;
       }
       public void remove(int index){
           if(empty()){
               throw new RuntimeException("Invalid array Index");
           }
           if(index<0 || index>=size()){
               throw new RuntimeException("Array not in the range");
           }
           int[] temp = new int[numbers.length-1];
           for (int i = 0; i < index; i++) {
               temp[i] = numbers[i];
           }
           temp[index]= numbers[index +1];
           for (int i =index+1; i < temp.length ; i++) {
               temp[i] = numbers[i+1];
           }
           numbers = temp;


       }
       public int get(int index){
           if(index>= size() || index <0){
               throw new RuntimeException("Array is not in the range");
           }
           if(empty()){
               throw  new RuntimeException("Array is empty");
           }
           return numbers[index];
       }
       public void print() {
           System.out.println(empty() ? "[]" : Arrays.toString(numbers));
       }
       public void clear(){
              numbers = null;
       }
       public int size(){

           return (numbers == null) ? 0 : numbers.length;
       }
       public boolean contains(int number){
           if(empty()){
               return false;
           }
           for (int i = 0; i <numbers.length ; i++) {
               if(numbers[i]==number){
                   return true;
               }
           }
           return false;
       }
       public boolean empty(){
           return numbers == null;
       }
}
