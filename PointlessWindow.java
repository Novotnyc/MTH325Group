package package1;

import javax.swing.JDialog;
import javax.swing.JFrame;

/**A window class to help the JFileChooser Window show. */
public class PointlessWindow extends JDialog {
	
	/**Default serial ID. */
	private static final long serialVersionUID = 1L;
	
	/**Creates a placeholder window so JFileChooser can Spawn in front
	 * of it. */
	public PointlessWindow() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
