import java.util.Scanner;

public class pregunta1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicito valor inical

        System.out.print("Ingrese el valor inicial: ");
        int valorInicial = scanner.nextInt();
        System.out.print("Ingrese el valor final: ");
        int valorFinal = scanner.nextInt();
        
        // Solicito el tamanio del grupo

        System.out.print("Ingresa el tamaño del grupo a visualizar: ");
        int tamanoGrupo = scanner.nextInt();
        
        int start = valorInicial;
        int end = start + tamanoGrupo - 1;
        char continuar;

        do {
            for (int i = start; i <= end && i <= valorFinal; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // nueva linea 

            if (end >= valorFinal) {
                break;
            }

            System.out.print("¿Desea continuar con el siguiente grupo? (s/n): ");
            continuar = scanner.next().charAt(0);

            start = end + 1;
            end = start + tamanoGrupo - 1;
        } while (continuar == 's' || continuar == 'S');

        scanner.close();
    }
}
