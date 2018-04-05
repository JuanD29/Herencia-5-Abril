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
public abstract class Contrato {
    protected String ID;
    abstract double calcularSalario();

    public Contrato(String ID) {
        this.ID = ID;
    }
    
  
    
}
