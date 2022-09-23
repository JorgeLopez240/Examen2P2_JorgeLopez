
package Package1;

import java.io.Serializable;

public class Empleado implements Serializable{
    
    private String nombre;
    private int edad;
    private String id;
    private int carros_reparados;

    private static final long SerialVersionUID=444L;
    
    public Empleado() {
    }

    public Empleado(String nombre, int edad, String id, int carros_reparados) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        this.carros_reparados = carros_reparados;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCarros_reparados() {
        return carros_reparados;
    }

    public void setCarros_reparados(int carros_reparados) {
        this.carros_reparados = carros_reparados;
    }

    @Override
    public String toString() {
        return nombre;
    }

}
