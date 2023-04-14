import javax.swing.JOptionPane;

public class Menu {

	
	public void menu(double valor) {
		
		Conversor conversor = new Conversor();
		
		String ingresar = (JOptionPane.showInputDialog(null,"Seleccione una opcion", "MENU", JOptionPane.PLAIN_MESSAGE,null, new Object[] {"De Pesos a Dolares","De Pesos a Euros",
				"De Pesos a Libras Esterlinas","De Pesos a Yen Japones",
				"De Pesos a Won Sur Coreano","De Dolares a Pesos",
				"De Euros a Pesos,", "De Libras Esterlinas a Pesos",
				"De Yen Japones a Pesos", "De Won Sur Coreano a Pesos"},"Seleccion")).toString();
		switch (ingresar) {
		case "De Pesos a Dolares":
			conversor.pesosDolares(valor);
			break;
		
		case "De Pesos a Euros":
			conversor.pesoEuro(valor);
			break;
			
		case "De Pesos a Libras Esterlinas":
			conversor.pesoLibras(valor);
			break;
		
		case "De Pesos a Yen Japones":
			conversor.pesoYen(valor);
			break;
			
		case "De Pesos a Won Sur Coreano":
			conversor.pesoWonSul(valor);;
			break;
			
		case "De Dolares a Pesos":
			conversor.dolarPeso(valor);
			break;
			
		case "De Euros a Pesos":
			conversor.euroPeso(valor);
			break;
			
		case "De Libras Esterlinas a Pesos":
			conversor.librasPeso(valor);
			break;
			
		case "De Yen Japones a Pesos":
			conversor.yenJapones(valor);
			break;
			
		case "De Won Sur Coreano a Pesos":
			conversor.wsCoreanoPeso(valor);
			break;
			
		}
	}
}
