import java.util.Scanner;
public class CheckGreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Float a,b,c;
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first number:  ");
		a = s.nextFloat();
		System.out.print("Enter second number:  ");
		b = s.nextFloat();
		System.out.print("Enter Third number:   ");
		c = s.nextFloat();
		if(a>b && a>c)
		{ System.out.println(a + " " + "is greater than"+" "+b+ "and"+" "+c);
		}
		else if(a<b && b>c)
		{ System.out.println(b + " " + "is greater than"+" "+a+ "and"+" "+c);
		}
		else if(a<c && b<c)
		{ System.out.println(c + " " + "is greater than"+" "+a+ "and"+" "+b);
		}
		}

}
