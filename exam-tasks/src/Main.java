public class Main {
  public static void main(String[] args) {
    Copy copy = new Copy();

    if (args.length == 0) {
      copy.printUsage(args);
    }
  }
}
