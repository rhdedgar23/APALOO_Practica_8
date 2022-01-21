/* ***********************DOCUMENTACION***********************
- Programa: Practica 8. 
- Version: Jueves 20 de enero de 2022.
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Larray que contiene metodos para agregar
  y remover elementos del inicio, el final y la mitad del
  ArrayList L. Ademas de un metodo para desplegar dicha lista.  
- Datos de entrada: Sin datos de entrada.
- Datos de salida: Sin datos de salida.          
**************************DOCUMENTACION*********************** */

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Random;

public class Larray {
	
	ArrayList<Integer> L= new ArrayList<Integer>();
	
	public void add_numbers_Last(int num) {//se insertan numeros aleatorios al final de la lista
		Random random= new Random();
		int n;
		
		for(int i=0; i<num; i++) {
			n= random.nextInt(11)+0;
			L.add(n);
		}
	}
	
	public void add_numbers_First(int num) {//se insertan num numeros aleatorios al inicio de la lista
		Random random= new Random();
		int n;
		
		for(int i=0; i<num; i++) {
			L.add(null);
			
			for(int j=0; j<L.size()-1; j++){
				L.set(j+1, L.get(j));
			}
			
			n= random.nextInt(11)+0;
			L.set(0, n);
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
