package org.yourcompany.calculadora;

import java.util.Random;

/**
 *
 * @author Posa el teu nom
 */


public class Calculadora {

    public static void main(String[] args) {

        // Exemples de crida per al mètode nombreDigits
        System.out.println("Nombre de dígits de 1234: " + nombreDigits(1234));
        System.out.println("Nombre de dígits de 56789: " + nombreDigits(56789));
        System.out.println("Nombre de dígits de -101010: " + nombreDigits(-101010));
        System.out.println("Nombre de dígits de 0: " + nombreDigits(0));

        //Llençmoneda
        System.out.println("Resultats del llençament de 50 monedes:" + llençmoneda(50) + " cares.");
        
        //Preucinema
        double preuFinal = preucinema(5.0, true, false);
        System.out.println("El preu final de la entrada és: " + preuFinal + " euros.");

        // Exemples de crida per al mètode sumaPrimersNumeros
        //System.out.println("Suma dels primers 5 números: " + sumaPrimersNumeros(5));
        //System.out.println("Suma dels primers 10 números: " + sumaPrimersNumeros(10));
        //System.out.println("Suma dels primers 15 números: " + sumaPrimersNumeros(15));

        // Exemples de crida per al mètode calcularFactorial
        //System.out.println("Factorial de 5: " + calcularFactorial(5));
        //System.out.println("Factorial de 7: " + calcularFactorial(7));
        //System.out.println("Factorial de 10: " + calcularFactorial(10));

        // Exemples de crida per al mètode sumaQuadrats
        //System.out.println("Suma dels quadrats dels primers 3 números: " + sumaQuadrats(3));
        //System.out.println("Suma dels quadrats dels primers 5 números: " + sumaQuadrats(5));
        //System.out.println("Suma dels quadrats dels primers 7 números: " + sumaQuadrats(7));

        // Exemples de crida per al mètode calcularPotencia
        //System.out.println("2 elevat a la potència 3: " + calcularPotencia(2, 3));
        //System.out.println("5 elevat a la potència 4: " + calcularPotencia(5, 4));
        //System.out.println("3 elevat a la potència 5: " + calcularPotencia(3, 5));

       
        
    }

    public static int llençmoneda(int llençaments) {
        Random aleatori = new Random();
        int cara = 0; 
        //int creu = 0;
        int comptador = 0;
        
        while (comptador < llençaments) {
            int resultat = aleatori.nextInt(2);
            
            if (resultat == 0) {
                //System.out.println("Cara");
                cara++;
            //} else {
                //System.out.println("Creu");
                //creu++;
            }
            comptador++;
        }
        //System.out.println("Cares: " + cara);
        //System.out.println("Creus: " + creu);
        return cara;
    }

    public static double preucinema(double preuBase, boolean esCapSetmana, boolean teCarnetJove) {
    double preu = preuBase;
    if (esCapSetmana == true) {
        preu = preu * 1.10; // Increment del 10% si és cap de setmana
    }
    if (teCarnetJove == true) {
        preu = preu * 0.85; // Descompte del 15% si té carnet jove
    }
    return preu;
    }



    /**
     * Calcula el nombre de dígits d’un número enter.
     * Funciona tant per a nombres positius com negatius.
     * Si el nombre és 0, retorna 1.
     *
     * @param nombre Número del qual es vol saber el nombre de dígits
     * @return Quantitat de dígits que té {@code nombre}
     */
    public static int nombreDigits(int nombre) {
        if (nombre == 0) {
            return 1; // el 0 té un dígit
        }        
        int comptador = 0;
        while (nombre != 0) {
            nombre /= 10;
            comptador++;
        }
        return comptador;
    }
}
