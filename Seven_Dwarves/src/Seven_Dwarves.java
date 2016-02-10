import java.util.Scanner;
public class Seven_Dwarves {

	public static void main(String[] args) {
		int Dwar1,Dwar2,Dwar3,Dwar4,Dwar5,Dwar6,Dwar7,Dwar8,Dwar9;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Dwar1 : ");
		Dwar1 = scan.nextInt();
		System.out.print("Enter Dwar2 : ");
		Dwar2 = scan.nextInt();
		System.out.print("Enter Dwar3 : ");
		Dwar3 = scan.nextInt();
		System.out.print("Enter Dwar4 : ");
		Dwar4 = scan.nextInt();
		System.out.print("Enter Dwar5 : ");
		Dwar5 = scan.nextInt();
		System.out.print("Enter Dwar6 : ");
		Dwar6 = scan.nextInt();
		System.out.print("Enter Dwar7 : ");
		Dwar7 = scan.nextInt();
		System.out.print("Enter Dwar8 : ");
		Dwar8 = scan.nextInt();
		System.out.print("Enter Dwar9 : ");
		Dwar9 = scan.nextInt();
		System.out.println();
		
		scan.close();
		
		if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar1 & Dwar2");
		
		else if(Dwar2+Dwar4+Dwar5+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar1 & Dwar3");
		
		else if(Dwar3+Dwar2+Dwar5+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar1 & Dwar4");
		
		else if(Dwar3+Dwar4+Dwar2+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar1 & Dwar5");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar2+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar1 & Dwar6");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar2+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar1 & Dwar7");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar7+Dwar2+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar1 & Dwar8");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar7+Dwar8+Dwar2==100)
		System.out.print("Fake Dwarf is Dwar1 & Dwar9");
		
		else if(Dwar1+Dwar4+Dwar5+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar2 & Dwar3");
		
		else if(Dwar3+Dwar1+Dwar5+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar2 & Dwar4");
		
		else if(Dwar3+Dwar4+Dwar1+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar2 & Dwar5");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar1+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar2 & Dwar6");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar1+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar2 & Dwar7");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar7+Dwar1+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar2 & Dwar8");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar7+Dwar8+Dwar1==100)
		System.out.print("Fake Dwarf is Dwar2 & Dwar9");
		
		else if(Dwar1+Dwar2+Dwar5+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar3 & Dwar4");
		
		else if(Dwar1+Dwar4+Dwar2+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar3 & Dwar5");
		
		else if(Dwar1+Dwar4+Dwar5+Dwar2+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar3 & Dwar6");
		
		else if(Dwar1+Dwar4+Dwar5+Dwar6+Dwar2+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar3 & Dwar7");
		
		else if(Dwar1+Dwar4+Dwar5+Dwar6+Dwar7+Dwar2+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar3 & Dwar8");
		
		else if(Dwar1+Dwar4+Dwar5+Dwar6+Dwar7+Dwar8+Dwar2==100)
		System.out.print("Fake Dwarf is Dwar3 & Dwar9");
		
		else if(Dwar3+Dwar1+Dwar2+Dwar6+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar4 & Dwar5");
		
		else if(Dwar3+Dwar1+Dwar5+Dwar2+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar4 & Dwar6");
		
		else if(Dwar3+Dwar1+Dwar5+Dwar6+Dwar2+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar4 & Dwar7");
		
		else if(Dwar3+Dwar1+Dwar5+Dwar6+Dwar7+Dwar2+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar4 & Dwar8");
		
		else if(Dwar3+Dwar1+Dwar5+Dwar6+Dwar7+Dwar8+Dwar2==100)
		System.out.print("Fake Dwarf is Dwar4 & Dwar9");
		
		else if(Dwar3+Dwar4+Dwar1+Dwar2+Dwar7+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar5 & Dwar6");
		
		else if(Dwar3+Dwar4+Dwar1+Dwar6+Dwar2+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar5 & Dwar7");
		
		else if(Dwar3+Dwar4+Dwar1+Dwar6+Dwar7+Dwar2+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar5 & Dwar8");
		
		else if(Dwar3+Dwar4+Dwar1+Dwar6+Dwar7+Dwar8+Dwar2==100)
		System.out.print("Fake Dwarf is Dwar5 & Dwar9");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar1+Dwar2+Dwar8+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar6 & Dwar7");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar1+Dwar7+Dwar2+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar6 & Dwar8");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar1+Dwar7+Dwar8+Dwar2==100)
		System.out.print("Fake Dwarf is Dwar6 & Dwar9");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar1+Dwar2+Dwar9==100)
		System.out.print("Fake Dwarf is Dwar7 & Dwar8");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar1+Dwar8+Dwar2==100)
		System.out.print("Fake Dwarf is Dwar7 & Dwar9");
		
		else if(Dwar3+Dwar4+Dwar5+Dwar6+Dwar7+Dwar1+Dwar2==100)
		System.out.print("Fake Dwarf is Dwar8 & Dwar9");
		
		else 
			System.out.print("Can't Find Dwarves");

	}

}
