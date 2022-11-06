package com.generics;


import java.util.*;
public class Hash{
public static void main(String args[]){
HashMap<Integer,Double> map=new HashMap<Integer,Double>();
map.put(8,90.87);
map.put(4,67.98);
map.put(5,79.6478);
map.put(9,34.87);

System.out.println("Data in hashmap");
for(@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()){
System.out.println(m.getKey()+" "+m.getValue());
}
}
}
