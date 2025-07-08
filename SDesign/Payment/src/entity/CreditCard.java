package entity;

public class CreditCard extends Card{

    public CreditCard(String cardNo, String userName) {
        super(cardNo, userName);
    }

    @Override
    public void pay(){
        System.out.println("Making payment via Credit Card");
    }
}
