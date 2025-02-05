public class Main {
    public static void main(String[] args) {
        HotelDatabase realDatabase = new HotelDatabase();
        HotelDatabaseProxy proxyDatabase = new HotelDatabaseProxy(realDatabase);
        HotelController controller = new HotelController(proxyDatabase);

        controller.showAvailableRooms();
        controller.bookRoom("101");
        controller.checkIn("101");
        controller.showAvailableRooms();
        controller.cancelBooking("101");
        controller.showAvailableRooms();
        controller.checkOut("101");
    }
}