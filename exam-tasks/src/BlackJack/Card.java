package BlackJack;

public class Card {
  String color;
  String value;
  String[] colors = {"Spades", "Diamonds", "Hearts", "Clubs"};
  String[] values = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
  int randomColorIndex = (int) Math.random() * 4;
  int randomValueIndex = (int) Math.random() * 14;

  Card (String value, String color) {
    this.value = value;
    this.color = color;
  }

  public void printCards() {
    System.out.println(this.value + " " + this.color);
  }

  public Card generateCard() {
    Card card = new Card(values[randomValueIndex], colors[randomColorIndex]);
    return card;
  }
}
