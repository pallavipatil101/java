package daily.task.practice;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer sb1 = new StringBuffer();
		System.out.println(sb1.capacity());			//16
		
//------------------------------------------------------------------------------		
		
		StringBuffer sb2 = new StringBuffer("abc");
		System.out.println(sb2.capacity());			//19
		sb2.append("dddddddddddddddddddd");			
		System.out.println(sb2.capacity());			//(19*2)+2=40
		
//------------------------------------------------------------------------------		
		
		StringBuffer sb3 = new StringBuffer();		//16
		
		sb3.append("defg");
		
		System.out.println(sb3.capacity()); 		//16
		
		sb3.append("hijklmnopqrstuv");
		
		System.out.println(sb3.capacity()); 		//(OldCapacity*2)+2=34 OR (OldCapacity+1)*2	--> when it goes beyong previous capacity.
		
		System.out.println(sb3); 					//defghijklmnopqrstuv

//-------------------------------------------------------------------------------
		
		StringBuffer sb4 = new StringBuffer("Sherlock");
		StringBuffer sb5 = new StringBuffer("Sherlock");
		System.out.println(sb4.equals(sb5));		//return false because unlike String class, StringBuffer does not override the equals method of Object class. Hence it compares the addresses. Not content.	

//-------------------------------------------------------------------------------
		
		System.out.println(sb4.insert(4, '-'));		//adds characters at given index
		sb4.setCharAt(6, 'u');						//replaces character from given index
		System.out.println(sb4);
		sb4.setLength(7);							//changes length of string
		System.out.println(sb4);
	
		StringBuilderDemo sbd = new StringBuilderDemo();
		System.out.println(sbd.myString());
	}

}
