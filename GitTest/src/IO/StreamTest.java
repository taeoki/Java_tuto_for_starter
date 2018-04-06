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
		System.out.println("1번째 입력 : " + sc.next());		// 단어단위
		System.out.println("2번째입력 : "+ sc.nextLine());	// 라인
		System.out.println("3번째입력 : "+ sc.nextInt());	// 정수
		
	}
}
