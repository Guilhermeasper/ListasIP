import java.util.Scanner;

public class L5Q1_Start_of_Something_New {
    private static int Am_i_drunk(int bebidas) {
        if (bebidas == 0) {
            return 0;
        } else if (bebidas == 1) {
            return 1;
        } else {
            return Am_i_drunk(bebidas - 1) + Am_i_drunk(bebidas - 2);
        }
    }

    public static void main(String args[]) {
        int bebidasTroy, bebidasGabriella, embriaguezTroy, embriaguezGabriella;
        double vergonhaTroy, vergonhaGrabriella;
        Scanner in = new Scanner(System.in);
        vergonhaTroy = in.nextDouble();
        bebidasTroy = in.nextInt();
        vergonhaGrabriella = in.nextDouble();
        bebidasGabriella = in.nextInt();
        embriaguezTroy = Am_i_drunk(bebidasTroy);
        embriaguezGabriella = Am_i_drunk(bebidasGabriella);
        if (vergonhaTroy > embriaguezTroy) {
            System.out.println("Nao foi dessa vez!! Troy nao teve coragem o suficiente.");
        } else {
            System.out.println("Esse pode ser o comeco de algo novo!! Troy vai cantar!!");
        }
        if (vergonhaGrabriella > embriaguezGabriella) {
            System.out.println("Nao foi dessa vez!! Gabriella nao teve coragem o suficiente.");
        } else {
            System.out.println("Esse pode ser o comeco de algo novo!! Gabriella vai cantar!!");
        }

    }
}