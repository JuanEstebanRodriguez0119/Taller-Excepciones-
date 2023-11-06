package s.taller__excepciones;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicios {
   
    public void Ejercicio_1(){
        int num ;
        boolean continua ;
        Scanner txt = new Scanner (System.in);
       
        do {
          try{
          continua = false;
              System.out.print("Ingrese un valor entero: ");
              num = txt.nextInt();
              int cuadrado = num * num ;
              System.out.println("El cuadrado de " + num + " es " + cuadrado);
            }
          catch (InputMismatchException ex) {
              System.out.println("Debe ingresar un obligatoriamente un numero entero. ");
              txt.next();
              continua = true;
            }
        }
        while (continua);
    }
   
    public void Ejercicio_2(){
        Scanner txt = new Scanner(System.in);
        boolean continuarCiclo = true;

        do {
            try {
                System.out.print("Introduzca un numerador entero: ");
                int numerador = txt.nextInt();
                System.out.print("Introduzca un denominador entero: ");
                int denominador = txt.nextInt();

                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador, denominador, resultado);
                continuarCiclo = false;
            } catch (InputMismatchException inputMismatchException) {
                System.err.printf("\nExcepcion: %s\n", inputMismatchException);
                txt.nextLine();
                System.out.println("Debe introducir enteros. Intente de nuevo.\n");
            } catch (ArithmeticException arithmeticException) {
                System.err.printf("\nExcepcion: %s\n", arithmeticException);
                System.out.println("Cero es un denominador invalido. Intente de nuevo.\n");
            }
        } while (continuarCiclo);
    }
   
    public void Ejercicio_5(){
        System.out.println("Listado de las condiciones excepcionales (1) Division por cero \n (2) Acceso a un índice fuera de rango en una lista \n (3) Valor no encontrado"
                + "\n (4) Archivo que no existe \n (5) Error tipo de dato  ");
        
        // 1 Division por cero
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
        
        // 2 Acceso a un índice fuera de rango en una lista
        try {          
            int[] myArray = {1, 2, 3};
            System.out.println(myArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Acceso a un índice fuera de rango en el arreglo.");
        }
        
        // 3 Valor no encontrado
        try {
            int intValue = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            System.out.println("Error: Valor no se puede convertir a un número.");
        }

        // 4 Archivo que no existe 
        try {
            FileReader file = new FileReader("fantasmin.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado.");
        }
        
        // 5 Error de tipo de dato
        try { 
            Object a = 10;
            String b = (String) a;
        } catch (ClassCastException e) {
            System.out.println("Error: Tipo de dato incorrecto para la operación.");
        }
    }
    
 // Clase necesaria para el ejercicio 2 :)
    
    public static int cociente(int numerador, int denominador) throws ArithmeticException {
        return numerador / denominador;
    }   
}
