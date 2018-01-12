package lamda;

public class Zari {
	public static void main(String[] args) {
		String[] names1 = Random.shuffle(Array.names1);
		String[] names2 = Random.shuffle(Array.names2);

		System.out.println("[                     ȭ �� Ʈ �� ��                      ]");
		System.out.println("�����ü� �����Ԣ�"); // �� <- �ٽɷ�������.
		Roding.roding(); // �ε����? ����.
		Print.print(names1, names2);
	}
}

class Roding {
	static void roding() {
		String str = "?";
		for (int i = 0; i < 56000; i++) {
			str = str + i; // 56��
			if (i % 1000 == 0)
				System.out.print("=");
		}
	}
}

class Array {
	// 2�� �׷����� �����Ѵ�. name1, name2 �迭�� �� �׷��� ��´�.
	static String[] names1 = { "���Ѽ�", "������", "�ݼ���", "�ݼҿ�", "�ݹμ�", "�ݸ�ȣ", "�ݻ��", "�����" };
	static String[] names2 = { "�ڹο�", "��ҿ�", "��뿵", "�ּ���", "���ϸ�", "���ΰ�", "�踶��", "������", "������", "õ����", "�����", "��ݹ�",
			"�ۼ���", "�ȼ���", "������", "�ڿ���", "���ѱ�", "������", "������", "������" };
}

// �׷��� �����޼ҵ带 �̿��Ͽ� ���´�.
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

// �� ���ǿ� ���缭 ����Ѵ�.
class Print {

	static void print(String[] names1, String[] names2) {

		int count = 0; // ����Ҷ� ī���͸� �ø���.
		int i = 0; // names2�� ����ϴ� ����
		int j = 0; // names1�� ����ϴ� ����

		while (true) {

			// 8�� ������� enter�� ����Ѵ�.
			if (count <= 16)
				if (count % 8 == 0)
					System.out.println();
			if (count == 16 || count == 28)
				System.out.printf("[%3s]", "�ݡݡ�");

			// 4�� ����̳�, 8�� ����� �ƴѰͿ� ���ؼ��� ������ ����Ѵ�.
			if (count <= 16)
				if (count % 4 == 0 && count % 8 != 0)
					System.out.print("     ");
			
			if (count > 16)
				if (count % 19 == 0 || count % 25 == 0)
					System.out.print("     ");

			// ��ȿ�� �˻�.
			// �׷�2�� ����Ѵ�. ����Ѵٸ� i�� ��, count�� �� ������Ų��.
			if (i <= names2.length - 1) {
				System.out.printf("[%3s]", names2[i]);
				i++;
				count++;
			}

			if (count == 23) {
				System.out.println();
				System.out.printf("[%3s][%3s]", "�ݡݡ�", "�ݡݡ�");
			}
			// ��ȿ�� �˻�!!
			// �׷�1�� ����Ѵ�. ����Ѵٸ� j�� ��, count�� �� ������Ų��.
			// ��Ģ���� ������ ��ã�ڴ�. �����ϰ� ����Ѵ�.
			if (j <= names1.length - 1) {
				if (count == 2 || count == 5 || count == 10 || count == 13 || count == 17 || count == 20 || count == 23
						|| count == 26) {
					System.out.printf("[%3s]", names1[j]);
					j++;
					count++;
				}
			}

			if (count == 28)
				System.out.printf("[%3s]", "�ݡݡ�");

			if (count == names1.length + names2.length)
				break;
		}
	}
}
