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
           /*int count = 1;
        Node node = new Node(number);
        if(head == null||index == 0){
            head = node;
        }else{

            Node n = head;
            while (n.next != null){
                count++;
                n = n.next;
                if(count == index){
                    node.next = n.next ;
                    n = node.next;
                }

            }

        }

*/


    }
    public void remove(int index){
        if(index == 0){
            firstNode = firstNode.nextNode;
        }
        else {
            Node n = firstNode;
            Node remove;
            for (int i = 0; i < index - 1; i++) {
                n = n.nextNode;
            }
            remove = n.nextNode;
            n.nextNode = remove.nextNode;

        }
    }
    public int get(int index){
        Node n = firstNode;
        int count = 0;
        while (n.nextNode != null){
            n = n.nextNode;
            count++;
            if(count == index){
                return n.number;
            }
        }
        return -1;
    }
    public void print(){
        Node n = firstNode;
        while (n.nextNode != null ){
            System.out.println(n.number);
            n = n.nextNode;

        }
        System.out.println(n.number);

    }
    public void clear(){

    }
    public int size(){
        Node n = firstNode;
        int count = 1;
        while(n.nextNode != null){
            n = n.nextNode;
            count++;
        }
        return count;

    }

    public boolean contains(int number){
        if(firstNode.number == number){
            return true;
        }
        Node n = firstNode;
        while (n.nextNode != null){
            n = n.nextNode;
            if(n.number == number){
                return true;
            }
        }
        return false;
    }

    public boolean empty(){
        return firstNode == null;
    }
}
