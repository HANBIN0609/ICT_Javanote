package day11;
// VO => Value Object => domain ��ü, ���� ��Ƶδ� ��ü
/*��ü�� �����̳� ��Ʈ��ũ�� �����Ϸ���
 * �ݵ�� java.io.Serializable �������̽���
 * ��ӹ޾� �����ؾ� �Ѵ�.
 * #����ȭ(Serializable)��?
 * - �����͸� �� �ٷ� ������ �� �ִٰ� ǥ���ϴ� ���� �ǹ�
 *   �̴� ��Ʈ���� ���� �����͸� ������ �� �ִٴ� �ǹ̴�.
 * - �ܼ��� Serializable�������̽��� ��ӹ�����
 *   ����ȭ�� �Ǵµ�, �� �������̽����� �߻�޼ҵ尡 ����
 *   ���� ������, �ܼ��� ����ȭ�� ��ü�� ��ŷ(marking)
 *   �ϴ� ��ɸ� �Ѵ�.
 *   <cf> ����ȭ�� ��ü�� �����ϴ� ����
 *        ������ȭ��� �Ѵ�. 
 */
public class EmpVO implements java.io.Serializable{
	

	private String ename;
	private int empno;
	private transient int salary;
	//transient�� ���̸� ����ȭ ��󿡼� ���ܵȴ�.
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
