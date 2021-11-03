package day11;
import java.io.*;
/*[�ǽ�] Ű����� �Է¹޾� �� ������ ����(result.txt)�� �����غ���.
 * 1) ������ �ҽ� : Ű���� ================> System.in
 * 2) ������ ������ : ����(result.txt)=====> FileOutputStream
 */
public class FileOutputStreamTest {

	public static void main(String[] args) 
	throws IOException
	{
		System.out.println("�Է��ϼ���. �Է��� ������ result.txt�� ����˴ϴ�.");
		String file = "src/day11/result.txt";
		int n = 0, count = 0;
		
		// ���ϰ� ��� ���� ��Ʈ�� ����
		FileOutputStream fos = new FileOutputStream(file, true);
		// true���� �ָ� append(�����̱�) ��
		// ���� ���� ���뿡 �̾����
		
		while((n=System.in.read())!= -1)  {
			fos.write(n);
			fos.flush(); // ��Ʈ���� �����ִ� �����͸� �о�� ����
			count++;
		}// while-----
		
		System.out.println(count+"����Ʈ ��");
		fos.close();
		System.in.close();
		System.out.close();
	}

}
