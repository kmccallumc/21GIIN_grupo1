/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */
package com.viu.cafegrupo1;

// para heredar de Empleado, uso el extend
// necesito ademas de un gerente, operarios
public class Operario extends Empleado{
    double bono;
    
    public Operario(String nombres, String apellidos, String documentoId, double salario){
        super(nombres, apellidos, documentoId, salario);
    }
    
    // añado los get y set para los atributos departamento y bono
    
    public double getBono(){
        return this.bono;
    }
    public void setBono(double bono){
        this.bono = bono;
    }

    public double salarioTotal() {
        return (this.bono + this.salario);
    }
        
}
