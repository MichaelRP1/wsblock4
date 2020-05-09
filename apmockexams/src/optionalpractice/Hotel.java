package optionalpractice;

import java.util.ArrayList;

public class Hotel {
    private Reservation[] rooms;
    private ArrayList waitList;

    // Part A
    public Reservation requestRoom(String guestName) {
        for(int i = 0; i < rooms.length; i++) {
            if(rooms[i] == null) {
                rooms[i] = new Reservation(guestName, i);
                return rooms[i];
            }
        }
        waitList.add(guestName);
        return null;
    }

    // Part B
    public Reservation cancelAndReassign(Reservation res) {
        int room = res.getRoomNumber();
        if(waitList.size() > 0) {
            rooms[room] = requestRoom((String) waitList.remove(0));
            return rooms[room];
        }
        rooms[room] = null;
        return null;
    }
}
