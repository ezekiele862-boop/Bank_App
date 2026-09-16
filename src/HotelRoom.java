public class HotelRoom {
    private int RoomNumber;
    private String type;
    private double price;
    private boolean isAvaliable;

    public HotelRoom(int roomNumber, String type, double price, boolean isAvailable) {
        this.RoomNumber = roomNumber;
        this.type = type;
        this.price = price;
        this.isAvaliable = isAvailable;
    }

    public int getRoomNumber() {
        return RoomNumber;
    }

    public double getPrice() {
        return price;
    }

    public String getType() {
        return type;
    }
    public boolean isAvaliable(){
        return isAvaliable;
    }

    public void setAvaliable(boolean available) {
        isAvaliable = available;
    }

    public void roomDetails(){
        System.out.println("Room number: "+ RoomNumber);
        System.out.println("Room Type: "+ type);
        System.out.println("Room price: "+ price);
        if(isAvaliable){
            System.out.println("Available");
        }
        else {
            System.out.println("Already booked");
        }
    }

}
