import java.util.Scanner;
public class SearchingAlgos {
    
    public void  LinearSearch(int arr[],int target){

        boolean found = false;
        for (int i = 0; i <arr.length ; i++) {
                 if (arr[i]==target) {

                   System.out.println("Value Found at index [" + i + "]");
                     found = true;
                 }
            }
        if (!found){
            System.out.println(" Value Not Found ");
        }

    }


    public void  LinearFirstAccrSearch(int arr[],int target){

        boolean found = false;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==target) {
                System.out.println("Value Found at index [" + i + "]");
                found=true;
               return ;
            }
        }
        if (!found){
            System.out.println(" Value Not Found ");
        }

    }


    public void binarySearch(int arr[],int target) {

        int left = 0;
        int right = arr.length - 1;
        int mid;

        while (left <= right) {

            mid = (left + right)/2;
            if (target == arr[mid]) {
                System.out.println("Value is at index [" + mid + "]");
                return;
            }else if (target != arr[mid])

                if (target > arr[mid]) {
                    left = mid + 1;
                } else if (target < arr[mid]) {
                    right = mid - 1;
                }

            }
        }


   public void FirstOccurBinarySearch(int arr[], int target) {

    int left = 0;
    int right = arr.length-1;
    int index = -1;

    while (left <= right) {

        int mid =(right+left)/2;

        if (target == arr[mid]) {
            index = mid;      
            right=mid-1;   

        } else if(target>arr[mid]) {
            left=mid + 1;

        } else {
            right=mid-1;
        }
    }

    if (index != -1) {
        System.out.println("First occurrence is at index [" + index + "]");
    } else {
        System.out.println("Value not found");
    }
}


    public void LastAccrbinarySearch(int arr[],int target) {

        int left = 0;
        int right = arr.length - 1;
        int index = -1;

         while (left <= right) {

        int mid=(right+left)/2;

        if (target == arr[mid]) {
            index = mid;      
            left=mid+1;   

        } else if(target>arr[mid]) {
            left=mid + 1;

        } else {
            right=mid-1;
        }
    }

        if (index != -1) {
            System.out.println("Value found at the ["+index+"]");
        }else{
           System.out.println("Value not found"); 
        }
    }


    public void AllOccrBinarySearch(int arr[],int target) {
     int left = 0;
    int right = arr.length-1;
    int first = -1;

    while (left <= right) {

        int mid =(right+left)/2;

        if (target == arr[mid]) {
            first = mid;      
            right=mid-1;   

        } else if(target>arr[mid]) {
            left=mid + 1;

        } else {
            right=mid-1;
        }
    }

    for (int i = first; i < arr.length && arr[first]==target; i++) {
     
  if (arr[i]==target) {
    
        System.out.println("An Occurrence is at index [" + i + "]");
    
  }
    
    }   
if (first==-1) {
    System.out.println("Value not Found at any index");
}

}



    public static void main(String [] agrs ){

        int option=1;
        Scanner sc=new Scanner(System.in);


        int[] arr= new int  [8];
        System.out.println("Enter the Values for Array ");
        for (int i = 0; i <8 ; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target value to search ");
        int target= sc.nextInt();

        SearchingAlgos sa =new SearchingAlgos();


        while (option!=0) {

            System.out.println("\nPlease Choose \n 1. For BinarySearch \n 2. For First Binary Occurance Search \n 3. For Last Binary Occurance Search \n 4. For All Binary Occurances Search \n 5. Linear Search \n 6. First Ocurance Linear Search \n0. Exit");
        
            option=sc.nextInt();
         
            
        switch (option) {
            case 0:
                System.out.println("\nProgram Terminated ");
                break;
            case 1:
                sa.binarySearch(arr, target);
                break;
            case 2:
                sa.FirstOccurBinarySearch(arr, target);
                break;
            case 3: 
                sa.LastAccrbinarySearch(arr, target);
                break;
            case 4:
                sa.AllOccrBinarySearch(arr, target);
                break;
            case 5:
                sa.LinearSearch(arr, target);
                break;
            case 6:
                sa.LinearFirstAccrSearch(arr, target);
                break;                
            default:
                System.out.println("Kindly Choose Correct option  ");
                break;
        }
         
        }
        }       

    }
