package s.taller__excepciones;

import java.util.Scanner;

public class Taller__Excepciones {

     public static void main(String[] args) {
       Scanner txt = new Scanner (System.in);
       Ejercicios ejercicios = new Ejercicios();
       Ejercicio_4 ejercicio4 = new Ejercicio_4();
       Ejercicio_3 ejercicio3 = new Ejercicio_3();
       System.out.println("Ejercicios Excepciones___ Rodriguez Juan / Espejo Edwin ");
        System.out.println("Escoja el ejercicio que desea ver: \n Ejercicio (1) \n Ejercicio (2) \n Ejercicio (3) \n Ejercicio (4)"
                + " \n Ejercicio (5)");
       int opc = txt.nextInt();
       switch (opc){
           case 1:
               ejercicios.Ejercicio_1();
           break;
           
           case 2:
               ejercicios.Ejercicio_2();
           break;
           
           case 3:
               ejercicio3.LeerArchivo();
           break;
           
           case 4:
               ejercicio4.Ejercicio4();
           break;
           
           case 5:
               ejercicios.Ejercicio_5();
           break;
       
       }
    }
   
}
