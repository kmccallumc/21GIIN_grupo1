/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */

package com.viu.cafegrupo1;

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
