package com.a.classical_threads_sol;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.*;

public class A_Need_Of_Threads_Sol {

	public static void main(String[] args) {
		List<String> photoUrl = FileUtil.readFile("download.txt");
		for (String url : photoUrl) {
			FileDownloaderTask downloaderTask = new FileDownloaderTask(url);
			Thread thread = new Thread(downloaderTask);
			thread.start();
		}
	}
}
