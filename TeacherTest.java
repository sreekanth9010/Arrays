package arraysAssignments;

public class TeacherTest {

	public static void main(String[] args) {
		// TODO Auto-generated method s
		Teacher []t = new Teacher[4];
		t[0]=new Teacher("alex","java fundamentals",1200l);
		t[1]=new Teacher("john" , "RDBMS",800l);
		t[2]=new Teacher("sam","networking",900l);
		t[3]=new Teacher("maria","python",900l);
		
		for(int i=0;i<4;i++)
		{
			System.out.print("Name:" + t[i].getTeacherName()+",");
			System.out.print("Subjet:" + t[i].getSubject()+",");
			System.out.print("Salary:" + t[i].getSalary()+",");
			System.out.println();
		}
	}

}
