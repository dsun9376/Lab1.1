
public class ControlStructures {
	public static void main (String[] args){fooBarBaz();}
	
//	 System.out.println("Hello,Java");} 
	
	
//	public boolean max(int a, int b)
	//{ of(x>=y)
		//return x; }
	
	//public static void PrimePrinter(int x, int y)
	//{ int counter = 0;
	//   int i=2;
	  //   while(counter <= (x-1))
	  //  	int fac = 2;
	        //for (int g = 2)
	
	
	
	
	public static void fooBarBaz() {
		{for (int n=2;n<=500;n++) 
		{boolean a = (n%3==0);
		 boolean b = (n%7==0);
		 boolean c = (n%10==0);
		  if (a || b || c)  
		  { if ( a && b && c) {System.out.println("foobarbaz");}
		  
		    else if (a && b) {System.out.println("foobar");} 
		    else if (a && c) {System.out.println("foobaz");}
		    else if (b && c) {System.out.println("barbaz");}
		    else if (a) {System.out.println("foo");}
		    else if (b) {System.out.println("bar");}
		    else if (c) {System.out.println("baz");}
		  }
		  else {System.out.println(n);}
		}
		}
	
		
		
		}
		
		
		
		    
		  
}

