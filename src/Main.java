import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner soma = new Scanner(System.in);

        System.out.println("Digite o primeiro numero a ser somado: ");
        int num1 = soma.nextInt();

        System.out.println("Digite o segundo numero a ser somado: ");
        int num2 = soma.nextInt();

        int res = num1 + num2;

        System.out.println("A soma dos valor: " + num1 + " e " + num2 + " é igual a " + res);
    }
}