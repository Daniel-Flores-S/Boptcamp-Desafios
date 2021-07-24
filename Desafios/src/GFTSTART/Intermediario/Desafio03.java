package GFTSTART.Intermediario;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

public class Desafio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));

        ArrayList<Integer>  lista = new ArrayList<Integer>();

        int  n  =sc.nextInt();

        while(n-->0) {
            lista.add(sc.nextInt());
        }

        SortedMap<Integer, Integer> contaQuant = new TreeMap<>();
        lista.forEach(id -> contaQuant.compute(id, (k   , v) -> (v == null ? 1 : v + 1)));

        contaQuant.entrySet().forEach(entry->{
            System.out.printf("%d aparece %d vez(es)\n", entry.getKey(), entry.getValue());
        });

        sc.close();
    }
}
