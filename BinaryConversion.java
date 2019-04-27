import java.util.Scanner;

public class BinaryConversion{
		
		//method for converting from binary to decimal
	static void binary2Decimal(){
		
		        Scanner read = new Scanner(System.in);
		        int decimal = 0;
				
		        System.out.println("\t\tEnter Binary number :");
				String binary = read.next(); //scanning binary number input from the keyboard
				
				try{
					
				int nmbr = Integer.parseInt(binary,2);  //a line which will scan whether the input number is a binary or not
				
				for(int i =0; i < binary.length() ;  i++ ){
						if( binary.charAt(i) == '1' )
						decimal += 1*Math.pow(2, (binary.length() -1) - i );	
				}
				}
				catch(Exception e){System.out.print("Please enter a valid binary number");}
				System.out.print( "Decimal value is " + decimal );
				
		}//end  of binary2Decimal
	
		
		//method for converting from decimal to binary
	public void Decimal2binary(){
				
				Scanner scan = new Scanner(System.in);
				try{
				System.out.println("\t\tEnter Decimal number :");
				int num2 = scan.nextInt(); //scanning decimal number input from the keyboard
				
				String bnum = Integer.toBinaryString(num2); //converting the decimal number to binary  string 
				System.out.println("\t\tBinary Value is: "+bnum);
				}
				catch(Exception e){ //exception to be catched for an invalid input
						System.out.println("\t\tPlease enter a valid decimal");
				}
				
		}
		
		//main method
	  public  static   void main(String[] args){
				
				Scanner read = new Scanner(System.in);
			    BinaryConversion obj = new BinaryConversion(); //object for calling methods
				int b = 0;
				do{    //loop for executing code continuously whenever the user wants to continue converting 
				System.out.println("\n\t\t\tWelcome!! Choose Option Below:  ");
				System.out.println("\t\t\t****************************** ");
				System.out.println("\n\t\t1. Decimal to Binary ");
				System.out.println("\t\t2. Binary to Decimal ");
				int a = read.nextInt();
				
				if(a==1){
					obj.Decimal2binary();	//calling method for convrting from decimal to binary
				}
				else if(a==2){
				obj.binary2Decimal();     //calling method for converting from binary to decimal
				}
				else{
						System.out.println("\t\t\tEnter a valid option from above");   //statement to be executed if user has entered an invalid option/ none
				}
				
				
			   System.out.println("\n\n\t\t\tDo you want to continue converting? 1) Yes/ 2)No");
			   b = read.nextInt();
				}while(b==1);   //condition which specify if user wants to continue converting or not
				
		} //close main method
		
		
}  //close main class
