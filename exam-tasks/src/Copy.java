public class Copy {

  public void printUsage() {
    System.out.println("copy [source] [destination]");
  }

  public void printNoDestination() {
    System.out.println("No destination provided");
  }
}

// This should be the basic replica of the 'cp' command
// When just one argument is provided print out
// No destination provided
// When both arguments provided and the source is a file
// Read all contents from it and write it to the destination
