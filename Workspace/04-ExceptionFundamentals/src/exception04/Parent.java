package exception04;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Parent{
	public void meth1() throws IOException{
		System.out.println("Parent");
	}
	public void meth2() throws IOException{
		System.out.println("Parent");
	}
	public void meth3() throws IOException{
		System.out.println("Parent");
	}
	public void meth4() throws IOException{
		System.out.println("Parent");
	}
	public void meth5() throws NullPointerException{
		System.out.println("Parent");
	}
}
class Child extends Parent{
	@Override
	public void meth1() throws IOException{
		System.out.println("Child");
	}
	@Override
	public void meth2() throws FileNotFoundException{
		System.out.println("Parent");
	}
	@Override
	public void meth3() //throws SQLException
	{
		System.out.println("Parent");
	}
	@Override
	public void meth4() {
		System.out.println("Parent");
	}
	public void meth5() throws ArrayIndexOutOfBoundsException{
		System.out.println("Parent");
	}
	
	public static void main(String[] args) {
		Parent p = new Parent();
//		p.meth1();
//		p.meth2();
	}
}


