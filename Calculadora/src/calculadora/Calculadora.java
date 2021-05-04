package calculadora;

public class Calculadora {

	private int result;
	
	public void Calculadora() {
		this.result = 0;
	}
	
	public void clear() {
		this.result = 0;
	}
	public static int suma (int a, int b) {
		return a + b;
	}
	
	public static int resta (int a, int b) {
		return a - b;
	}
	
	public static int multiplicar (int a, int b) {
		return a * b;
	}
	
	public static int dividir (int a, int b) {
		
		if (b>0) return a / b;
		else return 0;
	}
	
	public static boolean esPositivo(int a) {
		
		return ((a>0)?true:false);
	}
	
	
	
}
