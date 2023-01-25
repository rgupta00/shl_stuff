package com.day4.session2;
import java.util.*;

class Value implements Comparable<Value>{
	private int i;

	public Value(int i) {
		super();
		this.i = i;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	@Override
	public String toString() {
		return "Value [i=" + i + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Value other = (Value) obj;
		return i == other.i;
	}

	@Override
	public int compareTo(Value o) {
		return Integer.compare(o.getI(), this.getI());
	}
	
	
}
public class DemoSet {

	public static void main(String[] args) {
		
		Set<Value> set=new TreeSet<>(new Comparator<Value>() {

			@Override
			public int compare(Value o1, Value o2) {
				return Integer.compare(o1.getI(), o2.getI());
			}
		});
		set.add(new Value(2));
		set.add(new Value(82));
		
		set.add(new Value(27));
		set.add(new Value(772));
		
		System.out.println(set);
		
		
	}
}






