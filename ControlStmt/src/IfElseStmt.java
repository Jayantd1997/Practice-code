
public class IfElseStmt {
	public static void main(String[] args) {
		int marks = 40;

		if (marks++ < 40) {
			System.out.println("You failed! with marks= " + marks);
		} else if (marks-- > 20 | (marks-- < 60 & marks-- > 70)) {
			System.out.println("You are on distinction! with marks= " + marks);
		} else {
			System.out.println("You are merit with marks= " + marks);
		}
	}
}
