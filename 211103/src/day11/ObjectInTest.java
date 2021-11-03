package day11;
import java.io.*;
import java.util.*;
import javax.swing.*;
/*ObjectInTest클래스 만들어서

1. obj.txt파일을 읽어서 객체를 복원해보자

2. readUTF()/readObject(), readObject()
호출해서
콘솔에 출력
JFrame은 setSize(), setVisible(true)
 */
public class ObjectInTest {

	public static void main(String[] args)
	throws IOException, ClassNotFoundException
	{
		// src/day11/obj.txt를 읽어서 자료형 맞춰서 복원시킨 뒤 콘솔에 출력
		FileInputStream fis = new FileInputStream("src/day11/obj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		// 주의: 읽을 때 쓴 순서대로 자료형에 맞춰서 읽어야 함
		String str = ois.readUTF();
		Object obj = ois.readObject();
		Date date = (Date)obj;
		JFrame jf = (JFrame)ois.readObject();
				
		System.out.println(str);
		System.out.println(date);
		System.out.println(jf);
		
		jf.setSize(500,500);
		jf.setVisible(true);
		
		// e1, e2, e3을 읽어서 print() 호출하기
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
