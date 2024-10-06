import java.util.List;
import java.util.ArrayList;

public class BookingManager {
    private List<Booking> bookings;
    private Guest guest;

    public BookingManager(){
        bookings = new ArrayList<>();
    }

    public void addBooking(Booking booking){
        bookings.add(booking);
    }

    public void extractBookings(){
        String extract = "";
        for(Booking booking : bookings){
           booking.extractGuests();
        }
        //System.out.println(extract);
    }

    public List<Booking> getBookings(){
        return new ArrayList<>();
    }
}
