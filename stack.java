public class stack {
    int arr[];
    int top;
    int capacity;
    stack(int size){
        arr = new int[size];
        top = -1;
        capacity = size;
    }
    Boolean isFull(){
        return top+1==capacity;
    }
    Boolean isEmpty(){
        return top==-1;
    }
    void push(int x){
        if (isFull()) {
            System.out.println("Stack is full");
        }
        else{
            top++;
            arr[top] = x;
            System.out.println("Pushed "+x);
        }
    }
    void pop(){
        if(isEmpty()){
            System.out.println("Stack is empty");
        }
        else{
            top--;
            System.out.println("Popped "+arr[top+1]);
        }
    }
    void print(){
        for(int i=0;i<=top;i++){
            System.out.print(arr[i]);
        }
    }
    int capacity(){
        return top+1;
    }
    public static void main(String[] args) {
        stack s = new stack(3);
        s.push(1);
        s.push(2);
        s.push(3);
        s.print();
        System.out.println("\n");
        System.out.println(s.capacity());
    }
}
