//Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos por parámetro para que nos indique si es o no un número primo, 
//debe devolver true si es primo, sino false.
//Un número primo es aquel que solo puede dividirse entre 1 y sí mismo. Por ejemplo: 25 no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
package javarepaso12;

import java.util.Scanner;

public class JAVAREPASO12 {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese numero");
        int numero = leer.nextInt();

        boolean esPrimo = esPrimo(numero);//condicion true/false de consigna y llamado a metodo esPrimo(con argumento int)

        if (esPrimo) {
            System.out.println("El numero" + numero + " es numero primo");
        } else {
            System.out.println("El numero" + numero + " no es numero primo");
        }

    }

    public static boolean esPrimo(int numero) {//creacion de metodo esPrimo

        if (numero <= 1) {
            return false;//un numero menor o igual a 1 no puede ser primo

        }
        for (int i = 2; i < numero / 2; i++) {//a partir de valor 2 determinar divisibles del numero.
            //se planea numero/2 ya que no es necesario exceder la mitad del valor porque el divisor siempre sera menor a esta.
            //si numero dividido iteracion I tiene resto 0 NO es un numero primo ya que debe ser solo dividido por el mismo y 1 y no otros numeros.
            if (numero % i == 0) {
                return false;//return false a condicion esPrimo, es decor mp es[ro,p
            }
        }
       return true; //return true a condicion primo
    } 
}

