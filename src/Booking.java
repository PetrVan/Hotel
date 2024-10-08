import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.List;
import java.util.ArrayList;

public class Booking {
    /**
     * LocalDate start - datum zaáčtku pobytu
     */
    private LocalDate start;
    /**
     * LocalDate end - datum konce pobytu
     */
    private LocalDate end;
    /**
     * typeOfVacationWork - Typ pobytu - Relaxační/Pracovní
     */
    private boolean typeOfVacationWork;
    /**
     * Geust guest - třída Hosta
     */
    private Guest guest;
    /**
     * Room room - Třída pokoje
     */
    private Room room;
    /**
     * Seznam hostů
     */
    private List<Guest> otherGuests;

    /**
     * Vytvoří instanci třídy rezervace
     * @param guest Host
     * @param room Pokoj
     * @param start Začátek pobytu
     * @param end Konec pobytu
     * @param typeOfVacationWork typ pobytu
     */
    public Booking(Guest guest, Room room, LocalDate start, LocalDate end, boolean typeOfVacationWork){
        this.guest = guest;
        this.room = room;
        this.start = start;
        this.end = end;
        this.typeOfVacationWork = typeOfVacationWork;
        otherGuests = new ArrayList<>();
        otherGuests.add(guest);

    }

    /**
     * Vytvoří instanci třídy rezervace - pokud se neuvede datum
     * @param guest Host
     * @param room Místnost
     * @param typeOfVacationWork Typ pobytu
     */
    public Booking(Guest guest, Room room, boolean typeOfVacationWork){
        this(guest, room, LocalDate.now(), LocalDate.now().plusDays(6), typeOfVacationWork);
    }
    // Gettry a settry
    public LocalDate getStart() {
        return start;
    }

    public void setStart(LocalDate start) {
        this.start = start;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public boolean isTypeOfVacationWork() {
        return typeOfVacationWork;
    }

    public void setTypeOfVacationWork(boolean typeOfVacationWork) {
        this.typeOfVacationWork = typeOfVacationWork;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public void setOtherGuests(List otherGuests) {
        this.otherGuests = otherGuests;
    }

    /**
     * Přidání hosta
     * @param guest Hosta se seznamu
     */
    public void addGuest(Guest guest){
        otherGuests.add(guest);
    }
    /**
     * Odebrání hosta
     * @param guest Host ze seznamu
     */
    public void removeGuest(Guest guest){
        otherGuests.remove(guest);
    }
    /**
     * Výpis třídy rezervace
     * @return Jméno, příjmení, start, end, číslo pokoje, typ pobytu, cena
     */
    @Override
    public String toString(){
        String extract = "";
        for( Guest guest : otherGuests){
            String vacation = "";
            String sea;
            String terrace = "";

            if(typeOfVacationWork){
                vacation = "Pracovně";
            }
            else{
                vacation = "Relaxačně";
            }
            if(room.isSeaView()){
                sea = "ano";
            }
            else{
                sea = "ne";
            }
            if(room.isTerrace()){
                terrace = "ano";
            }
            else{
                terrace = "ne";
            }
            extract += guest.getFirstName() + " " + guest.getLastName() + " Od " +
            start.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + " do " +
            end.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + " Číslo pokoje: " + room.getNumberOfRoom()
            + " Typ pobytu: " + vacation + " Výhled na moře: " + sea + " S balkónem: " + terrace + " Cena: " + room.getPrice() + " Kč ";
        }
        return extract;
    }

}
