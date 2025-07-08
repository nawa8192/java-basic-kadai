package kadai_028;

public class JyankenExec_Chapter28 {

	public static void main(String[] args) {
		Jyanken_Chapter28 jyanken = new Jyanken_Chapter28();
		
		String choice = jyanken.getMtChoice();
		
		String random = jyanken.getRandom();
		
		jyanken.playGame(choice,random);
     }
}
	
