import java.util.*;

class Numbers {
	static int binarynum, octalnum, decimalnum, hexadecimalnum;
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

class Decimal extends Numbers{
	Numbers d=new Numbers();
	int binary, octal, decimal=d.decimalnum, hexadecimal, i=0, i2=1, base;
	int[] rm=new int[99];

	public void convert_decimal(){
		while(i2<5){
			if(i2==1)
				base=2;
			else if (i2==2)
				base=8;
			else if (i2==3)
				base=10;
			else if (i2==4)
				base=16;

			while(decimal!=0){
		
				rm[i]=decimal%base;
				decimal=decimal/base;
				i++;
			}
		i2++;
		}
	}

	public void seter(){
		System.out.println("Your output is ");
		for (int i=0; i<=this.i; i++) {
			System.out.print(rm[i]);
		}
	}
}

class programer_converter {
	public static void main(String[] args) {
		Numbers num=new Numbers();
		num.geter();
		Decimal dnum=new Decimal();
		dnum.convert_decimal();
		dnum.seter();
	}
}
//the end