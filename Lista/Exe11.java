package Lista;

import java.util.Scanner;


public class Exe11 {
	public void Exe11() {
		
	}
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int numId;
	    double nota1, nota2, nota3, mediaExe, mediaAprov;
	    char conceito, sit;

	    System.out.print("Digite o número de identificação do aluno: ");
	    numId = sc.nextInt();

	    System.out.print("Digite a nota da primeira: ");
	    nota1 = sc.nextDouble();

	    System.out.print("Digite a nota da segunda: ");
	    nota2 = sc.nextDouble();

	    System.out.print("Digite a nota da terceira: ");
	    nota3 = sc.nextDouble();

	    System.out.print("Digite a média dos exercícios: ");
	    mediaExe = sc.nextDouble();

	    mediaAprov = (nota1 + nota2 * 2 + nota3 * 3 + mediaExe) / 7;

	    if (mediaExe >= 90) {
	      conceito = 'A';
	      sit = 'A';
	    } else if (mediaAprov>= 75) {
	      conceito = 'B';
	      sit = 'A';
	    } else if (mediaAprov >= 60) {
	      conceito = 'C';
	      sit = 'A';
	    } else if (mediaAprov >= 40) {
	      conceito = 'D';
	      sit = 'R';
	    } else {
	      conceito = 'E';
	      sit = 'R';
	    }

	    System.out.println("Número de identificação: " + numId);
	    System.out.println("Notas: " + nota1 + ", " + nota2 + ", " + nota3);
	    System.out.println("Média dos exercícios: " +  mediaExe);
	    System.out.println("Média de aproveitamento: " + mediaAprov);
	    System.out.println("Conceito: " + conceito);
	    System.out.println(sit == 'A' ? "Aprovado" : "Reprovado");
	  }
	}


