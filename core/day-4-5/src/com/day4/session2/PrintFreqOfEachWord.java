package com.day4.session2;

import java.util.*;
import java.util.Map.Entry;
import java.io.*;

public class PrintFreqOfEachWord {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader("demo.txt"))) {
			String line = null;
			while ((line = br.readLine()) != null) {
				String tokens[] = line.split(" ");
				for (String token : tokens) {
					if(!map.containsKey(token)) {
						map.put(token, 0);
					}else {
						Integer freq=map.get(token);
						map.put(token, ++freq);
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//just print the map
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for(Entry<String, Integer> entry: entrySet) {
			System.out.println(entry.getKey()+" : "+ entry.getValue());
		}

	}

}













