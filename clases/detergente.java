package clases;
import interfaces.interfazConDescuento;
import interfaces.interfazEsLiquido;
import java.util.*;

public class detergente implements interfazConDescuento, interfazEsLiquido {
    Scanner teclado=new Scanner(System.in); 

    //ATRIBUTOS
    private String marca;
    private double precio;
    private double volumen;
    private String tipoEnvase;
    private double descuento;
    
    //CONSTRUCTOR
    public detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    //GET Y SET

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getVolumen() {
        return volumen;
    }
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public String getTipoEnvase() {
        return tipoEnvase;
    }
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }

    public double getDescuento() {
        return descuento;
    }
    
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }
    
    public double getPrecioDescuento() {
        return precio - (precio * (descuento/100.0));
    }
    
    //TO STRING
    @Override
    public String toString() {
        return "detergente [Marca=" + marca + ", precio=" + precio + "]";
    }
    
}
