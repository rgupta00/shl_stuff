package com.day4.session1.ex_handing;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class B_CheckedVsUncheked {
	public static void main(String[] args) {
		
		//Checked ex vs uncheked ex
		try{
			BufferedReader br=new BufferedReader(new FileReader("demo.txt"));
			String line=null;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			System.out.println("file is found");
		}catch (FileNotFoundException e) {
			System.out.println("file is not found");
		}
		catch(IOException ex) {
			System.out.println("some io ex");
		}
		catch(Exception ex) {
			System.out.println("some other ex");
		}
		
		
	}

}
