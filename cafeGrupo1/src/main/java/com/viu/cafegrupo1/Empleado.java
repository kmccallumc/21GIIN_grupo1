/**
 * @author kmccallum <Kathleen_McCallum VIU>
 * @author dcollado <David Collado VIU>
 * @author oguardia <Oscar Guardia VIU>
 */

package com.viu.cafegrupo1;

// creo la clase empleado como abstracto, para poder heredar luego
public abstract class Empleado {
    String nombres;
    String apellidos;
    String documento_id;
    double salario;
    
    // el constructor
    public Empleado(String nombres, String apellidos, String documento_id, Double salario){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.documento_id = documento_id;
        this.salario = salario;
    }
    
    // los gets
    public String getNombres(){
        return this.nombres;
    }
    public String getApellidos(){
        return this.apellidos;
    }
    public String getDocumentoId(){
        return this.documento_id;
    }
    public double getSalario(){
        return this.salario;
    }
    
    // los sets
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setDocumentoId(String doc_id) {
        this.documento_id = doc_id;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double calcularSalario(double extras){
        try{
            return extras+this.salario;
        }catch(NumberFormatException nfe){
            System.out.print(nfe.getMessage());
            return -1;
        }
            
    }
}
