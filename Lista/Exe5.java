package Lista;

import java.util.Scanner;


public class Exe5 {
	public void Exe5() {
	} 
	
	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, result;
        
        System.out.print("Digite um número: ");
        num = input.nextInt();
        
        if (num >= 0) {
            result = num * 2;
        } else {
            result = num * 3;
        }
        
        System.out.println("O resultado é: " + result);
       
     
    }
}