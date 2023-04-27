import java.io.IOException;

import javax.swing.JOptionPane;

public class Funcion {

	Conversor monedas = new Conversor();

	public void Conversor(double DatoParaConvertir) throws IOException, InterruptedException {

		String divisas = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero",
				"Monedas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De soles a dolar", "De soles a libras esterlinas", "De soles a euro",
						"De dolar a soles", "De libras esterlinas a soles", "De euro a soles", "De Boliviano a soles" },
				"Selección")).toString();

		switch (divisas) {
		case "De soles a dolar":

			monedas.SolesaDolar(DatoParaConvertir);

			break;
		case "De soles a libras esterlinas":

			monedas.SolesaLibras(DatoParaConvertir);

			break;
		case "De soles a euro":

			monedas.SolesaEuro(DatoParaConvertir);

			break;
		case "De dolar a soles":

			monedas.DolaraSoles(DatoParaConvertir);

			break;
		case "De libras esterlinas a soles":

			monedas.LibrasaSoles(DatoParaConvertir);

			break;
		case "De euro a soles":

			monedas.EuroaSoles(DatoParaConvertir);

			break;
		case "De Boliviano a soles":

			monedas.BolivianoaSoles(DatoParaConvertir);

			break;
		}
	}

	Conversor2 centimetro = new Conversor2();

	public void Conversor2(double DatoParaConvertir) throws IOException, InterruptedException {

		String medidas = (JOptionPane.showInputDialog(null, "Elije la longitud a la que deseas convertir tu medida",
				"Medidas", JOptionPane.PLAIN_MESSAGE, null,
				new Object[] { "De centimetro a metro", "De centrimetro a pulgada", "De centrimetro a milimetro" },
				"Selección")).toString();

		switch (medidas) {
		case "De centimetro a metro":

			centimetro.CmaM(DatoParaConvertir);

			break;
		case "De centrimetro a pulgada":

			centimetro.CmaP(DatoParaConvertir);

			break;
		case "De centrimetro a milimetro":

			centimetro.CmaMm(DatoParaConvertir);

			break;

		}
	}

}
