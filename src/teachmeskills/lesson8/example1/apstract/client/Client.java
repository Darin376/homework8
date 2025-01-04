package teachmeskills.lesson8.example1.apstract.client;

import teachmeskills.lesson8.example1.apstract.card.BaseCard;

public class Client {
    long id;
    String name;

    BaseCard[] cards;

//    BelCard[] belCards;
//    MasterCard[] masterCards;
//    VisaCard[] visaCards;


    public Client(long id, String name, BaseCard[] cards) {
        this.id = id;
        this.name = name;
        this.cards = cards;
    }


}
