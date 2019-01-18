import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConversaoTemperaturaFrame extends JFrame {
	
	private final JLabel titulo;
	private final JTextField fahrenheit;
	private final JTextField celsius;
	private final JTextField kelvin;
	private final JLabel labelCelsius;
	private final JLabel labelFahrenheit;
	private final JLabel labelKelvin;
	private final JPanel panelTitulo;
	private final JPanel panelKelvin; 
	private final JPanel panelFahrenheit;
	private final JPanel panelCelsius;
	
	public ConversaoTemperaturaFrame() {
		
		super("Conversão de Temperatura:");
		setLayout(new GridLayout(4, 1));
		
		
		titulo = new JLabel("Conversor de temperaturas.");
		panelTitulo = new JPanel();
		labelFahrenheit = new JLabel("Fahrenheit:");
		fahrenheit = new JTextField(3);
		labelCelsius = new JLabel("Celsius:");
		celsius = new JTextField(3);
		labelKelvin = new JLabel("Kelvin:");
		kelvin = new JTextField(3);
		panelFahrenheit = new JPanel();
		panelCelsius = new JPanel();
		panelKelvin = new JPanel();
		
		panelFahrenheit.setLayout(new FlowLayout());
		panelCelsius.setLayout(new FlowLayout());
		panelKelvin.setLayout(new FlowLayout());
		panelTitulo.setLayout(new FlowLayout());
		
		panelTitulo.add(titulo);
		
		panelFahrenheit.add(labelFahrenheit);
		panelFahrenheit.add(fahrenheit);
		
		panelCelsius.add(labelCelsius);
		panelCelsius.add(celsius);
		
		panelKelvin.add(labelKelvin);
		panelKelvin.add(kelvin);
		
		add(panelTitulo);
		add(panelFahrenheit);
		add(panelCelsius);
		add(panelKelvin);
		
		fahrenheit.addKeyListener(
				
				new KeyAdapter() {
					
					@Override
					public void keyReleased(KeyEvent event) {
						
						final double temp = 5.0/9.0 * (Double.parseDouble(fahrenheit.getText()) - 32);	
						
						labelCelsius.setText(String.format("Celsius: %.1f", temp));
						
					}
					
				}
				
				);
		
	}
	
}
