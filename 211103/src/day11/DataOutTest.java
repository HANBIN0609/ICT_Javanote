package day11;
import java.io.*;
/* DataOutputStream/DataInputStream
 * - 1byte��� ��Ʈ��
 * - ���� ��Ʈ��
 * - ���: �ڹ��� �پ��� �ڷ������� ����Ʈ ������
 *         �����Ͽ� ����, �̸� �ٽ� �ڷ�������
 *         �����Ͽ� �д� ����� ������
 * - ����: DataInputStream�� DataOutputStream
 * 			�� ¦�� �̷� ����ؾ� ��
 * [�ǽ�] data.txt���Ͽ� �ڹ��� �پ��� �ڷ��� �����͸�
 *        �Ẹ��.
 *        - ������ ������: ����(data.txt)
 *            =>FileOutputStream==>DataOutputStream
 */

public class DataOutTest {

	public static void main(String[] args) 
	throws IOException
	{
		//��� ��Ʈ�� ����(���Ͽ� ���� ����)
		FileOutputStream fos = new FileOutputStream("data.txt");
		
		//���� ��Ʈ��
		DataOutputStream dos = new DataOutputStream(fos);
		
		//�ڹ��� �پ��� �ڷ����� �����͸� �Ẹ��.
		byte b = 127; // 1 
		byte[] ba = {65, 66, 67}; // 4
		short s = 3000; // 6
		char ch = '��'; //8
		boolean bool = true; //9
		String str = "ȫ�浿"; // 15
		
		dos.writeByte(b);
		dos.write(ba);
		dos.writeShort(s);
		dos.writeChar(ch);
		dos.writeBoolean(bool);
		//dos.writeChars(str);
		//���ڿ��� �� ���� writeUTF() �޼ҵ带 ���
		dos.writeUTF(str); 
		/*�����ڵ� utf-8 �������� ���ڿ��� ����Ѵ�.
		 * utf-8������ �� ������ ǥ���� ���� �� ����Ʈ
		 * ����ߴ���, �� ����Ʈ �Ǵ� ������Ʈ �����ϴ���
		 * �˾Ƴ���, �ƽ�Ű ���ڴ� 1����Ʈ��,
		 * �׸�����, ���긮��, �ƶ��� ���� ���ڴ� 2����Ʈ��,
		 * �� �� ���ڴ� 3����Ʈ�� ǥ����
		 * ex) "ȫ�浿" >>> 3 * 3 + 2 ==> 11����Ʈ(api Ȯ��)
		 */
		
		System.out.println("�� "+dos.size()+"����Ʈ ��");
		dos.flush();
		dos.close();
	}

}
