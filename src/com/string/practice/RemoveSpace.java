package com.string.practice;

//Remove white space from String
//Input : "  j  av a  St  a r  "
//Output : javaStar

public class RemoveSpace {
	
	static void removeWithoutBuiltInMethod() {
        
		String str = "   All Is Well  ";
		
		char[] strArray = str.toCharArray();  //convert string to array
		
		String newString = "";   //take empty string
		
		for(int i = 0; i < strArray.length; i++ ) {
			if(strArray[i] != ' ' && strArray[i] != '\t') {   
				newString = newString + strArray[i];
			}
		}
		System.out.println(newString);
	}

	public static void main(String[] args) {
		
		String str = "  j  av a  St  a r  ";
		
		System.out.println("Using trim() >> " + str.trim());   //trim() : it only replace spaces at end and start
		
		System.out.println("Using replaceAll() >>" + str.replaceAll("\\s", ""));   // here \\s represents unicode value for space 
		

		System.out.println("Remove Space w/o Built in Methods : ");
		RemoveSpace.removeWithoutBuiltInMethod();
	}

}
