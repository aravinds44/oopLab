class LargestNum{



public static void main(String args[])
{	

	int a = 10, b = -10 , c = 5;

	System.out.println("a = "+a+",b = "+b+",c = "+c);

	if((a > b) && (a > c)){
		System.out.println("Largest of "+a+", "+b+", "+c+" = "+a);

	}
	else 
	if((b > a) && (b > c)){
		System.out.println("Largest of "+a+","+b+","+c+"="+b);
	
	}
	else{
	System.out.println("Largest of "+a+","+b+","+c+"="+c);
	}
	
}
}