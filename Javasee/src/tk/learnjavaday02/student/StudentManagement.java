package tk.learnjavaday02.student;

import java.util.Scanner;

public class StudentManagement {
	public static void main(String[] args) {
		StudentInfo[] studentInfo = new StudentInfo[3];
		Scanner scanner = new Scanner(System.in);
		StudentInfo stu1 = new StudentInfo();
		stu1.name = scanner.nextLine();
		stu1.age = Integer.parseInt(scanner.nextLine());
		stu1.stuNo = scanner.nextLine();
		stu1.score = Float.parseFloat(scanner.nextLine());
		

		StudentInfo stu2 = new StudentInfo();
		stu2.name = scanner.nextLine();
		stu2.age = Integer.parseInt(scanner.nextLine());
		stu2.stuNo = scanner.nextLine();
		stu2.score = Float.parseFloat(scanner.nextLine());
		
		StudentInfo stu3 = new StudentInfo();
		stu3.name = scanner.nextLine();
		stu3.age = Integer.parseInt(scanner.nextLine());
		stu3.stuNo = scanner.nextLine();
		stu3.score = Float.parseFloat(scanner.nextLine());
		
		studentInfo[0] = stu1;
		studentInfo[1] = stu2;
		studentInfo[2] = stu3;
		for (int i = 0; i < studentInfo.length - 1; i++) {
			for (int j = 0; j < studentInfo.length-1-i; j++) {
				if (studentInfo[j].score < studentInfo[j+1].score) {
					 StudentInfo temp = new StudentInfo();
					 temp = studentInfo[j];
					 studentInfo[j] = studentInfo[j+1];
					 studentInfo [j+1] = temp;
				}
			}
		}
		for (int i = 0; i < studentInfo.length; i++) {
			System.out.println("姓名："+ studentInfo[i].name + "分数：" + studentInfo[i].score);
		}
	}
}
