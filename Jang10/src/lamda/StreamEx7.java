//package lamda;
//
//import java.util.List;
//import java.util.Map;
//import java.util.Optional;
//
//import static java.util.stream.Collectors.*;
//import java.util.stream.*;
//import java.util.Comparator.*;
//import  static java.util.Comparator.*;
//
//class Sto{
//		String name;
//		boolean isMale;
//		int hak;
//		int ban;
//		int score;
//		Sto(String name, boolean isMale, int hak, int ban, int score) {
//			this.name = name;
//			this.isMale = isMale;
//			this.hak = hak;
//			this.ban = ban;
//			this.score = score;
//		}
//		public String getName() {return name;}
//		public boolean isMale() {return isMale;}
//		public int getHak() {return hak;}
//		public int getBan() {return ban;}
//		public int getScore() {return score;}
//		
//		@Override
//		public String toString() {
//			
//			return String.format("[%s,%s,%d학년 %d반,%3d점]",name,isMale ? "남":"여",hak,ban,score);
//		}
//		
//		enum Level{HIGH,MID,LOW}
//		
//	}
//	public class StreamEx7 {
//		public static void main(String[] args) {
//			Sto[ ] stuArr = {
//					new Sto("나자바",true,1,1, 300),
//					new Sto("김자바",false,1,1, 250),
//					new Sto("김자바",true,1,1, 200),
//					new Sto("이자바",false,1,2, 150),
//					new Sto("남자바",true,1,2, 100),
//					new Sto("안자바",false,1,2, 50),
//					new Sto("화자바",false,1,3, 100),
//					new Sto("강자바",false,1,3, 150),
//					new Sto("이자바",true,1,3, 200),
//					
//					new Sto("나자바",true,1,1, 300),
//					new Sto("김자바",false,1,1, 250),
//					new Sto("김자바",true,1,1, 200),
//					new Sto("이자바",false,1,2, 150),
//					new Sto("남자바",true,1,2, 100),
//					new Sto("안자바",false,1,2, 50),
//					new Sto("화자바",false,1,3, 100),
//					new Sto("강자바",false,1,3, 150),
//					new Sto("이자바",true,1,3, 200)
//			};
//			
//			System.out.printf("1. 단순분할(성별로 분할)%n");
//			Map<Boolean, List<Sto>>stuBySex = Stream.of(stuArr)
//							.collect(partitioningBy(Sto::isMale));
//			
//			List<Sto> maleStudent = stuBySex.get(true);
//			List<Sto> femaleStudent = stuBySex.get(false);
//
//			for(Sto s: maleStudent)System.out.println(s);
//			for(Sto s: femaleStudent)System.out.println(s);
//			
//			
//			System.out.printf("%n2. 단순분할 + 통계(성별 학생수)%n");
//			Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
//								.collect(partitioningBy(Sto::isMale,counting()));
//			
//			System.out.println("남학생수 ="+stuNumBySex.get(true));
//			System.out.println("여학생수 ="+stuNumBySex.get(false));
//			
//			
//			System.out.printf("%n3. 단순분할 +통계(성별 1등)%n");
//			Map<Boolean, Optional<Sto>> topScoreBySex = Stream.of(stuArr)
//										.collect(partitioningBy(Sto::isMale,maxBy(comparingInt(Sto::getScore))));
//			
//			System.out.println("남학생 1등"+topScoreBySex.get(true));
//			System.out.println("여학생 1등"+topScoreBySex.get(false));
//			
//			Map<Boolean, Sto> topScoreBySex2 = Stream.of(stuArr)
//							.collect(partitioningBy(Sto::isMale,collectingAndThen(maxBy(comparing(Sto::getScore)),Optional::get)
//					
//					));
//			
//			System.out.println("남학생 1등"+topScoreBySex2.get(true));
//			System.out.println("여학생 1등"+topScoreBySex2.get(false));
//			
//			
//			System.out.printf("%n4. 다중분할(성별 불합격자, 100점이하");
//			
//			Map<Boolean,Map<Boolean,List<Sto>>> failedStuBySex =
//							Stream.of(stuArr).collect(partitioningBy(Sto::isMale,partitioningBy(s->s.getScore()<=100)));
//			List<Sto> failedMaleStu = failedStuBySex.get(true).get(true);
//			List<Sto> failedFemaleStu = failedStuBySex.get(false).get(true);
//			
//			for(Sto s: failedMaleStu)System.out.println(s);
//			for(Sto s: failedFemaleStu)System.out.println(s);
//			
//			
//
//		}
//		
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	}
