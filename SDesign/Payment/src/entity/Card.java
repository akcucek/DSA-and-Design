package entity;

abstract public class Card implements PaymentMethod{

    private String cardNo;
    private String userName;

    public Card(String cardNo, String userName){
        this.cardNo = cardNo;
        this.userName = userName;
    }

    public String getCardNo(){
        return cardNo;
    }

    public String getUserName(){
        return userName;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    //abstract void pay();
    //because in future we know what
    //is the role of pay Method then make class should be abstract

}
