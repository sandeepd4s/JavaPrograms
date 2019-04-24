package sample;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Report {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
		PrintWriter p = new PrintWriter(System.getProperty("user.dir")+"/"+"res.html");
		p.println("<!DOCTYPE html>");
		p.println("<html>\n<body>");
		p.println("<h2> Compare Report for time : " +"FILE SOURCE"+"</h2>");
		p.print("");
		p.close();
		
	}

}
