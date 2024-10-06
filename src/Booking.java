import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Booking {
    private LocalDate start;
    private LocalDate end;
    private boolean typeOfVacationWork;
    private Guest guest;
    private Room room;
    private List<Guest> otherGuests;

    public Booking(Guest guest, Room room, LocalDate start, LocalDate end, boolean typeOfVacationWork){
        this.guest = guest;
        this.room = room;
        this.start = start;
        this.end = end;
        this.typeOfVacationWork = typeOfVacationWork;
        otherGuests = new ArrayList<>();
        otherGuests.add(guest);
    }

    public Booking(Guest guest, Room room, boolean typeOfVacationWork){
        this(guest, room, LocalDate.now(), LocalDate.now().plusDays(6), typeOfVacationWork);
    }

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

    public void addGuest(Guest guest){
        otherGuests.add(guest);
    }

    public void extractGuests(){
        String extract = "";
        for( Guest guest : otherGuests){
            extract += guest.getFirstName() + " " + guest.getLastName() + " ";
        }
        System.out.println(extract);
    }

    public void removeGuest(Guest guest){
        otherGuests.remove(guest);
    }

    public List<Guest> getOtherGuests(){
        return new ArrayList<>(otherGuests);
    }


}
