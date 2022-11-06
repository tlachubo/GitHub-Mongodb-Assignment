package com.Streams;
import java.util.*;
public class Fruits {
int calories;
String name;
int price;
String colour;
public Fruits(int calories,String name,int price,String colour)
{
this.calories=calories;
this.name=name;
this.price=price;
this.colour=colour;
}
public String getName()
{
	return name;
}
public void setName(String name)
{
	this.name=name;
}
public int getCalories()
{
	return calories;
}
public void setCalories(int calories)
{
	this.calories=calories;
}
public int getPrice()
{
	return price;
}
public void setPrice(int price)
{
	this.price=price;
}
public String getColour()
{
	return colour;
}
public void setColour(String colour)
{
	this.colour=colour;
}
 class StreamsProgram1 {
	public static void main(String[] args) {
		ArrayList<Fruits>fruitList=new ArrayList<Fruits>();
		fruitList.add(new Fruits(100,"apple",40,"red"));
		fruitList.add(new Fruits(100,"orange",20,"orange"));
		fruitList.add(new Fruits(100,"Grapes",20,"Green"));
		fruitList.add(new Fruits(100,"Mango",20,"yellow"));
		System.out.println("List of fruits sorted by calories");
		fruitList.stream().filter(f->f.calories<100).forEach(f->System.out.println(f.calories));
		System.out.println("colour wise fruit names");
		fruitList.stream().sorted(new Comparator<Fruits>()
				{
			@Override
			public int compare(Fruits o1,Fruits o2)
			{
				return o1.getColour().compareTo(o2.getColour());
			}
				})
		.forEach(f->System.out.println(f.getName()));
		System.out.println("List of fruits which are red sorted by price:");
		fruitList.stream().filter(f->f.getColour().equalsIgnoreCase("red")).sorted((Fruits o1,Fruits o2)->(int)o1.getPrice()-o2.getPrice()).forEach(f->System.out.println(f.getName()));	
	}
 }
}

