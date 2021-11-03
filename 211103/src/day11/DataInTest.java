package day11;
import java.io.*;

public class DataInTest {

	public static void main(String[] args)
	throws IOException
	{
		// src/day11/data.txt를 읽어서 자료형을 맞춰서 복원시킨 뒤 콘솔에 출력
		FileInputStream fis = new FileInputStream("src/day11/data.txt");
		DataInputStream dis = new DataInputStream(fis);

		// 주의: 읽을 때 쓴 순서대로 자료형에 맞춰서 읽어야 함
		System.out.println(dis.available()+"bytes 읽을 수 있음");
		
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
