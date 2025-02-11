package linkedList;

public class ChainNode {
    ChainNode next;
    Object data;

    ChainNode(Object d){
        this.data = d;
        this.next = null;
    }
    ChainNode(Object d, ChainNode n){
        this.data = d;
        this.next = n;
    }
}
