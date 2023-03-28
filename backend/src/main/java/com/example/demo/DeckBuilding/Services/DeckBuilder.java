package com.example.demo.DeckBuilding.Services;

import com.example.demo.Cards.Card;

import java.util.List;

public interface DeckBuilder {
    List<Card> GetCardsPossibleToAdd();

    void AddCardToDeck(String CardName);

    void PutCardFromDeckBack(String CardName);

    List<Card> GetPlayerDeck();


}