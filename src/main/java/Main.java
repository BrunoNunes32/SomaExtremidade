import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    System.out.println("Informe o inicio do intervalo: ");

    int inicio = leitor.nextInt();
    int i = inicio;// VARIÁVEL CONTADORA
    int somaInter = inicio; // VARIÁVEL DE INCREMENTAÇÃO

    System.out.println("Informw o fim do intervalo: ");
    int fim = leitor.nextInt();

    // LAÇO QUE FAZ A SOMA DOS INTERVALOS
    while (i < fim) {
      i++;
      somaInter += i;
    }
    System.out.println(somaInter);
    leitor.close();
  }
}