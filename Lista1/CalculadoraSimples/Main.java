import java.io.IOException;
import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner dgt = new Scanner(System.in);
    Calculadora c = new Calculadora();

    System.out.println("n1: ");
    double N1 = dgt.nextDouble();

    System.out.println("n2: ");
    double N2 = dgt.nextDouble();

    System.out.println("Operação: ");
    char Simbol = dgt.next().charAt(0);

    c.Operacao(N1, N2, Simbol);
    System.out.println(c.Result());
  }
}