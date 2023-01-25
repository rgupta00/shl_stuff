package com.day4.session2;
import java.util.*;
import java.util.Map.Entry;
class Product{
	private int id;
	private String name;
	private double price;
	
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
	
}
public class DemoMap {
	
	public static void main(String[] args) {
		//CustomerName-->List<Product>
		
		Map<String, List<Product>> map2=new HashMap<>();
		
		
		
		Map<String, Integer> map=new HashMap<>();
		map.put("raj", 78);
		map.put("ekta", 96);
		map.put("sumit", 50);
		map.put("amit", 90);
		map.forEach((k,v)->System.out.println(k+" : "+ v));
		//how to iterate map
		//keyset vs enteryset (better performance)
		
//		Set<String> keySet = map.keySet();
//		for(String key: keySet) {
//			System.out.println(key +": "+ map.get(key));
//		}
		
//		Set<Entry<String, Integer>> entrySet =
//				map.entrySet();
//		
//		for(Entry<String, Integer> e: entrySet) {
//			System.out.println(e.getKey()+" : "+ e.getValue());
//		}
		
		//System.out.println(map);
		
	}

}











