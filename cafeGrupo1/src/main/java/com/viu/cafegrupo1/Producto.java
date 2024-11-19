/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */

package com.viu.cafegrupo1;

public abstract class Producto {
    String nombreProducto;
    double precio;
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
    public double valorTotalInventario(){
        return (this.stock * this.precio);
    }
    
    public String describirProducto(){
        String descProducto = "\nEl producto " + 
                this.nombreProducto + 
                " cuesta " + this.precio + 
                " y tenemos " + this.stock + 
                " en stock actualmente.";
        return descProducto;
    }
}
