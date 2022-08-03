
public class RendimentoPoupanca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = 10000;
		int meses = 1;
		double taxaSelic = 7;
		double taxaReferencial = 0.05;

		double rendimento = calculaRendimetento(valor, meses, taxaSelic, taxaReferencial);
		
		System.out.println("Rendimento: " + rendimento);
	}

	public static double calculaRendimetento(double valor, int meses, double taxaSelic, double taxaReferencial) {

		double taxaMensalSelic = 0;

		if (taxaSelic <= 8.5) {
			taxaMensalSelic = (taxaSelic * 0.7) / 12;
		} else {
			taxaMensalSelic = 0.5;
		}

		double taxaTotalMensal = (taxaMensalSelic + taxaReferencial) / 100;
		
		double rendimento = valor * Math.pow(1+taxaTotalMensal, meses);
		
		return rendimento;
	}
}
