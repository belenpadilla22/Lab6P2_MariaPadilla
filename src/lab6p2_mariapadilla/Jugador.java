
package lab6p2_mariapadilla;

public class Jugador {
    private String nombre,pos;
    private int edad;
    
    // constructores

    public Jugador() {
    }

    public Jugador(String nombre, String pos, int edad) {
        this.nombre = nombre;
        this.pos = pos;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Jugador{" + "nombre=" + nombre + ", pos=" + pos + ", edad=" + edad + '}';
    }
    
    
    
   
    
}
