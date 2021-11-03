package day11;
import java.io.*;
/* DataOutputStream/DataInputStream
 * - 1byte기반 스트림
 * - 필터 스트림
 * - 기능: 자바의 다양한 자료형들을 바이트 단위로
 *         분해하여 쓰고, 이를 다시 자료형별로
 *         복원하여 읽는 기능을 수행함
 * - 주의: DataInputStream과 DataOutputStream
 * 			은 짝을 이뤄 사용해야 함
 * [실습] data.txt파일에 자바의 다양한 자료형 데이터를
 *        써보자.
 *        - 데이터 목적지: 파일(data.txt)
 *            =>FileOutputStream==>DataOutputStream
 */

public class DataOutTest {

	public static void main(String[] args) 
	throws IOException
	{
		//노드 스트림 생성(파일에 직접 연결)
		FileOutputStream fos = new FileOutputStream("data.txt");
		
		//필터 스트림
		DataOutputStream dos = new DataOutputStream(fos);
		
		//자바의 다양한 자료형의 데이터를 써보자.
		byte b = 127; // 1 
		byte[] ba = {65, 66, 67}; // 4
		short s = 3000; // 6
		char ch = '가'; //8
		boolean bool = true; //9
		String str = "홍길동"; // 15
		
		dos.writeByte(b);
		dos.write(ba);
		dos.writeShort(s);
		dos.writeChar(ch);
		dos.writeBoolean(bool);
		//dos.writeChars(str);
		//문자열을 쓸 때는 writeUTF() 메소드를 사용
		dos.writeUTF(str); 
		/*유니코드 utf-8 형식으로 문자열을 출력한다.
		 * utf-8형식은 각 문자의 표현을 위해 한 바이트
		 * 사용했는지, 두 바이트 또는 세바이트 차지하는지
		 * 알아내어, 아스키 문자는 1바이트로,
		 * 그리스어, 히브리어, 아랍어 등의 문자는 2바이트로,
		 * 그 외 문자는 3바이트로 표현함
		 * ex) "홍길동" >>> 3 * 3 + 2 ==> 11바이트(api 확인)
		 */
		
		System.out.println("총 "+dos.size()+"바이트 씀");
		dos.flush();
		dos.close();
	}

}
