package IO;


import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class StreamTest {
	public static void main(String[] args) throws Exception {
		/*
		InputStream in = System.in;
		int a;
		int b;
		int c;
		a = in.read();
		b = in.read();
		c = in.read();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		char[] a = new char[3];
				
		//reader.read(a);
		
		System.out.println(a);
		
		BufferedReader br = new BufferedReader(reader);
		String str = br.readLine();
		System.out.println(str);
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1��° �Է� : " + sc.next());		// �ܾ����
		System.out.println("2��°�Է� : "+ sc.nextLine());	// ����
		System.out.println("3��°�Է� : "+ sc.nextInt());	// ����
		
	}
}
