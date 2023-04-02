import java.util.Scanner;

public class menu2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Bienvenido al italianis que desea ordenar ");
            System.out.println("1. albondigas");
            System.out.println("2. ensalada");
            System.out.println("3. pasta");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Preparando albondigas");

                    break;
                case 2:
                    System.out.println("Preparando ensalada");

                    break;
                case 3:
                    System.out.println("Preparando pasta");

                    break;
                case 4:
                    System.out.println("salir");
                    break;
                default:
                    System.out.println("Opción inválida, por favor ingrese una opción válida.");
                    break;
            }
        } while (opcion != 4);
        sc.close();
    }

}
