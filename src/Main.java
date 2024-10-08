import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Vytvoření objektů hosté
        Guest guest1 = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest guest2 = new Guest("Jan", "Dvořáček", LocalDate.of(1995, 5, 5));
        // Změna data narození
        guest2.setBirthdate(LocalDate.of(1993, 5, 4));

        // Vytvoření seznamu hostů
        List<Guest> guestList = new ArrayList<>();
        // Přidání hostů do seznamu
        guestList.add(guest1);
        guestList.add(guest2);
        // Výpis hostů
        System.out.println("Hosté: ");
        for(Guest guest : guestList){
            System.out.println(guest.getDescription());
        }
        // Vytvoření objektů pokoje
        Room room1 = new Room(1, 1, BigDecimal.valueOf(1000), true,true);
        Room room2 = new Room(1, 1, BigDecimal.valueOf(1000), true,true);
        Room room3 = new Room(3, 3, BigDecimal.valueOf(2400), false, true);
        // Vytvoření rezervací
        Booking booking1 = new Booking(guest1, room1, LocalDate.of(2021,7,19), LocalDate.of(2021, 7, 26), true);
        Booking booking2 = new Booking(guest2, room3, LocalDate.of(2021,7,19), LocalDate.of(2021, 7, 26), false);
        // Přidání hosta do jedné rezervace
        booking2.addGuest(guest1);
        // Vytvoření objektu rezervace
        BookingManager bookings = new BookingManager();
        // Přidání rezervací do třídy rezervace
        bookings.addBooking(booking1);
        bookings.addBooking(booking2);
        // Výpis rezervací
        System.out.println("Rezervace: ");
        System.out.println(bookings);
    }
}