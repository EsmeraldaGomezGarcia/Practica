/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolistaenlazada;

/**
 *
 * @author esmer
 */
class Nodo {
    private int dato;
 private Nodo siguiente;
  
 //Constructores de la clase Nodo
 public Nodo (int dato, Nodo siguiente)
 {
  this.dato=dato;
   
  this.siguiente=siguiente;
 }
  
 public Nodo (int datos)
 {
  this.dato=datos;
  this.siguiente=null;
 }

    Nodo(int info, Object object) {
        
    }
  

 public int getDato() 
 {
  return dato;
 }
 
 public void setDato(int dato) 
 {
  this.dato = dato;
 }
 
  public Nodo getSiguiente() 
  {
  return siguiente;
 }
 
 public void setSiguiente(Nodo siguiente) 
 {
  this.siguiente = siguiente;
 }
}

