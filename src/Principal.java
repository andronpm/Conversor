import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		// Instancia del conversor
		Menu menu = new Menu();
		
		boolean var = true;
		while (var) {
			
			String uno = (JOptionPane.showInputDialog(null,"Seleccione una opcion", "MENU", JOptionPane.QUESTION_MESSAGE,null,
					new Object[] {"Conversor de moneda","Conversor de temperatura"},"")).toString();
			
			switch (uno) {
			
				case "Conversor de moneda":
					
					String aDolares = (JOptionPane.showInputDialog("Digite la cantidad que quiere convertir"));
					
					if(Validar(aDolares)) {
						double dolar = Double.parseDouble(aDolares);
						menu.menu(dolar);
						
						int respuesta = JOptionPane.showConfirmDialog(null, "Desea realizar otra conversion");
						if(JOptionPane.OK_OPTION == respuesta) {
							break;
						}else {
							var = false;
							JOptionPane.showMessageDialog(null, "Programa finalizado");
							break;
						}
					}else {
						JOptionPane.showMessageDialog(null, "valor invalido");
						break;
					}
					
				case "Convertidor de temperatura":
					JOptionPane.showMessageDialog(null, "estan en contruccion");
					
				default:
					break;
			}
		}
		
	
	}
	
	
	
	
	
	public static boolean Validar(String valor) {
		try {
			double x = Double.parseDouble(valor);
			if(x >= 0 || x < 0);
				return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}

}


