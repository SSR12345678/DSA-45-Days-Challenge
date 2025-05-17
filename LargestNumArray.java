import java.util.Scanner;

public class LargestNumArray {
     
                   public static void main(String[] args) {
                         
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter the size of an array : ");
                    int size = sc.nextInt();

                    // declare an array 

                    int[] arr = new int[size];

                    // taking user input for array element
                    System.out.print("Enter " + size + " Element for an array : ");
                    for (int i=0; i<size; i++){
                          arr[i] = sc.nextInt();
                    }

                    // output the array

                    System.out.print("Our array is : ");
                    for(int i=0; i<size; i++){
                        System.out.print(arr[i] + " ");
                    }

                       // next line 
                            System.out.println();
              
                            //largest element finding concept
                    int largest = arr[0];
                    for (int i=1; i<size; i++){
                          if(arr[i] > largest){
                            largest = arr[i];
                          }

                    }

                    System.out.println("The largest element of this array is : " + largest);
                    

                    // for(int i=0; i<size; i++){
                    //     for(int j=i+1; j<size; j++){
                    //         if(arr[i]> arr[j]){
                    //             System.out.print("The largest element of this array is : " + arr[i]);
                    //         }

                    //         else{
                    //             int temp=0;
                    //             temp = arr[i];
                    //             arr[i] = arr[j];
                    //             arr[j] = temp;
                    //             System.out.print("The largest element of this array is : " + arr[i]);
                    //         }
                    //     }
                    // }
                 



                   }
    
}
