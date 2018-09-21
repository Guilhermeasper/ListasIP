import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	Scanner in = new Scanner (System.in);
		int x = in.nextInt();
		int z = in.nextInt();
		double h = Math.sqrt(Math.pow(x-34, 2)+Math.pow(z-220, 2));
		double k = Math.sqrt(Math.pow(x-0, 2)+Math.pow(z-0, 2));
		double s = Math.sqrt(Math.pow(x-140, 2)+Math.pow(z-456, 2));
		System.out.printf("Distancia para Hogsmeade: %.2f%n", h);
		System.out.printf("Distancia para Kakariko: %.2f%n", k);
		System.out.printf("Distancia para Solitude: %.2f%n", s);
  }
}