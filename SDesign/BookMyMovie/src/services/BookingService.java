package services;

public class BookingService {

    //Singleton Instance
    private static BookingService instance;

    private BookingService(){

    }

    //Singleton Design Pattern
    public static BookingService Instance(){
        if(instance == null){
            instance = new BookingService();
        }
        return instance;
    }
}
