import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	Scanner in = new Scanner (System.in);
		int m = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		double c1 = 80/a;
		double c2 = 100/b;
		double c3 = 120/c;
		double c4 = 80/d;
		if(c1>=c2 && c1>=c3 && c1>=c4 && m>=a) {
			System.out.print("Verde");
		}else if(c2>=c1 && c2>=c3 && c2>=c4 && m>=b) {
			System.out.print("Vermelho");
		}else if(c3>=c1 && c3>=c2 && c3>=c4 && m>=c) {
			System.out.print("Roxo");
		}else if(c4>=c1 && c4>=c2 && c4>=c3 && m>=d) {
			System.out.print("Amarelo");
		}else {
			System.out.print("Acho que vou a pe :(");
		}
		in.close();	
  }
}