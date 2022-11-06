package com.generics;
import java.util.*;


public class Employee {

static void displayDetails()
{
Set<Integer> set1 = new HashSet<Integer>();

set1.add(1);
set1.add(2);
set1.add(3);

Set<String> set2 = new HashSet<String>();
set2.add("tanuja");
set2.add("Sowji");
set2.add("Kusuma");

Set<Double> set3 = new HashSet<Double>();
set3.add(1000.00);
set3.add(2000.00);
set3.add(3000.00);

Set<String> set4 = new HashSet<String>();
set4.add("StatDept");
set4.add("CommerceDept");
set4.add("physicsDept");


for (Integer a : set1)
{
System.out.printf("Id :%d\n", a);
}
Iterator<String> b = set2.iterator();

while (b.hasNext())
{
System.out.printf("Name :%s\n", b.next());
}
for(Double c : set3 )
{
System.out.printf("Salary :%f\n",c);
}
Iterator<String> d = set4.iterator();
while(d.hasNext())
{
System.out.printf("Department :%s\n",d.next());
}





}

public static void main(String[] args)
{
displayDetails();
}
}



