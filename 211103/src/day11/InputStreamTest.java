package day11;
import java.io.*;
/* System.in
 * - InputStreamŸ��
 * - 1byte ��� ��Ʈ��
 * - Node ��Ʈ�� => Ű����� ��� �����ϴ� ��Ʈ��
 * - �ֿ� �޼ҵ�:
 * 	 public int read() : ����Ʈ �Է��� �����ϰ� �Է��� ����(ctrl+c >>> ������, ctrl+d >>> ������)
 * 						 -1�� ��ȯ�Ѵ�.
 */
public class InputStreamTest {

	public static void main(String[] args) throws IOException { // IO�۾��� �� �׻� �ͼ����� ���Ƿ� ����ó�� �ؾ���
		
		int input = 0;
		int count = 0;
		while(true) {
			input = System.in.read();
			System.out.println("input: "+((char)input));
			count++;
			if(input == 'x') break;
		}// while-----
		System.out.println(count+"bytes �Է¹���");
		System.in.close();
		System.out.close();
	}

}
