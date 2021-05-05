package com.tistory.hihighlinux.Prac;
import java.util.HashMap;
import java.util.Map.Entry;



public class ProgrammersAlgorithm {
    public static String solution(String[] participant, String[] completion) {
    	/*
    	 * ������ ������ ������ participant �� �Է°���, ������ ������� completion�� �Է°����� �ȴ�.
    	 * ���� ���� ���� ������ �����ϼ��� *�� �Ѹ��� ������ �����ϰ� ��缱���� �����Ͽ���
    	 */
    	String people = "";
    	HashMap<String, Integer> hm = new HashMap<>();
    	for(String ply : participant) {
    		hm.put(ply, hm.getOrDefault(ply, 0) + 1);
    		System.out.println(hm);
    	}
    	// ������ ������ �־��ش�. �����ڰ� �ߺ��� �� �� ����.
    	
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
