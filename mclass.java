class Substraction
{
int a,b,s;
void sub()
{
a=10;
b=5;
s=a-b;
System.out.println("Substraction of two number is:"+s);
}
}
class Mclass
{
public static void main(String args[])
{
Addition ob1=new Addition();
Substraction ob2=new Substraction();
ob1.add();
ob2.sub();
}
}