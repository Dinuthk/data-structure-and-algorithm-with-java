public class Queue {
    int arr[];
    int front;
    int rear;
    int capacity;
    int noOfItem;

    Queue(int size){
        capacity = size;
        front = 0;
        rear =-1;
        arr= new int[size];
    }

    Boolean isFull(){
        return rear+1 ==capacity;
    }
    Boolean isEmpty(){
        return rear<front;
    }
    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            rear++;
            arr[rear] = x;
            System.out.println("Enqueued "+x);
        }
    }
    void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            front++;
            System.out.println("Removed "+arr[front-1]);
        }
    }
    void print(){
        for(int i=front;i<rear+1;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] arg){
        Queue q =new Queue(4);

        q.enqueue(12);
        q.enqueue(12);
        q.enqueue(12);
        q.enqueue(12);
        q.print();
    }
}
