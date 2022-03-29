import java.util.Scanner;
public class week10lab {
    public static void main(String[] args){
        System.out.println("Hello Glasgow!");
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.print("Enter a number:");
        float x = myObj.nextFloat();  // Read user input
        System.out.print("Enter another number:");
        float y = myObj.nextFloat();  // Read user input
        float average = (x+y)/2;
        System.out.print("Average of the 2 numbers is " + average);
        System.out.println("\nQuestion 2b: ");
        String module = "CSC1009";
        switch(module)
        {
        case "CSC1009":
        System.out.println("Object-Oriented Programming");
        break;
        case "CSC1008":
        System.out.println("Data structures and algorithm");
        break;
        case "CSC1007":
        System.out.println("Operating systems");
        break;
        case "CSC1006":
        System.out.println("Mathematics 2");
        break;
        
        default:
        System.out.println("Unknown Module");
        break;
        }
        System.out.println("Question 2c: ");
        for (int i = 102; i >= 66; i--) {
            if (i % 2 != 0) {
            int odd = i;
            System.out.println("Value of i=" + odd);
        }
        }
    }
}