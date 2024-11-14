/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viu.cafegrupo1;

/**
 *
 * @author kmccallum <Kathleen_McCallum VIU>
 */
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
