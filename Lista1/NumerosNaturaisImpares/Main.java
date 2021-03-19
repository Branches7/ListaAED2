import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner dgt = new Scanner(System.in);
    System.out.println("Número: ");
    int n = dgt.nextInt();
    
    int i = 0;
    int impar = 1;

    while(i < n){
      System.out.println(impar);
      i++;
      impar = impar + 2;
    }
  }
}