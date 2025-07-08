package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {

    public String getMtChoice() {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        String choice= scanner.next();
        
        if (!(choice.equals("r") || choice.equals("s") || choice.equals("p"))) {
			System.out.println("グーのr、チョキのs、パーのpのどれかを入力してください");
			continue;
		} else {
			scanner.close();
			return choice;
		}
        
        }
    }

    	public String getRandom() {
    		
    		String[] jyanken = {"r","s","p"};
    		
    		String choice = jyanken [(int) Math.floor(Math.random()*3)];

            return choice;
        }

        public void playGame(String choice, String random) {
        	
        	String result=null;
        	
        	HashMap<String, String> jyanken = new HashMap<>();
    		jyanken.put("r", "グー");
    		jyanken.put("s", "チョキ");
    		jyanken.put("p", "パー");
    		
    		System.out.println("自分の手は" + jyanken.get(choice) + "対戦相手の手は" + jyanken.get(random));
    		
    		if ((choice.equals("r") && random.equals("s")) ||
    		     (choice.equals("s") && random.equals("p"))  ||
    			 (choice.equals("p") && random.equals("r"))){
    				
    			result="自分の勝ちです";
    			
    		}else if ((choice.equals("r") && random.equals("p")) ||
       		           (choice.equals("s") && random.equals("r"))  ||
       			       (choice.equals("p") && random.equals("s"))){
    			
    			result="自分の負けです";
    			
	        }else {
    			
	        	result="あいこです";
    			
    		}
              System.out.println(result);
        }
    }
    