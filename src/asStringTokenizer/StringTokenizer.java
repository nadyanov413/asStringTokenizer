package asStringTokenizer;
import javax.swing.JOptionPane;

public class StringTokenizer {
	
	String in = JOptionPane.showInputDialog("Enter data values separated by comma:");
	String delim = ",";
	
	StringTokenizer st = new StringTokenizer(in,delim);
	
	int count = st.countTokens;
	
	

}
