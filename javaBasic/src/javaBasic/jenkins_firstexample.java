package javaBasic;

public class jenkins_firstexample {
	
	//https://github.com/adityakilari/jenkins_examples.git
	
	
	int x;
	int y;
	public void add(int x, int y) {
		this.x = x;
		this.y = y;
		
		System.out.print(x+y);
	}
	
	public static void main(String args[]) {
		jenkins_firstexample exp = new jenkins_firstexample();
		exp.add(10, 20);
	}

}
