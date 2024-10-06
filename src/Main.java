import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        guest2.setBirthdate(LocalDate.of(1993, 5, 4));
        List<Guest> guestList = new ArrayList<>();
        guestList.add(guest1);
        guestList.add(guest2);
        for(Guest guest : guestList){
            System.out.println(guest.getFirstName() + " " + guest.getLastName() + " " + guest.getBirthdate());
        }

        Room room1 = new Room(1, 1, BigDecimal.valueOf(1000), true,true);
        Room room2 = new Room(1, 1, BigDecimal.valueOf(1000), true,true);
        Room room3 = new Room(3, 3, BigDecimal.valueOf(2400), false, true);

        Booking booking1 = new Booking(guest1, room1, LocalDate.of(2021,7,19), LocalDate.of(2021, 7, 26), true);
        Booking booking2 = new Booking(guest2, room3, LocalDate.of(2021,7,19), LocalDate.of(2021, 7, 26), false);
        booking2.addGuest(guest1);
        //booking2.extractGuests();


        BookingManager bookings = new BookingManager();
        bookings.addBooking(booking1);
        bookings.addBooking(booking2);
        bookings.extractBookings();


    }
}