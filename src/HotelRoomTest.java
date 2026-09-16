import java.util.Scanner;
public class HotelRoomTest {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        HotelRoom room1 = new HotelRoom(101,"Single",10000,true);
        HotelRoom room2 = new HotelRoom(102,"Double",15000,true);
        HotelRoom room3 = new HotelRoom(201,"Duplex",25000,true);
        HotelRoom room4 = new HotelRoom(202,"Suite",40000,true);
        while (choice !=5){
            System.out.println("======HotelRoom======");
            System.out.println("1. View Available");
            System.out.println("2. Book a Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Room Details");
            System.out.println("5. Exit");

            System.out.println("Choice one option");
            choice = scanner.nextInt();

            switch (choice){
                case 1:
                   if(room1.isAvaliable()){
                       System.out.println(room1.getType() + " is available");
                   }
                   if(room2.isAvaliable()){
                       System.out.println(room2.getType() + " is available");
                   }
                   if(room3.isAvaliable()){
                       System.out.println(room3.getType() + " is available");
                   }
                   if(room4.isAvaliable()){
                       System.out.println(room4.getType() + " is available");
                   }
                    break;
                case 2:
                    System.out.println("Enter room number: ");
                    int room = scanner.nextInt();
                    if(room==room1.getRoomNumber()){
                        if(room1.isAvaliable()){
                            room1.setAvaliable(false);
                            System.out.println("Room 101 booked successfully");
                        }
                        else {
                            System.out.println("Room 101 is already booked");
                        }
                    } else if (room==room2.getRoomNumber()) {
                        if(room2.isAvaliable()){
                            room2.setAvaliable(false);
                            System.out.println("Room 102 booked successfully");
                        }
                        else {
                            System.out.println("Room 102 is already booked");
                        }
                    } else if (room ==room3.getRoomNumber()) {
                        if(room3.isAvaliable()){
                            room3.setAvaliable(false);
                            System.out.println("Room 201 booked successfully");
                        }
                        else {
                            System.out.println("Room 201 is already booked");
                        }
                    } else if (room==room4.getRoomNumber()) {
                        if(room4.isAvaliable()) {
                            room4.setAvaliable(false);
                            System.out.println("Room 202 booked successfully");
                        }
                        else {
                            System.out.println("Room 202 is already booked");
                        }
                    }
                    else {
                        System.out.println("invalid room number");
                    }
                    break;
                case 3:
                    System.out.println("Enter room number to cancel: ");
                    int canceledRoom= scanner.nextInt();

                    if(canceledRoom==room1.getRoomNumber()){
                        if(!room1.isAvaliable()){
                            room1.setAvaliable(true);
                            System.out.println("Room 101 canceled successfully");
                        }
                        else {
                            System.out.println("Room 101 is available");
                        }
                    } else if (canceledRoom==room2.getRoomNumber()) {
                        if(!room2.isAvaliable()){
                            room2.setAvaliable(true);
                            System.out.println("Room 102 canceled successfully");
                        }
                        else {
                            System.out.println("Room 102 is available");
                        }
                    } else if (canceledRoom==room3.getRoomNumber()) {
                        if(!room3.isAvaliable()){
                            room3.setAvaliable(true);
                            System.out.println("Room 103 canceled successfully");
                        }
                        else {
                            System.out.println("Room 103 is available");
                        }
                    } else if (canceledRoom==room4.getRoomNumber()) {
                        if(!room4.isAvaliable()){
                            room4.setAvaliable(true);
                            System.out.println("Room 202 canceled successfully");
                        }
                        else {
                            System.out.println("Room 202 is available");
                        }
                    }
                    else {
                        System.out.println("invalid room number");
                    }
                    break;
                case 4:
                    System.out.println("Enter room number: ");
                    int roomNumber=scanner.nextInt();

                    if(roomNumber==room1.getRoomNumber()){
                        room1.roomDetails();
                    } else if (roomNumber==room2.getRoomNumber()) {
                        room2.roomDetails();
                    } else if (roomNumber==room3.getRoomNumber()) {
                        room3.roomDetails();
                    } else if (roomNumber==room4.getRoomNumber()) {
                        room4.roomDetails();
                    }
                    else {
                        System.out.println("Invalid room number");
                    }
                    break;
                case 5:
                    System.out.println("Thank you for using our hotel");
                    break;
                default:
                    System.out.println("invalid: please select from 1-5");

            }


        }



    }
}
