/* ***********************DOCUMENTACION***********************
- Programa: Practica 8. 
- Version: Jueves 20 de enero de 2022.
- Autor: Edgar Daniel Rodriguez Herrera  
- Descripcion: Clase Prueba que creo tres objetos de tipo 
  Lligada, tres objetos de tipo Larray y les agrega y remueve
  elementos usando los metodos de las clases Larray y Lligada. 
  Calcula el tiempo de ejecucion de cada metodo y lo imprime. 
  Ademas, despliega una LinkedList y una ArrayList, imprimiendo
  de inicio a fin y de fin a inicio ambas listas.   
- Datos de entrada: Sin datos de entrada.
- Datos de salida: Listas desplegadas y tiempos de ejcucion.          
**************************DOCUMENTACION*********************** */

public class Prueba {
	
	public static void main(String[] args) {
		
		Lligada Llig1= new Lligada();
		Lligada Llig2= new Lligada();
		Lligada Llig3= new Lligada();
		
		Larray Larr1= new Larray();
		Larray Larr2= new Larray();
		Larray Larr3= new Larray();
		
		//para obtener los tiempos de ejecucion de cada metodo:
		long tiempoIni, tiempoFin, milisegundos;
		
		//para LinkedList add
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig1.add_numbers_Last(5); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig1.add_numbers_Last(5): " + milisegundos + "\n");
		Llig1.despliega();
		Llig1.desplieg_reversa();
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig2.add_numbers_First(25000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig2.add_numbers_First(25000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig3.add_numbers_Medium(25000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig3.add_numbers_Medium(25000): " + milisegundos + "\n");
				
		
		//para ArrayList add
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr1.add_numbers_Last(5); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr1.add_numbers_Last(5): " + milisegundos + "\n");
		Larr1.despliega();
		Larr1.desplieg_reversa();
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr2.add_numbers_First(25000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("\nTiempo de ejecucion de metodo Larr2.add_numbers_First(25000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr3.add_numbers_Medium(25000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr3.add_numbers_Medium(25000): " + milisegundos);
		
		
		//para LinkedList remove
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig1.remove_numbers_Last(4); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig1.remove_numbers_Last(4): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig2.remove_numbers_First(24000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig2.remove_numbers_First(24000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig3.remove_numbers_Medium(24000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig3.remove_numbers_Medium(24000): " + milisegundos);
		
		
		//para ArrayList remove
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr1.remove_numbers_Last(4); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr1.remove_numbers_Last(4): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr2.remove_numbers_First(24000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr2.remove_numbers_First(24000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr3.remove_numbers_Medium(24000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr3.remove_numbers_Medium(24000): " + milisegundos);
	}
	
}
