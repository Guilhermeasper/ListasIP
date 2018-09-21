import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	Scanner in = new Scanner (System.in);
		int d = in.nextInt();
		if(d>=0 && d<=10) {
			System.out.printf("Arthur");
		}else if(d>10 && d<=30) {
			System.out.printf("Luiz");
		}else if(d>30 && d<=100) {
			System.out.printf("Pedro");
		}else {
			System.out.printf("Nenhum");
		}
  }
}