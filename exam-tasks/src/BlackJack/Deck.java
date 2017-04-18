package BlackJack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
  List<Card> cardDeck;
  int numberOfCards;
  String[] colors = {"Spades", "Diamonds", "Hearts", "Clubs"};
  String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  int randomColorIndex = (int) Math.random() * 4;
  int randomValueIndex = (int) Math.random() * 14;

  Deck(int numberOfCards) {
    this.numberOfCards = numberOfCards;
    this.cardDeck = new ArrayList<>();
    for (int i = 0; i < numberOfCards; i++) {
      
    }
  }

}
