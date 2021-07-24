package GFTSTART.Basico;


import java.util.Scanner;

public class Desafio03 {
	 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int  pares = 0;
        int  impares = 0;
        int  positivos = 0;
        int  negativos = 0;
        int[] VL = new int[5] ;

        for (int i = 0; i < VL.length; i++) {
            VL[i] = in.nextInt();
        }

        for (int i = 0; i < VL.length; i++) {
            if (VL[i]%2 == 0) {
                pares += 1;
            }

            if (VL[i]%2 != 0) {
                impares += 1;
            }

            if (VL[i] > 0) {
                positivos += 1;
            }

            if (VL[i] < 0) {
                negativos += 1;
            }
        }
        System.out.println(pares + " valor(es) par(es)");
        System.out.println(impares + " valor(es) impar(es)");
        System.out.println(positivos + " valor(es) positivo(s)");
        System.out.println(negativos + " valor(es) negativo(s)");

    }
}