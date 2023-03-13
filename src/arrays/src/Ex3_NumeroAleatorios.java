import java.util.Random;

public class Ex3_NumeroAleatorios {
  public static void main(String[] args) {
    Random random = new Random();

    int[] numerosAleatorios = new int[20];

    for(int i = 0; i < numerosAleatorios.length; i++){
      int numero = random.nextInt(100);
      numerosAleatorios[i] = numero;
    }

    System.out.print("Numeros Aleatorios: ");
    for (int numero : numerosAleatorios) {
      System.out.print(numero + " ");
    }
    System.out.print("\nAntecessor dos numeros Aleatorios: ");
    for (int numero : numerosAleatorios) {
      System.out.print((numero-1) + " ");
    }
    System.out.print("\nSucessores dos numeros Aleatorios: ");
    for (int numero : numerosAleatorios) {
      System.out.print((numero+1) + " ");
    }
  }
}
