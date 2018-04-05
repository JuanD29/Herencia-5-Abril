/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.unal.poo.herencia.vista;

import edu.unal.poo.herencia.modelo.Compannia;
import edu.unal.poo.herencia.modelo.Consultor;
import edu.unal.poo.herencia.modelo.Contrato;
import edu.unal.poo.herencia.modelo.Programador;

/**
 *
 * @author Estudiante
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Compannia compannia = new Compannia();
        compannia.anniadirContrato(new Consultor ("C","C1"));
        Contrato c2 = new Programador ("F",100,"java","P1");
        compannia.anniadirContrato(c2);
        double total = compannia.calcularSalario();
        
    }
    
}
