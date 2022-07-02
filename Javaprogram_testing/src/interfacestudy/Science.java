package interfacestudy;

public interface Science
{
    int s2 =3;
	void physics();
	void chemistry();
	void biology();
	default void questionPaper()
	{
		System.out.println("set of question paper in science's book");
	}
}
