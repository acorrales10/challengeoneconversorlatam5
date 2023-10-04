package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

	
	public void ConvertirColonesADolares(double valor) {
		double monedaDolar = valor / 539.00;
		monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaDolar+ " Dolares");
	}
	
	public void ConvertirColonesAEuros(double valor) {
		double monedaEuro = valor / 550.00;
		monedaEuro = (double) Math.round(monedaEuro *100d)/100;
		JOptionPane.showMessageDialog(null, "Tienes $ " +monedaEuro+ " Euros");
	}
	
	public void ConvertirColonesALibras(double valor) {
		double monedaLibra = valor / 655.15;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaLibra+ " Libras Esterlinas");
	}
	
	public void ConvertirColonesAYen(double valor) {
		double monedaYen = valor / 0.28;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaYen+ " Yuanes");
	}
	
	public void ConvertirColonesAWon(double valor) {
		double monedaWon = valor / 2.54;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes $ " +monedaWon+ " Wons");
	}
}
