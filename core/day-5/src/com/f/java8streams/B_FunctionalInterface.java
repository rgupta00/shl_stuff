package com.f.java8streams;

import java.io.File;import java.io.FileFilter;
import java.util.Comparator;

@FunctionalInterface
interface Foof{
	void foo();
}
public class B_FunctionalInterface {
	
	public static void main(String[] args) {
		//FI is a interface that support funcatinoal programming: SAM single abs method 
		
		Foof f=()-> System.out.println("hello to all");
			
	
		Runnable  runnable=()-> System.out.println("job of the threads...");
		
		
		Comparator<Emp> comparator=( o1,  o2)->  Double.compare(o2.getSalary(), o1.getSalary());
			
//		File dir=new File("C:\\tools1\\sts\\sts-bundle\\sts-3.9.12.RELEASE");
//		if(dir.isDirectory()) {
//			File[]files=dir.listFiles(new FileFilter() {
//				
//				@Override
//				public boolean accept(File name) {
//					return name.isHidden();
//				}
//			});
//			
//			for(File file: files) {
//				System.out.println(file.getName());
//			}
//			
//		}
//		
		
		//java 8: 
		File dir=new File("C:\\tools1\\sts\\sts-bundle\\sts-3.9.12.RELEASE");
		
		if(dir.isDirectory()) {
			File[]files=dir.listFiles( name->name.isHidden());
			
			for(File file: files) {
				System.out.println(file.getName());
			}
			
		}
		
		
		
	}
	
	

}






