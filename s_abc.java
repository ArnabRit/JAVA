class s_abc
{
	static String name[] = { "somnath" , "rit", "Arnab" , "prince", "miscat","Akash"};
	public static void main (String args[])
	{
		int size = name.length;
		String a = null;
		int i,j;
		for(i = 0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(name[j].compareTo(name[i])<0)
				{
					a = name[i];
					name[i]=name[j];
					name[j]=a;
				}
			}
		}
		for(i=0;i<size;i++)
		{
			System.out.println(name[i]);
		}
	}
}