import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;


public class Student implements Externalizable{

	private String stuName;
	private int stuAge;
	private String stuReligion;
	
	public Student()
	{
	}
	
	public Student(String stuName, int stuAge, String stuReligion) {
		this.stuName = stuName;
		this.stuAge = stuAge;
		this.stuReligion = stuReligion;
	}

	
	public String getStuName() {
		return stuName;
	}


	public void setStuName(String stuName) {
		this.stuName = stuName;
	}


	public int getStuAge() {
		return stuAge;
	}


	public void setStuAge(int stuAge) {
		this.stuAge = stuAge;
	}


	public String getStuReligion() {
		return stuReligion;
	}


	public void setStuReligion(String stuReligion) {
		this.stuReligion = stuReligion;
	}

	
	@Override
	public String toString() {
		return "Student [stuName=" + stuName + ", stuAge=" + stuAge
				+ ", stuReligion=" + stuReligion + "]";
	}

	@Override
	public void readExternal(ObjectInput arg0) throws IOException,
			ClassNotFoundException {
		stuAge=arg0.readInt();
		stuName=(String)arg0.readObject();
		
	}

	@Override
	public void writeExternal(ObjectOutput arg0) throws IOException {
		arg0.writeInt(stuAge);
		arg0.writeObject(stuName);
		
	}

}
