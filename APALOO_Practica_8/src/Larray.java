import java.util.ArrayList;
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
	
	
}
