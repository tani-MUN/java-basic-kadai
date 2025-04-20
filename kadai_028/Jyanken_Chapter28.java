package text.kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	String myChoice;
	String yourChoice;
	
	public String getMyChoice() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		myChoice=scanner.next();
		if(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p")) {
			return myChoice;
		}else {
			return "正しい値を入力してください。";
		}
	}
	
	public String getRandom() {
		String[] rsp= {"r","s","p"};
		int num=(int)Math.floor(Math.random()*3);
		yourChoice=rsp[num];
		return yourChoice;
	}
	
	public void playGame(String myChoice, String yourChoice) {
		HashMap<String,String> list = new HashMap<>();
		list.put("r", "グー");
		list.put("s", "チョキ");
		list.put("p", "パー");
		String me=list.get(myChoice);
		String you=list.get(yourChoice);
		System.out.println("自分の手は"+me+",対戦相手の手は"+you);
		
		if(me.equals(you)) {
			System.out.println("あいこです");
		}else if((me.equals("グー") && you.equals("チョキ")) ||
				(me.equals("チョキ") && you.equals("パー")) ||
				(me.equals("パー") && you.equals("グー"))) {
			System.out.println("自分の勝ちです");
		}else {
			System.out.println("自分の負けです");
		}
	}
}
