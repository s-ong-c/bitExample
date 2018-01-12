package lamda;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
	public static void main(String[] args) {
		Stream<Student> studentStream = Stream.of(
				new Student("���ڹ�",3,300),
				new Student("���ڹ�",1,200),
				new Student("���ڹ�",2,100),
				new Student("���ڹ�",2,150),
				new Student("���ڹ�",1,200),
				new Student("���ڹ�",3,290),
				new Student("���ڹ�",3,180)
				
		);
		studentStream.sorted(Comparator.comparing(Student::getBan)
				.thenComparing(Comparator.naturalOrder())).forEach(System.out::println);
		
	}
}

class Student implements Comparable<Student>{
	String name;
	int ban;
	int totalScore;
	public Student(String name, int ban, int totalScore) {
		this.name = name;
		this.ban = ban;
		this.totalScore = totalScore;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", ban=" + ban + ", totalScore=" + totalScore + "]";
	}
	public String getName() {
		return name;
	}
	public int getBan() {
		return ban;
	}
	public int getTotalScore() {
		return totalScore;
	}
	@Override
	public int compareTo(Student s) {
		return s.totalScore-this.totalScore;
	}
	
	
	
}