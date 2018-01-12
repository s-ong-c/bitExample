package instanceex;

class Exercise6_4 {

		public static void main(String args[]) { 
			Student s = new Student();
			
			s.name = "홍길동 ";
			s.ban = 1; 
			s.no = 1;
			s.kor = 100; s.eng = 60; 
			s.math = 76;
		
			System.out.println("이름 :"+s.name); 
			System.out.println("총점 :"+s.getTotal()); 
			System.out.println("평균 :"+s.getAverage());
		
			}
		
		}
class Student { /* 알맞은 코드를 넣어 완성하시오 (1) . */
			String name;
			int ban;
			int no;
			int kor;
			int eng;
			int math;
			
			
			int getTotal(){
				return kor+eng+math; } 
			float getAverage(){ 
				return(int)((getTotal()/3f)*10+0.5)/10f; 
				}
			public String toString(){ 
				return name +","+ban +","+no +","+kor +","+eng +","+math +","+getTotal() 
									+","+getAverage() ; }
				
			
				
		


	}


