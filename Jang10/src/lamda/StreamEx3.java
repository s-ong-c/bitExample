	package lamda;
	
	import java.util.stream.IntStream;
import java.util.stream.Stream;
	import java.util.*;
	public class StreamEx3 {
		public static void main(String[] args) {
	
			Student1 [ ] stuArr = {
					new Student1("���ڹ�",3,300),
					new Student1("���ڹ�",1,200),
					new Student1("���ڹ�",2,100),
					new Student1("���ڹ�",2,150),
					new Student1("���ڹ�",1,200),
					new Student1("���ڹ�",3,290),
					new Student1("���ڹ�",3,180)
	
			};
			Stream<Student1> stuStream = Stream.of(stuArr);
	
			stuStream.sorted(Comparator.comparing(Student1::getBan)
					.thenComparing(Comparator.naturalOrder()))
			.forEach(System.out::println);
			
			stuStream = Stream.of(stuArr);
			IntStream stuScoreStream = stuStream.mapToInt(Student1::getTotalScore);
			
			IntSummaryStatistics stat  = stuScoreStream.summaryStatistics();
			System.out.println("count="+stat.getCount());
			System.out.println("sum="+stat.getSum());
			System.out.printf("average=%.2f%n",stat.getAverage());
			System.out.println("min="+stat.getMin());
			System.out.println("max="+stat.getMax());
		}
	}
	
	class Student1 implements Comparable<Student1>{
		String name;
		int ban;
		int totalScore;
		Student1(String name, int ban, int totalScore) {
			this.name = name;
			this.ban = ban;
			this.totalScore = totalScore;
		}
		@Override
		public String toString() {
			return "Student [name=" + name + ", ban=" + ban + ", totalScore=" + totalScore + "]";
		}
		public String getName() {return name;}
		public int getBan() {return ban;}
		public int getTotalScore() {return totalScore;}
	
		@Override
		public int compareTo(Student1 o) {
			// TODO Auto-generated method stub
			return o.totalScore-this.totalScore;
		}
	
	
	
	}