class Constructor
{int a,b,c,d,e,f;
String name;
String p;
Constructor()
{System.out.println("no arguments");
}
Constructor(int an)
{a=an;

}
Constructor(int bd,String news)
{b=bd;
name=news;

}
Constructor(int f,int g,int h,String pi)
{c=f;
d=g;
e=h;
p=pi;

}
void addition()
{System.out.println("addition = "+(c+d+e));
}
void subtraction()
{System.out.println("subtraction = "+((c-d)-e));
}
void multi()
{System.out.println("multiplication = "+((c*d)*e));
}
void division()
{System.out.println("division = "+((c/d)/e));
}

public static void main(String args[])
{
	Constructor c=new Constructor();
	Constructor c1=new Constructor(5);
	Constructor c2=new Constructor(6,"book");
	Constructor c3=new Constructor(7,8,9,"pen");





c3.addition();
c3.subtraction();
c3.multi();
c3.division();



}
}