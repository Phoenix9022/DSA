import java.util.LinkedList; 
import java.lang.String;
import java.util.Scanner;

public class DSA1 {

    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        list.add("DT");
        list.add("IT");
        list.add("ECE");
        list.add("CSE");
        System.out.println("Enter The Element To Add:");
        Scanner sc = new Scanner(System.in);
        list.add(sc.nextLine());
        
        System.out.println(list);

        System.out.println("Enter The Element To Remove:");
        list.remove(sc.nextLine());

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("IT")) {
                System.out.println("Found IT At "+i);
            }
            
        }                                           
    }
}