import java.util.*;

class Numbers {
	int binarynum, octalnum, decimalnum, hexadecimalnum;
	Scanner input=new Scanner(System.in);

	public void geter(){

		int choss;
	while (true) {
		
		System.out.println("what number do you want to convert please indentify: ");
		System.out.println("press 1 for binary ");
		System.out.println("press 2 for octal "); 
		System.out.println("press 3 for decimal "); 
		System.out.println("press 4 for hexadecimal ");
		choss=input.nextInt();

		if(choss==1){
			System.out.println("Enter binary number: ");
			binarynum=input.nextInt();
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
			hexadecimalnum=input.nextInt();
			break;
		}else{
			System.out.println("wrong choice try again");
		}
		}
	}
}

class programer_converter {
	public static void main(String[] args) {
		Numbers num=new Numbers();
		num.geter();
	}
}
//the end
