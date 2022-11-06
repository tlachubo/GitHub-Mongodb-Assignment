package com.Lambda;
import java.lang.*;
import java.util.*;


public class ThreadExample {
	public static void main(String args[]){
		
//		List<Integer> list=new ArrayList<Integer>();
//		list.add(1);
//		list.add(4);
//		list.add(5);
//		list.add(3);
////		System.out.println(list);
//		//Consumer<List<Integer>> numlist=list1->list.stream().forEach(a->System.out.println(a+" "));
//		//modify.addThen(numList).accept(list);
//		
//		Thread t1=new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println(list);
//			}
//		});
//		
//		t1.start();
//	}

		Thread t1 = new Thread(()->{
			List<Integer> list=new ArrayList<Integer>();
			list.add(1);
			list.add(4);
			list.add(5);
			list.add(3);
			System.out.println(list);
		});
		t1.start();
	}
}
