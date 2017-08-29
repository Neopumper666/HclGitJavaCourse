package com.hcl;

public class JeloGuorl {
	
	String s = "JP";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JeloGuorl jg = new JeloGuorl(5);
		
		//JeloGuorl a = new JeloGuorl();
		//JeloGuorl b = new JeloGuorl(2);
		JeloGuorl c = new JeloGuorl(jg.s + " Hello World");
	}
	
	public JeloGuorl(){
		System.out.println("constructor vacio :v");
	}
	
	public JeloGuorl(int a){
		System.out.println("constructor numerico: "+a);
	}
	
	public JeloGuorl(String cadena){
		System.out.println("constructor cadenico: "+cadena);
	}
	
}
