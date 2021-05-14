package Stack;

public class Stack {
    int[] numbers;
    public void push(int number) {
        if (numbers == null) {
            numbers = new int[1];
            numbers[0] = number;

        }else {
            int[] temp = new int[numbers.length+1];
            for (int i = 0; i <numbers.length ; i++) {
                temp[i] = numbers[i];

            }
            temp[temp.length-1] = number;
            numbers = temp;
        }

    }

    public void pop() {
        int[] temp = new int[numbers.length-1];
        for (int i = 0; i < temp.length ; i++) {
            temp[i] = numbers[i];
        }
        numbers = temp;
    }
    public boolean empty() {
/*
        if (numbers == null) {
            return true;
        } else {
            return false;
        }
*/      return numbers == null ? true : false;

    }
    public int peek() {
        if (empty()) {
            System.err.println("array is empty");

        }
         return numbers[numbers.length-1];

    }
    public void clear(){
        numbers = null;
    }
    public void print(){
        if (numbers == null) {
            System.out.print("[]");
            return;
        }
            System.out.print("[");
            for (int i = numbers.length-1; i >=0; i--) {
                System.out.print(numbers[i]+",");
            }
            System.out.println("\b]");


    }
    public boolean contains(int number) {
        if(empty()) {
            return false;
        }else{
            for (int i = 0; i <numbers.length ; i++) {
                if(numbers[i]==number){
                    return true;
                }

            }
            return false;
        }
    }
    public int size(){
        return numbers == null ? 0 : numbers.length;
    }

}
