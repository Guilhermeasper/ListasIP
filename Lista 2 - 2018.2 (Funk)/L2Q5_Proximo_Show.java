import java.io.*;
import java.util.*;

public class HuxleyCode {
  public static void main(String args[]) {
    int diaAtual, mesAtual, anoAtual, diaShow, mesShow, anoShow, mesDias, diasAteOShow = 0, i, j, k;
        Scanner in = new Scanner(System.in);
        diaAtual = in.nextInt();
        mesAtual = in.nextInt();
        anoAtual = in.nextInt();
        diaShow = in.nextInt();
        mesShow = in.nextInt();
        anoShow = in.nextInt();
        in.close();
        for (i = anoAtual; i <= anoShow; i++) {
            for (j = mesAtual; j <= 12; j++) {
                switch (j) {
                    case 1:
                    case 3:
                    case 5:
                    case 7:
                    case 8:
                    case 10:
                    case 12:
                        mesDias = 31;
                        break;
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        mesDias = 30;
                        break;
                    default:
                        if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {
                            mesDias = 29;
                        } else {
                            mesDias = 28;
                        }
                }
                        for (k = diaAtual; k <= mesDias; k++) {
                            if (k == diaShow && j == mesShow && i == anoShow) {
                                break;
                            } else {
                                diasAteOShow += 1;
                            }
                        }
                        diaAtual = 1;
                        if (j == mesShow && i == anoShow) {
                            break;
                        }
                }
                mesAtual = 1;
            }
        System.out.printf("%d", diasAteOShow);
        
  }
}