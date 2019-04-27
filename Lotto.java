import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class Lotto extends JFrame{
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JTextArea field = new JTextArea(3,25);
		JButton get = new JButton("Get Numbers");
		JButton reset = new JButton("Reset");
		JLabel label = new JLabel("Welcome to Lotto++");
		JOptionPane pane = new JOptionPane();
		
		
		public static void main(String[] args){
				
				new Lotto(); //calling lotto function
				
		}
		
		public Lotto(){ //declation of lotto funtion
				
			
				super("Lotto++");
				setSize(500,200);
				setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				setVisible(true);
				setResizable(false);
				
				
				panel.setBackground(new Color(248,211,5));
				get.setBackground(new Color(0,128,0));
				reset.setBackground(new Color(255,0,0));
				label.setForeground(new Color(0,128,128));
				
				panel.setFont(new Font("Microsoft JhengHei UI", 0, 16));
				get.setFont(new Font("Microsoft JhengHei UI", 0, 16));
				reset.setFont(new Font("Microsoft JhengHei UI", 0, 16));
				label.setFont(new Font("Microsoft JhengHei UI", 4, 17));
				field.setFont(new Font("Microsoft JhengHei UI", 0, 16));
				
				panel.add(label);
				panel.add(field);
				panel.add(get);
				panel.add(reset);
				
				add(panel);
				
				
				
				get.addActionListener(new ActionListener(){
						
						public void actionPerformed(ActionEvent me){
								
								Random rndm1 = new Random();
								String msg = "Are you 18+?";
								String title = "Age";
								String confirm ;
								int reply = pane.showConfirmDialog(null, msg, title, pane.YES_NO_OPTION);
								
								if(reply ==pane.YES_OPTION){
								int rnd1 = rndm1.nextInt(25);
								int rnd2 = rndm1.nextInt(49);
								int rnd3 = rndm1.nextInt(49);
								int rnd4 = rndm1.nextInt(49);
								int rnd5 = rndm1.nextInt(49);
								int rnd6 = rndm1.nextInt(49);
								
								String strng1 = String.valueOf(rnd1);
								String strng2 = String.valueOf(rnd2);
								String strng3 = String.valueOf(rnd3);
								String strng4 = String.valueOf(rnd4);
								String strng5 = String.valueOf(rnd5);
								String strng6 = String.valueOf(rnd6);
								
								field.setText(strng1+" "+strng2+" "+strng3+" "+strng4+" "+strng5+" "+" Bonus "+strng6);
								}
								else if(reply == pane.NO_OPTION){
										field.setText("You are still under age for playing lotto");
								}
								else{System.exit(0);}
						}
						
						
						
				});
				
				reset.addActionListener(new ActionListener(){
						
						public void actionPerformed(ActionEvent me){
								
								field.setText("");
								
						}
						
						
				});
				
				
		}
		
		
		
}