
public class Student {
	String studentName;
	int rollNo;
	int marks;
	Branch branchName;

	Student(String studentName, int rollNo, int marks, Branch branchName) {
		this.studentName = studentName;
		this.rollNo = rollNo;
		this.marks = marks;
		this.branchName = branchName;
	}

	double generate_marksheet(int marks) {
		double percentage = (marks / 700.0) * 100;
		return percentage;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("vikas", 1, 700, Branch.COMPUTER);
		Student s2 = new Student("punam", 2, 400, Branch.ELECTRICAL);
		Student s3 = new Student("jayant", 3, 250, Branch.MECHANICAL);

		Student students[] = { s1, s2, s3 };

		for (int i = 0; i < students.length; i++) {
			double percent = students[i].generate_marksheet(students[i].marks);
			if (percent > 40.0) {
				System.out.println(students[i].studentName + " is passed of percent=" + percent);
			} else {
				System.out.println(students[i].studentName + " is failed of percent=" + percent);
			}
		}

	}
}
