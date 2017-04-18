import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Copy {

  public void printUsage() {
    System.out.println("copy [source] [destination]");
  }

  public void printNoDestination() {
    System.out.println("No destination provided");
  }

  public void printFiletoOther(String[] args) {
    Path filePath = Paths.get(args[0]);
    try {
      List<String> content = Files.readAllLines(filePath);
      for (int i = 0; i < content.size(); i++) {
        System.out.println(content.get(i));
      }
    } catch (Exception e){
      System.out.println("I'm sorry, I could not read the file");
    }
  }
}

// This should be the basic replica of the 'cp' command
// When both arguments provided and the source is a file
// Read all contents from it and write it to the destination
