import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    	Scanner in = new Scanner(System.in);
		String hero = in.next();
		String flor = in.next();
		int bowserVida = in.nextInt();
		
		if(hero.equals("Mario") && flor.equals("FireFlower")) {
			if(bowserVida <= (73*4)) {
				System.out.printf("%s conseguiu derrotar o Bowser e salvar a princesa Peach.", hero);
			}else {
				System.out.print("O Bowser conseguiu escapar.");
			}
		}else if(hero.equals("Mario") && flor.equals("IceFlower")) {
			if(bowserVida <= (50*4)) {
				System.out.printf("%s conseguiu derrotar o Bowser e salvar a princesa Peach.", hero);
			}else {
				System.out.print("O Bowser conseguiu escapar.");
			}
		}else if(hero.equals("Mario") && flor.equals("BoomerangFlower")) {
			if(bowserVida <= (32*4)) {
				System.out.printf("%s conseguiu derrotar o Bowser e salvar a princesa Peach.", hero);
			}else {
				System.out.print("O Bowser conseguiu escapar.");
			}
		}else if(hero.equals("Luigi") && flor.equals("FireFlower")) {
			if(bowserVida <= (70*4)) {
				System.out.printf("%s conseguiu derrotar o Bowser e salvar a princesa Peach.", hero);
			}else {
				System.out.print("O Bowser conseguiu escapar.");
			}
		}else if(hero.equals("Luigi") && flor.equals("IceFlower")) {
			if(bowserVida <= (45*4)) {
				System.out.printf("%s conseguiu derrotar o Bowser e salvar a princesa Peach.", hero);
			}else {
				System.out.print("O Bowser conseguiu escapar.");
			}
		}else if(hero.equals("Luigi") && flor.equals("BoomerangFlower")) {
			if(bowserVida <= (28*4)) {
				System.out.printf("%s conseguiu derrotar o Bowser e salvar a princesa Peach.", hero);
			}else {
				System.out.print("O Bowser conseguiu escapar.");
			}
		}
  }
}