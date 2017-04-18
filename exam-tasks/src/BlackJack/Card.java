package BlackJack;

public class Card {
  String color;
  String value;

  Card (String value, String color) {
    this.value = value;
    this.color = color;
  }

  public void printCards() {
    System.out.println(this.value + " " + this.color);
  }

}
