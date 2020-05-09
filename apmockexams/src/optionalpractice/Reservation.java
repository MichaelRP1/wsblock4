package optionalpractice;

public class Reservation {
    private String guestName = "";
    private int roomNumber = 0;
    public Reservation(String guestName, int roomNumber) {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }
    public int getRoomNumber() {
        return roomNumber;
    }
}
