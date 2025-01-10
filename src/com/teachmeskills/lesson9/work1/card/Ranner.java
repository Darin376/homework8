package com.teachmeskills.lesson9.work1.card;

import com.teachmeskills.lesson9.work1.card.client.Client;
import com.teachmeskills.lesson9.work1.card.fabric.CardsFabric;
import com.teachmeskills.lesson9.work1.card.imple.BelCard;
import com.teachmeskills.lesson9.work1.card.imple.VisaCard;

import java.util.Date;

public class Ranner {
    public static void main(String[] args) {

        BaseCard[] cards = CardsFabric.crieteCards();

        Client client = new Client("Pavel", cards);
        for (BaseCard card : client.cards) {
            System.out.println(card.getCardNumberOne() + card.getBalanceONe() + card.getVaiteDate());
        }

    }














//
//    private static BaseCard[] crieteCards() {
//        BaseCard card1 = new BelCard("233", 11, new Date());
//        BaseCard card2 = new BelCard("2312", 11, new Date());
//        BaseCard card3 = new VisaCard("2131333", 23, new Date(), "Belka");
//        BaseCard card4 = new VisaCard("2221133", 25, new Date(), "Belka");
//
//        BaseCard[] cards = new BaseCard[4];
//        cards[0] = card1;
//        cards[1] = card2;
//        cards[2] = card3;
//        cards[3] = card4;
//        return cards;
//    };
}
