import javax.swing.*;

public class JV {
	public static void main(String[] args){
		String a,b,c;
		int x,y,z;
		a = JOptionPane.showInputDialog("input 1: ?");
		b = JOptionPane.showInputDialog("input 2: ?");
		z = Integer.parseInt(a) + Integer.parseInt(b);
		/*c = String.parseString(z);*/
		JOptionPane.showMessageDialog(null, "Sum : " + z, "Result", JOptionPane.PLAIN_MESSAGE);	
	}	
}
