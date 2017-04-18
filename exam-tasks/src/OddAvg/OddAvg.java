package OddAvg;

import java.util.ArrayList;
import java.util.List;

public class OddAvg {
  public static void main(String[] args) {
    OddAvg oddAvg = new OddAvg();
    List<Integer> arrayList = new ArrayList<>();
    /*for (int i = 1; i < 10; i++) {
      arrayList.add(i);
    }*/
    arrayList.add(5);
    arrayList.add(13);
    arrayList.add(14);
    arrayList.add(17);
    arrayList.add(16);
    System.out.println(oddAvg.oddsAverage(arrayList));
  }

  public static double oddsAverage(List<Integer> arraylist) {
    List<Integer> listOfOdds = new ArrayList<>();
    double sumOfOdds = 0;
    double averageOfOdds = 0;
    for (int i = 0; i < arraylist.size(); i++ ) {
      if (arraylist.get(i) % 2 == 1) {
        listOfOdds.add(arraylist.get(i));
      }
    }
    for (int j = 0; j < listOfOdds.size(); j++) {
      sumOfOdds += listOfOdds.get(j);
    }
    averageOfOdds = sumOfOdds / listOfOdds.size();
    return averageOfOdds;
  }
}
