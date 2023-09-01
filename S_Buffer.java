class S_Buffer
{
	public static void main(String args[])
	{
		StringBuffer a = new StringBuffer("cse_TINT_3rd");
		System.out.println("original :"+a);
		System.out.println("Length of the string :"+a.length());
		int i;
		for(i=0;i<a.length();i++)
		{
			int p = i+1;
			System.out.println("character at position "+ p +" "+"is"+" "+ a.charAt(i));
		}	
			String abc = new String(a.toString()); 
			int pos = abc.indexOf("_3rd");
			a.insert(pos,"year");
			System.out.println("Modified string " +a);
			a.setCharAt(5,'_');
			System.out.println("String now "+a);
			a.append("_Arnab_Pramanick");
			System.out.println("The final string is " + a);
	}
}