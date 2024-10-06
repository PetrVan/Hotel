import java.math.BigDecimal;

public class Room {
    private int numberOfRoom;
    private int numberOfBeds;
    private BigDecimal price;
    private boolean isTerrace;
    private boolean isSeaView;

    public Room(int nubmerOfRoom, int numberOfBeds, BigDecimal price, boolean isTerrace, boolean isSeaView ){
        this.numberOfRoom = nubmerOfRoom;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isTerrace = isTerrace;
        this.isSeaView = isSeaView;
    }

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
