package Lista;

import java.util.Scanner;

public class Exe2 {

  public void Exe2 () {
}

  public void status() {
      Scanner input = new Scanner(System.in);
      String nome,sexo,estadoCivil;
      int tempoCasado =1;
      
      System.out.print("Digite o nome: ");
      nome = input.nextLine();
      
      System.out.print("Digite o sexo (M ou F): ");
      sexo = input.nextLine();
      
      System.out.print("Digite o estado civil: ");
      estadoCivil = input.nextLine();
      
      if (sexo.equals("F") && estadoCivil.equalsIgnoreCase("CASADA")) {
          System.out.print("Digite o tempo de casada em anos e se for menos de 1 ano digite 0: ");
          tempoCasado = input.nextInt();
      }
      System.out.println(nome + " é casada há " + tempoCasado + " anos.");
  } 

  

  public static void main(String[] args) {
      Exe2 obj= new Exe2 ();
      obj.status(); 
  }
}