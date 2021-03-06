class Student
{
	protected int number;
	protected String name;
	protected String major;
	protected String grade;
	protected int credit;
    
    public Student()
	{
		
    }

	public Student(int number,String name,String major,String grade,int credit)
	{
		this.number=number;
		this.name=name;
		this.major=major;
		this.grade=grade;
		this.credit=credit;
	}

	public void setNumber(int number)
	{
		this.number=number;
	}
	public int getNumber()
	{
		return number;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void setMajor(String major)
	{
		this.major=major;
	}
	public String getMajor()
	{
		return major;
	}
	public void setGrade(String grade)
	{
		this.grade=grade;
	}
	public String getGrade()
	{
		return grade;
	}
	public void setCredit(int credit)
	{
		this.credit=credit;
	}
	public int getCredit()
	{
		return credit;
	}

	public String toString()
	{
		return "학번:"+number+" 이름:"+name+" 소속 학과:"+major+" 학년:"+grade+" 이수 학점:"+credit;
	}
}

class UnderGraduate extends Student
{
	public String club;

	public UnderGraduate()
	{
		
	}
	public UnderGraduate(int number,String name,String major,String grade,int credit,String club)
	{
		super(number,name,major,grade,credit);
		this.club= club;
	}
    public void setClub(String club)
	{
		this.club=club;
	}
	public String getClub()
	{
		return club;
	}
	public String toString()
	{
		return super.toString()+" 소속 동아리:"+club;
	}
}

class GraduateStudent extends Student
{
	public String lab;
	public double scholar;

	public GraduateStudent()
	{
		
	}
	public GraduateStudent(int number,String name,String major,String grade,int credit,String lab,double scholar)
	{
		super(number,name,major,grade,credit);
		this.lab=lab;
		this.scholar=scholar;
	}
	 public void setLab(String lab)
	{
		this.lab=lab;
	}
	public String getLab()
	{
		return lab;
	} 
	public void setScholar(double scholar)
	{
		this.scholar=scholar;
	}
	public double getScholar()
	{
		return scholar;
	}
	public String toString()
	{
		return super.toString()+" 조교 유형:"+lab+" 장학금 비율:"+scholar;
	}
}


class StudentTest02 
{
	public static void main(String[] args) 
	{
		Student st= new Student(140522,"유관순","디자인과","4학년",16);
		UnderGraduate un= new UnderGraduate(160213,"홍길동","철학과","2학년",18,"농구");
        GraduateStudent gr= new GraduateStudent(180113,"김유신","영문학과","3학년",21,"교육 조교",0.3);
		System.out.println(st);
		System.out.println(un);
		System.out.println(gr);

	}
}
