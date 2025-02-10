public class CircularQueue {

    int arr[];
    int front;
    int rear;
    int capacity;

    CircularQueue(int size){
        capacity = size;
        front =-1;
        rear = -1;
        arr = new int[size];
    }
    Boolean isEmpty(){
        if(front == -1){
            return true;
        }
        else
            return false;
    }
    Boolean isFull(){
        if(front == 0 && rear == capacity-1){
            return true;
        }
        else if(rear+1 == front){
            return true;
        }
        else
            return false;
    }
    void enqueue(int x){
        if(isFull()){
            System.out.println("Queue is full");
        }
        else{
            if(front == -1){
                front = 0;
            }
            rear = (rear+1)%capacity;
            arr[rear] = x;
            System.out.println("Enqueued "+x);
        }
    }
    void dequeue(){
        int element = 0;
        if (isEmpty()) {
            System.out.println("Queue is empty");
        }
        else{
            element = arr[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }
            else{
                front = (front+1)%capacity;
                
            }
            System.out.println("Removed "+element);
        }
       
        
    }
    void print(){
        int i;
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        else{
            for(i=front;i!=rear;i=(i+1)%capacity){
                System.out.print(arr[i]+" ");
            }
            System.out.println(arr[i]);
        }
        
    }

    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(4);

        q.enqueue(12);
        q.enqueue(12);
        q.enqueue(12);
        q.enqueue(12);
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.print();
    }
    
}
