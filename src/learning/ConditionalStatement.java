package learning;

public class ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int score =91;
String grade;
if (score>90) {
	grade ="A";
}
else if (score>80) {
	grade ="B";
}
else if(score>70) {
	grade="C";
}
else if(score>60) {
	grade="D";
}
else {
	grade="E";
}
System.out.println("score is:" +score);
System.out.println("grade is:" +grade);
	}

}
