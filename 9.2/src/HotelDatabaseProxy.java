import java.time.LocalTime;
import java.util.List;


class HotelDatabaseProxy implements IHotelDatabase {
    private HotelDatabase realDatabase;

    public HotelDatabaseProxy(HotelDatabase realDatabase) {
        this.realDatabase = realDatabase;
    }

    @Override
    public List<String> getAvailableRooms() {
        System.out.println("Proxy: Logging room availability request...");
        LocalTime startTime = LocalTime.now();

        List<String> rooms = realDatabase.getAvailableRooms();

        LocalTime endTime = LocalTime.now();
        System.out.println("Proxy: Time elapsed: " + (endTime.toNanoOfDay() - startTime.toNanoOfDay()) / 1_000_000 + " ms");
        return rooms;
    }

    @Override
    public void bookRoom(String roomNumber) {
        System.out.println("Proxy: Logging room booking...");
        realDatabase.bookRoom(roomNumber);
    }

    @Override
    public void cancelBooking(String roomNumber) {
        System.out.println("Proxy: Logging booking cancellation...");
        realDatabase.cancelBooking(roomNumber);
    }

    @Override
    public void checkIn(String roomNumber) {
        System.out.println("Proxy: Checking in guest...");
        realDatabase.checkIn(roomNumber);
    }

    @Override
    public void checkOut(String roomNumber) {
        System.out.println("Proxy: Checking out guest...");
        realDatabase.checkOut(roomNumber);
    }
}