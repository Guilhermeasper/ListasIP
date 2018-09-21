import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
		double dmax = 0;
		int i = in.nextInt();
		double a = in.nextDouble();
		double d = in.nextDouble();
		int p = in.nextInt();
		String s = in.next();
		if(s.equals("Sim")){
			dmax = ((Math.pow(i+5, 3))/(Math.sqrt(a)+(d/2)+((p+50)/3)));
		}
		if(s.equals("Nao")){
			dmax = (Math.pow(i, 3))/(Math.sqrt(a)+(d/2)+((p)/3));
		}
		if(dmax >= 100.0){
			System.out.println("Voce consegue");
		}else{
			System.out.println("Isso e perda de tempo");
		}
  }
}