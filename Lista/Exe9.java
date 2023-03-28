package Lista;

import java.util.Scanner;


public class Exe9 {
	public void Exe9() {
	} 
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double peso, altura, imc;

        System.out.print("Digite o seu peso em KG: ");
        peso = input.nextDouble();

        System.out.print("Digite a sua altura: ");
        altura = input.nextDouble();

        imc = peso / (altura * altura);

        System.out.printf("Seu IMC é %.2f, o que indica que você está ", imc);

        if (imc < 18.5) {
            System.out.println("abaixo do peso.");
        } else if (imc < 25) {
            System.out.println("com peso normal.");
        } else if (imc < 30) {
            System.out.println("acima do peso.");
        } else {
            System.out.println("obeso.");
        }
    }
}