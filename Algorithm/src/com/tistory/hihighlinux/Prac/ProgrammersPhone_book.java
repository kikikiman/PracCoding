package com.tistory.hihighlinux.Prac;

import java.util.HashMap;

public class ProgrammersPhone_book {
	public static void main(String[] args) {
//		String[] phone_book = {"119", "97674223", "1195524421"};
		String[] phone_book = {"123","1234","789" };
		 boolean d =solution(phone_book);
		System.out.println(d);
	}
	
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
       HashMap<String, String> hm = new HashMap<>();

        // 중복을 제거해서 해시 맵에 모두 저장
        for( String input : phone_book ) {
            hm.put(input, input);
        }

        // 다른 관점이다. : input 데이터를 분해해서 input의 prefix를 다른 string에서 찾는 것이다.
        for ( String target : phone_book) {
            // target을 분해하며 다른 곳에서 prefix 있는지 찾기 
            for( int i=0; i< target.length(); i++) {
                // 이거랑
            	// target.length()로 포함됐는지 확인! substring메소드로 긴문자열에서 짧은문자열을 하나씩 확인해서 키값이 있나 없나 비교확인
            	System.out.println(">>>" + target.substring(0, i));
                if( hm.containsKey(target.substring(0,i)) ) {
                	
                    return false;
                }
                // 이거랑 같은 말이야.
				else if ( hm.get(target.substring(0,i)) != null) {
					return false;
				}
            }

        }
        return answer;
    }
}
