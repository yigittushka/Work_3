package Booking;

public class Room {
    private int numberOfPerson;
    private int amountPriceRoom;
    private boolean free;

    public int getNumberOfPerson() {
        return numberOfPerson;
    }

    public void setNumberOfPerson(int numberOfPerson) {
        this.numberOfPerson = numberOfPerson;
    }

    public int getAmountPriceRoom() {
        return amountPriceRoom;
    }

    public void setAmountPriceRoom(int amountPriceRoom) {
        this.amountPriceRoom = amountPriceRoom;
    }

    public boolean isFree() {
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

    public Room(int numberOfPerson, int amountPriceRoom, boolean free) {
        this.numberOfPerson = numberOfPerson;
        this.amountPriceRoom = amountPriceRoom;
        this.free = free;
    }
}
