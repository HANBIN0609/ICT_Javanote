package day11;
import java.io.*;
/*FileInputStream
 * - 1byte ��� ��Ʈ��
 * - ��� ��Ʈ��(���ϰ� ��� ������)
 */
public class FileInputStreamTest {

	public static void main(String[] args) 
	throws FileNotFoundException, IOException{
		String file 
		= "C:\\Users\\ict01-15\\eclipse-workspace2\\hbinjava\\src\\day11\\InputStreamTest.java";
		// �����ͼҽ�: ���� === FileInputStream 
		
		FileInputStream fis = new FileInputStream(file);
		// ���ϰ� ��� ����
		
		int n = 0, count = 0;
		// ������ ���� ������ -1�� ��ȯ�Ѵ�.
		while((n=fis.read()) != -1) {
			System.out.write(n);
			count++;
		}//while-----
		System.out.println("�� "+count+"bytes");
		fis.close();
		System.out.close();
	}

}
