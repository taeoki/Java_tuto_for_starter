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
			String data = i+"��° ���Դϴ�. \r\n";	
			
			//FileOutputStream�� ���� �� ���� Byte�迭�� ��� �ϹǷ� String�� Byte������ �ٲپ� �ִ� getByte()�޼ҵ带 ���
			output.write(data.getBytes());
		}
		output.close();
		*/
		
		/*
		// String�� Byte�迭�� ��ȯ���� �ʾƵ� ��.
		FileWriter fw = new FileWriter("C:\\out.txt");
		for(int i=1; i<11; i++) {
			String data = i+"��° ���Դϴ�. \r\n";	
			fw.write(data);			
		}
		fw.close(); */
		
		PrintWriter pw = new PrintWriter("C:\\out.txt");
		for(int i = 1; i<11; i++) 
		{
			String data = i+" ��° ���Դϴ�.";
			pw.println(data);
		}
		pw.close();
		
		FileWriter fw = new FileWriter("c:\\out.txt",true);
		// = PrintWriter fw = new PrintWriter(new FileWriter("C:\\out.txt",true));
		for(int i=11; i<21; i++) {
			String data = i+" ��° ���Դϴ�.\r\n";
			fw.write(data);
		}
		fw.close();
	}
}
