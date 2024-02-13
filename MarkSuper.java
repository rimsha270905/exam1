class Hod 
{	 
	int totalmark=100;
}

class Teacher extends Hod
{ 	int totalmark=50;
 	void displayMark()
	{
		System.out.println(Mark is +totalmark);
		System.out.println(Mark from Super Class +super.totalmark);
	}
}
class MarkSuper
{
     public static void main(String args[])
     {
           Teacher t1 = new Teacher();  Create a Teacher object
    	   t1.displayMark();
     }
}