package day11;
import java.io.*;

public class DataInTest {

	public static void main(String[] args)
	throws IOException
	{
		// src/day11/data.txt�� �о �ڷ����� ���缭 ������Ų �� �ֿܼ� ���
		FileInputStream fis = new FileInputStream("src/day11/data.txt");
		DataInputStream dis = new DataInputStream(fis);

		// ����: ���� �� �� ������� �ڷ����� ���缭 �о�� ��
		System.out.println(dis.available()+"bytes ���� �� ����");
		
		byte a = dis.readByte();
		System.out.println(a);
		
		byte[] data = new byte[3];
		int n = dis.read(data);
		
		for(byte b:data)
			System.out.println(b);
		
		short c = dis.readShort();
		System.out.println(c);
		
		char d = dis.readChar();
		System.out.println(d);
		
		boolean e = dis.readBoolean();
		System.out.println(e);
		
		String str = dis.readUTF();
		System.out.println(str);
		
		dis.close();
		fis.close();
	}

}
