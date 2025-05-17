import java.util.Scanner;

public class SecondLargeArray {
      
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the size of an array ");
        int size = sc.nextInt();

        int[] arr = new int[size];

         System.out.print(  " Enter " + size + " Elements in this array " );
         for(  int i = 0; i < size; i++ ){
            arr[i] = sc.nextInt();

        }

        System.out.print("Our array is ");
          for( int i=0; i<size; i++){
              System.out.print(arr[i] + " " );
          }

        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MAX_VALUE;
 
          for( int i=0; i<size; i++){
                if(arr[i] > largest){
                    slargest = largest;
                    largest = arr[i];
                }

                else if ((arr[i] > slargest) &&  (arr[i] != largest)){
                    slargest = arr[i];
                }
          }
            System.out.println();
        System.out.println(" second largest element is  : " + slargest);

    }
}
