/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.herencia.modelo;

/**
 *
 * @author Estudiante
 */
public class Consultor extends Contrato{
    private String labor;
   

    public Consultor(String labor,String ID) {
        super(ID);
        this.labor = labor;
    }
    
    

    @Override
    double calcularSalario(){
    return 220;
    }

    
    
    
    
}
