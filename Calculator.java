import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class Calculator extends JFrame implements ActionListener{

static double a=0,b=0,result=0;
static int operator=0;
private static JPanel jp,jp2,jp3;
private JTextField t1;
private JButton zero,one,two,three,four,five,six,seven,eight,nine,plus,minus,in2,div,equals,del,CE,percentage,power,deci;


public void createGUI(){

	jp=new JPanel();
	t1=new JTextField();
	t1.setEnabled(false);
	//t1.setForeground(Color.BLACK);

	zero=new JButton("0");
	one=new JButton("1");
	CE=new JButton("CE");
	CE.setForeground(Color.green);
	del=new JButton("Del");
	del.setForeground(Color.red);
	two=new JButton("2");
	three=new JButton("3");
	four=new JButton("4");
	five=new JButton("5");
	six=new JButton("6");
	seven=new JButton("7");
	eight=new JButton("8");
	nine=new JButton("9");
	plus=new JButton("+");

	plus.setForeground(Color.blue);

	minus=new JButton("-");

	minus.setForeground(Color.blue);

	in2=new JButton("*");

	in2.setForeground(Color.blue);

	div=new JButton("/");

	div.setForeground(Color.blue);



	percentage=new JButton("%");

	percentage.setForeground(Color.blue);

	power=new JButton("^");
	power.setForeground(Color.blue);
	deci=new JButton(".");
	deci.setForeground(Color.blue);
	equals=new JButton("=");
	equals.setForeground(Color.green);
	//ActionListener

	zero.addActionListener(this);
	one.addActionListener(this);
	CE.addActionListener(this);
	del.addActionListener(this);
	two.addActionListener(this);
	three.addActionListener(this);
	four.addActionListener(this);
	five.addActionListener(this);
	six.addActionListener(this);
	seven.addActionListener(this);
	eight.addActionListener(this);
	nine.addActionListener(this);
	plus.addActionListener(this);
	minus.addActionListener(this);
	in2.addActionListener(this);
	div.addActionListener(this);
	percentage.addActionListener(this);
	power.addActionListener(this);
	deci.addActionListener(this);
	equals.addActionListener(this);

jp.setLayout(new GridLayout(4,5));
jp.add(t1);
jp2=new JPanel();
jp2.add(t1);
jp2.setLayout(new GridLayout(1,1));



jp.add(zero);
	jp.add(one);
	jp.add(two);
	jp.add(CE);

	jp.add(del);
	jp.add(three);
	jp.add(four);
	jp.add(five);
	jp.add(div);
	jp.add(percentage);
	jp.add(six);
	jp.add(seven);
	jp.add(eight);
	jp.add(in2);
	jp.add(minus);
	jp.add(nine);


jp.add(deci);
	jp.add(power);


jp.add(plus);
jp.add(equals);

jp3=new JPanel();
jp3.setLayout(new GridLayout(2,1));
jp3.add(jp2);
jp3.add(jp);
}

public void actionPerformed(ActionEvent e){
	if(e.getSource()==zero){
		t1.setText(t1.getText().concat("0"));
		//zero.setForeground(Color.black);
	}
		if(e.getSource()==one){
		t1.setText(t1.getText().concat("1"));
	}
	if(e.getSource()==two){
			t1.setText(t1.getText().concat("2"));
		}
			if(e.getSource()==three){
			t1.setText(t1.getText().concat("3"));
	}
	if(e.getSource()==four){
			t1.setText(t1.getText().concat("4"));
		}
			if(e.getSource()==five){
			t1.setText(t1.getText().concat("5"));
	}
	if(e.getSource()==six){
			t1.setText(t1.getText().concat("6"));
			//t1.setForeground(Color.BLACK);
		}
			if(e.getSource()==seven){
			t1.setText(t1.getText().concat("7"));
	}
	if(e.getSource()==eight){
			t1.setText(t1.getText().concat("8"));
		}
			if(e.getSource()==nine){
			t1.setText(t1.getText().concat("9"));
	}
if(e.getSource()==deci){

		t1.setText(t1.getText().concat("."));
						zero.setEnabled(true);
						one.setEnabled(true);
						two.setEnabled(true);
						three.setEnabled(true);
						four.setEnabled(true);
						five.setEnabled(true);
						six.setEnabled(true);
						seven.setEnabled(true);
						eight.setEnabled(true);
						nine.setEnabled(true);
						deci.setEnabled(false);

	}


        if(e.getSource()==plus)
        {
			try{
            a=Double.parseDouble(t1.getText());
		operator=1;
            t1.setText("");
 									zero.setEnabled(true);
									one.setEnabled(true);
									two.setEnabled(true);
									three.setEnabled(true);
									four.setEnabled(true);
									five.setEnabled(true);
									six.setEnabled(true);
									seven.setEnabled(true);
									eight.setEnabled(true);
									nine.setEnabled(true);
									deci.setEnabled(true);

        }catch(NumberFormatException nf){
			JOptionPane.showMessageDialog(null,"idiot");
		}
	}

 if(e.getSource()==minus)
        {
			try{
            a=Double.parseDouble(t1.getText());
		operator=2;
            t1.setText("");
				zero.setEnabled(true);
				one.setEnabled(true);
				two.setEnabled(true);
				three.setEnabled(true);
				four.setEnabled(true);
				five.setEnabled(true);
				six.setEnabled(true);
				seven.setEnabled(true);
				eight.setEnabled(true);
				nine.setEnabled(true);
				deci.setEnabled(true);

        }catch(NumberFormatException nf){
			JOptionPane.showMessageDialog(null,"Please entern valid number/symbol");
		}
	}
         if(e.getSource()==in2)
		        {
					try{
		            a=Double.parseDouble(t1.getText());
				operator=3;
		            t1.setText("");
		            zero.setEnabled(true);
					one.setEnabled(true);
					two.setEnabled(true);
					three.setEnabled(true);
					four.setEnabled(true);
					five.setEnabled(true);
					six.setEnabled(true);
					seven.setEnabled(true);
					eight.setEnabled(true);
					deci.setEnabled(true);
nine.setEnabled(true);
        }catch(NumberFormatException nf){
			JOptionPane.showMessageDialog(null,"Please entern valid number/symbol");
		}
	}
         if(e.getSource()==div)
		        {
		            try{
						a=Double.parseDouble(t1.getText());
				operator=4;
		            t1.setText("");
		            zero.setEnabled(true);
					one.setEnabled(true);
					two.setEnabled(true);
					three.setEnabled(true);
					four.setEnabled(true);
					five.setEnabled(true);
					six.setEnabled(true);
					seven.setEnabled(true);
					eight.setEnabled(true);
					deci.setEnabled(true);
nine.setEnabled(true);
        }catch(NumberFormatException nf){
			JOptionPane.showMessageDialog(null,"Please entern valid number/symbol");
		}
	}
        if(e.getSource()==percentage)
				        {
							try{
				            a=Double.parseDouble(t1.getText());
						operator=5;
				            t1.setText("");
				            zero.setEnabled(true);
							one.setEnabled(true);
							two.setEnabled(true);
							three.setEnabled(true);
							four.setEnabled(true);
							five.setEnabled(true);
							six.setEnabled(true);
							seven.setEnabled(true);
							eight.setEnabled(true);
							nine.setEnabled(true);
							deci.setEnabled(true);
        }catch(NumberFormatException nf){
			JOptionPane.showMessageDialog(null,"Please entern valid number/symbol");
		}
	}
         if(e.getSource()==power)
						        {
									try{
						            a=Double.parseDouble(t1.getText());
								operator=6;
						            t1.setText("");
						            zero.setEnabled(true);
									one.setEnabled(true);
									two.setEnabled(true);
									three.setEnabled(true);
									four.setEnabled(true);
									five.setEnabled(true);
									six.setEnabled(true);
									seven.setEnabled(true);
									eight.setEnabled(true);
									nine.setEnabled(true);
									deci.setEnabled(true);
        }catch(NumberFormatException nf){
			JOptionPane.showMessageDialog(null,"Please entern valid number/symbol");
		}
	}

         if(e.getSource()==equals)
		        {
					try{
		            b=Double.parseDouble(t1.getText());


					switch(operator){
						case 1: result=a+b;
						break;
						case 2: result=a-b;
						break;
						case 3: result=a*b;
						break;
						case 4: result=a/b;
						break;
						case 5: result=a%b;
						break;
						case 6: result=(int)Math.pow(a, b);
						break;
						default: result=0;
					}
					t1.setText(""+result);
					zero.setEnabled(false);
					one.setEnabled(false);
					two.setEnabled(false);
					three.setEnabled(false);
					four.setEnabled(false);
					five.setEnabled(false);
					six.setEnabled(false);
					seven.setEnabled(false);
					eight.setEnabled(false);
					nine.setEnabled(false);
					deci.setEnabled(false);



				}catch(NumberFormatException nf){
			JOptionPane.showMessageDialog(null,"Please entern valid number/symbol");
		}
	}
				      if(e.getSource()==del)
				        {
				            String s=t1.getText();
				            t1.setText("");
				            for(int i=0;i<s.length()-1;i++)
				            t1.setText(t1.getText()+s.charAt(i));
				            	zero.setEnabled(true);
																one.setEnabled(true);
																two.setEnabled(true);
																three.setEnabled(true);
																four.setEnabled(true);
																five.setEnabled(true);
																six.setEnabled(true);
																seven.setEnabled(true);
																eight.setEnabled(true);
																nine.setEnabled(true);
																deci.setEnabled(true);

        }

							if(e.getSource()==CE)
						        {
						            String s=t1.getText();
						            t1.setText("");

									zero.setEnabled(true);
									one.setEnabled(true);
									two.setEnabled(true);
									three.setEnabled(true);
									four.setEnabled(true);
									five.setEnabled(true);
									six.setEnabled(true);
									seven.setEnabled(true);
									eight.setEnabled(true);
									nine.setEnabled(true);
									deci.setEnabled(true);

}

}


public static void main(String...args){
 CalculatorFront s=new CalculatorFront();

s.createGUI();
s.setVisible(true);
s.setLocation(400,150);
s.add(jp3);
s.setSize(400,300);
s.setDefaultCloseOperation(EXIT_ON_CLOSE);





}

}