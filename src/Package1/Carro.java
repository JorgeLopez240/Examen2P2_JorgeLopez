
package Package1;

import java.util.Date;

public class Carro {
    
    private String marca;
    private String modelo;
    private Date fabricacion;
    private String estado;
    private double costo_reparacion;

    public Carro() {
    }

    public Carro(String marca, String modelo, Date fabricacion, String estado, double costo_reparacion) {
        this.marca = marca;
        this.modelo = modelo;
        this.fabricacion = fabricacion;
        this.estado = estado;
        this.costo_reparacion = costo_reparacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Date getFabricacion() {
        return fabricacion;
    }

    public void setFabricacion(Date fabricacion) {
        this.fabricacion = fabricacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getCosto_reparacion() {
        return costo_reparacion;
    }

    public void setCosto_reparacion(double costo_reparacion) {
        this.costo_reparacion = costo_reparacion;
    }

    @Override
    public String toString() {
        return "Carro{" + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    
}
