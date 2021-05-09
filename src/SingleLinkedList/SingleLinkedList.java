package SingleLinkedList;

public class SingleLinkedList {

    Node firstNode;

    public void add(int number){
        Node node = new Node(number);
        if(firstNode == null){
            firstNode = node;
        }
        else{
            Node n = firstNode;
            while (n.nextNode != null){
                n = n.nextNode;
            }
            n.nextNode = node;
        }

    }
    public void add(int index,int number){


    }
    public void remove(int index){

    }
    public int get(int index){
        return -1;
    }
    public void print(){

    }
    public void clear(){

    }
    public int size(){
        return -1;
    }
    public boolean contains(int number){
        return false;
    }
    public boolean empty(){
        return firstNode == null;
    }
}
