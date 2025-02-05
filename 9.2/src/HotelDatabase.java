import java.util.ArrayList;
import java.util.List;

class HotelDatabase implements IHotelDatabase {
    private List<String> availableRooms;

    public HotelDatabase() {
        this.availableRooms = new ArrayList<>();
        availableRooms.add("101");
        availableRooms.add("102");
        availableRooms.add("103");
    }

    @Override
    public List<String> getAvailableRooms() {
        System.out.println("Fetching available rooms from database...");
        return new ArrayList<>(availableRooms);
    }

    @Override
    public void bookRoom(String roomNumber) {
        if (availableRooms.contains(roomNumber)) {
            availableRooms.remove(roomNumber);
            System.out.println("Room " + roomNumber + " successfully booked.");
        } else {
            System.out.println("Room " + roomNumber + " is not available.");
        }
    }

    @Override
    public void cancelBooking(String roomNumber) {
        if (!availableRooms.contains(roomNumber)) {
            availableRooms.add(roomNumber);
            System.out.println("Booking for room " + roomNumber + " cancelled.");
        } else {
            System.out.println("Room " + roomNumber + " was not booked.");
        }
    }

    @Override
    public void checkIn(String roomNumber) {
        System.out.println("Guest checked into room " + roomNumber);
    }

    @Override
    public void checkOut(String roomNumber) {
        System.out.println("Guest checked out from room " + roomNumber);
    }
}
