package day11;
// VO => Value Object => domain 객체, 값을 담아두는 객체
/*객체를 파일이나 네트워크로 전송하려면
 * 반드시 java.io.Serializable 인터페이스를
 * 상속받아 구현해야 한다.
 * #직렬화(Serializable)란?
 * - 데이터를 한 줄로 나열할 수 있다고 표시하는 것을 의미
 *   이는 스트림을 통해 데이터를 전송할 수 있다는 의미다.
 * - 단순히 Serializable인터페이스를 상속받으면
 *   직렬화가 되는데, 이 인터페이스에는 추상메소드가 존재
 *   하지 않으며, 단순히 직렬화된 객체로 마킹(marking)
 *   하는 기능만 한다.
 *   <cf> 직렬화된 객체를 복원하는 것을
 *        역직렬화라고 한다. 
 */
public class EmpVO implements java.io.Serializable{
	

	private String ename;
	private int empno;
	private transient int salary;
	//transient를 붙이면 직렬화 대상에서 제외된다.
	public EmpVO() {
		
	}
	
	public EmpVO(String ename, int empno, int salary) {
		super();
		this.ename = ename;
		this.empno = empno;
		this.salary = salary;
	}
	
	public void print() {
		System.out.println("---Record for "+ename+"---");
		System.out.println("Name: "+ename);
		System.out.println("Empno: "+empno);
		System.out.println("Salary: "+salary);
	}
}///////////////////////////////////
