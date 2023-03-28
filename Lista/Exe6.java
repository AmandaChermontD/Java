package Lista;

import java.util.Scanner;


public class Exe6 {
	public void Exe6() {
	} 
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean valor1, valor2;
        
        System.out.print("Digite o primeiro valor (true/false): ");
        valor1 = input.nextBoolean();
        
        System.out.print("Digite o segundo valor (true/false): ");
        valor2 = input.nextBoolean();
        
        if (valor1 && valor2) {
            System.out.println("Os dois são verdadeiros.");
        } else if (!valor1 && !valor2) {
            System.out.println("Os dois são falsos.");
        } else {
            System.out.println("Um dos valores é falso.");
        }
        
       
    }
}