package Booking;

import Booking.servis.BookingService;

import java.util.Scanner;

public class Main {
    public static int a = 1;
    public static void main(String[] args) {

//        Scanner scan= new Scanner(System.in);
//        int a = scan.nextInt();
//        System.out.println(a);


        Bill b1 = new Bill(100.0);
        Client yigit = new Client("Yigit", "Turdiev", "89057738127", "iev.y@yandex.ru", b1);


        Bill b2 = new Bill(200.0);
        Client aktam = new Client("Aktam", "Turdiev", "89153483296", "iev.a@yandex.ru", b2);



        Room [] MoscowHotelRooms = new Room[] {new Room(1, 90, true), new Room(2, 150, true),
        new Room(3, 200, true)};

        Hotel MoscowHotel = new Hotel("MoscowCity", MoscowHotelRooms);

        Room [] spbHotelRooms = new Room[] {new Room(3, 200, true), new Room(1, 50, true),
                new Room(2, 150, true)};

        Hotel spbHotel = new Hotel( "SPbHotel" ,spbHotelRooms);

        BookingService  bs = new BookingService();
        System.out.println("\n");
        System.out.println(a++);
        bs.book(MoscowHotel, yigit, 1);
        System.out.println("\n");
        System.out.println(a++);
        bs.book(MoscowHotel, yigit, 4);
        System.out.println("\n");
        System.out.println(a++);
        bs.book(spbHotel ,aktam, 1);
        System.out.println("\n");
        System.out.println(a++);
        bs.book(spbHotel ,aktam, 2);



    }
}


