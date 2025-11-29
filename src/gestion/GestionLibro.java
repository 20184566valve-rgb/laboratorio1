/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestion;
 
import clases.Libro;

/**
 *
 * @author ProfL3403
 */
public class GestionLibro {
    
    private Libro[] libros;
    private int totalLibros;
    
    public GestionLibro(){
        libros = new Libro[50];
        totalLibros=0;
        
         // Inicializamos 20 libros
        libros[totalLibros++] = new Libro("L001", "El Principito", "Antoine de Saint-Exupéry", 35.0);
        libros[totalLibros++] = new Libro("L002", "Cien Años de Soledad", "Gabriel García Márquez", 50.0);
        libros[totalLibros++] = new Libro("L003", "Don Quijote", "Miguel de Cervantes", 45.0);
        libros[totalLibros++] = new Libro("L004", "La Odisea", "Homero", 40.0);
        libros[totalLibros++] = new Libro("L005", "Harry Potter 1", "J.K. Rowling", 60.0);
        libros[totalLibros++] = new Libro("L006", "Harry Potter 2", "J.K. Rowling", 62.0);
        libros[totalLibros++] = new Libro("L007", "1984", "George Orwell", 45.5);
        libros[totalLibros++] = new Libro("L008", "El Hobbit", "J.R.R. Tolkien", 55.0);
        libros[totalLibros++] = new Libro("L009", "El Señor de los Anillos", "J.R.R. Tolkien", 80.0);
        libros[totalLibros++] = new Libro("L010", "Fahrenheit 451", "Ray Bradbury", 33.0);
        libros[totalLibros++] = new Libro("L011", "Crimen y Castigo", "Fiódor Dostoyevski", 52.0);
        libros[totalLibros++] = new Libro("L012", "El Aleph", "Jorge Luis Borges", 30.0);
        libros[totalLibros++] = new Libro("L013", "Orgullo y Prejuicio", "Jane Austen", 40.0);
        libros[totalLibros++] = new Libro("L014", "Drácula", "Bram Stoker", 36.0);
        libros[totalLibros++] = new Libro("L015", "It", "Stephen King", 75.0);
        libros[totalLibros++] = new Libro("L016", "Carrie", "Stephen King", 45.0);
        libros[totalLibros++] = new Libro("L017", "El Alquimista", "Paulo Coelho", 38.0);
        libros[totalLibros++] = new Libro("L018", "Metamorfosis", "Franz Kafka", 28.0);
        libros[totalLibros++] = new Libro("L019", "La Iliada", "Homero", 42.0);
        libros[totalLibros++] = new Libro("L020", "El Arte de la Guerra", "Sun Tzu", 32.0);
        
    }
    
    public Libro buscarPorCodigo(String codigo){
        for (int i = 0; i < totalLibros; i++) {
            if(libros[i].getCodigo().equalsIgnoreCase(codigo)){
                return libros[i];
            }
        }
        return null;
    }
    
    
    public boolean registrar(Libro libro){
        //Verificar si esta lleno el arreglo
        if(totalLibros == libros.length){
            return false;
        }
       
        //Evitar duplicados
        if(buscarPorCodigo(libro.getCodigo())!=null)        
        { 
            return false;
        }
        
        //registras
        libros[totalLibros] = libro;
        totalLibros++;
        return true;
    }
    
    public boolean actualizar (Libro libro){
        for (int i = 0; i < totalLibros; i++) {
            if(libros[i].getCodigo().equalsIgnoreCase(libro.getCodigo())){
                libros[i].setTitulo(libro.getTitulo());
                libros[i].setAutor(libro.getAutor());
                libros[i].setPrecio(libro.getPrecio());
                return true;
            }
        }
        return false;
    }
    
    
    public boolean eliminar(String codigo){
        for (int i = 0; i < totalLibros; i++) {
            if(libros[i].getCodigo().equalsIgnoreCase(codigo)){
                
                //correr los demas elementos una posicion a la izquierda
                for ( int j=i ; j< totalLibros-1; j++){
                    libros[j]= libros[j+1];
                }
                
                //Limpiamos el ultimo casillero
                libros[totalLibros -1]= null;
                totalLibros--;
     
                return true;
            }
        }
        return false;
    }
    
    public Libro[] obtenerLibros(){
        return libros;
    }
    public int obtenerTotalLibros(){
        return totalLibros;
    }
    
}
