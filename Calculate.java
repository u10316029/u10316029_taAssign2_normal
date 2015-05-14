import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Calculate{

	private JFrame frame;
	private static JTextField InputRadius;
	private static JTextField InputSide;
	private static JTextField Inputlength,InputWidth;
	private static JTextField area_of_Circle;
	private static JTextField per_of_Circle;
	private static JTextField area_of_Square;
	private static JTextField per_of_Square;
	private static JTextField area_of_Rectangle;
	private static JTextField per_of_Rectangle;
	public static void main(String[] args) {
		Calculate window = new Calculate();
		window.frame.setVisible(true);		
	}
	public Calculate() {
		initialize();
	}

	private void initialize() {
		
		//The components for Circle
		Circle a = new Circle();
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 600);
		frame.setTitle("U10316029_GeoCalculate");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(null);
		
		JLabel Circle = new JLabel("Circle:");
		Circle.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		Circle.setBounds(38, 29, 60, 15);
		frame.add(Circle);
		
		JLabel radius = new JLabel("Radius:");
		radius.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		radius.setBounds(54, 64, 46, 15);
		frame.add(radius);
		
		InputRadius = new JTextField();
		InputRadius.setBounds(109, 62, 96, 21);
		frame.add(InputRadius);
	
		JLabel area = new JLabel("The area is:");
		area.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		area.setBounds(54, 106, 81, 15);
		frame.add(area);
		
		JLabel perimeter = new JLabel("The perimeter is:");
		perimeter.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		perimeter.setBounds(54, 147, 107, 15);
		frame.add(perimeter);
		
		area_of_Circle = new JTextField();
		area_of_Circle.setBounds(129, 104, 96, 21);
		frame.add(area_of_Circle);
		
		per_of_Circle = new JTextField();
		per_of_Circle.setBounds(160, 145, 96, 21);
		frame.add(per_of_Circle);
		
		
		//The components for Square
		Square b = new Square();
		
		JLabel Square = new JLabel("Square:");
		Square.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		Square.setBounds(38, 180, 60, 15);
		frame.add(Square);
		
		JLabel side = new JLabel("Side:");
		side.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		side.setBounds(54, 215, 46, 15);
		frame.add(side);
		
		InputSide = new JTextField();
		
		InputSide.setBounds(109, 213, 98, 21);
		frame.add(InputSide);
		
		JLabel area1 = new JLabel("The area is:");
		area1.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		area1.setBounds(54, 257, 81, 15);
		frame.add(area1);
		
		JLabel perimeter1 = new JLabel("The perimeter is:");
		perimeter1.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		perimeter1.setBounds(54, 298, 107, 15);
		frame.add(perimeter1);
		
		area_of_Square = new JTextField();
		area_of_Square.setBounds(129, 255, 96, 21);
		frame.add(area_of_Square);
		
		per_of_Square = new JTextField();
		per_of_Square.setBounds(160, 296, 96, 21);
		frame.add(per_of_Square);
		
		//The components for Rectangle
		Rectangle c = new Rectangle();
		
		JLabel Rectangle = new JLabel("Retangle: ");
		Rectangle.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		Rectangle.setBounds(38, 361, 60, 15);
		frame.add(Rectangle);
		
		JLabel length = new JLabel("Length:");
		length.setFont(new Font("PMingLiU", Font.PLAIN, 13));
		length.setBounds(54, 396, 46, 15);
		
		frame.add(length);
		Inputlength = new JTextField();
		Inputlength.setBounds(109, 394, 96, 21);
		frame.add(Inputlength);
		
		JLabel width = new JLabel("Width:");
		width.setFont(new Font("PMingLiU", Font.PLAIN, 13));
		width.setBounds(54, 438, 46, 15);
		
		frame.add(width);
		InputWidth = new JTextField();
		InputWidth.setBounds(109, 436, 96, 21);
		frame.add(InputWidth);
		
		JLabel area2 = new JLabel("The area is:");
		area2.setFont(new Font("PMingLiU ", Font.PLAIN, 13));
		area2.setBounds(54, 480, 81, 15);
		frame.add(area2);
		
		JLabel perimeter2 = new JLabel("The perimeter is:");
		perimeter2.setFont(new Font("PMingLiU", Font.PLAIN, 13));
		perimeter2.setBounds(54, 522, 107, 15);
		frame.add(perimeter2);
		
		area_of_Rectangle = new JTextField();
		area_of_Rectangle.setBounds(129, 478, 96, 21);
		frame.add(area_of_Rectangle);
		
		per_of_Rectangle = new JTextField();
		per_of_Rectangle.setBounds(160, 520, 96, 21);
		frame.add(per_of_Rectangle);
		
		JButton calculate = new JButton("Calculate");
		calculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double radius;
			
				try{
					radius = Double.parseDouble(InputRadius.getText());
					if(radius >= 0){
						a.setRadius(radius);	
						per_of_Circle.setText(a.getPerimeter()+"");
						area_of_Circle.setText(a.getArea()+"");
					}
					else
						JOptionPane.showMessageDialog(null, "Input error");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Input error");
				}
			}
		});
		calculate.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		calculate.setBounds(293, 61, 100, 23);
		frame.add(calculate);
		
		JButton remove = new JButton("Remove");
		remove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputRadius.setText("");
				per_of_Circle.setText("");
				area_of_Circle.setText("");
			}
		});
		remove.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		remove.setBounds(414, 61, 100, 23);
		frame.add(remove);
		
		JButton calculate2 = new JButton("Calculate");
		calculate2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double side;
				try{
					side = Double.parseDouble(InputSide.getText());
					if(side >= 0){
						b.setSide(side);
						per_of_Square.setText(b.getPerimeter()+"");
						area_of_Square.setText(b.getArea()+"");
					}
					else
						JOptionPane.showMessageDialog(null, "Input error");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Input error");
				}
			}
		});
		calculate2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		calculate2.setBounds(293, 212, 100, 23);
		frame.add(calculate2);
		
		JButton remove2 = new JButton("Remove");
		remove2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				InputSide.setText("");
				per_of_Square.setText("");
				area_of_Square.setText("");
			}
		});
		remove2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		remove2.setBounds(414, 212, 100, 23);
		frame.add(remove2);
		
		JButton calculate3 = new JButton("Calculate");
		calculate3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				double length;
				double width;
				try{
					
					length = Double.parseDouble(Inputlength.getText());
					width = Double.parseDouble(InputWidth.getText());
					if(length>=0 && width>=0){
						c.setSide(length, width);
						per_of_Rectangle.setText(c.getPerimeter()+"");
						area_of_Rectangle.setText(c.getArea()+"");
					}
					else
						JOptionPane.showMessageDialog(null, "Input error");
				}catch(Exception e1){
					JOptionPane.showMessageDialog(null, "Input error");
				}
			}
		});calculate3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		calculate3.setBounds(293, 393, 100, 23);
		frame.add(calculate3);
		
		JButton remove3 = new JButton("Remove");
		remove3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Inputlength.setText("");
				InputWidth.setText("");
				per_of_Rectangle.setText("");
				area_of_Rectangle.setText("");
			}
		});
		remove3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 14));
		remove3.setBounds(414, 393, 100, 23);
		frame.add(remove3);
	}
}
 class Circle {
	private double radius;
	
	Circle(){
		radius = 1;
	}
	
	Circle(double radius){
		this.radius = radius;
	}
	
	double getArea(){
		return (int)((radius * radius * Math.PI)*1000)/1000.0;
	}
	
	double getPerimeter(){
		return (int)((2 * radius * Math.PI)*1000)/1000.0;
	}
	
	void setRadius(double radius){
		this.radius = radius;
	}
}
class Square{
	private double side;
	Square(){
		side = 1;
	}
	Square(double side){
		this.side = side;
	}
	double getArea(){
		return (int)((side * side *1000)/(1000.0));
	}
	double getPerimeter(){
		return (int)((4 * side * 1000)/(1000.0));
	}
	void setSide(double side){
		this.side = side;
	}
}
class Rectangle{
	private double length,width;
	Rectangle(){
		length = 1;
		width = 1;
	}
	Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}
	double getArea(){
		return (int)((length * width *1000)/(1000.0));
	}
	double getPerimeter(){
		return (int)((2 * (length + width) * 1000)/(1000.0));
	}
	void setSide(double length,double width){
		this.length = length;
		this.width = width;
	}
}
