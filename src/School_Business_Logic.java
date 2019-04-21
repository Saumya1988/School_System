
public class School_Business_Logic implements ISchool_Business
{
School sc=new School();
	

	@Override
	public void marks(int class_no, int student_no)
	{
		// TODO Auto-generated method stub
		System.out.println(sc.arr[class_no].st[0].marks);
	}

	@Override
	public void add_Class_no(Standard class1)
	{
		// TODO Auto-generated method stub
		
		sc.arr[0]=class1;
		
		System.out.println(sc.arr[0].class_no);
	}

	@Override
	public void total_students(int class_no) 
	{
		// TODO Auto-generated method stub
		System.out.println(sc.arr[class_no].st.length);
	}

}
