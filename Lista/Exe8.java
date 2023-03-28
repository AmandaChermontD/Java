package Lista;

import java.util.Scanner;


public class Exe8 {
	public void Exe8() {
	} 
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, num3, maior, meio,menor;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextInt();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextInt();

        System.out.print("Digite o terceiro número: ");
        num3 = input.nextInt();


        if (num1 > num2 && num1 > num3) {
            maior = num1;
            if (num2 > num3) {
                meio = num2;
                menor = num3;
            } else {
                meio = num3;
                menor = num2;
            }
        } else if (num2 > num1 && num2 > num3) {
            maior = num2;
            if (num1 > num3) {
                meio = num1;
                menor = num3;
            } else {
                meio = num3;
                menor = num1;
            }
        } else {
            maior = num3;
            if (num1 > num2) {
                meio = num1;
                menor = num2;
            } else {
                meio = num2;
                menor = num1;
            }
        }

        System.out.println("Os números informados em ordem decrescente são: " + maior + ", " + meio + ", " + menor);
    }

}