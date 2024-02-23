
package lab6p2_mariapadilla;

public class Equipo {
    private String nombre,pais,cuidad,estadio;
    
    // constructores

    public Equipo() {
    }

    public Equipo(String nombre, String pais, String cuidad, String estadio) {
        this.nombre = nombre;
        this.pais = pais;
        this.cuidad = cuidad;
        this.estadio = estadio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCuidad() {
        return cuidad;
    }

    public void setCuidad(String cuidad) {
        this.cuidad = cuidad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nombre=" + nombre + ", pais=" + pais + ", cuidad=" + cuidad + ", estadio=" + estadio + '}';
    }
    
    
    
    
}
