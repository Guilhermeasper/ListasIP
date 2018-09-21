import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int p,v,f;
		Scanner in = new Scanner(System.in);
		p = in.nextInt();
		v = p/3;
		f = p%3;
		System.out.printf("%d%n%d", v, f);
  }
}