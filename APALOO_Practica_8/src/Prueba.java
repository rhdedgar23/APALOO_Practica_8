
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
		Llig1.add_numbers_Last(5000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig1.add_numbers_Last(5000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig2.add_numbers_First(5000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig2.add_numbers_First(5000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig3.add_numbers_Medium(5000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig3.add_numbers_Medium(5000): " + milisegundos);
				
		
		//para ArrayList add
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr1.add_numbers_Last(5000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr1.add_numbers_Last(5000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr2.add_numbers_First(5000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr2.add_numbers_First(5000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr3.add_numbers_Medium(5000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr3.add_numbers_Medium(5000): " + milisegundos);
		
		
		//para LinkedList remove
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig1.remove_numbers_Last(4000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig1.remove_numbers_Last(4000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig2.remove_numbers_First(4000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig2.remove_numbers_First(4000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Llig3.remove_numbers_Medium(4000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Llig3.remove_numbers_Medium(4000): " + milisegundos);
		
		
		//para ArrayList remove
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr1.remove_numbers_Last(4000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr1.remove_numbers_Last(4000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr2.remove_numbers_First(4000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr2.remove_numbers_First(4000): " + milisegundos);
		
		tiempoIni= System.currentTimeMillis();//obtiene tiempo inicial
		Larr3.remove_numbers_Medium(4000); //procedimiento en general
		tiempoFin=System.currentTimeMillis();//obtiene tiempo final
		milisegundos= tiempoFin - tiempoIni;//diferencia entre tiempos= tiempo de ejecucion
		System.out.println("Tiempo de ejecucion de metodo Larr3.remove_numbers_Medium(4000): " + milisegundos);
		
	}
	
}
