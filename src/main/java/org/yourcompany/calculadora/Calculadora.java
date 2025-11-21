package org.yourcompany.calculadora;

import java.util.Scanner;

/**
 *
 * @author Kevin
 */


public class Calculadora {
    
    /**
     * Calcula la suma dels primers n números naturals.
     * Per exemple, si n = 5, retorna 1 + 2 + 3 + 4 + 5 = 15.
     *
     * @param n Quantitat de números naturals a sumar
     * @return La suma dels primers n números
     */
    public static int sumaPrimersNumeros(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    /**
     * Calcula el factorial d’un número enter positiu.
     * El factorial es defineix com n! = 1 × 2 × 3 × ... × n.
     * Si n = 0, retorna 1 segons la definició matemàtica.
     *
     * @param n Número del qual es vol calcular el factorial
     * @return El valor del factorial de n
     */
    public static long calcularFactorial(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
    
    /**
     * Calcula la suma dels quadrats dels primers n números naturals.
     * Per exemple, si n = 3, retorna 1² + 2² + 3² = 14.
     *
     * @param n Nombre de termes a calcular
     * @return La suma dels quadrats dels primers n números
     */
    public static int sumaQuadrats(int n) {
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            suma += i * i;
        }
        return suma;
    }
    
    /**
     * Calcula la potència d’un número utilitzant multiplicacions successives.
     * Equivalent a base^exponent.
     * Si exponent és 0, retorna 1.
     *
     * @param base Valor base de la potència
     * @param exponent Exponent al qual s’eleva la base
     * @return El resultat de base elevat a exponent
     */
    public static int calcularPotencia(int base, int exponent) {
        if (exponent == 0) return 1;
        int resultat = base;
        for (int i = 1; i < exponent; i++) {
            resultat = multiplicar(resultat, base);
        }
        return resultat;
    }
    
    /**
     * Multiplica dos nombres sencers utilitzant la suma repetida.
     * No utilitza l'operador de multiplicació.
     * Gestiona també multiplicacions amb nombres negatius.
     *
     * @param a Primer operand
     * @param b Segon operand
     * @return El resultat de multiplicar a per b
     */
    public static int multiplicar(int a, int b) {
        int resultat = 0;
        for (int i = 0; i < Math.abs(b); i++) {
            resultat += a;
        }
        return b < 0 ? -resultat : resultat;
    }

    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
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
    
    /**
     * Mostra pel terminal el menú principal de la SuperCalculadora.
     * Aquest menú permet a l’usuari seleccionar diferents operacions
     * matemàtiques, com calcular sumes, factorials, quadrats, potències
     * o comptar dígits.
     *
     * No rep cap paràmetre i no retorna cap valor, simplement imprimeix
     * el menú per pantalla i deixa preparada la lectura de l’opció escollida.
     */
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
        try (Scanner lector = new Scanner(System.in)) {
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
                    case 1 -> {
                        System.out.print("Introdueix n: ");
                        int n1 = lector.nextInt();
                        System.out.println("Resultat: " + sumaPrimersNumeros(n1));
                    }
                    case 2 -> {
                        System.out.print("Introdueix n: ");
                        int n2 = lector.nextInt();
                        System.out.println("Resultat: " + calcularFactorial(n2));
                    }
                    case 3 -> {
                        System.out.print("Introdueix n: ");
                        int n3 = lector.nextInt();
                        System.out.println("Resultat: " + sumaQuadrats(n3));
                    }
                    case 4 -> {
                        System.out.print("Introdueix la base: ");
                        int base = lector.nextInt();
                        System.out.print("Introdueix l'exponent: ");
                        int exponent = lector.nextInt();
                        System.out.println("Resultat: " + calcularPotencia(base, exponent));
                    }
                    case 5 -> {
                        System.out.print("Introdueix el nombre: ");
                        int n4 = lector.nextInt();
                        System.out.println("El nombre té " + nombreDigits(n4) + " dígits.");
                    }
                    case 6 -> System.out.println("Sortint de la SuperCalculadora. Fins aviat!");
                    default -> System.out.println("Opció no vàlida. Torna-ho a intentar.");
                }
            } while (opcio != 6);
        }
    }
}
