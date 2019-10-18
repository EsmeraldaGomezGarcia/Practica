/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolistaenlazada;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author esmer
 */
public class ProyectoListaEnlazada {
 public static int menu()
 {
JOptionPane.showInputDialog("Menu"
        + "\n 1.- Imprimir lista"
        + "\n2.- Eliminar nodos que superen un valor dado"
        + "\n3.- Salir");
 

  int seleccion=leer("Seleccione una opción: ");
  return seleccion;
 }

 public static void main(String[] args)
 {
      int opcion;
      
  Lista numeros=new Lista();
numeros.agregarFin(34);
  numeros.agregarFin(63);
 numeros.agregarFin(28);
  numeros.agregarFin(70);
 numeros.agregarFin(57);
numeros.agregarFin(60);
 
  do
  {
   opcion=menu();
   switch(opcion)
   {
   case 1:
       System.out.println("lista de numeros:");
  numeros.imprimir();
    break;
 
   case 2:
    int e=leer("Ingrese el numero a eliminar ");
    numeros.eliminar(e);
    break;
   
 
   default:
    System.out.println("FINAL");
    break;
   }
  }while(opcion!=3);

 }
  public static int leer(String texto)
 {
  Scanner leer=new Scanner(System.in);
  System.out.println(texto);
  int dato=leer.nextInt();
  return dato;
 }
}
