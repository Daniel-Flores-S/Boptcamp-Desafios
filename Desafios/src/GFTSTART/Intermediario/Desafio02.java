package GFTSTART.Intermediario;

import java.io.IOException;
import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        Double soma = 0d;
        int cont = 0;

        while (true) {
            int n = leitor.nextInt();
            if (n > 0) {
                cont +=1;
                soma = soma + n;
            }
            else if(n <= 0){
                break;
            }
        }
        double media = soma / cont;
        System.out.println(String.format("%.2f", media));
    }

}
