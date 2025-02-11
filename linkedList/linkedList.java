package linkedList;

public class linkedList {
    int size;
    ChainNode head;

    linkedList() {
        this.size = 0;
        this.head = null;
    }

    public Boolean isEmpty() {
        return head == null;
    }

    public int size() {
        return size;
    }

    public void daddFirst(Object ele) {
        if (isEmpty()) {
            head = new ChainNode(ele);
        } else {
            head = new ChainNode(ele, head);
        }
        size++;
    }

    public void addLast(Object ele) {
        if (isEmpty()) {
            head = new ChainNode(ele);
        } else {
            ChainNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = new ChainNode(ele);
        }
        size++;
    }

    public void removeFirst() {
        Object rmData = null;
        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            rmData = head.data;
            head = head.next;
            size--;
            System.out.println("Removed " + rmData);
        }
    }
    public void removeLast() {
        Object rmData = null;
        if(isEmpty()){
            System.out.println("List is empty");
        }
        else{
            if(size==1){
                rmData = head.data;
                head = null;
                size--;
            }
            else{
                ChainNode temp = head;
                while(temp.next.next!=null){
                    temp = temp.next;
                }
                rmData = temp.next.data;
                temp.next = null;
                size--;
            }
            size--;
            System.out.println("Removed "+rmData);
        }
    }

}
