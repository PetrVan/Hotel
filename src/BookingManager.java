import java.util.List;
import java.util.ArrayList;

public class BookingManager {
    /**
     * List rezervací
     */
    private List<Booking> bookings;
    /**
     * Vytvoření instance rezervace
     */
    public BookingManager(){
        bookings = new ArrayList<>();
    }
    /**
     * Metoda přidání rezervace
     * @param booking rezervace
     */
    public void addBooking(Booking booking){
        bookings.add(booking);
    }

    /**
     * Metoda odebrání rezervace
     * @param booking
     */
    public void     removeBooking(Booking booking){
        bookings.remove(booking);
    }

    /**
     * Výpis třídy rezervace
     * @return rezervace
     */
    @Override
    public String toString(){
        String extract = "";
        for(Booking booking : bookings){
            System.out.println(booking);
        }
        return extract;
    }
}
