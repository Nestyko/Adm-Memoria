package aux_classes.strings;


public class StrFunction{
	

	
	public static int distancia_primera_ultima(String cadena, char buscar){
		return (cadena.lastIndexOf(buscar)-cadena.indexOf(buscar));
	}
	
	
	
	
	
	public static int sumatoria_digitos(String cadena){
		int sum = 0;
		for (int i = 0; i < cadena.length(); i++) {
			switch(cadena.charAt(i)){
			case '1': sum+= 1; break;
			case '2': sum+= 2; break;
			case '3': sum+= 3; break;
			case '4': sum+= 4; break;
			case '5': sum+= 5; break;
			case '6': sum+= 6; break;
			case '7': sum+= 7; break;
			case '8': sum+= 8; break;
			case '9': sum+= 9; break;
			}
		}
		return sum;
	}
	
	/**
	 * Verifica si contiene algun caracter que no sea numeros o letras
	 * 
	 * @param a es la String a evaluar
	 * @return true si posee caracteres especiales
	 */
	public static boolean containsEspecials(String a){
		for (int j = 0; j < a.length(); j++) {
			char b = a.charAt(j);
			if(((b >= 65) && (b <= 90 )) || ((b >= 97) && (b <= 122)) 
					|| (b >= 48) && ( b <= 57) || (b == 32)){
				continue;
			}
			else{
				return true;
			}
		}
		return false;
		
	}
	/*
	public static String removeEspecials(String a){
		for (int j = 0; j < a.length(); j++) {
			char b = a.charAt(j);
			if(((b >= 65) && (b <= 90 )) || ((b >= 97) && (b <= 122)) 
					|| (b >= 48) && ( b <= 57) || (b == 32)){
				continue;
			}
			else{
				
			}
		}
		return a;
		
	}*/
	
	public static int contar_palabra(String cadena, String buscar){
		cadena = cadena.toLowerCase();
		buscar = cadena.toLowerCase();
		int coincidencias = 0;
		int aux = 0;
		while (aux <= cadena.length()){
			if(cadena.indexOf(buscar,aux) != -1){
				coincidencias++;
				aux = cadena.indexOf(buscar,aux)+buscar.length();
			}
			else{
				break;
			}
		}
		return coincidencias;
	}
	/**
	 * Convierte un vector de cualquier tipo en un String separando cada elemento con 4 espacios.
	 * @param element Es un vector de cualquier tipo de variable.
	 * @return El vector en forma de String, cada elemento separado por 4 espacios
	 */
	public static <T> void toString(T[] element){
		for (int i = 0; i < element.length; i++) {
			if(element[i] != null){
				System.out.print( element[i]+"    ");
			}
		}
	}
	
	
	/**
	 * Convierte un arreglo en un String dejando 3 espacios entre cada elemento
	 * @param array
	 * @return El arreglo en forma de String
	 */
	public static String toString(int[] array){
		String a = "";
		try {
			for (int i = 0; i < array.length; i++) {
				a += array[i] + "   ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	
	/**
	 * Convierte un arreglo en un String dejando 3 espacios entre cada elemento
	 * @param array
	 * @return El arreglo en forma de String
	 */
	public static String toString(double[] array){
		String a = "";
		try {
			for (int i = 0; i < array.length; i++) {
				a += array[i] + "   ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	
	/**
	 * Convierte un arreglo en un String dejando 3 espacios entre cada elemento
	 * @param array
	 * @return El arreglo en forma de String
	 */
	public static String toString(short[] array){
		String a = "";
		try {
			for (int i = 0; i < array.length; i++) {
				a += array[i] + "   ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	/**
	 * Convierte un arreglo en un String dejando 3 espacios entre cada elemento
	 * @param array
	 * @return El arreglo en forma de String
	 */
	public static String toString(byte[] array){
		String a = "";
		try {
			for (int i = 0; i < array.length; i++) {
				a += array[i] + "   ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	/**
	 * Convierte un arreglo en un String dejando 3 espacios entre cada elemento
	 * @param array
	 * @return El arreglo en forma de String
	 */
	public static String toString(long[] array){
		String a = "";
		try {
			for (int i = 0; i < array.length; i++) {
				a += array[i] + "   ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
	/**
	 * Convierte un arreglo en un String dejando 3 espacios entre cada elemento
	 * @param array
	 * @return El arreglo en forma de String
	 */
	public static String toString(float[] array){
		String a = "";
		try {
			for (int i = 0; i < array.length; i++) {
				a += array[i] + "   ";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return a;
	}
}
