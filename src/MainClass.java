
public class MainClass {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
	Standard sd=new Standard();
	sd.class_no=1;
	sd.class_no=2;
	Student st=new Student();
	sd.st[0]=new Student();
	sd.st[0].stud_id=101;
	sd.st[0].stud_name="aa";
	sd.st[0].age=10;
	sd.st[0].marks=70;
	School_Business_Logic sb=new School_Business_Logic();
	sb.add_Class_no(sd);
	sb.total_students(0);
	sb.marks(0, 0);
	}

}
