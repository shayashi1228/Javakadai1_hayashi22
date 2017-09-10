import java.util.Scanner;

public class ColLesson01 {
	public static void main(String[] args) {
		// Wordクラスのインスタンス配列
		Word[] words = new Word[10];

		// コマンドラインから入力
		System.out.println("英単語と日本語をスペースで区切って入力して下さい。");
		Scanner sc  = new Scanner(System.in);
		String input = sc.nextLine();

		// ここから記述してください
		int index = 0;
		while (!input.equals("e")){
						String[] tmp = new String[2];
						tmp = input.split(" ");
						Word wd = new Word(tmp[0], tmp[1]);
						words[index] = wd;
						index++;
						System.out.println("次の単語を入力してください。\"e\"で終了します。");
						input = sc.nextLine();
		}
		for(int i = 0; i < index; i++){
			System.out.println("英単語:" + words[i].getEnglish() + " 日本語:" + words[i].getJapanese());
		}
		System.out.println(index + "件、登録しました。");

	}
}