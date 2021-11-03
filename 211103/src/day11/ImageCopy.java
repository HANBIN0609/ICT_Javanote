package day11;
import java.io.*;
/* 1) smile.png �̹��� ������ copy.png���Ϸ� �����սô�.
 * ������ �ҽ� : ����(smile.png) =====> FileInputStream
 * ������ ������ : ����(copy.png)======> FileOutputStream
 * 
 * ��, �迭�� ��Ƽ� �а� ������
 */
public class ImageCopy {

	public static void main(String[] args)
	throws FileNotFoundException, IOException{
		
		int n = 0, total = 0;
		String spng = "C:\\Users\\ict01-15\\eclipse-workspace2\\hbinjava\\src\\day11\\molang.gif";
		String cpng = "src/day11/copy.gif";
		
		byte[] data = new byte[100000]; // �ް���
		
		FileInputStream fis = new FileInputStream(spng);
		FileOutputStream fos = new FileOutputStream(cpng);
		
		while((n = fis.read(data)) != -1) {
			fos.write(data, 0, n);
			fos.flush();
			total += n;
		}
		
		System.out.println("���� ���� �Ϸ�. "+total+"����Ʈ ����");
		fis.close();
		fos.close();
		System.out.close();
	}

}
