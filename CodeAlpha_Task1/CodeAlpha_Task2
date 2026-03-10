import java.util.*;

class Room {
    int roomNumber;
    String type;
    boolean booked;
    String customerName;

    Room(int roomNumber, String type) {
        this.roomNumber = roomNumber;
        this.type = type;
        this.booked = false;
        this.customerName = "";
    }
}

public class HotelReservationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Room> rooms = new ArrayList<>();

        rooms.add(new Room(101, "Standard"));
        rooms.add(new Room(102, "Deluxe"));
        rooms.add(new Room(103, "Suite"));

        int choice;

        do {
            System.out.println("\n===== HOTEL MENU =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                for (Room r : rooms) {
                    System.out.println(r.roomNumber + " - " + r.type + " - " +
                            (r.booked ? "Booked by " + r.customerName : "Available"));
                }
            }

            else if (choice == 2) {
                System.out.print("Enter room number to book: ");
                int num = sc.nextInt();
                sc.nextLine();

                for (Room r : rooms) {
                    if (r.roomNumber == num && !r.booked) {
                        System.out.print("Enter customer name: ");
                        r.customerName = sc.nextLine();

                        System.out.println("Processing payment...");
                        System.out.println("Payment successful!");

                        r.booked = true;
                        System.out.println("Room booked successfully!");
                    }
                }
            }

            else if (choice == 3) {
                System.out.print("Enter room number to cancel: ");
                int num = sc.nextInt();

                for (Room r : rooms) {
                    if (r.roomNumber == num && r.booked) {
                        r.booked = false;
                        r.customerName = "";
                        System.out.println("Booking cancelled!");
                    }
                }
            }

        } while (choice != 4);

        sc.close();
    }
}
