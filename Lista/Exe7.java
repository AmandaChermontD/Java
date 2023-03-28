package Lista;

import java.util.Scanner;


public class Exe7 {
	public void Exe7() {
	} 

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, result;
        
        System.out.print("Digite um número inteiro: ");
        num = input.nextInt();
        
        if (num % 2 == 0) {
            result = num + 5;
        } else {
            result = num + 8;
        }
        
        System.out.println("O resultado é: " + result);
    }
}





