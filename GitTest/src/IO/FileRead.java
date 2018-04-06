package IO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args)throws IOException {
		byte[] b = new byte[1024];		// 1024����Ʈ�� �о������ 
		FileInputStream input = new FileInputStream("c:\\out.txt");
		input.read(b);
		System.out.println(new String(b));
		input.close();
		// �� �о�� �ϴ� ��Ȯ�� ���̸� �� ��� �� ������
		// �׷��� �Ʒ��� ���� ����� ����
		
		BufferedReader br = new BufferedReader(new FileReader("c:\\out.txt"));
		while(true) {
			String line = br.readLine();
			if(line==null) break;
			System.out.println(line);
		}
		br.close();
		// ���δ����� ������ ����. ���̻� ���������� ������ null�� �����Ѵ�.
	}
}
