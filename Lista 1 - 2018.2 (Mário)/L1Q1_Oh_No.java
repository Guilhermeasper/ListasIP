import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	Scanner in = new Scanner (System.in);
		int d = in.nextInt();
		if(d==1) {
			System.out.print("Life Mushroom");
		}else if(d==2) {
			System.out.print("Fire Flower");
		}else if(d==3) {
			System.out.print("Boost Star");
		}else if(d==4){
			System.out.print("Mega Mushroom");
		}
		in.close();
  }
}