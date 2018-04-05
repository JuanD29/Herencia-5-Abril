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
public class LiderProgramador extends Programador{
    protected ArrayList <Programador> grupoProgramadores;

    public LiderProgramador(String nombre, double salario, String lenguaje, String []grupoProgramadores, String ID) {
        super(nombre, salario, lenguaje, ID);
        this.grupoProgramadores = new ArrayList <>();
    }
    
    public boolean anniadirProgramador (Programador programador){
        return this.grupoProgramadores.add(programador);
    }
    
    public double calcularSalario(){
        double extra = salario*0.1;
        
       return salario; 
    }//
    
    
}
