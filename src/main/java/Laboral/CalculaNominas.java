package Laboral;

/**
 * clase CalculaNominas con dos empleados creados
 * 
 * @author Noelia
 * @version 1.0
 * @since 1.8
 */

public class CalculaNominas {

	/**
	 * Crear dos empleados
	 * 
	 * @param args
	 * @throws DatosNoCorrectosException 
	 */
	public static void main(String[] args) throws DatosNoCorrectosException {
		
		Empleado empleado1 = new Empleado("James Cosling", "32000032G", 'M', 4, 7);
		Empleado empleado2 = new Empleado("Ada Lovelace", "32000031R", 'F');
		
		/**
		 * Llamada del metodo escribe
		 */
		escribe(empleado1, empleado2);
		
		/**
		 * Incremento años trabajados segundo empleado
		 */
		
		empleado2.incrAnyo();
		
		/**
		 * Cambio de categoria primer empleado
		 */
		empleado1.setCategoria(9);
		
		/**
		 * Llamada del metodo escribe con los nuevos cambios
		 */
		escribe(empleado1, empleado2);

	}
	
	/**
	 * Metodo escribe muestra atributos y sueldo de los empleados
	 * 
	 * @param empleado1
	 * @param empleado2
	 */
	private static void escribe (Empleado empleado1, Empleado empleado2){
		System.out.println(empleado1 + " Su sueldo es: " + Nomina.sueldo(empleado1));
		System.out.println(empleado2 + " Su sueldo es: " + Nomina.sueldo(empleado2));
		
	}
	
	
	

}
