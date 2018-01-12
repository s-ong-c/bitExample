package lamda;

public class Zari {
	public static void main(String[] args) {
		String[] names1 = Random.shuffle(Array.names1);
		String[] names2 = Random.shuffle(Array.names2);

		System.out.println("[                     화 이 트 보 드                      ]");
		System.out.println("♡남궁성 선생님♡"); // ♡ <- 핵심로직구현.
		Roding.roding(); // 로딩기능? 구현.
		Print.print(names1, names2);
	}
}

class Roding {
	static void roding() {
		String str = "?";
		for (int i = 0; i < 56000; i++) {
			str = str + i; // 56개
			if (i % 1000 == 0)
				System.out.print("=");
		}
	}
}

class Array {
	// 2개 그룹으로 생성한다. name1, name2 배열에 각 그룹을 담는다.
	static String[] names1 = { "◎한성", "◎필주", "◎소희", "◎소연", "◎민석", "◎명호", "◎상욱", "◎장우" };
	static String[] names2 = { "박민우", "김소영", "김대영", "최수정", "이하림", "진민경", "김마음", "오지훈", "박형훈", "천문필", "심헌용", "김금미",
			"송성은", "안선영", "양종훈", "박영원", "권한길", "조정인", "오윤주", "정원조" };
}

// 그룹을 랜덤메소드를 이용하여 섞는다.
class Random {
	static String[] shuffle(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int idx = (int) (Math.random() * arr.length);

			String tmp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = tmp;
		}
		return arr;
	}
}

// 각 조건에 맞춰서 출력한다.
class Print {

	static void print(String[] names1, String[] names2) {

		int count = 0; // 출력할때 카운터를 올린다.
		int i = 0; // names2를 출력하는 변수
		int j = 0; // names1를 출력하는 변수

		while (true) {

			// 8의 배수에서 enter를 출력한다.
			if (count <= 16)
				if (count % 8 == 0)
					System.out.println();
			if (count == 16 || count == 28)
				System.out.printf("[%3s]", "◎◎◎");

			// 4의 배수이나, 8의 배수가 아닌것에 대해서는 공백을 출력한다.
			if (count <= 16)
				if (count % 4 == 0 && count % 8 != 0)
					System.out.print("     ");
			
			if (count > 16)
				if (count % 19 == 0 || count % 25 == 0)
					System.out.print("     ");

			// 유효성 검사.
			// 그룹2를 출력한다. 출력한다면 i의 값, count의 값 증가시킨다.
			if (i <= names2.length - 1) {
				System.out.printf("[%3s]", names2[i]);
				i++;
				count++;
			}

			if (count == 23) {
				System.out.println();
				System.out.printf("[%3s][%3s]", "◎◎◎", "◎◎◎");
			}
			// 유효성 검사!!
			// 그룹1를 출력한다. 출력한다면 j의 값, count의 값 증가시킨다.
			// 규칙성을 도저히 못찾겠다. 무식하게 출력한다.
			if (j <= names1.length - 1) {
				if (count == 2 || count == 5 || count == 10 || count == 13 || count == 17 || count == 20 || count == 23
						|| count == 26) {
					System.out.printf("[%3s]", names1[j]);
					j++;
					count++;
				}
			}

			if (count == 28)
				System.out.printf("[%3s]", "◎◎◎");

			if (count == names1.length + names2.length)
				break;
		}
	}
}
