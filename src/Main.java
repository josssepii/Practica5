import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcion = sc.nextInt();

        do {
            System.out.println("""
            Elige uno de los 3 ejercicios:
                1. Múltiplos de 3 hasta el número que introduzcas.
                2. Introducir número y decir si es primo o no.
                3. Números fallidos y correctos
                """);

            switch (opcion) {
                case 1 -> ejercicio1(sc);
                case 2 -> ejercicio2(sc);
                case 3 -> ejercicio3(sc);
                case 4 -> ejercicio4(sc);
                default -> System.out.println("Saliendo...");
            }
        }while(opcion != 5);
    }

    public static void ejercicio1(Scanner sc) {
        System.out.print("Introduce un número: ");
        int numero = sc.nextInt();
        int contador = 0;
        for (int i = 1; i <= numero; i++) {
            if (i % 3 == 0) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " múltiplos de 3.");
    }
    public static void ejercicio2(Scanner sc) {
        System.out.print("Introduce un número entero positivo: ");
        int numero = sc.nextInt();
        boolean primo = true;
        if (numero <= 1) {
            primo = false;
        } else {
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    primo = false;
                }
            }
        }
        if (primo) {
            System.out.println("El número es primo.");
        } else {
            System.out.println("El número no es primo.");
        }
    }
    public static void ejercicio3(Scanner sc) {
        System.out.print("Dime un número inicial: ");
        int ultimo = sc.nextInt();
        int contador = 1, fallados = 0, num;
        do {
            System.out.print("Dime un número: ");
            num = sc.nextInt();
            if (num != 0) {
                contador++;
                if (num > ultimo) {
                    ultimo = num;
                } else {
                    System.out.println("Fallo es menor.");
                    fallados++;
                }
            }
        } while (num != 0);
        System.out.println("Total de números introducidos: " + contador);
        System.out.println("Números fallados: " + fallados);
    }
    public static void ejercicio4(Scanner sc) {
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma = suma + (i * i);
        }
        System.out.println("La suma es: " + suma);
    }
}