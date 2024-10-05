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


}
