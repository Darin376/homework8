package teachmeskills.lesson8.example1.apstract;

import teachmeskills.lesson8.example1.apstract.card.BaseCard;
import teachmeskills.lesson8.example1.apstract.card.BelCard;
import teachmeskills.lesson8.example1.apstract.card.MasterCard;
import teachmeskills.lesson8.example1.apstract.card.VisaCard;
import teachmeskills.lesson8.example1.apstract.client.Client;

import java.util.Date;

public class Ranner {
    public static void main(String[] args) {
        Client client = new Client(1, "Oleg", getCards());



    };
    private static BaseCard[] getCards () {
        BelCard belCard1 = new BelCard(3311, 332.55, new Date());
        BelCard belCard2 = new BelCard(222, 222.76, new Date());
        MasterCard masterCard1 = new MasterCard(222, 222.76, new Date(), "maxer");
        VisaCard visaCard1 = new VisaCard(222, 222.76, new Date(), "father", "Poland");

        BaseCard[] cards = {belCard1, belCard2, masterCard1, visaCard1};
        for(BaseCard card : cards) {
            card.cardInfo();
            System.out.println("proverka  " + card.sanksinfo());
        }
//        int[] mass = new int[]{2,4,2,5};
//        for(int g :mass) {
//            System.out.println(g);
//        };
        return cards;
    };



};
