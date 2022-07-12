/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo1;

/**
 *
 * @author Miguel
 */
public class Perro  extends Animal
{
    public Perro()
    {
        
    }
    
    public Perro(String nombre, int numeroDePatas, int numeroDeOjos, String tipo)
    {
        super(nombre,numeroDePatas,numeroDeOjos,tipo);
    }
    
    @Override
    public String toString()
    {
        return "Perro: " + this.nombre + " Tiene  " + numeroDePatas +" patas y tiene " + numeroDeOjos + " ojos y es " + tipo; 
    }
    
    @Override
    public void comunicar()
    {
        System.out.println("Wau Wau");
    }
}
