import javax.swing.JOptionPane;

public class Calculadora {
	public static void main(String[] args) {
		
		int n1,n2;
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		
		int calculo = n1 - n2;
		
		
		System.out.println("A Soma dos seus números é:" + calculo);
		
				
	}

}
