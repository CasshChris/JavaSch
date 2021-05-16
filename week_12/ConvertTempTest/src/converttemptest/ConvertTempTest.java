/**
 * Project Name: ConvertTempTest
 * Programmer: Student - Christian Alvarez
 * Date: 04-22-2021
 */

package converttemptest;
// i :: import Classes
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.text.DecimalFormat; 

public class ConvertTempTest {
// 1 :: Declare panel, Text Fields, Labels & Buttons to add to JFrame
private JPanel panel;
private JTextField celsiusJTextField;
private JButton calculateJButton;
private JLabel designByJLabel;

// 2 :: Declare window final size
private final int WINDOW_WIDTH = 700;
private final int WINDOW_HEIGHT = 700;

    // 3 :: define main()
    public static void main(String[] args) {
        ConvertTemp app = new ConvertTemp ();

        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        app.setSize(700, 300);

        app.setLocationRelativeTo(null);

        app.setVisible(true);

    }
}

public ConvertTemp() {

    // 1 :: Set window title
    setTitle("Convert Celsius to Fahrenheit - Programmer: Christian Alvarez");
    
    // 2 :: Specify what happens when close button clicked
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // 3 :: Call buildPanel()
    buildPanel();
    
    // 4 :: Add the panel to the content pane.
    add(panel);
    
    // 5 :: set window size & 
    setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
    setVisible(true);
}
    
    
private void buildPanel () {
    JLabel celsiusMessage=newJLabel("Please, Enter the Celsius Temperature:");

    celsiusJTextField = new JTextField (10);

    calculateJButton = new JButton ("Convert Celsius to Fahrenheit");

    calculateJButton.addActionListener (new CalcButtonListener());

    designByJLabel = new JLabel ("Design by: Christian Alvarez");

    panel = new JPanel ();

    panel.add (celsiusMessage);
    panel.add (celsiusJTextField);
    panel.add (calculateJButton);
    panel.add (designByJLabel);

    panel.setBackground(Color.YELLOW);

    celsiusJTextField.setBackground(Color.GREEN);
    calculateJButton.setBackground(Color.RED);
    calculateJButton.setForeground(Color.WHITE);
    
    celsiusMessage.setFont(new Font("Times",Font.BOLD,36));
    celsiusJTextField.setFont(new Font("Times",Font.BOLD,36));
    calculateJButton.setFont(new Font("Times",Font.BOLD,36));
}

private class CalcButtonListener implements ActionListener {

    public void actionPerformed(ActionEvent e) {
        // 1 :: Declare variables
        double celsius;
        double fahrenheit;
        
        DecimalFormat fmt = new DecimalFormat("#,##0.0");
        
        celsius = Double.parseDouble(celsiusJTextField.getText());
        
        fahrenheit = (9.0 / 5.0) * celsius + 32;
        
        JOptionPane.showMessageDialog(null, celsius + " degree Celsius is = to " + fmt.format(fahrenheit) + " Fahrenheit degrees");
    }
}
}
    
