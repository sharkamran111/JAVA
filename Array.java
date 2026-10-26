import java.util.Scanner;
public class Array {

Scanner sc = new Scanner(System.in);

public int isertAtStart(int arr[],int value,int size){
if (size<arr.length) {
    
for (int i = size; i>0 ; i--){
    arr[i]=arr[i-1];
}
    arr[0]=value;
    size+=1;
}else{
    System.out.println("Array is full !");
}
return size;
}
public int  insertAtEnd(int arr[],int value,int size){

    if (size<arr.length) {

    arr[size]=value;
    size+=1;
}else{
    System.out.println("Array is full !");
}
return size;
} 
public int insertAtIndex(int arr[],int value,int size){

if (size<arr.length) {
System.out.println("Please Enter the index you want to insert value at ");
    int index=sc.nextInt();
    if (index > -1 && index <= size ) {
    

        for (int i = size; i>index ; i--){
        arr[i]=arr[i-1];
        }
    arr[index]=value;
    size+=1;
    }else{System.out.println("Index Does not Exist ");}

}else{
    System.out.println("Array is full !");
}

return size;
}
public int deleteAtStart(int arr[],int size){
    if (size!=0) {
    arr[0]=0;
   
    
        for (int i =0; i<size ; i++){
        arr[i]=arr[i+1];
      
        }
          System.out.println("Deletion Success");
            size-=1;
    }else{
        System.out.println("Array is Empty");
    }
    
    return size;
}
public int deleteAtEnd(int arr[],int size){
        if (size!=0) {
    arr[size-1]=0;
    size-=1;    
    }else{
        System.out.println("Array is Empty");
    }
    return size;
}
public int deleteAtIndex(int arr[],int value,int size){

if (size!=0) {
System.out.println("Please Enter the index you want to delete value at ");
    int index=sc.nextInt();
    if (index >= 0 && index < size) {
    
        arr[index]=0;
        
        for (int i =index; i<size ; i++){
        arr[i]=arr[i+1];
        }
       size-=1;
   
    }else{System.out.println("Index Does not Exist ");}

}else{
    System.out.println("Array is Empty");
}
    return size;
}
public void SearchAndReplaceValue(int arr[],int size){
    boolean found=false ;
System.out.println("Enter the value to be searched and replaced");
   int  target=sc.nextInt();

   System.out.println("Enter the New Value Which replaces "+target);
   int  value=sc.nextInt();
    for (int i = 0; i <size; i++) {
        if (arr[i]==target){
            arr[i]=value;
            System.out.println("Value Replaced Successfully");
            found=true;
        }
        
    }
    if (!found) {
            System.out.println("Value is not in array to be replaced!");
        }
}
public int SearchAndDeleteValue(int arr[],int size){
       boolean found=false ;

  System.out.println("Enter the value to be searched and replaced");
   int  target=sc.nextInt();
    for (int i = 0; i <size; i++) {
        if (arr[i]==target){
            arr[i]=0;
             size--;
            found=true;
        

              for (int  j = i; j<size; j++){
                arr[j]=arr[j+1];
                }
                 System.out.println("Value Deleted Successfully");
        }
     
     
        
    }    
    if (!found) {
            System.out.println("Value is not in array !");
        }
      
        return size;
}
public void  FindMin(int arr[],int size){
           int min=arr[0];
           for (int i = 0; i < size; i++) {
            if (arr[i]<min) {
                min=arr[i];
                
            }
           }
           System.out.println("Smallest Value in array is: "+min);
}
public void FindMax(int arr[],int size){
    int max=arr[0];
           for (int i = 0; i < size; i++) {
            if (arr[i]>max) {
                max=arr[i];
                
            }
           }
           System.out.println("Largest Value in array is: "+max); 
}
public void SumOfArrayElements(int arr[],int size){
    int sum = 0;      
    for (int i = 0; i < size; i++) {
         sum+=arr[i];
                
            }
            System.out.println("Sum of Array is = "+sum);
}
public void DisplayArray(int arr[],int size){
       for (int i = 0; i <size; i++) {
         System.out.println("Elemet at Index["+i+"] is : "+arr[i]);
                
            }
}

    public static void main(String[] args) {


        int size=6;
        int value=0;
        int option=1;

    Scanner scan= new Scanner(System.in);
    Scanner ValSC= new Scanner(System.in);

        int[] arr =new int[10];
        arr[0]=12;
        arr[1]=38;
        arr[2]=71;
        arr[3]=5;
        arr[4]=96;
        arr[5]=62;



Array sa= new Array();


while (option!=0) {
    
System.out.println("0.  Exit Program");
System.out.println("1.  Insert Element at Start");
System.out.println("2.  Insert Element at End");
System.out.println("3.  Insert Element at Index");
System.out.println("4.  Search and Replace Value");
System.out.println("5.  Search and Delete Value");
System.out.println("6.  Sum of Array");
System.out.println("7.  Find Maximum");
System.out.println("8.  Find Minimum");
System.out.println("9.  Display Array");
System.out.println("10. Delete At Start");
System.out.println("11. Delete At End");
System.out.print("Enter your option: ");



option=scan.nextInt();
        switch (option) {



            case 0:
                System.out.println("\nProgram Terminated ");
                break;
            case 1:
                System.out.println("Please Enter the value to be inserted ");
                value=ValSC.nextInt();
                size=sa.isertAtStart(arr, value, size);
                break;
            case 2:
                System.out.println("Please Enter the value to be inserted ");
                value=ValSC.nextInt();
                size=sa.insertAtEnd(arr, value, size);
                break;
            case 3: 
            System.out.println("Please Enter the value to be inserted ");
                value=ValSC.nextInt();
                size=sa.insertAtIndex(arr, value, size);
                break;
            case 4:
                sa.SearchAndReplaceValue(arr, size);
                break;
            case 5:
            
                size=sa.SearchAndDeleteValue(arr, size);
                break;
            case 6:
               sa.SumOfArrayElements(arr, size);
                break;
            case 7:
                sa.FindMax(arr, size); 
                break;
            case 8:
                sa.FindMin(arr, size);
                break;
            case 9:
                sa.DisplayArray(arr,size); 
                break;
            case 10:
               
                size=sa.deleteAtStart(arr, size);
                break;
            case  11:
                size=sa.deleteAtEnd(arr, size);
                break;
            default:
                System.out.println("Kindly Choose Correct option  ");
                break;
        }
    }
    
}

}