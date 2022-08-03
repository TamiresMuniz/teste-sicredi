import java.util.ArrayList;
import java.util.List;

public class RendimentoPoupancaEstruturado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double valor = 10000;
		int meses = 10;
		double taxaSelic = 7;
		double taxaReferencial = 0.05;

		List<String> resultado = calculaRendimetento(valor, meses, taxaSelic, taxaReferencial);
		for(String linha: resultado) {
			System.out.println(linha);	
		}
		
	}

	public static List<String> calculaRendimetento(double valor, int meses, double taxaSelic, double taxaReferencial) {

		double taxaMensalSelic = 0;

		if (taxaSelic <= 8.5) {
			taxaMensalSelic = (taxaSelic * 0.7) / 12;
		} else {
			taxaMensalSelic = 0.5;
		}

		double taxaTotalMensal = (taxaMensalSelic + taxaReferencial) / 100;
		
		List<String> resultado = new ArrayList<String>();
		resultado.add("Valor Inicial: " + valor);
		for( int i  = 1; i <= meses; i++) {
			double juroMensal = (valor * Math.pow(1+taxaTotalMensal, i)) - valor;
			double rendimentoTotalMensal = valor * Math.pow(1+taxaTotalMensal, i);
			resultado.add("Mês " + i + " Juro mensal: " + juroMensal + " Rendimento total Mensal: " + rendimentoTotalMensal);
		}
		
		double rendimento = valor * Math.pow(1+taxaTotalMensal, meses);
		resultado.add("Resultado final: " + rendimento);
		
		return resultado;
	}
}
