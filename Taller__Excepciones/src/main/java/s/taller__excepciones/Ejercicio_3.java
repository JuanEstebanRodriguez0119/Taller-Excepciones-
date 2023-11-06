package s.taller__excepciones;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
    public class Ejercicio_3 {
    
    public void LeerArchivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese la ruta completa del archivo a leer: ");
        String rutaArchivo = scanner.nextLine();
        // Profe el archivo tiene que ser un .txt, en el classroom se encuentra 
        //el archivo, copie la ruta que aparece en su computadora y pruebelo :D 
        // Tambien pruebe el error :)
        try {
            FileReader archivo = new FileReader(rutaArchivo);
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            System.out.println("Contenido del archivo " + rutaArchivo + ":");
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }
            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("El archivo en la ruta " + rutaArchivo + " no se encontró. Por favor, verifica la ruta y el nombre del archivo.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error de lectura en el archivo: " + e.getMessage());
        }
    }
}

