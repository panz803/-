package ch08_1411031011;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner keyin = new Scanner(System.in);
		String a,b;
		int x,y,z;
		try {
			System.out.print("�п�J��Ӿ��(�H�ťն��j)=>");
			a = keyin.next();
			b = keyin.next();
			x = Integer.parseInt(a);
			y = Integer.parseInt(b);
			z = x/y;
			System.out.printf("%d",z);
		}
		catch(ArithmeticException e){
			System.out.println("�ҥ~���e:"+e.toString());
			System.out.println("��:�ƾǹB����~�A�p���Ƭ�0");
			
		}
		catch(NumberFormatException e){
			System.out.println("�ҥ~���e:"+e.getMessage());
			System.out.println("��:�r���ഫ����Ƶo�Ϳ��~");
			
		}
		catch(Exception e){
			System.out.println("�ҥ~���e:"+e.toString());
			System.out.println("�ҥ~�o��!");
			
		}
		finally {
			System.out.println("\n���}try...catch�A�{������!");
			keyin.close();
		}
	}

}
