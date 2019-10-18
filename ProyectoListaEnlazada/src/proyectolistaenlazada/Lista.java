/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolistaenlazada;

import static java.lang.Math.exp;

/**
 *
 * @author esmer
 */
class Lista {
    
 private Nodo principal;
 private Nodo fina;
  

 public Lista()
 {
  principal=fina=null;
 }
  

 public void agregarFin(int info)
 {
   
   Nodo nuevo = new  Nodo(info, null);
  
  if(principal==null)
  {
   principal=fina=nuevo;
  }
  else
  {
   fina.setSiguiente(nuevo);
   fina = nuevo;
  }
  
 }
  
 
 public void imprimir()
 {
  Nodo a=principal; 
  while(a!=null)
  {
   System.out.println(a.getDato());
   a = a.getSiguiente();
  } 
 }

 public void eliminar(int valor)
 {
  Nodo anterior=principal;
  Nodo e= principal.getSiguiente();
  Nodo temporal;
  while(e!=null)
  {
  
   if(e.getDato() > valor)
   {
    temporal=e.getSiguiente();   
    anterior.setSiguiente(e.getSiguiente()); 
    e= temporal;   
   }
   else
   {
    anterior=anterior.getSiguiente();
    e=e.getSiguiente();
   } 
  }
 }
}