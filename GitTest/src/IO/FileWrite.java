package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		/*
		FileOutputStream output = new FileOutputStream("c:\\out.txt");
		output.close();
		*/
		
		/*
		FileOutputStream output = new FileOutputStream("c:\\out.txt");
		for(int i=1; i<11; i++) {
			String data = i+"번째 줄입니다. \r\n";	
			
			//FileOutputStream에 값을 쓸 때는 Byte배열로 써야 하므로 String을 Byteㅂ열로 바꾸어 주는 getByte()메소드를 사용
			output.write(data.getBytes());
		}
		output.close();
		*/
		
		/*
		// String을 Byte배열로 변환하지 않아도 됨.
		FileWriter fw = new FileWriter("C:\\out.txt");
		for(int i=1; i<11; i++) {
			String data = i+"번째 줄입니다. \r\n";	
			fw.write(data);			
		}
		fw.close(); */
		
		PrintWriter pw = new PrintWriter("C:\\out.txt");
		for(int i = 1; i<11; i++) 
		{
			String data = i+" 번째 줄입니다.";
			pw.println(data);
		}
		pw.close();
		
		FileWriter fw = new FileWriter("c:\\out.txt",true);
		// = PrintWriter fw = new PrintWriter(new FileWriter("C:\\out.txt",true));
		for(int i=11; i<21; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			fw.write(data);
		}
		fw.close();
	}
}
