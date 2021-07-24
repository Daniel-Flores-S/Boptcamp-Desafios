package Santander.Basicos;
/*
Você deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados são pares, quantos valores
 informados são ímpares, quantos valores informados são positivos e quantos valores informados são negativos.
Entrada
Você receberá 5 valores inteiros.
Saída
Exiba a mensagem conforme o exemplo de saída abaixo, sendo uma mensagem por linha e não esquecendo
o final de linha após cada uma.
 */
import java.util.Scanner;

public class AnaliseNumeros {
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
