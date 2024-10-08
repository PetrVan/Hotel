import java.math.BigDecimal;

public class Room {
    /**
     * int numberOfRoom - číslo pokoje
     */
    private int numberOfRoom;
    /**
     *  int numberOfBeds - počet postelí na jednom pokoji
     */
    private int numberOfBeds;
    /**
     * Cena pokoje
     */
    private BigDecimal price;
    /**
     * Pokoj s balkénem
     */
    private boolean isTerrace;
    /**
     * Pokoj s výhledem na moře
     */
    private boolean isSeaView;

    /**
     * Vytvoří instanci objektu pokoje
     * @param nubmerOfRoom číslo pokoje
     * @param numberOfBeds počet postelí na pokoji
     * @param price cena pokoje
     * @param isTerrace pokoj s balkónem
     * @param isSeaView pokoj s výhledem na moře
     */
    public Room(int nubmerOfRoom, int numberOfBeds, BigDecimal price, boolean isTerrace, boolean isSeaView ){
        this.numberOfRoom = nubmerOfRoom;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isTerrace = isTerrace;
        this.isSeaView = isSeaView;
    }
    // Gettry a settry
    public int getNumberOfRoom() {
        return numberOfRoom;
    }

    public void setNumberOfRoom(int numberOfRoom) {
        this.numberOfRoom = numberOfRoom;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public boolean isTerrace() {
        return isTerrace;
    }

    public void setTerrace(boolean terrace) {
        isTerrace = terrace;
    }

    public boolean isSeaView() {
        return isSeaView;
    }

    public void setSeaView(boolean seaView) {
        isSeaView = seaView;
    }
}
