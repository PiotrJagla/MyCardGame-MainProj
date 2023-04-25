package com.example.demo.Duel.Services;

import com.example.demo.CardsServices.Cards.Card;

import java.util.ArrayList;
import java.util.List;

public class Row {

    private List<Card> cards;

    public Row() {
        cards = new ArrayList<>();
    }

    public void clearRow(){
        cards.clear();
    }

    public void play(Card aCard){
        if(aCard.getDisplay().getName().equals("Leader")){
            for(Card card: cards){
                card.boostPointsBy(2);
            }
        }
        cards.add(aCard);
    }

    public void play(Card aCard, Card playedOnCard){
        if(aCard.getDisplay().getName().equals("Leader")){
            for(Card card: cards){
                card.boostPointsBy(2);
            }
        }
        cards.add(aCard);
    }

    public void boost(Card aCard){
        int cardIndex = cards.indexOf(aCard);
        cards.get(cardIndex).boostPointsBy(3);
    }

    public int getRowPoints(){
        int result = 0;
        for(int i = 0 ; i < cards.size() ; ++i){
            result += cards.get(i).getPoints();
        }
        return result;
    }

    public List<Card> getCards() {
        return cards;
    }

    public Card get(int cardId){
        return cards.get(cardId);
    }
}