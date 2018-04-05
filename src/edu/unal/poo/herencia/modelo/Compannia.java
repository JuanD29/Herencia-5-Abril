/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.herencia.modelo;
import java.util.*;
/**
 *
 * @author Estudiante
 */
public class Compannia {
    private ArrayList<Contrato> contratos;
    
    public Compannia(){
        this.contratos = new ArrayList<>();
        
    }
    
    public boolean anniadirContrato(Contrato contrato){
        return this.contratos.add(contrato);
    }
    
    public double calcularSalario(){
        double total = 0;
        for (Contrato contrato:contratos){
            total+=contrato.calcularSalario();
        }
            return total;
        
    }
}
