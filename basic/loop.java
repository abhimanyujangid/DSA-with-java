import java.util.Scanner;

// public class loop {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         // print a reverse number
//     //     System.out.println("Enter a number :");
//     //     int number = sc.nextInt();
//     //     int reverse = 0;
//     //     while (number > 0) {
//     //         // long lastDigit = number % 10;
//     //         // number = number/10;
//     //         // System.out.print(lastDigit);
//     //         int lastDigit = number % 10;
//     //         reverse = (reverse*10)+lastDigit;
//     //         number = number /10;
//     // }
//     // System.out.println("The reverse number is :" + reverse);

//     // Q:1  print every number but not print multiply number of 10 
//     while (true) {
//         System.out.println("Enter a number : ");
//         int number  = sc.nextInt();
//         if (number % 10 == 0){
//             continue;
//         }
//         System.out.println("you enter a number is " + number);
//     }
// }
// }

// Assigment
public class loop {
    public static void main(String[] args) {
        /*
         Question 2 : Write a program that reads a set of integers, and then prints the sum of then and odd integers
         */
        Scanner sc = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        int choice = 0;
        
        do{
            System.out.println("Enter a number");
            int number  = sc.nextInt();
            if(number % 2 == 0){
                even = even + number;
            }
            else{
                odd = odd + number;
            }
            System.out.println("Plese select choice for next step if want add next number press 1 and exite press 0");
            choice = sc.nextInt();

        }while(choice == 1);
        System.out.println("Total even number " + even);
        System.out.println("Total odd number " + odd);

    }

}