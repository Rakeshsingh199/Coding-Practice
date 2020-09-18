import java.util.*;
class LinearSearch{
public static void main(String args[]){
ArrayList<Integer> al = new ArrayList<>();
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of elements: ");
int size = sc.nextInt();
System.out.println("Enter " +size+ " elements: ");
for(int i=0;i<size;i++){
al.add(sc.nextInt());
}
System.out.print("The contents in the list are :" );
Iterator it = al.iterator();
while(it.hasNext()){
System.out.print(it.next()+ " ");
}
System.out.println("\nEnter the element to be searched : ");
int key = sc.nextInt();
System.out.println("the element entered is : " + key);
System.out.println("Searching.... for element");
for(int i=0;i<size;i++){
if(al.get(i)==key){
System.out.println("Element found at position : " +i);
continue;
}
else {
System.out.println("Element not present in the list at pos :" +i);
}
}
System.out.println("Program completed..");
}
}
