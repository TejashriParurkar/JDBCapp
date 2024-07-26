import com.nt.Insert;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your choice-");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Select by id");
        System.out.println("4. Select all");
        System.out.println("5. Update");

        int intValue = scanner.nextInt();

        System.out.println("You have entered: " + intValue);
        scanner.nextLine();
        if (intValue == 1){
            //perform insert op
            System.out.println("Enter your id name salary");
            String input = scanner.nextLine();
            System.out.println("next line " + input);
            String[] arr = input.split(" ");

            Insert ins = new Insert(Integer.parseInt( arr[0]), arr[1], Integer.parseInt( arr[2]));
            ins.insertRecord();
        }

    }
}