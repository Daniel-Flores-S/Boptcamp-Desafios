package Santander.Intermediario;

/*
A corrida de tartarugas é um esporte que cresceu muito nos últimos anos, fazendo com que vários competidores se dediquem
a capturar tartarugas rápidas, e treina-las para faturar milhões em corridas pelo mundo. Porém a tarefa de capturar
tartarugas não é uma tarefa muito fácil, pois quase todos esses répteis são bem lentos. Cada tartaruga é classificada
em um nível dependendo de sua velocidade:
Nível 1: Se a velocidade é menor que 10 cm/h .
Nível 2: Se a velocidade é maior ou igual a 10 cm/h e menor que 20 cm/h .
Nível 3: Se a velocidade é maior ou igual a 20 cm/h .
Sua tarefa é identificar qual o nível de velocidade da tartaruga mais veloz de um grupo.
Entrada
A entrada consiste de múltiplos casos de teste, e cada um consiste em duas linhas: A primeira linha contém um inteiro
L (1 ≤ L ≤ 500) representando o número de tartarugas do grupo, e a segunda linha contém L inteiros Vi (1 ≤ Vi ≤ 50)
representando as velocidades de cada tartaruga do grupo.
Saída
Para cada caso de teste, imprima uma única linha indicando o nível de velocidade da tartaruga mais veloz do grupo.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Corrida {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int nivel = 0;
        int m = 0;

        int n;
        do {
            n = Integer.parseInt(br.readLine());
            String str = br.readLine();
            String s[] = str.split(" ");

            for (int i = 0; i < s.length; i++) {
                if (Integer.parseInt(s[i]) >= m) {
                    m = Integer.parseInt(s[i]);
                }
            }

            if (m >= 20) {
                nivel = 3;
            }
            else if (m >= 10 && nivel < 20) {
                nivel = 2;
            }
            else if (m < 10) {
                nivel = 1;
            }

            System.out.println(nivel);
            nivel = 0;
            m = 0;

        } while (br.ready());

    }
}
