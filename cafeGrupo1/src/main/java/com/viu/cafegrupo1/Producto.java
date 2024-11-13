/**
 *
 * @author kmccallum <Kathleen_McCallum VIU>
 */

package com.viu.cafegrupo1;

public class Producto {
    String nombreProducto;
    Double precio;
    int stock;
    
    public Producto (String nomProd, Double precio, int stock){
        this.nombreProducto = nomProd;
        this.precio = precio;
        this.stock = stock;
    }
    
    // los gets
    
    public String getNombreProducto(){
        return this.nombreProducto;
    }
    public double getPrecio(){
        return this.precio;
    }
    public int getStock(){
        return this.stock;
    }
    
    // los sets
    
    public void setNombreProducto(String nomprod){
        this.nombreProducto = nomprod;
    }
    
    public void setPrecio(Double precio){
        this.precio = precio;
    }
    
    public void setStock(int stock){
        this.stock = stock;
    }
    
    // Valor total del inventario
    public Double valorTotalInventario(){
        return (this.stock * this.precio);
    }
}
