package interfacestudy;

public interface Math 
{
    int s = 2;// trying to declare variable static and final
	void geometry(); //method are by default public and abstract
	void algebra();
	default void questionPaper()
	{
		System.out.println("set of question paper in mathematics book");
	}
}

