package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args)throws IOException {
		byte[] b = new byte[1024];		// 1024바이트를 읽어오도록 
		FileInputStream input = new FileInputStream("c:\\out.txt");
		input.read(b);
		System.out.println(new String(b));
		input.close();
		// ㄴ 읽어야 하는 정확한 길이를 모를 경우 좀 불편함
		// 그래서 아래와 같은 방법이 가능
		
		BufferedReader br = new BufferedReader(new FileReader("c:\\out.txt"));
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		br.close();
		// 라인단위로 파이을 읽음. 더이상 읽을라인이 없을때 null을 리턴한다.
	}
}
