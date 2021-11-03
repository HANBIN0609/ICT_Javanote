package day11;
import java.io.*;
import java.util.*;
import javax.swing.*;
/*ObjectInTestŬ���� ����

1. obj.txt������ �о ��ü�� �����غ���

2. readUTF()/readObject(), readObject()
ȣ���ؼ�
�ֿܼ� ���
JFrame�� setSize(), setVisible(true)
 */
public class ObjectInTest {

	public static void main(String[] args)
	throws IOException, ClassNotFoundException
	{
		// src/day11/obj.txt�� �о �ڷ��� ���缭 ������Ų �� �ֿܼ� ���
		FileInputStream fis = new FileInputStream("src/day11/obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// ����: ���� �� �� ������� �ڷ����� ���缭 �о�� ��
		String str = ois.readUTF();
		Object obj = ois.readObject();
		Date date = (Date)obj;
		JFrame jf = (JFrame)ois.readObject();
				
		System.out.println(str);
		System.out.println(date);
		System.out.println(jf);
		
		jf.setSize(500,500);
		jf.setVisible(true);
		
		// e1, e2, e3�� �о print() ȣ���ϱ�
		EmpVO e1 = (EmpVO)ois.readObject();
		e1.print();
		EmpVO e2 = (EmpVO)ois.readObject();
		e2.print();
		EmpVO e3 = (EmpVO)ois.readObject();
		e3.print();
		
		ois.close();
		fis.close();
		
	}

}
