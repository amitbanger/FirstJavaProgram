package com.demo.forloop;

public class Forloop {
	public static void main(String[] args) {
		int i = 1;
	for (System.out.println("Amit"); i<10; System.out.println("Banger")) {
		//System.out.println("Line " + i);
		i = i+3;
	}
/*************************foreachLoop***comes in java 1.5******************************************/
	String [] values = new String[4];
	values[0] = "Webdriver";
	values[1] = "Grid";
	values[2] = "IDE";
	values[3] = "RC";
	
	for(String value: values) {
		System.out.println(value);
		}
/************************forLoopBreak************************************************************/	
	for (int j=0; j<=10; j++)
	{if(j==0)
		System.out.println("i am into break loop");
	if(values[j]=="IDE"){
		break;
		}
	System.out.println(values[j]);
	}	
/***************************For loop continue*******************************************************/
	for(String value : values) {
		if (value.startsWith("G")) {
			continue;}
		System.out.println(value);
	}
	
	
	
	
	
	}
	

}
