import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int l = in.nextInt();
		int p = in.nextInt();
		int h = in.nextInt();
		//x = (a + b + (|a - b|)) / 2.
		int b = (l + a + (Math.abs(l-a)))/2;
		int c = (b + p + (Math.abs(b-p)))/2;
		int m = c * h;
		System.out.printf("%d", m);
  }
}