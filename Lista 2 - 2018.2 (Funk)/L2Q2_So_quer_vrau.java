import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int vraus;
    String vrau = "Essas malandra, assanhadinha, que so quer";
    Scanner in = new Scanner(System.in);
    vraus = in.nextInt();
    while(vraus > 0) {
        vrau = vrau + " vrau";
        vraus -= 1;
    }
    System.out.printf("%s", vrau);
    in.close();
  }
}