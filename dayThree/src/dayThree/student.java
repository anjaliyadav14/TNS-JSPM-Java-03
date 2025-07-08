package dayThree;

import java.util.Scanner;

public class student {
    String name;
    int age;

    // Constructor
    public student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display the data
    void display() {
        System.out.println("student Name: " + name);
        System.out.println("student Age: " + age);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter your name: ");
        String userName = sc.nextLine();

        System.out.print("Enter your age: ");
        int userAge = sc.nextInt();

        // Passing user input to constructor
        student s1 = new student(userName, userAge);

        // Displaying the data
        s1.display();

        sc.close();
    }
}
