import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		
		float n1,n2;
		
		n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero"));
		n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero"));
		
		float calculo = n1 * n2;
		float calculo2 = n1 / n2;
		
		
		System.out.println("A multiplicação dos seus números é:" + calculo);
		System.out.println("A divisão dos seus números é:" + calculo2);
		
				
	}

}
