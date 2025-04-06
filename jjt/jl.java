import java.util.Scanner;

public class jl {
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      TurtleFrame f = new TurtleFrame();
      Turtle m1 = new Turtle();
      f.add(m1);

      System.out.println("タートルコマンドを入力してください（例: 前へ 100、右へ 90）");
      System.out.println("終了するには '終了' を入力してください。");

      while (true) {
         System.out.print("> ");
         String command = sc.nextLine(); // 1行分のコマンドを読み込む

         if (command.equalsIgnoreCase("終了")) {
            break;  // ループ終了
         }

         String[] parts = command.split(" ");  // スペースで分割
         if (parts.length != 2) {
            System.out.println("コマンドの形式が正しくありません（例: 前へ 100）");
            continue;
         }

         String action = parts[0];
         int value;

         try {
            value = Integer.parseInt(parts[1]);
         } catch (NumberFormatException e) {
            System.out.println("数値が正しくありません。");
            continue;
         }

         // コマンド実行
         switch (action.toLowerCase()) {
            case "前へ":
               m1.fd(value);
               break;
            case "後ろへ":
               m1.bk(value);
               break;
            case "右へ":
               m1.rt(value);
               break;
            case "左へ":
               m1.lt(value);
               break;
            default:
               System.out.println("不明なコマンドです。使えるのは 前へ, 後ろへ, 右へ, 左へ");
         }
      }

      sc.close();
      System.out.println("終了します。");
   }
}
