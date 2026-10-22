/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ialpro_001.calculadorasimple;

// Importo la librería encargada de resgistrar los inputs del usuario
import java.util.Scanner;

/**
 *
 * @author ÁlvaroSerrano
 */
public class IALPRO_001CalculadoraSimple {

    public static void main(String[] args) {
        // Declaro las variables
        float suma;
        float resta;
        float multi;
        float div;
        float resto;
        
        // Añado la función para capturar la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        
        // Establezco la primera solicitud de variable al usuario
        float num1;
        System.out.println("Introduce el primer número:");
        num1 = scanner.nextFloat();
        
        // Igual que en la primera solicitud, añado la segunda
        float num2;
        System.out.println("Introduce el segundo número:");
        num2 = scanner.nextFloat();
        
        // Agrego las operaciones
        suma = num1 + num2;
        resta = num1 - num2;
        multi = num1 * num2;
        div = num1 / num2;
        resto = num1 % num2;
        
        // Declaro los outputs para mostrar los resultados al usuario
        System.out.println("Los resultados de los cálculos son los siguientes:");
        System.out.println("Suma --> " + suma);
        System.out.println("Resta --> " + resta);
        System.out.println("Multiplicación --> " + multi);
        System.out.println("División --> " + div);
        System.out.println("Resto de la división --> " + resto);
    }
}
