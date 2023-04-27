
import java.io.IOException;

import javax.swing.JOptionPane;

public class MenuPrincipal {
	static Funcion monedas = new Funcion();
	static Funcion centimetro = new Funcion();

	public static void main(String[] args) throws IOException, InterruptedException {
		String opciones = (JOptionPane.showInputDialog(null, "Selecciona una opcion de conversión", "Menu",
				JOptionPane.DEFAULT_OPTION, null, new Object[] { "Conversor de moneda", "Conversor de longitudes" },
				"Seleccion")).toString();

		boolean flag = true;
		while (flag) {
			switch (opciones) {
			case "Conversor de moneda":

				String valor = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir:");
				if (Validar(valor)) {
					double DatoParaConvertir = Double.parseDouble(valor);
					monedas.Conversor(DatoParaConvertir);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion afirmativa");

					} else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}

				} else {
					JOptionPane.showMessageDialog(null, "Ingrese solo números");
				}
				break;

			case "Conversor de longitudes":

				String valor2 = JOptionPane
						.showInputDialog("Ingresa la cantidad de centrimetros que deseas convertir:");
				if (Validar(valor2)) {
					double DatoParaConvertir = Double.parseDouble(valor2);
					centimetro.Conversor2(DatoParaConvertir);

					int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
					if (JOptionPane.OK_OPTION == respuesta) {
						System.out.println("Selecciona opcion afirmativa");

					} else {
						flag = false;
						JOptionPane.showMessageDialog(null, "Programa terminado");
					}

				} else {
					JOptionPane.showInputDialog(null, "Ingrese solo números");
				}
				break;
			}
		}
	}

	public static boolean Validar(String valor) {

		try {
			double numero = Double.parseDouble(valor);
			if (numero >= 0 || numero < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}

	public static boolean Validar2(String valor2) {

		try {
			double numero = Double.parseDouble(valor2);
			if (numero >= 0 || numero < 0)
				;
			return true;
		} catch (NumberFormatException e) {
			return false;
		}

	}
}
