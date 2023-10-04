package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAColones {
	public void ConvertirDolaresAColones(double valor) {
		double monedaDolar = valor * 539.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Colones");
	}
	
	public void ConvertirEurosAColones(double valor) {
		double monedaEuro = valor * 550.00;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Colones");
	}
	
	public void ConvertirLibrasAColones(double valor) {
		double monedaLibra = valor * 655.15;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Colones");
	}
	
	public void ConvertirYenAColones(double valor) {
		double monedaYen = valor * 0.28;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Colones");
	}
	
	public void ConvertirWonAColones(double valor) {
		double monedaWon = valor * 2.54;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Colones");
	}
}
