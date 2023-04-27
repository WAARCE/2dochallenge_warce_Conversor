import javax.swing.JOptionPane;

public class Conversor2 {

	public void CmaM(double valor2) {
		double metro = valor2 / 100;
		Math.round(metro);
		JOptionPane.showMessageDialog(null, "Son " + metro + " metros");
	}

	public void CmaP(double valor2) {
		double pulgada = valor2 * 0.3937;
		Math.round(pulgada);
		JOptionPane.showMessageDialog(null, "Son " + pulgada + " metros");
	}

	public void CmaMm(double valor2) {
		double milimetro = valor2 * 10;
		Math.round(milimetro);
		JOptionPane.showMessageDialog(null, "Son " + milimetro + " metros");
	}
}
