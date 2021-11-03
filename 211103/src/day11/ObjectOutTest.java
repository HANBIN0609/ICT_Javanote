package day11;
import java.io.*;
import java.util.*;
import javax.swing.*;
/*ObjectOutputStream/ObjectInputStream
 * - 1byte��� ��Ʈ��
 * - ���� ��Ʈ��
 * - ����ȭ�� ������ ��ü�� ���Ϸ� ���ų�
 *   ��Ʈ��ũ�� ������ �� �ִ�.
 * - DataOutput/DataInput�������̽��� �����ϰ� ����  
 */
public class ObjectOutTest {

	public static void main(String[] args)
	throws IOException
	{
		// ��ü�� ���Ͽ� �Ẹ��
		Date today = new Date();
		
		JFrame f = new JFrame("::������Ʈ ��Ʈ��::");
		f.getContentPane().add(new JButton("Hello"));
		
		EmpVO e1 = new EmpVO("SCOTT", 7788, 3000);
		EmpVO e2 = new EmpVO("ADAMS", 7799, 4000);
		EmpVO e3 = new EmpVO("KING", 7777, 5000);
		
		// src/day11/obj.txt ���Ͽ� ��ü�� �Ẹ��
		// 1. ��� ��Ʈ��
		FileOutputStream fos = new FileOutputStream("src/day11/obj.txt");
		
		// 2. ���� ��Ʈ��
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeUTF("��ü�� ���Ͽ� ���ϴ�");
		oos.writeObject(today);
		oos.writeObject(f);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println("src/day11/obj.txt�� ���� �Ϸ�");
		System.out.close();
	}

}
