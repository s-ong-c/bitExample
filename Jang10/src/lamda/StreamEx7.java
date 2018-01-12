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
//			return String.format("[%s,%s,%d�г� %d��,%3d��]",name,isMale ? "��":"��",hak,ban,score);
//		}
//		
//		enum Level{HIGH,MID,LOW}
//		
//	}
//	public class StreamEx7 {
//		public static void main(String[] args) {
//			Sto[ ] stuArr = {
//					new Sto("���ڹ�",true,1,1, 300),
//					new Sto("���ڹ�",false,1,1, 250),
//					new Sto("���ڹ�",true,1,1, 200),
//					new Sto("���ڹ�",false,1,2, 150),
//					new Sto("���ڹ�",true,1,2, 100),
//					new Sto("���ڹ�",false,1,2, 50),
//					new Sto("ȭ�ڹ�",false,1,3, 100),
//					new Sto("���ڹ�",false,1,3, 150),
//					new Sto("���ڹ�",true,1,3, 200),
//					
//					new Sto("���ڹ�",true,1,1, 300),
//					new Sto("���ڹ�",false,1,1, 250),
//					new Sto("���ڹ�",true,1,1, 200),
//					new Sto("���ڹ�",false,1,2, 150),
//					new Sto("���ڹ�",true,1,2, 100),
//					new Sto("���ڹ�",false,1,2, 50),
//					new Sto("ȭ�ڹ�",false,1,3, 100),
//					new Sto("���ڹ�",false,1,3, 150),
//					new Sto("���ڹ�",true,1,3, 200)
//			};
//			
//			System.out.printf("1. �ܼ�����(������ ����)%n");
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
//			System.out.printf("%n2. �ܼ����� + ���(���� �л���)%n");
//			Map<Boolean, Long> stuNumBySex = Stream.of(stuArr)
//								.collect(partitioningBy(Sto::isMale,counting()));
//			
//			System.out.println("���л��� ="+stuNumBySex.get(true));
//			System.out.println("���л��� ="+stuNumBySex.get(false));
//			
//			
//			System.out.printf("%n3. �ܼ����� +���(���� 1��)%n");
//			Map<Boolean, Optional<Sto>> topScoreBySex = Stream.of(stuArr)
//										.collect(partitioningBy(Sto::isMale,maxBy(comparingInt(Sto::getScore))));
//			
//			System.out.println("���л� 1��"+topScoreBySex.get(true));
//			System.out.println("���л� 1��"+topScoreBySex.get(false));
//			
//			Map<Boolean, Sto> topScoreBySex2 = Stream.of(stuArr)
//							.collect(partitioningBy(Sto::isMale,collectingAndThen(maxBy(comparing(Sto::getScore)),Optional::get)
//					
//					));
//			
//			System.out.println("���л� 1��"+topScoreBySex2.get(true));
//			System.out.println("���л� 1��"+topScoreBySex2.get(false));
//			
//			
//			System.out.printf("%n4. ���ߺ���(���� ���հ���, 100������");
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
