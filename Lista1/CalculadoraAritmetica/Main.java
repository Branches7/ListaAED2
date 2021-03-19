import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner num = new Scanner(System.in);
    System.out.println("1 - Multiplicação\n2 - Divisão\n3 - Adição\n4 - Subtração\n");
    int escolha = num.nextInt(); 
    int n1, n2;
    switch(escolha){ //swich para receber a operação desejada
      case 1:
      System.out.println("N1:");
      n1 = num.nextInt();
      System.out.println("N2:");
      n2 = num.nextInt();
      System.out.println(n1 * n2);
      break;
      case 2:
      System.out.println("N1:");
      n1 = num.nextInt();
      System.out.println("N2:");
      n2 = num.nextInt();
      try{ // Erro ao tentar dividir por zero
        System.out.println(n1 / n2);
      }
      catch(ArithmeticException e){
        System.out.println("Não é possível dividir por zero.");
      }
      break;
      case 3:
      System.out.println("N1:");
      n1 = num.nextInt();
      System.out.println("N2:");
      n2 = num.nextInt();
      System.out.println(n1 + n2);
      break;
      case 4:
      System.out.println("N1:");
      n1 = num.nextInt();
      System.out.println("N2:");
      n2 = num.nextInt();
      System.out.println(n1 - n2);
      break;
      default:
      break;
    }
  }
}
