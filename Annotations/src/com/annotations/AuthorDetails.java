package com.annotations;
import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface info{
	String Class = null;
	int AuthorID();
	String Author();
	String Supervisor();
	String Date();
	String Time();
	double Version();
	
}
@info(AuthorID=01,Author="Vinod",Supervisor="Tanu",Date="04-11-2022",Time="12.09",Version=1.0)
class Person{
	
	int size;
	String Date;
	String Time;
	double Version;


	public Person(int size,String date,String time,double version, String Date, String Time, double Version) {
		this.size=size;
		this.Date=Date;
		this.Time=Time;
		this.Version=Version;
		
	}
}

public class AuthorDetails {
	public static void main(String[]args) {
		Person obj=new Person(1,"04-11-2022","12.31",1.0, null, null, 0);
		Class<? extends Person> c=obj.getClass();
		Annotation an=c.getAnnotation(info.class);
		info i=(info)an;
		System.out.println(i.AuthorID());
		System.out.println(i.Author());
		System.out.println(i.Supervisor());
		System.out.println(i.Date());
		System.out.println(i.Time());
		System.out.println(i.Version());
	}

}
