package sample.testcase;

import java.io.BufferedReader;
import java.io.FileReader;

public class SampleBufferedReader {
public static void main(String[] args) throws Exception {
	String fileName = "SampleBufferedReader.txt";
	
	FileReader file = new FileReader(fileName);
	BufferedReader read = new BufferedReader(file);
	
	String data;
	while((data=read.readLine())!=null) {
		System.out.println(data);
	}
	
//	String a1 = read.readLine();
//	System.out.println(a1);
}
}
