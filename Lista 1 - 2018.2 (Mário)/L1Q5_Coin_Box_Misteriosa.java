import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		if(x>y && y>z) {
			System.out.printf("%d %d %d", x, y, z);
		}else if(x>=z && z>=y) {
			System.out.printf("%d %d %d", x, z, y);
		}else if(y>=z && z>=x) {
			System.out.printf("%d %d %d", y, z, x);
		}else if(y>=x && x>=z) {
			System.out.printf("%d %d %d", y, x, z);
		}else if(z>=y && y>=x) {
			System.out.printf("%d %d %d", z, y, x);
		}else if(z>=x && x>=y) {
			System.out.printf("%d %d %d", z, x, y);
		}
		in.close();
  }
}