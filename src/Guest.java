import java.time.LocalDate;

public class Guest {
    private String firstName;
    private String lastName;
    private LocalDate birthdate;

    public Guest(String firstName, String lastName, LocalDate birthdate){
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
    }

}
