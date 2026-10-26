import java.util.Scanner;
public class Array2 {
    Scanner sc=new Scanner(System.in);

    public void WriteArr(int arr[]){
        
    for (int i = 0; i < arr.length; i++) {
    System.out.println("Enter element for Index: "+i);
    arr[i]=sc.nextInt();
}
    }

    public int sum(int arr[]){
        int sum=0;
    for (int i = 0; i < arr.length; i++) {
        sum+=arr[i];
    }
    return sum;
    }


    public int average(int arr[]){
        return sum(arr)/arr.length;
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
  
        Array2 Ar =new Array2();
        Ar.WriteArr(arr);
        System.out.println(Ar.sum(arr)); 
        System.out.println(Ar.average(arr));
    }
}
