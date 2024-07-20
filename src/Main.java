import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner calculadora = new Scanner(System.in);

        int A;
        int B;
        int soma;

        System.out.println("Digite o primeiro número ");
        A = calculadora.nextInt();

        System.out.println("Digite o segundo número");
        B = calculadora.nextInt();

        soma = A + B;
        System.out.println("Soma = " + soma);

        calculadora.close();
    }
}