package filesDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceWord{
  public static void main(String[] args) throws FileNotFoundException {
    if (args.length != 4) {
      System.out.println("Usage java ReplaceText SourceFile TargetFile oldStr newStr");
      System.exit(1);
    }
    File sourceFile = new File(args[0]);
    if (!sourceFile.exists()) {
      System.out.println("Source file " + args[0] + " doesn't exists.");
      System.exit(2);
    }

    File targetFile = new File(args[1]);
    if (targetFile.exists()) {
      System.out.println("Target file " + args[1] + " already exists.");
      System.exit(3);
    }

    try (
            Scanner scanner = new Scanner(sourceFile);
            PrintWriter writer = new PrintWriter(targetFile);
    ) {
      while (scanner.hasNext()) {
        String s1 = scanner.nextLine();
        String s2 = s1.replaceAll(args[2], args[3]);
        writer.println(s2);
      }
    }
  }
}
