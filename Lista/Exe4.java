package Lista;

import java.util.Scanner;


public class Exe4 {
	public void Exe4() {
	} 
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a, b, c;
    
    System.out.print("Digite o primeiro número: ");
    a = input.nextInt();
    
    System.out.print("Digite o segundo número: ");
    b = input.nextInt();
    
    if (a == b) {
        c = a + b;
    } else {
        c = a * b;
    }
    
    System.out.println("O resultado é: " + c);
    
}
}