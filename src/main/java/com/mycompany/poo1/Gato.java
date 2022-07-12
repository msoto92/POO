/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo1;

/**
 *
 * @author Miguel
 */
public class Gato extends Animal 
{
    public Gato()
    {        
    }
    
    public Gato(String nombre, int numeroDePatas, int numeroDeOjos, String tipo)
    {
        super(nombre, numeroDePatas, numeroDeOjos, tipo);
    }
    
    
    @Override
    public void comunicar()
    {
        System.out.println("Miau Miau");
    }
    
}
