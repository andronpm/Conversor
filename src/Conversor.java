import javax.swing.JOptionPane;

public class Conversor {

	
	public void pesosDolares(double valor) {
		double dolar = valor / 3739.00;
		dolar = (double) Math.round(dolar *100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $" + dolar + " dolares USD");
	}
	
	public void pesoEuro(double valor) {
		double euro = valor * 0.00020;
		euro = (double) Math.round(euro *100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $" + euro + " Euros");		
	}
	
	public void pesoLibras(double valor) {
		double libras = valor * 0.00017;
		libras =(double) Math.round(libras * 100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $" + libras + " Libras Esterlinas");		
	}
	
	public void pesoYen(double valor) {
		double yjapones = valor * 0.028;
		yjapones = (double) Math.round(yjapones*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $" + yjapones + " Yen Coreano");		
	}
	
	public void pesoWonSul(double valor) {
		double wscoreano = valor * 0.28;
		wscoreano = (double) Math.round(wscoreano*100d)/100;
		JOptionPane.showMessageDialog(null, "tienes $" + wscoreano + " Won Sur Coreano");		
	}
	
	public void dolarPeso(double valor) {
		double dolar = valor * 3700;
		JOptionPane.showMessageDialog(null, "tienes $" + dolar + " Pesos Colombianos");		
	}
	
	public void euroPeso(double valor) {
		double euro = valor * 4.993;
		JOptionPane.showMessageDialog(null, "tienes $" + euro + " Pesos Colombianos");		
	}
	
	public void librasPeso(double valor) {
		double librasesterlinas = valor * 5.705;
		JOptionPane.showMessageDialog(null, "tienes $" + librasesterlinas + " Pesos Colombianos");		
	}
	
	public void yenJapones(double valor) {
		double yJapones = valor * 34.87;
		JOptionPane.showMessageDialog(null, "tienes $" + yJapones + " Pesos Colombianos");		
	}
	
	public void wsCoreanoPeso(double valor) {
		double wscoreano = valor * 3.48;
		JOptionPane.showMessageDialog(null, "tienes $" + wscoreano + " Pesos Colombianos");		
	}
	
		

}




