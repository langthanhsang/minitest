package lesson2;

import java.util.Scanner;

public class ThietkeMenuChoUngDung {
    public static void main(String[] args) {
        int choice = -1;
        while (choice != 0) {

            Scanner menu = new Scanner(System.in);
            System.out.println("menu");
            System.out.println("1. draw the triangle :");
            System.out.println("2. draw the square : ");
            System.out.println("3. draw the rectangle: ");
            System.out.println("Exit");
            System.out.println("Enter your choice");
            choice = menu.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("******");
                    System.out.println("*****");
                    System.out.println("****");
                    System.out.println("***");
                    System.out.println("**");
                    System.out.println("*");
                    break;
                case 2:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 3:
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    System.out.println("******");
                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }
        }
    }
}