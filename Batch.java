package Inheritance;

public class Batch {
	private String year;
	private String deptName;
	private String stdName;
	
	public Batch() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batch(String year, String deptName, String stdName) {
		super();
		this.year = year;
		this.deptName = deptName;
		this.stdName = stdName;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getStdName() {
		return stdName;
	}

	public void setStdName(String stdName) {
		this.stdName = stdName;
	}

	@Override
	public String toString() {
		return "Batch [year=" + year + ", deptName=" + deptName + ", stdName=" + stdName + "]";
	}
	
	
}
