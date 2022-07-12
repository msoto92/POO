/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poo1;

/**
 *
 * @author Miguel
 */
public class Animal 
{    
    protected String nombre;
    
    protected int numeroDePatas;
    
    protected int numeroDeOjos;
    
    protected String tipo;
    
    public Animal()
    {
        
    }
    
    public Animal(String nombre, int numeroDePatas, int numeroDeOjos, String tipo)
    {
        this.nombre = nombre;
        this.numeroDePatas = numeroDePatas;
        this.numeroDeOjos = numeroDeOjos;
        this.tipo = tipo;
    }    

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the numeroDePatas
     */
    public int getNumeroDePatas() {
        return numeroDePatas;
    }

    /**
     * @param numeroDePatas the numeroDePatas to set
     */
    public void setNumeroDePatas(int numeroDePatas) {
        this.numeroDePatas = numeroDePatas;
    }

    /**
     * @return the numeroDeOjos
     */
    public int getNumeroDeOjos() {
        return numeroDeOjos;
    }

    /**
     * @param numeroDeOjos the numeroDeOjos to set
     */
    public void setNumeroDeOjos(int numeroDeOjos) {
        this.numeroDeOjos = numeroDeOjos;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public void comunicar()
    {
        System.out.println("Llamando al metodo comunicar desde el padre.");
    }
    
    
}
