import java.util.HashMap;
import java.util.Map.Entry;

import javax.xml.crypto.AlgorithmMethod;

public class ProgrammersAlgorithm {
    public static String solution(String[] participant, String[] completion) {

    	String str  = "";
    	int num = 0;
    	HashMap<String, Integer> hm = new HashMap();
    	for(String player : participant) {
    		hm.put(player, hm.getOrDefault(player, 0) + 1);
    	}
    	
    	for(String player : completion) {
    		hm.put(player, hm.get(player) - 1);
    	}
    	
    	for(String key : hm.keySet()) {
    		if(hm.get(key) != 0) {
    			str = key;
    		}
    	}
    	
    
    	return str;
    }
    
    public static void main(String[] args) {
    	String[] ky = {"leo", "kiki", "eden"};
    	String[] vl = {"eden", "kiki"};
    	
    	solution(ky, vl);
    	
    	
    	
    	
    }
    
}
