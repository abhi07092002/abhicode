class Pattern1
{
	public static void main(String args[])
	{
	Console con=System.console();
	int no,i,j,k;
	no=Integer.parseInt(con.readLine());
	System.out.println("No of lines="+no);
	for(i=1;i<=no;i++)
	{
	for(j=i;j<=no;j++)
		System.out.print(" ");
	for(j=1;j<=i;j++)	
		System.out.print(j);
	for(k=1;k>=1;k--)
		System.out.print(k);
	System.out.println();
	}
	}
}