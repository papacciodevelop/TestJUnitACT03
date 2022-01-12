
public class ePrincipalEjercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int operando1 = 0;
		int operando2 = 0;
		System.out.println(sumar(operando1, operando2));
		System.out.println(restar(operando1, operando2));
		System.out.println(multiplicar(operando1, operando2));
	}

	public static int sumar(int operador1, int operador2) {
		int valor = operador1 + operador2;
		
		return valor;
	}

	public static int restar(int operador1, int operador2) {
		int valor = operador1 - operador2;
		return valor;
	}

	public static int multiplicar(int operador1, int operador2) {
		int valor = operador1 * operador2;
		return valor;
	}

}
