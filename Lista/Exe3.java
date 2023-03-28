package Lista;
import java.util.Scanner;


public class Exe3 {
	public void Exe3() {
	}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int num;
    
    System.out.print("Digite um número (inteiro): ");
    num = input.nextInt();
    
    if (num % 2 == 0) {
        System.out.println("O número " + num + " é par.");
    } else {
        System.out.println("O número " + num + " é ímpar.");
    }
    

}
}