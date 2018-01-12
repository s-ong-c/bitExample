package lamda;

import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.*;
import static java.util.stream.Collectors.*;
import java.util.stream.*;
import java.util.Comparator.*;
import  static java.util.Comparator.*;

class Sto{
	String name;
	boolean isMale;
	int hak;
	int ban;
	int score;
	Sto(String name, boolean isMale, int hak, int ban, int score) {
		this.name = name;
		this.isMale = isMale;
		this.hak = hak;
		this.ban = ban;
		this.score = score;
	}
	 String getName() {return name;}
	 boolean isMale() {return isMale;}
	 int getHak() {return hak;}
	 int getBan() {return ban;}
	 int getScore() {return score;}

	@Override
	public String toString() {

		return String.format("[%s,%s,%d�г� %d��,%3d��]",name,isMale ? "��":"��",hak,ban,score);
	}

	enum Level{HIGH,MID,LOW}

}
public class StreamEx8 {
	public static void main(String[] args) {
		Sto[ ] stuArr = {
				new Sto("���ڹ�",true,1,1, 300),
				new Sto("���ڹ�",false,1,1, 250),
				new Sto("���ڹ�",true,1,1, 200),
				new Sto("���ڹ�",false,1,2, 150),
				new Sto("���ڹ�",true,1,2, 100),
				new Sto("���ڹ�",false,1,2, 50),
				new Sto("ȭ�ڹ�",false,1,3, 100),
				new Sto("���ڹ�",false,1,3, 150),
				new Sto("���ڹ�",true,1,3, 200),

				new Sto("���ڹ�",true,2,1, 300),
				new Sto("���ڹ�",false,2,1, 250),
				new Sto("���ڹ�",true,2,1, 200),
				new Sto("���ڹ�",false,2,2, 150),
				new Sto("���ڹ�",true,2,2, 100),
				new Sto("���ڹ�",false,2,2, 50),
				new Sto("ȭ�ڹ�",false,2,3, 100),
				new Sto("���ڹ�",false,2,3, 150),
				new Sto("���ڹ�",true,2,3, 200)
		};
		System.out.printf("1. �ܼ��׷�ȭ(�ݺ��� �׷�ȭ)%n");
		System.out.println();
		Map<Integer, List<Sto>> stuByBan	= Stream.of(stuArr)
							.collect(groupingBy(Sto::getBan)); 
		
					// �׷�ȭ  getBan���� 
		
		for(List<Sto> ban:stuByBan.values()) {//�ݺ��� 
			for(Sto s:ban) {
				System.out.println(s);
			}
		}
		System.out.printf("2. �ܼ��׷�ȭ(�������� �׷�ȭ)%n");
		Map<Sto.Level, List<Sto>> stuByLevel = Stream.of(stuArr)
									.collect(groupingBy( s->{
										if( s.getScore() >=200) return Sto.Level.HIGH;
									else if( s.getScore() >=100) return Sto.Level.MID;
									else  								return Sto.Level.LOW;
									}));
		TreeSet<Sto.Level> keySet = new TreeSet<>(stuByLevel.keySet());
		
		
		
		for(Sto.Level key: keySet) {
			System.out.println("["+key+"]");
			
			for(Sto s: stuByLevel.get(key)) 
				System.out.println(s);
			
			System.out.println();
		}
		System.out.printf("3. �ܼ��׷�ȭ(�������� �׷�ȭ)%n");
		
		Map<Sto.Level, Long>stuCntByLevel = Stream.of(stuArr)
							.collect(groupingBy(s->{
								if( s.getScore() >=200) return Sto.Level.HIGH;
								else if( s.getScore() >=100) return Sto.Level.MID;
								else  return Sto.Level.LOW;
								},counting()));
						
		
		for(Sto.Level key : stuCntByLevel.keySet())
			System.out.printf("[%s]-%d��",key,stuCntByLevel.get(key));
		
		System.out.println();
		
						
		System.out.printf("%n4. ���߱׷�ȭ (�г⺰, �ݺ�)%n");
		Map<Integer, Map<Integer,List<Sto>>> stuByHakAnd =
				Stream.of(stuArr)
					.collect(groupingBy(Sto::getHak,groupingBy(Sto::getBan)));
		
		for(Map<Integer, List<Sto>>hak: stuByHakAnd.values()) {
			for(List<Sto> ban :hak.values()) {
				System.out.println();
				for(Sto s :ban)
					System.out.println(s);
			}}
		
		System.out.printf("%n5. ���߱׷�ȭ+ ���(�г⺰, �ݺ� 1��)%n");
		Map<Integer, Map<Integer,Sto>> topStuByHakAnd = 
				Stream.of(stuArr)
					.collect(groupingBy(Sto::getHak,groupingBy(Sto::getBan,
									collectingAndThen(maxBy(comparingInt(Sto::getScore))
											,Optional::get)
							)));
		
		for(Map<Integer, Sto> ban:topStuByHakAnd.values())
			for(Sto s: ban.values())
				System.out.println(s);
		
		
		System.out.printf("%n6. ���߱׷�ȭ+ ���(�г⺰, �ݺ� �����׷�)%n");
		
		Map<String, Set<Sto.Level>> stuByScoreGroup = Stream.of(stuArr)
					.collect(groupingBy(s->s.getHak() +"-"+s.getBan(),
						mapping(s->{
							if( s.getScore() >=200)	 return Sto.Level.HIGH;
							else if( s.getScore() >=100) return Sto.Level.MID;
							else  								return Sto.Level.LOW;
							} ,toSet())
							
							));
		Set<String> keySet2 = stuByScoreGroup.keySet();
		
		for(String key: keySet2) {
			System.out.println("["+key+"]"+stuByScoreGroup.get(key));
		}
		
	}
}

		
		
		
		
		
		
		
		
		
		
