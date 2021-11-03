package day11;
import java.io.*;
import java.util.*;
import javax.swing.*;
/*ObjectOutputStream/ObjectInputStream
 * - 1byte기반 스트림
 * - 필터 스트림
 * - 직렬화가 구현된 객체를 파일로 쓰거나
 *   네트워크로 전송할 수 있다.
 * - DataOutput/DataInput인터페이스를 구현하고 있음  
 */
public class ObjectOutTest {

	public static void main(String[] args)
	throws IOException
	{
		// 객체를 파일에 써보자
		Date today = new Date();
		
		JFrame f = new JFrame("::오브젝트 스트림::");
		f.getContentPane().add(new JButton("Hello"));
		
		EmpVO e1 = new EmpVO("SCOTT", 7788, 3000);
		EmpVO e2 = new EmpVO("ADAMS", 7799, 4000);
		EmpVO e3 = new EmpVO("KING", 7777, 5000);
		
		// src/day11/obj.txt 파일에 객체를 써보자
		// 1. 노드 스트림
		FileOutputStream fos = new FileOutputStream("src/day11/obj.txt");
		
		// 2. 필터 스트림
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeUTF("객체를 파일에 씁니다");
		oos.writeObject(today);
		oos.writeObject(f);
		
		oos.writeObject(e1);
		oos.writeObject(e2);
		oos.writeObject(e3);
		
		oos.flush();
		oos.close();
		fos.close();
		
		System.out.println("src/day11/obj.txt에 쓰기 완료");
		System.out.close();
	}

}
