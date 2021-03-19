import java.util.Scanner;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    Scanner dgt = new Scanner(System.in);

    int n = 10;
    int num[] = new int[n];

    for (int i=0; i<n; i++){
      System.out.printf("Numero: ");
      num[i] = dgt.nextInt();
    }
    int numdif[] = Arrays.stream(num).distinct().toArray();

    for (int i=0; i<numdif.length; i++){
      System.out.printf("%2d", numdif[i]);
    }
  }
}