/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */
package com.viu.cafegrupo1;

public class cafeEspecial extends Producto {
    String origen;
    double notaCata;
    
    public cafeEspecial(String nomProd, Double precio, int stock){
        super(nomProd, precio, stock);
    }
    // añado los 2 atributos
    // origen
    public String getOrigen(){
        return this.origen;
    }
    public void setOrigen(String origen){
        this.origen = origen;
    }
    
    // notaCata
    public double getNotaCata(){
        return this.notaCata;
    }
    public void setNotaCata(double notaCata){
        this.notaCata = notaCata;
    }
    
    @Override
    public String describirProducto(){
        String descOriginal = super.describirProducto();
        String descCafe = ". Además el café es de origen " + 
                this.origen + 
                " y tiene una nota de cata " + this.notaCata;
        String descFinal = descOriginal.concat(descCafe);
        
        return descFinal;
    }
}
