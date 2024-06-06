import java.util.Scanner;
public class conditions {
    public static void main(String[] args) {
        //Question 1 : Write a Java program to get a number from the user and print whether it is
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");
        // int input = sc.nextInt();
        // String text;
        // if(input<0){
        //     text = "Negative";
        // }
        // else {
        //     text = "positive";
        // }
        // System.out.println("The given number is " + text + ".");

        //Question 5 : Write a Java program that takes a year from the user and print whether that year is a leap year or not
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the leep year :");
        int input = sc.nextInt();
        boolean x = (input % 4) == 0;
        boolean y = (input % 100) != 0;
        boolean z = ((input % 100 == 0) && (input % 400 == 0));
        if (x && (y || z)) {
        System.out.println(input + " is a leap year");
        } else {
        System.out.println(input + " is not a leap year");
        }

        }


    }

    

