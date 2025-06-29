package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	public void referer(String[] word) {
		
		HashMap<String, String> dictionary = new HashMap<>();
		
		dictionary.put("apple","りんご");
		dictionary.put("peach","桃");
		dictionary.put("banana","バナナ");
		dictionary.put("lemon","レモン");
		dictionary.put("pear","梨");
		dictionary.put("kiwi","キウイ");
		dictionary.put("strawberry","いちご");
		dictionary.put("grape","ぶどう");
		dictionary.put("muscat","マスカット");
		dictionary.put("cherry","さくらんぼ");
		
		
		for( int i = 0; i < word.length ; i++ ) {
			String result = dictionary.get(word[i]);
			if (result == null) {
				result = word[i] + "は辞書に存在しません";
			}else {
				result = word[i] + "の意味は" + result;
		    
		}
		
		System.out.println(result);
	  }
	}

}
