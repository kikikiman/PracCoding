package com.tistory.hihighlinux.Prac;
import java.util.HashMap;
import java.util.Map.Entry;



public class ProgrammersAlgorithm {
    public static String solution(String[] participant, String[] completion) {
    	/*
    	 * 마라톤 선수들 참가자 participant 로 입력값과, 완주한 마라토너 completion이 입력값으로 된다.
    	 * 완주 하지 못한 선수를 리턴하세요 *단 한명의 선수만 제외하고 모든선수가 완주하였음
    	 */
    	String people = "";
    	HashMap<String, Integer> hm = new HashMap<>();
    	for(String ply : participant) {
    		hm.put(ply, hm.getOrDefault(ply, 0) + 1);
    		System.out.println(hm);
    	}
    	// 참가자 선수를 넣어준다. 참가자가 중복이 될 수 있음.
    	
    	for(String ply : completion) {
    		hm.put(ply, hm.get(ply) - 1);
    	}
    	
    	for(String str : hm.keySet()) {
    		if(hm.get(str) != 0) {
    			people = str;
    		}
    	}
    	
    	
    	return people;
    }
    
    public static void main(String[] args) {
    	String[] ky = {"leo", "eden", "eden", };
    	String[] vl = {"eden", "leo"};
    	
    	String str = solution(ky, vl);
    	System.out.println(str);
    	
    	
    	
    }
    
}
