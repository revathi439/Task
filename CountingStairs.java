import java.util.*;
import java.lang.*;
public class CountingStairs
{
public static int Count(int a)
{
int n[]=new int[a+1];
n[0]=1;
n[1]=1;
n[2]=2;
int i;
for(i=3;i<=a;i++)
n[i]=n[i-1]+n[i-2]+n[i-3];
return n[a];
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number of stairs:");
int a=sc.nextInt();
System.out.println("number of ways to reach:"+Count(a));
}
}
