package lab;
@FunctionalInterface
interface Power
{
	public double power(double x,double y);
}
public class Q1 {
	
	public static void main(String[] args) {
		
		Power p1 = (a,b)->{
			return Math.pow(a, b);
		};
		
		Power p2 = (a,b)->{
			double pow = a;
			for(int i=1;i<b;i++)
			{
				pow = pow*a;
			}
			return pow;
		};
		
		System.out.println(p1.power(10, 3));
		System.out.println(p2.power(10, 3));
	}

}