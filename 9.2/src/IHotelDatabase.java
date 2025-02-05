import java.util.List;


interface IHotelDatabase {
    List<String> getAvailableRooms();
    void bookRoom(String roomNumber);
    void cancelBooking(String roomNumber);
    void checkIn(String roomNumber);
    void checkOut(String roomNumber);
}