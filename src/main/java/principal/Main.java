package principal;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Quantos números você vai digitar?");
    int n = input.nextInt();
    double[] vect = new double[n];

    for (int i = 0; i < vect.length; i++) {
        System.out.println("Digite o próximo número: ");
        vect[i] = input.nextDouble();

    }
    double soma = 0.0;
    for (int i = 0; i < vect.length; i++) {
        soma += vect[i];
    }
    double media = soma / vect.length;
    System.out.println("Valores: ");
    for(int i = 0; i < vect.length; i++){
        System.out.println("Valor "+ i +": "+vect[i]);
    }



    System.out.println("soma: " + soma + "\n"
                    + "media: " + media );



    }
}