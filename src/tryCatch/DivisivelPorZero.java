package tryCatch;

import java.util.Scanner;

public class DivisivelPorZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o numerador: ");
        int numerador = input.nextInt();

        System.out.println("Informe o denominador: ");
        int denominador = input.nextInt();

        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: Divisão por zero não permitida.");
        }
    }
}
