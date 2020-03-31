package javaBasic;

import java.util.ArrayList;
import java.util.List;

public class Javapractice {

	List<a> l = data.getList();
	
	public Javapractice() {
		
	 //l.add(e)
	}
	
	public static void main(String [] args) { 
		
		
		
	}
	
	public class a{
		private String floc;
		private String tloc;
		private int cost;
		
		
		public a(String floc, String tloc, int cos) {
			this.cost =cos;
			this.floc = floc;
			this.tloc = tloc;
			
		}
		public a() {
			
		}
		
		
		public String getFloc() {
			return floc;
		}
		public void setFloc(String floc) {
			this.floc = floc;
		}
		public String getTloc() {
			return tloc;
		}
		public void setTloc(String tloc) {
			this.tloc = tloc;
		}
		public int getCost() {
			return cost;
		}
		public void setCost(int cost) {
			this.cost = cost;
		}
			
	}
	
	
	static class data{
		
		private static  List<a> list = new ArrayList<>();

		public static List<a> getList() {
			return list;
		}

		public void setList(List<a> list) {
			data.list = list;
		}

		
	}
	

}
