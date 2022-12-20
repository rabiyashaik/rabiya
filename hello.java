import java.io.*;
import java.util.*;
class p1
{
double pi=3.14,r=5,h=5;
double a=pi*(r*r);
double p=pi*(r*r*r);
void q1()
{
System.out.print("Area of circle is"+a);
}
}
class p2 extends p1
{
void q1()
{
double b=(4/3)*(p);
System.out.println("volume of sphere="+b);
}
}
class p3 extends p1
{
void q1()
{
double c=(h/3)*(a);
System.out.println("volume of cone="+c);
}
}
class p4 extends p1
{
void q1()
{
double d=2*p/3;
System.out.println("volume of hemisphere="+d);
}
}
class hello
{
public static void main(String args[])
{
p1 o3=new p1();
p2 o= new p2();
p3 o1=new p3();
p4 o4=new p4();
o3=o4;
o3=o1;
o3=o;
o3.q1();
}
}

