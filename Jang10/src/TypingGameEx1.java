import java.util.*; 

class TypingGameEx1 { 
      Vector words = new Vector(); 
      String[] data = {"�¿�","����","����","ȿ��","����","����","Ƽ�Ĵ�","���","����ī"};             
      int interval = 2 * 1000; // 2�� 

      
      WordGenerator wg = new WordGenerator(); 

      public static void main(String args[]) { 
            TypingGameEx1 game = new TypingGameEx1(); 

            game.wg.start(); 

            Vector words = game.words; 
            
            while(true) { 
                  System.out.println(words); 

                  String prompt = ">>"; 
                  System.out.print(prompt); 

                  // ȭ�����κ��� ���δ����� �Է¹޴´�. 
                  Scanner s = new Scanner(System.in); 
                  String input = s.nextLine().trim(); 

                  /*

                     ������ �ڵ带 �ϼ��ϼ���.

 

                    1. ����ڰ� �Է��� ���� words���� ã�� �����Ѵ�.

                 */

            } 
      } // main 

      public void delay(int millis) { 
            try { 
                  Thread.sleep(millis); 
            } catch(Exception e) {} 
      } 

      class WordGenerator extends Thread { 
            public void run() {

                  /*

                        WordGenerator�� �����ð�(interval) �������� data�迭�� �� ��Ҹ� ���

                        words(Vector�ν��Ͻ�)�� �����ϴ� ���� �����Ѵ�.

 

                       ������ �ڵ带 �ϼ��ϼ���.

                       1. ���ڿ� �迭 data�� ������ ��Ҹ� ��� words(Vector�ν��Ͻ�)�� �����Ѵ�.

                       2. �ν��Ͻ� ���� interval�� ����ŭ �ð������� �д�.

                       3. �ݺ����� �̿��ؼ� 1,2�� �۾��� �ݺ������� �̷������ �Ѵ�.

                  */
            } // end of run() 
      } // class WordGenerator 
} // TypingGameEx1 

