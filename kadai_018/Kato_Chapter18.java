package text.kadai_018;

abstract public class Kato_Chapter18 {
	public String familyName="加藤";
//	姓を表す
	public String givenName;
//	名を表す
	public String address;
//	住所を表す
	
	public void commonIntroduce() {
		System.out.println("名前は"+this.familyName+this.givenName+"です");
		System.out.println("住所は東京都中野区◯×です");
	}
	abstract public void eachIntroduce();
	
	public void execIntroduce() {
		commonIntroduce();
		eachIntroduce();
		System.out.println("");
	}
}
