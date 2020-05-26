import java.util.Scanner;

public class Arithmetic_Operations {

void add(int a ,int b)
{
		int c=a+b;
System.out.println("Addition Value is "+c);
}

void sub(int a ,int b)
{
		int c=a-b;
System.out.println("Sub Value is "+c);
}

void mul(int a ,int b)
{
		int c=a*b;
System.out.println("MUL Value is "+c);
}

void div(int a ,int b)
{
		int c=a/b;
System.out.println("Division Value is "+c);
}



public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic_Operations obj=new Arithmetic_Operations();
		obj.add(10, 20);
		obj.div(50, 5);
		obj.sub(100, 20);
		obj.mul(50, 5);
	}

}
