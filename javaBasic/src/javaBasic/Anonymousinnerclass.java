package javaBasic;


interface a{
	 void add(int x, int y);
	 void subtract(int c,int b);
	 
}
public class Anonymousinnerclass {
	
	public static void main(String args[]) {
		
		a obj = new a() {

			@Override
			public void add(int x, int y) {
				// TODO Auto-generated method stub
				int z;
				z = x+y;
				System.out.println(z);
			}

			@Override
			public void subtract(int c, int b) {
				// TODO Auto-generated method stub
				int v;
				v = c-b;
				System.out.println(v);
			}
			
		};	
		obj.add(10, 20);	
		obj.subtract(20, 8);
		
	}
}
