public class Main {
  public static void main(String[] args) {
    Copy copy = new Copy();

    if (args.length == 0) {
      copy.printUsage();
    } else if (args.length == 1) {
      copy.printNoDestination();
    } else if (args.length == 2) {
      copy.printFiletoOther(args);
    }
  }
}
