//package com.zk;
import java.io.*;
public class Test{
	public static void main(String[] args){
		PrintWriter out = null;
		try{
			out = new PrintWriter("employee.txt");
			String name = "Harry Hacker";
			double salary = 75000;
			out.print(name);
			out.print(' ');
			out.print(salary);
			out.close();
		}
		catch(IOException e){
			System.out.println(e.toString());
		}
	}
}