import java.util.Scanner;
import java.io.*;
import java.util.*;
public class BubbleSort {
public static void main(String args[]) throws java.lang.Exception {
System.out.println("Enter the size of the list : ");
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int n = Integer.parseInt(br.readLine());
int arr[] = new int[n];
String input[] = br.readLine().split("\\s");
System.out.println("Enter the array items: ");
for(int i=0;i<n;i++){
    arr[i] = Integer.parseInt(input[i]);
}
System.out.print("Array list before sorting : " +Arrays.toString(arr));
System.out.println("\nArrays after sorting :" );
for(int i=0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(arr[j] < arr[i]){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }
}
System.out.print(Arrays.toString(arr));
}
}