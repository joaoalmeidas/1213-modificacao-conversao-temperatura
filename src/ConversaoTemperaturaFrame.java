import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversaoTemperaturaFrame extends JFrame {
	
	
	private final JTextField fahrenheit;
	private final JLabel celsius;
	private final JLabel labelFahrenheit;
	private final JPanel panelFahrenheit;
	private final JPanel panelCelsius;
	
	public ConversaoTemperaturaFrame() {
		
		super("Conversão de Temperatura:");
		setLayout(new GridLayout(2, 1));
		
		labelFahrenheit = new JLabel("Fahrenheit:");
		fahrenheit = new JTextField(3);
		celsius = new JLabel("Celsius:");
		panelFahrenheit = new JPanel();
		panelCelsius = new JPanel();
		
		panelFahrenheit.setLayout(new FlowLayout());
		panelCelsius.setLayout(new FlowLayout());
		
		fahrenheit.addKeyListener(
				
				new KeyAdapter() {
					
					@Override
					public void keyReleased(KeyEvent event) {
						
						final double temp = 5.0/9.0 * (Double.parseDouble(fahrenheit.getText()) - 32);	
						
						celsius.setText(String.format("Celsius: %.1f", temp));
						
					}
					
				}
				
				);
		
		panelFahrenheit.add(labelFahrenheit);
		panelFahrenheit.add(fahrenheit);
		
		panelCelsius.add(celsius);
		
		add(panelFahrenheit);
		add(panelCelsius);
		
	}
	
}
