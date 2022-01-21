/* ***********************DOCUMENTACION***********************
- Programa: Practica 8. 
- Version: Jueves 20 de enero de 2022.
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Lligada que contiene metodos para agregar
  y remover elementos del inicio, el final y la mitad del
  LinkedList L. Ademas de un metodo para desplegar dicha lista.  
- Datos de entrada: Sin datos de entrada.
- Datos de salida: Sin datos de salida.          
**************************DOCUMENTACION*********************** */

import java.util.LinkedList;
import java.util.Random;
import java.util.ListIterator;

public class Lligada {
	
	LinkedList<Integer> L= new LinkedList<Integer>();
	
	public void add_numbers_Last(int num) {//se insertan numeros aleatorios al final de la lista
		Random random= new Random();
		int n;
		
		for(int i=0; i<num; i++) {
			n= random.nextInt(11)+0;
			L.addLast(n);
		}
	}
	
	public void add_numbers_First(int num) {//se insertan num numeros aleatorios al inicio de la lista
		Random random= new Random();
		int n;
		
		for(int i=0; i<num; i++) {
			n= random.nextInt(11)+0;
			L.addFirst(n);
		}
	}
	
	public void add_numbers_Medium(int num) {// se insertan num numeros aleatorios en la posicion de en medio de la lista
		 Random random= new Random();
		 int mitad,  n;
		 
		 for(int i=0; i<num; i++) {
			mitad= (L.size())/2;
			n= random.nextInt(11)+ 0;
		
			L.add(mitad, n); 
		 }
	}
	
	public void remove_numbers_Last(int num) {//se eliminan num numeros del final de la lista
		
		for(int i=0; i<num; i++) {
			L.remove(L.size()-1);
		}
	}
	
	public void remove_numbers_First(int num) {//se eliminan num numeros del inicio de la lista
		
		for(int i=0; i<num; i++) {
			L.remove(0);
		}
	}
	
	public void remove_numbers_Medium(int num) {//se eliminan num numeros de la posicion de en medio de la lista
		int mitad;
		
		for(int i=0; i<num; i++) {
			mitad= (L.size())/2;
			L.remove(mitad);
		}
	}
	
	public void despliega() {
		ListIterator<Integer> itr;
		itr= L.listIterator();
		
		while(itr.hasNext()== true) {
			System.out.println(itr.next());
		}
		System.out.println("\n");
	}
	
	public void desplieg_reversa() {
		ListIterator<Integer> itr;
		itr= L.listIterator(L.size());
		
		while(itr.hasPrevious()== true) {
			System.out.println(itr.previous());
		}
		System.out.println("\n");
	}
}
