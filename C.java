import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Movie Booking System!");
        System.out.println("Please select a movie from the following list:");
        System.out.println("1. Movie 1: The Dark Knight");
        System.out.println("2. Movie 2: Inception");
        System.out.println("3. Movie 3: Interstellar");
        System.out.println("4. Movie 4: Avatar");

        System.out.print("Enter your choice (1-4): ");
        int mov = sc.nextInt();
        int screen;
        
        switch (mov) {
            case 1:
                System.out.println("You selected: The Dark Knight");
                System.out.println("Available Screens:");
                System.out.println("1. Screen 1 (Standard)");
                System.out.println("2. Screen 2 (IMAX)");
                System.out.print("Select a screen (1-2): ");
                screen = sc.nextInt();
                
                if (screen == 1) {
                    System.out.println("Booking confirmed! You have booked a ticket for The Dark Knight on Screen 1 (Standard).");
                } else if (screen == 2) {
                    System.out.println("Booking confirmed! You have booked a ticket for The Dark Knight on Screen 2 (IMAX).");
                } else {
                    System.out.println("Invalid screen selection.");
                }
                break;
            case 2:
                System.out.println("You selected: Inception");
                System.out.println("Available Screens:");
                System.out.println("1. Screen 3 (Standard)");
                System.out.println("2. Screen 4 (4DX)");
                System.out.print("Select a screen (1-2): ");
                screen = sc.nextInt();
                
                if (screen == 1) {
                    System.out.println("Booking confirmed! You have booked a ticket for Inception on Screen 3 (Standard).");
                } else if (screen == 2) {
                    System.out.println("Booking confirmed! You have booked a ticket for Inception on Screen 4 (4DX).");
                } else {
                    System.out.println("Invalid screen selection.");
                }
                break;
            case 3:
                System.out.println("You selected: Interstellar");
                System.out.println("Available Screens:");
                System.out.println("1. Screen 1 (IMAX)");
                System.out.println("2. Screen 3 (Standard)");
                System.out.print("Select a screen (1-2): ");
                screen = sc.nextInt();
                
                if (screen == 1) {
                    System.out.println("Booking confirmed! You have booked a ticket for Interstellar on Screen 1 (IMAX).");
                } else if (screen == 2) {
                    System.out.println("Booking confirmed! You have booked a ticket for Interstellar on Screen 3 (Standard).");
                } else {
                    System.out.println("Invalid screen selection.");
                }
                break;
            case 4:
                System.out.println("You selected: Avatar");
                System.out.println("Available Screens:");
                System.out.println("1. Screen 2 (3D)");
                System.out.println("2. Screen 4 (IMAX 3D)");
                System.out.print("Select a screen (1-2): ");
                screen = sc.nextInt();
                
                if (screen == 1) {
                    System.out.println("Booking confirmed! You have booked a ticket for Avatar on Screen 2 (3D).");
                } else if (screen == 2) {
                    System.out.println("Booking confirmed! You have booked a ticket for Avatar on Screen 4 (IMAX 3D).");
                } else {
                    System.out.println("Invalid screen selection.");
                }
                break;
            default:
                System.out.println("Invalid movie selection. Please restart the booking process.");
                break;
        }

        sc.close();
    }
}