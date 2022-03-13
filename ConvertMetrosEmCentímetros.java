package git;
import java.util.Scanner;

public class ConvertMetrosEmCentímetros {

	static Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		System.out.println("Converter Quanto(s) Metro(s) Para Centimetros?");
			float metro = scan.nextFloat();
			float centimetro = (metro)*100;
		
			System.out.println(metro + " Metro(s)" + " = " + centimetro + " Centimetros");
	}
}
