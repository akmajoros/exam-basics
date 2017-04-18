import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
    Path pathToCopy = Paths.get(args[1]);
    try {
      List<String> content = Files.readAllLines(filePath);
      List<String> toCopy = new ArrayList<>();
        Files.write(pathToCopy, content);
        System.out.println("Copy successfully performed");
    } catch (Exception e){
      System.out.println("I'm sorry, I am unable to read the file");
    }
  }
}
