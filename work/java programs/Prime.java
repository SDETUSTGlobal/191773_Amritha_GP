public class Prime
{
public static void main(String[]args)
{
System.out.println("prime nos are");
int i;
int num=0;
String p=" ";
for(i=1;i<=10;i++)
{int counter=0;
for(num=i;num>=1;num--)
{
if(i%num==0)
{counter=counter+1;
}
}
if(counter==2)
{ p=p+i+" ";}
}
System.out.println(p);
}
}

