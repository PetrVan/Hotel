import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;


public class Guest {
    /**
     * String fistName - jméno hosta
     */
    private String firstName;
    /**
     * String lastName - příjmení hosta
     */
    private String lastName;
    /**
     *  LocalDate birthdate - Datum narození hosta
     */
    private LocalDate birthdate;

    /**
     * Vytvoří instanci třídy Guest
     * @param firstName Jméno hosta
     * @param lastName Příjmení hosta
     * @param birthdate Narozeniny hosta
     */
    public Guest(String firstName, String lastName, LocalDate birthdate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }
    // Gettry a settry
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    /**
     * Metoda pro Výpis celého jména a datumu narození
     * @return Jméno příjmení a (datum narození)
     */
    public String getDescription(){
        return firstName + " " + lastName + " " + "(" + birthdate.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM)) + ")";
    }

}
