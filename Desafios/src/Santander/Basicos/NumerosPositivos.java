package Santander.Basicos;

import java.util.Scanner;

public class NumerosPositivos {
    public static  void main(String args[]){
        Scanner in = new Scanner(System.in);
        int positivos = 0;
        float number =  0;
        for (int i = 0; i < 6; i++) {
            number = in.nextFloat();
            if (number > 0){
                positivos++;
            }
        }
        System.out.print(positivos+" valores positivos");
    }
}
