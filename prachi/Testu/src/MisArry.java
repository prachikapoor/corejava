
public class MisArry {
public static void main(String []args)
{
int a[]={7,2,8,4,6,1,3,9,10};
//int a[]= {1,3,2,5,6,8,7,9,10};

	int sum=0;
for(int i=0;i<a.length;i++)
{	
	   sum=sum+a[i];
}		System.out.println(sum);

int sum2=0;		
	for(int i=0;i<=a.length+1;i++)	
	sum2+=i;
	System.out.println(sum2);
		
	int r=sum2-sum;
	System.out.println(r);
}
}