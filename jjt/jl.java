import java.util.Scanner;

public class jl {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      TurtleFrame f = new TurtleFrame();
      Turtle m1 = new Turtle();
      f.add(m1);

      System.out.println("�^�[�g���R�}���h����͂��Ă��������i��: �O�� 100�A�E�� 90�j");
      System.out.println("�I������ɂ� '�I��' ����͂��Ă��������B");

      while (true) {
         System.out.print("> ");
         String command = sc.nextLine(); // 1�s���̃R�}���h��ǂݍ���

         if (command.equalsIgnoreCase("�I��")) {
            break;  // ���[�v�I��
         }

         String[] parts = command.split(" ");  // �X�y�[�X�ŕ���
         if (parts.length != 2) {
            System.out.println("�R�}���h�̌`��������������܂���i��: �O�� 100�j");
            continue;
         }

         String action = parts[0];
         int value;

         try {
            value = Integer.parseInt(parts[1]);
         } catch (NumberFormatException e) {
            System.out.println("���l������������܂���B");
            continue;
         }

         // �R�}���h���s
         switch (action.toLowerCase()) {
            case "�O��":
               m1.fd(value);
               break;
            case "����":
               m1.bk(value);
               break;
            case "�E��":
               m1.rt(value);
               break;
            case "����":
               m1.lt(value);
               break;
            default:
               System.out.println("�s���ȃR�}���h�ł��B�g����̂� �O��, ����, �E��, ����");
         }
      }

      sc.close();
      System.out.println("�I�����܂��B");
   }
}
