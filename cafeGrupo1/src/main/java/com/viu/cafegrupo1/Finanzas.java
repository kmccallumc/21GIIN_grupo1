/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viu.cafegrupo1;

/**
 *
 * @author kmccallum <Kathleen_McCallum VIU>
 */
  class Finanzas {
     private double ingresos;
     private double gastos;
     
     public Finanzas(double ingresos, double gastos){
         this.ingresos = ingresos;
         this.gastos = gastos;
     }
    
     // sets y gets de Ingresos
     public double getIngresos(){
         return this.ingresos;
     }
     public void setIngresos(double ingreso){
         this.ingresos = ingreso;
     }
     
     // set y get de gastos
     public double getGastos(){
         return this.gastos;
     }
     public void setGastos(double gastos){
         this.gastos = gastos;
     }
     
     public double beneficioNeto(){
         return (this.ingresos - this.gastos);
     }
}
