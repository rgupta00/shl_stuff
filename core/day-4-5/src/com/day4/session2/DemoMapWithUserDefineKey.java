package com.day4.session2;
import java.util.*;
final class Key implements Comparable<Key>{
	private String k;

	public String getK() {
		return k;
	}

	public void setK(String k) {
		this.k = k;
	}

	public Key(String k) {
		this.k = k;
	}

	@Override
	public String toString() {
		return "Key [k=" + k + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(k);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Key other = (Key) obj;
		return Objects.equals(k, other.k);
	}

	@Override
	public int compareTo(Key o) {
		return this.getK().compareTo(o.getK());
	}
	
	
}
public class DemoMapWithUserDefineKey {
	
	public static void main(String[] args) {
		Map<Key, String> map=new TreeMap<>();
		map.put(new Key("22"), "22 value");
		map.put(new Key("2333"), "22 value");
		
		String value=map.get(new Key("22"));
		System.out.println(value);
	}

}














