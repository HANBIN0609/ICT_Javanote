package day11;
import java.io.*;
/*FileInputStream
 * - 1byte 기반 스트림
 * - 노드 스트림(파일과 노드 연결함)
 */
public class FileInputStreamTest {

	public static void main(String[] args) 
	throws FileNotFoundException, IOException{
		String file 
		= "C:\\Users\\ict01-15\\eclipse-workspace2\\hbinjava\\src\\day11\\InputStreamTest.java";
		// 데이터소스: 파일 === FileInputStream 
		
		FileInputStream fis = new FileInputStream(file);
		// 파일과 노드 연결
		
		int n = 0, count = 0;
		// 파일의 끝을 만나면 -1을 반환한다.
		while((n=fis.read()) != -1) {
			System.out.write(n);
			count++;
		}//while-----
		System.out.println("총 "+count+"bytes");
		fis.close();
		System.out.close();
	}

}
