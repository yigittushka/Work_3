package Booking.servis;

import Booking.Bill;
import Booking.Client;
import Booking.Hotel;
import Booking.Room;

public class BookingService {
    public  void  book (Hotel h, Client c, int numberOfPerson){
        Room [] rooms = h.getRooms();
        boolean isFreeRooms = false;
        for(Room r : rooms){
            if(r.isFree()){
                isFreeRooms = true;
            }
        }

        if(!isFreeRooms){
            System.out.println("Свободный номеров в отеле: " + h.getNameHotel() + " - нет");
        }

        bookRooms(c, numberOfPerson, rooms);
    }

    private void bookRooms(Client c, int numberOfPerson, Room[] rooms) {
        boolean succses = false;
        for (Room r : rooms){
             if(r.getNumberOfPerson() == numberOfPerson){
                 succses = true;
                 System.out.println("Нашелся свободный номер для клиента: " + c.getName());
                 if(c.getBill().getAmount() >= r.getAmountPriceRoom()){
                     Bill clientBill = c.getBill();
                     clientBill.setAmount(clientBill.getAmount() - r.getAmountPriceRoom());
                     r.setFree(false);
                     System.out.println("Номер был успешно забронирован: " + c.getName());
                 }else {
                     System.out.println("Не хватает денег у клиента: " + c.getName());
                 }
             }
        }
        if( !succses) {
            System.out.println("Не нашлось свободных номеров для клмента: " + c.getName());
        }
    }
}
