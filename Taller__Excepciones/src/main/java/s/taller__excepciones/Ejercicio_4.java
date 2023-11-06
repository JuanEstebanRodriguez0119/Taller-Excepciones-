
package s.taller__excepciones;

import java.util.Scanner;


public class Ejercicio_4 {
     // Profe, en vez de tomar las clases como ExcepcionA, B y C las llamamos asi: (Van en orden, A, B y C)    
    private class NumeroExcepcion extends Exception {
    public NumeroExcepcion(String mensaje) {
        super(mensaje);
    }
}

    public class DivisionPorCeroExcepcion extends NumeroExcepcion {
        public DivisionPorCeroExcepcion() {
            super("¡Error! División por cero.");
        }
    }

    public class NumeroNegativoExcepcion extends NumeroExcepcion {
        public NumeroNegativoExcepcion() {
            super("¡Error! Número negativo no permitido.");
        }
    }
    // El metodo que usamos de ejemplo :) 
    public void dividir(int numerador, int denominador) throws NumeroExcepcion {
        if (denominador == 0) {
            throw new DivisionPorCeroExcepcion();
        } else if (numerador < 0 || denominador < 0) {
            throw new NumeroNegativoExcepcion();
        } else {
            // Realiza la división si no hay problemas
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        }
    }    
    public void Ejercicio4(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Ingrese el denominador: ");
        int denominador = scanner.nextInt();

        try {
            dividir(numerador, denominador);
        } catch (NumeroExcepcion e) {
            System.out.println("Se produjo un error: " + e.getMessage());
        }
        }
        
    }
