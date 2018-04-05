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
public class Empleado extends Contrato {
    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario, String ID) {
        super(ID);
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    double calcularSalario() {
       return 110;
    }

}
