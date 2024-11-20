/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */
package com.viu.cafegrupo1;

// para heredar de Empleado, uso el extend
public class Gerente extends Empleado{
    String departamento;
    double bono;
    
    public Gerente(String nombres, String apellidos, String documentoId, double salario){
        super(nombres, apellidos, documentoId, salario);
    }
    
    // añado los get y set para los atributos departamento y bono
    public String getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(String depa){
        this.departamento = depa;
    }
    
    public double getBono(){
        return this.bono;
    }
    public void setBono(double bono){
        this.bono = bono;
    }

    public double salarioTotal() {
        return (this.bono + this.salario);
    }
    
    @Override
    public double calcularSalario(double extras){
        try{
            double salarioPlus = salarioTotal() + extras;
            return (salarioPlus);
        }catch(NumberFormatException nfe){
            System.out.print(nfe.getMessage());
            System.out.print("Error en calculo de salario del gerente");
            return -1;
        }
    } 
    
}
