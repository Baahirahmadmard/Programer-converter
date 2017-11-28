import java.util.*;

class Numbers {
	static String binarynum, hexadecimalnum;
	static int octalnum, decimalnum;
	Scanner input=new Scanner(System.in);
	int choss;
	
	public void geter(){

		
	while (true) {
		
		System.out.println("what number do you want to convert please indentify: ");
		System.out.println("press 1 for binary ");
		System.out.println("press 2 for octal "); 
		System.out.println("press 3 for decimal "); 
		System.out.println("press 4 for hexadecimal ");
		choss=input.nextInt();

		if(choss==1){
			System.out.println("Enter binary number: ");
			binarynum=input.next();
			break;
		}else if (choss==2) {
			System.out.println("Enter octal number: ");
			octalnum=input.nextInt();
			break;
		}else if (choss==3) {
			System.out.println("Enter decimal number: ");
			decimalnum=input.nextInt();
			break;
		}else if (choss==4) {
			System.out.println("Enter hexadecimal number: ");
			hexadecimalnum=input.next();
			break;
		}else{
			System.out.println("wrong choice try again");
		}
		}
	}
}

class Binary extends Numbers{
	Numbers d=new Numbers();
	String octal, hexadecimal;
	String binary=d.binarynum;
	int decimal;

	public void convert_binary(){
		decimal=Integer.parseInt(binary, 2);
		octal=Integer.toOctalString(decimal);
		hexadecimal=Long.toHexString(decimal);
	}

	public void seter(){
		System.out.println("you converted decimal to those: ");
		System.out.println("Octal = "+octal);
		System.out.println("Decimal = "+decimal);
		System.out.println("Hexadecimal = "+hexadecimal);
		System.out.println("====================================================");
	}
}

class Decimal extends Numbers{
	Numbers d=new Numbers();
	String binary, octal, hexadecimal;
	int decimal=d.decimalnum;

	public void convert_decimal(){
		binary=Integer.toBinaryString(decimal);
		octal=Integer.toOctalString(decimal);
		hexadecimal=Integer.toHexString(decimal);
	}

	public void seter(){
		System.out.println("you converted decimal to those: ");
		System.out.println("Binary = "+binary);
		System.out.println("Octal = "+octal);
		System.out.println("Hexadecimal = "+hexadecimal);
		System.out.println("====================================================");
	}
}

class programer_converter {
	public static void main(String[] args) {

		Numbers num=new Numbers();
		num.geter();
		if(num.choss==1){
			
			Binary bnum=new Binary();
			bnum.convert_binary();
			bnum.seter();

		}else if(num.choss==2){

		}else if(num.choss==3){

			Decimal dnum=new Decimal();
			dnum.convert_decimal();
			dnum.seter();

		}else if(num.choss==4){

		}
		
	}
}
//the end