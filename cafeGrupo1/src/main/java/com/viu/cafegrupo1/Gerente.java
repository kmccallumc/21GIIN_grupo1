/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.viu.cafegrupo1;

/**
 *
 * @author kmccallum <Kathleen_McCallum VIU>
 */
// para heredar de Empleado, uso el extend
public class Gerente extends Empleado{
    String departamento;
    Double bono;
    
    public Gerente(String nombres, String apellidos, String documentoId, Double salario){
        super(nombres, apellidos, documentoId, salario);
    }
    
    // añado los get y set para los atributos departamento y bono
    public String getDepartamento(){
        return this.departamento;
    }
    public void setDepartamento(String depa){
        this.departamento = depa;
    }
    
    public Double getBono(){
        return this.bono;
    }
    public void setBono(Double bono){
        this.bono = bono;
    }

    public Double SalarioTotal() {
        return (this.bono + this.salario);
    }
    
}
