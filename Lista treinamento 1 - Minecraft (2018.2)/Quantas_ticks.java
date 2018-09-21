import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	int d, c, t;
		Scanner in = new Scanner(System.in);
		d = in.nextInt();
		c = in.nextInt();
		t = (d*108000)/c;
		System.out.print(t);
  }
}