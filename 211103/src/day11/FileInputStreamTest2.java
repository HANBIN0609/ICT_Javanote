package day11;
import java.io.*;
/*FileInputStream
 * - 1byte ��� ��Ʈ��
 * - ��� ��Ʈ��(���ϰ� ��� ������)
 */
public class FileInputStreamTest2 {

	public static void main(String[] args) 
	throws FileNotFoundException, IOException{
		String file 
		= "C:\\Users\\ict01-15\\eclipse-workspace2\\hbinjava\\src\\day11\\InputStreamTest.java";
		// �����ͼҽ�: ���� === FileInputStream 
		
		FileInputStream fis = new FileInputStream(file);
		// ���ϰ� ��� ����
		
		int n = 0, count = 0, total = 0;
		byte[] data = new byte[1024];
		// ���ϵ����͸� byte�迭�� ��Ƽ� �а� �ֿܼ� ����غ�����.
		
		// ������ ���� ������ -1�� ��ȯ�Ѵ�.
		while((n=fis.read(data)) != -1) {
			System.out.write(data, 0, n);
			count++; // �ݺ��� Ƚ��
			total += n; // ����ũ��
		}//while-----
		System.out.println("�� "+total+"bytes");
		fis.close();
		System.out.close();
	}

}
