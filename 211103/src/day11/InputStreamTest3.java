package day11;
import java.io.*;
/* System.out
 * - PrintStreamŸ��
 * - 1byte��� ��Ʈ��
 * - �ְܼ� ��� �����ϴ� ��� ��Ʈ��
 * - �ֿ� �޼ҵ�
 *   print()/println()
 *   public void write(int b)
 */

public class InputStreamTest3 {

	public static void main(String[] args) throws IOException{
		
		int n = 0, count = 0, total = 0;
		// �����͸� 1����Ʈ ������ �̵��ϴ� ���� �ƴ϶�
		// �迭(�ް���)�� ��Ƽ� �̵����Ѻ���
		
		byte[] data = new byte[6]; // �ް���
		
		while((n = System.in.read(data)) != -1) {
			//System.out.println((char)n);
			//n: ���� ����Ʈ �� (�ް��ǿ� ���� �ް� ����)
			System.out.write(data, 0, n);
			count++; // �ݺ��� Ƚ��
			total += n; // ���� ����Ʈ ��
		}
		System.out.println("Total: "+total+"bytes");
		System.in.close();
		System.out.close();
	}

}
