
package ejercicios6;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicios {
    static void guardar(String nombre_archivo, ArrayList<Pelicula> peliculas)
    {
        try
        {
            PrintWriter print_writer = new PrintWriter(nombre_archivo);

            for(Pelicula pelis:peliculas)
            {
                print_writer.println(pelis.nombre+ " " + pelis.descripcion+" "+ pelis.duracion);
            }

            print_writer.close();
        }catch (Exception e)
        {
 
        }
        
        
        
    }
    
    static ArrayList<Pelicula> abrir(String nombre_archivo)
    {
         ArrayList<Pelicula> lectura = new ArrayList<>();
        
        try
        {
            Scanner scanner = new Scanner(new File(nombre_archivo));
            while(scanner.hasNext())
            {
                String nombre = scanner.next();
                String descripcion = scanner.next();    
                int duracion = scanner.nextInt();
                lectura.add(new Pelicula(nombre, descripcion,duracion));
            }
        }catch(Exception e)
        {
        }
                for(Pelicula dato : lectura)
        {
            System.out.println(dato.nombre + " " + dato.descripcion+" "+dato.duracion);
        }
        

        return lectura;
    }


}
