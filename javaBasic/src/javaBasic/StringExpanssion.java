package javaBasic;

public class StringExpanssion {

	public static void main(String[] args) {
		{ 
	        String temp = ""; 
	        String strin = "3(ab)4(cd)"; 
	        int j; 
	  
	        for (int i = 0; i < strin.length(); i++) { 
	            
	                // Subtract '0' to convert char to int 
	                int num = strin.charAt(i) - '0'; 
	                if (strin.charAt(i + 1) == '(') { 
	  
	                    // Characters within brackets 
	                    for (j = i + 1; strin.charAt(j) != ')'; j++) { 
	                        if ((strin.charAt(j) >= 'a'
	                             && strin.charAt(j) <= 'z') 
	                            || (strin.charAt(j) >= 'A'
	                                && strin.charAt(j) <= 'Z')) { 
	                            temp += strin.charAt(j); 
	                        } 
	                    } 
	  
	                    // Expanding 
	                    for (int k = 1; k <= num; k++) { 
	                        System.out.print(temp); 
	                    } 
	  
	                    // Reset the variables 
	                    num = 0; 
	                    temp = ""; 
	  
	                    if (j < strin.length()) { 
	                        i = j; 
	                    } 
	                } 
	            } 
	        } 
	    } 
	}


