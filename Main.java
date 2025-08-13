import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pet myPet = null;
        while (myPet == null) {
            System.out.print("1. Dog 🐶\n2. Cat 🐱\n3. Parrot 🦜\n4. Hamster 🐹\nChoose your pet: ");
            int choice = in.nextInt();
            in.nextLine();

            switch (choice) {
                case 1: myPet = new Dog();
                break;
                case 2: myPet = new Cat();
                break;
                case 3: myPet = new Parrot();
                break;
                case 4: myPet = new Hamster();
                break;
                default: System.out.println("Invalid choice! Pick 1-4.");
            }
        }

        System.out.print("Name your pet: ");
        String petName = in.nextLine();
        myPet.setName(petName);

        int option;
        do {
            myPet.status();
            System.out.println("What do you want to do?");
            System.out.println("1. Eat 🍖");
            System.out.println("2. Sleep 😴");
            System.out.println("3. Play 🎮");
            System.out.println("4. Quit 🚪");
            System.out.print("Choice: ");
            option = in.nextInt();

            switch (option) {
                case 1: myPet.eat();
                break;
                case 2: myPet.sleep();
                break;
                case 3: myPet.play();
                break;
                case 4: System.out.println("Goodbye!");
                break;
                default: System.out.println("Invalid option!");
            }
        } while (option != 4);
    }
}