class Calculator{



public static void main(String args[])
{	int a,b,c=0;
	String sym;

	if(args.length != 0){
		a = Integer.parseInt(args[0]);//converts string to integer
		b = Integer.parseInt(args[2]);
		

		sym = args[1]; //symbol
	
		
		if(sym.equals("+")){
			c = a+b;
		}
		else 
		if(sym.equals("-")){
			c = a-b;
		}
		else 
		if(sym.equals("*")){
			c = a*b;
		}
		
		else 
		if(sym.equals("/")){
			c = a/b;
		}
		
		System.out.println(a+sym+b+"="+c);	
		
	}
	else{
		System.out.println("NO CLA given");
	}
}
}