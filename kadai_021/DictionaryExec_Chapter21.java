package text.kadai_021;

public class DictionaryExec_Chapter21 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Dictionary_Chapter21 fruit=new Dictionary_Chapter21();
		
		String[] fruits= {"apple","banana","grape","orange"};
		
		for(String word: fruits) {
			System.out.println(fruit.getMeaning(word));
		}
	}

}
