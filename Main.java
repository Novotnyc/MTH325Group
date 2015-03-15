package package1;

import package1.PointlessWindow;
import package1.Pokemon;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Vector;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Main {

	public static void main(String[] args) {
		randomFunction();

	}
	public final static void randomFunction() {
		Vector<String> nameArray = new Vector<String>();
		Vector<Pokemon> pokeArray = new Vector<Pokemon>();
		JOptionPane.showMessageDialog(null, "Welcome to the Java "
				+ "Pokedex!\nPlease select the database text file"
				+ " on the next screen:");
		JFileChooser choice = new JFileChooser();
		FileNameExtensionFilter filter = new FileNameExtensionFilter(
				"Text Files", "txt");
		choice.setFileFilter(filter);
		int value = choice.showOpenDialog(new PointlessWindow());
		if (value == JFileChooser.APPROVE_OPTION) {
			try {
				BufferedReader newBuffer = new BufferedReader(new 
						FileReader(choice.getSelectedFile()));
				String line;
				while ((line = newBuffer.readLine()) != null) {
					nameArray.add(line.substring(0, 
							line.lastIndexOf('\t')));
					int newNum = Integer.parseInt(line.substring(0, 3));
					String newName = line.substring(line.indexOf('\t') 
							+ 1, line.lastIndexOf('\t'));
					String newType1 = line.substring(
							line.lastIndexOf('\t') + 1);
					String newType2;
					int newTotal;
					line = newBuffer.readLine();
					if (line.charAt(0) == '\t' || line.charAt(0) == '2'
							|| line.charAt(0) == '3' || line.charAt(0)
							== '4' || line.charAt(0) == '5' 
							|| line.charAt(0) == '6' || line.charAt(0)
							== '7' || line.charAt(0) == '1') {
						newType2 = null;
						newTotal = Integer.parseInt(line.substring(0, 
									line.indexOf('\t')));
					} else {
							newType2 = line.substring(0, 
									line.indexOf('\t'));
							line = line.substring(line.indexOf('\t')
									+ 1);
							
							newTotal = Integer.parseInt(line.substring(0, 
									line.indexOf('\t')));
						}
					line = line.substring(line.indexOf('\t') + 1);
					int newHP = Integer.parseInt(line.substring(
							0, line.indexOf('\t')));
					line = line.substring(line.indexOf('\t') + 1);
					int newAttack = Integer.parseInt(line.substring(
							0, line.indexOf('\t')));
					line = line.substring(line.indexOf('\t') + 1);
					int newDefense = Integer.parseInt(line.substring(
							0, line.indexOf('\t')));
					line = line.substring(line.indexOf('\t') + 1);
					int newSpAttack = Integer.parseInt(line.substring(
							0, line.indexOf('\t')));
					line = line.substring(line.indexOf('\t') + 1);
					int newSpDefense = Integer.parseInt(line.substring(
							0, line.indexOf('\t')));	
					line = line.substring(line.indexOf('\t') + 1);
					int newSpeed = Integer.parseInt(line);
					pokeArray.add(new Pokemon(newNum, newName, newType1,
							newType2, newHP, newSpeed, newAttack,
							newDefense, newSpAttack, newSpDefense,
							newTotal));
				}
				newBuffer.close();
		} catch (Exception e) {
				e.printStackTrace();
		}
		
		} else {
			System.exit(0);
		}

}
}