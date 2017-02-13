/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarjetagraficaarraylist;

import java.util.Scanner;

/**
 *
 * @author admin
 */
import java.util.ArrayList;
public class TarjetaGraficaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        ArrayList<String> nombreTarjeta = new ArrayList<>();
        ArrayList<String> marca = new ArrayList<>();
        ArrayList<String> tipoDeGrafica = new ArrayList<>();
        ArrayList<String> tipoDeMemoria = new ArrayList<>();
        ArrayList<String> tamanoMemoria = new ArrayList<>();
        ArrayList<String> estado = new ArrayList<>();
        ArrayList<Double> precio = new ArrayList<>();
        //tarjeta 1
        
        nombreTarjeta.add("RX 470");
        marca.add("Asus");
        tipoDeGrafica.add("AMD");
        tipoDeMemoria.add("GDDR5");
        tamanoMemoria.add("4GB");
        estado.add("Nuevo");
        precio.add(199.0);
        
        //Tarjeta 2
        nombreTarjeta.add("RX 480");
        marca.add("Asus");
        tipoDeGrafica.add("AMD");
        tipoDeMemoria.add("GDDR5");
        tamanoMemoria.add("8GB");
        estado.add("Nuevo");
        precio.add(215.0);
        
        //Tarjeta 3
        nombreTarjeta.add("RX 480 G1");
        marca.add("Asus");
        tipoDeGrafica.add("AMD");
        tipoDeMemoria.add("GDDR5");
        tamanoMemoria.add("4GB");
        estado.add("Nuevo");
        precio.add(580.5);
        
        
        double precioTotal = 0;
        String nuevaTarjeta = "";
        int offset = 0;
        boolean fin = false;
        do {
            System.out.println("Seleccione:\n1:Insertar\n2:Modificar\n3:Borrar\n4:Ver\n5:Salir");
            int valor = Integer.parseInt(s.nextLine());
            switch (valor) {
                case 1:
                    System.out.println("Opcion insertar: ");
                    do {
                        System.out.print("Introduzca el nombre de la tarjeta: ");
                        nombreTarjeta.add(s.nextLine());
                        System.out.print("Introduzca la marca: ");
                        marca.add(s.nextLine());
                        System.out.print("Introduzca el tipo de gráfica: ");
                        tipoDeGrafica.add(s.nextLine());
                        System.out.print("Introduzca el tipo de memoria: ");
                        tipoDeMemoria.add(s.nextLine());
                        System.out.print("Introduzca el estado: ");
                        estado.add(s.nextLine());
                        System.out.print("Introduzca el precio: ");
                        precio.add(Double.parseDouble(s.nextLine()));
         
                        System.out.println("Pulsa n para introducir otra tarjeta o cualquier otra cosa para terminar. ");

                        nuevaTarjeta = s.nextLine();
                    } while (nuevaTarjeta.equals("n"));
                    break;
                  
                case 2:
                    do {
                        System.out.println("Opcion modificar: ");
                        System.out.print("Introduzca el registro a modificar entre: [1-"+marca.size()+"]: ");
                        offset = Integer.parseInt(s.nextLine());
                        if(offset > marca.size() || offset < 1){
                            System.out.println("Debes de introducir un número entre 1 y "+marca.size());
                            break;
                        }
                            System.out.print("Modifique el nombre de la tarjeta: ");
                            nombreTarjeta.set(offset,s.nextLine());
                            System.out.print("Modifique la marca: ");
                            marca.set(offset,s.nextLine());
                            System.out.print("Modifique el tipo de gráfica: ");
                            tipoDeGrafica.set(offset,s.nextLine());
                            System.out.print("Modifique el tipo de memoria: ");
                            tipoDeMemoria.set(offset,s.nextLine());
                            System.out.print("Modifique el nuevo tamaño de memoria: ");
                            tamanoMemoria.set(offset,s.nextLine());
                            System.out.print("Modifique el nuevo estado: ");
                            estado.set(offset,s.nextLine());
                            System.out.print("Modifique el nuevo precio: ");
                            precio.set(offset,Double.parseDouble(s.nextLine()));
                        
                        System.out.println("Pulsa n para modificar cualquier otra registro o cualquier otra cosa para volver al menú. ");
                           nuevaTarjeta = s.nextLine();
                           
                    } while (nuevaTarjeta.equals("n"));
                    break;
                case 3:
                    System.out.println("Opcion borrar: ");
                    if(marca.size() <= 0){
                        System.out.println("No existe ningun registro");
                        break;                        
                    }
                    
                    System.out.print("Introduzca el registro a borrar [1-"+marca.size()+"]: ");
                    offset = Integer.parseInt(s.nextLine());
                    if(offset > marca.size() || offset < 1){
                        System.out.println("Debes de introducir un número entre 1 y "+marca.size());
                        break;
                    }                 
                        nombreTarjeta.remove(offset-1); 
                        marca.remove(offset-1);
                        tipoDeGrafica.remove(offset-1);
                        tipoDeMemoria.remove(offset-1);
                        tamanoMemoria.remove(offset-1);
                        estado.remove(offset-1);
                        precio.remove(offset-1);
                         
                    break;

                case 4:
                    if(marca.size() <= 0){
                        System.out.println("No existe ningun registro");
                        break;                        
                    }

                    System.out.println("Opcion ver: ");
                    for (int i = 0; i < marca.size(); i++) {
                        System.out.println("-- Tarjeta " + (i+1) + " --");
                        System.out.println("Nombre de la tarjeta: " + nombreTarjeta.get(i) 
                                + "\nMarca: " + marca.get(i)
                                + "\nTipo de gráfica: " + tipoDeGrafica.get(i)                                
                                + "\nTipo de memoria: " + tipoDeMemoria.get(i)                                                            
                                + "\nTamaño de memoria: " + tamanoMemoria.get(i)                                
                                + "\nEstado: " + estado.get(i)                                
                                + "\nPrecio: " + precio.get(i) +"\n\n");
                    }
                    break;
                case 5:
                    fin = true;
                    break;
                case 6:
                    System.out.println("Muestra el total del precio de tarjetas en stock: ");                   
                    for (int i = 0; i < marca.size(); i++) {
                       precioTotal += precio.get(i);
                    }
                    System.out.println("Total: " + precioTotal);                   
                        
            }
        } while (fin != true);
    }    
}
