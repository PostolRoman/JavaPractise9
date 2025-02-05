import java.util.List;

class HotelController {
    private IHotelDatabase database;

    public HotelController(IHotelDatabase database) {
        this.database = database;
    }

    public void bookRoom(String roomNumber) {
        database.bookRoom(roomNumber);
    }

    public void cancelBooking(String roomNumber) {
        database.cancelBooking(roomNumber);
    }

    public void checkIn(String roomNumber) {
        database.checkIn(roomNumber);
    }

    public void checkOut(String roomNumber) {
        database.checkOut(roomNumber);
    }

    public void showAvailableRooms() {
        List<String> rooms = database.getAvailableRooms();
        System.out.println("Available rooms: " + rooms);
    }
}