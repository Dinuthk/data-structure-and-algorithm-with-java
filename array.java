import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        int arr[] = new int[10];
        Scanner sc = new Scanner(System.in);
        int size =5;
        System.out.println("Enter the elements(max5): ");
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        System.out.println("\n");

        //insert operation
        System.out.println("Enter the position to insert:(1,2,3...): ");
        int pos = sc.nextInt();
        System.out.println("Enter the element to insert: ");
        int ele = sc.nextInt();
        size++;
        for(int i=size;i>pos;i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = ele;
        System.out.println("Elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        //delete operation
        System.out.println("Enter the position to delete:(1,2,3...): ");
        int poss = sc.nextInt();
        size--;
        for(int i=poss-1;i<size;i++){
            arr[i] = arr[i+1];
        }
        System.out.println("Elements are: ");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

        //search operation
        System.out.println("Enter the element to search: ");
        int data = sc.nextInt();
        int k;
        for(k=0;k<size;k++){
            if(arr[k]==data){
                break;
            }
            else{
                System.out.println("Element not found this position: "+k+1);
            }
        }
        System.out.println("Element found at: "+(k+1));
    }
}