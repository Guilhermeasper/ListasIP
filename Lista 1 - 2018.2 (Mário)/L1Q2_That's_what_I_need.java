import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    		Scanner in = new Scanner (System.in);
		String d = in.nextLine();
		if(d.equals("Zero")) {
			System.out.printf("%d", 0);
		}else if(d.equals("Um")) {
			System.out.print(1);
		}else if(d.equals("Dois")) {
			System.out.print(2);
		}else if(d.equals("Tres")) {
			System.out.print(3);
		}else if(d.equals("Quatro")) {
			System.out.print(4);
		}else if(d.equals("Cinco")) {
			System.out.print(5);
		}else if(d.equals("Seis")) {
			System.out.print(6);
		}else if(d.equals("Sete")) {
			System.out.print(7);
		}else if(d.equals("Oito")) {
			System.out.print(8);
		}else if(d.equals("Nove")) {
			System.out.print(9);
		}
		in.close();
  }
}