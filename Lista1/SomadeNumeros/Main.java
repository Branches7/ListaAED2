import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner dgt = new Scanner(System.in);
    int num = 0, soma = 0;
    
    while (num != -1){
    System.out.println("Numero: ");
    num = dgt.nextInt();
      if (num == -1){
        System.out.println(soma);
      }
      else{
        soma = soma + num;
      }
    }
  }
}