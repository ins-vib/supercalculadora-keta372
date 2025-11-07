package org.yourcompany.calculadora;
import java.util.Scanner;

public class SuperCalculadora {

    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }

    public static int calcularPotencia(int base, int exponent) {
        if (exponent == 0) return 1;
        int resultat = base;
        for (int i = 1; i < exponent; i++) {
            resultat = multiplicar(resultat, base);
        }
        return resultat;
    }

    private static int multiplicar(int a, int b) {
        int resultat = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultat += a;
        }
        return b < 0 ? -resultat : resultat;
    }

    public static int nombreDigits(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;
        int digits = 0;
        while (n > 0) {
            n /= 10;
            digits++;
        }
        return digits;
    }

    public static void mostrarMenuConsola() {
        System.out.println("\n Menú de SuperCalculadora:");
        System.out.println("1 - Suma dels primers n números");
        System.out.println("2 - Factorial d'un nombre");
        System.out.println("3 - Suma dels quadrats dels primers n números");
        System.out.println("4 - Potència d'un nombre");
        System.out.println("5 - Nombre de dígits d'un nombre");
        System.out.println("6 - Sortir");
        System.out.print("Escull una opció: ");
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int opcio;

        System.out.println("EXEMPLES DE PROVA");
        System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        System.out.println("Factorial de 5: " + calcularFactorial(5));
        System.out.println("Factorial de 7: " + calcularFactorial(7));
        System.out.println("Factorial de 10: " + calcularFactorial(10));

        System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

        System.out.println("Nombre de dígits de 12345: " + nombreDigits(12345));
        System.out.println("\n");

        do {
            mostrarMenuConsola();
            opcio = lector.nextInt();

            switch (opcio) {
                case 1:
                    System.out.print("Introdueix n: ");
                    int n1 = lector.nextInt();
                    System.out.println("Resultat: " + sumaPrimersNumeros(n1));
                    break;
                case 2:
                    System.out.print("Introdueix n: ");
                    int n2 = lector.nextInt();
                    System.out.println("Resultat: " + calcularFactorial(n2));
                    break;
                case 3:
                    System.out.print("Introdueix n: ");
                    int n3 = lector.nextInt();
                    System.out.println("Resultat: " + sumaQuadrats(n3));
                    break;
                case 4:
                    System.out.print("Introdueix la base: ");
                    int base = lector.nextInt();
                    System.out.print("Introdueix l'exponent: ");
                    int exponent = lector.nextInt();
                    System.out.println("Resultat: " + calcularPotencia(base, exponent));
                    break;
                case 5:
                    System.out.print("Introdueix el nombre: ");
                    int n4 = lector.nextInt();
                    System.out.println("El nombre té " + nombreDigits(n4) + " dígits.");
                    break;
                case 6:
                    System.out.println("Sortint de la SuperCalculadora. Fins aviat!");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna-ho a intentar.");
            }
        } while (opcio != 6);
        lector.close();
    }
}
