package com.teachmeskills.lesson9.work1.card.client;

import com.teachmeskills.lesson9.work1.card.BaseCard;

public class Client {
    public String name;
    public BaseCard[] cards;

    public Client(String name, BaseCard[] cards) {
        this.name = name;
        this.cards = cards;
    }
}
