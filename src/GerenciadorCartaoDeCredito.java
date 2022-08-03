
public class GerenciadorCartaoDeCredito {

	public static void main(String[] args) {
		double limite = 1000;
		double[] listaCompras = new double[] {100.0, 150.5};
		int resultado = temLimite(limite, listaCompras);
		System.out.println("Tem limite? " + resultado);

		listaCompras = new double[] {500.0d, 500.01d};
		resultado = temLimite(limite, listaCompras);
		System.out.println("Tem limite? " + resultado);		
		
	}
	
	public static int temLimite(double limite, double[] listaCompras) {
		double soma = 0;
		for(double valor : listaCompras) {
			soma += valor;
		}
		if(soma > limite) {
			return 1;
		}
		return 0;
	}
}
