package casting;

public class NonPrimitive {

	public static void main(String[] args) {
		//up-casting

		University u = new University();
		u.syllabus();
		u.paperset();
		
		
		College c = new College();
		c.syllabus();
		c.paperset();
		c.examfees();
	
		
		University v = new College();
		v.paperset();
		v.syllabus();
		
		
	}

}
