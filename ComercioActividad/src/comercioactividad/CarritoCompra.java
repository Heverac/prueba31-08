/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comercioactividad;

/**
 *
 * @author CETECOM
 */
public class CarritoCompra {
    private String productos;
    private double total;
    private String carro;

    public CarritoCompra(String productos, Double total, String carro) {
        this.productos = productos;
        this.total = total;
        this.carro = carro;
        
        }

    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public String getCarro() {
        return carro;
    }

    public void setCarro(String carro) {
        this.carro = carro;
    }
    
    
    
}
