package Lista;

import java.util.Scanner;


public class Exe10 {
	public void Exe10() {
		
	}
    public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);

     double precoNorm, precoFin;
     int condicaoPagamento;

     System.out.print("Digite o preço normal do produto: ");
     precoNorm = input.nextDouble();

     System.out.println("Escolha a condição do pagamento:");
     System.out.println("1 - À vista em dinheiro ou cheque, recebe 10% de desconto");
     System.out.println("2 - À vista no cartão de crédito, recebe 15% de desconto");
     System.out.println("3 - Em duas vezes, preço normal de etiqueta sem juros");
     System.out.println("4 - Em duas vezes, preço normal de etiqueta mais juros de 10%");
     condicaoPagamento = input.nextInt();

     switch (condicaoPagamento) {
         case 1:
             precoFin = precoNorm * 0.9;
             break;
         case 2:
             precoFin = precoNorm * 0.85;
             break;
         case 3:
             precoFin = precoNorm;
             break;
         case 4:
             precoFin = precoNorm * 1.1;
             break;
         default:
             System.out.println("Condição de pagamento inválida!");
             return;
     }

     System.out.printf("Preço final do produto: R$%.2f", precoFin);
 }
}