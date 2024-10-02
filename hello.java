int[] a= {1,2,3,4};
int[] rev=new int[4];
for(int i=a.length-1;i>=0;i--)
{
	for(int j=0;j<rev.lenth-1;j++)
		rev[j]=a[i];
}
