import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    		Scanner in = new Scanner(System.in);
		String p = in.next();
		String l = in.next();
		String s = in.next();
		boolean frente = true;
		if(p.charAt(0) == 'f' || p.charAt(0) == 'F') {
			if(p.charAt(p.length()-1) == 'r' || p.charAt(p.length()-1) == 'R') {
				System.out.print("Direita");
				frente = false;
			}
		}
		if(l.charAt(0) == 'f' || l.charAt(0) == 'F') {
			if(l.charAt(l.length()-1) == 'r' || l.charAt(l.length()-1) == 'R') {
				System.out.print("Meio");
				frente = false;
			}
		}
		if(s.charAt(0) == 'f' || s.charAt(0) == 'F') {
			if(s.charAt(s.length()-1) == 'r' || s.charAt(s.length()-1) == 'R') {
				System.out.print("Esquerda");
				frente = false;
			}
		}
		if(frente) {
			System.out.print("Vou em frente");
		}
  }
}