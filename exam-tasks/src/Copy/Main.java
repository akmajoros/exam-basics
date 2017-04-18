package Copy;

public class Main {
  public static void main(String[] args) {
    Copy copy = new Copy();
    if (args[0].contains("-cp") && args.length == 1) {
      copy.printUsage();
    }
  }
}
