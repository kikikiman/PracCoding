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

        // �ߺ��� �����ؼ� �ؽ� �ʿ� ��� ����
        for( String input : phone_book ) {
            hm.put(input, input);
        }

        // �ٸ� �����̴�. : input �����͸� �����ؼ� input�� prefix�� �ٸ� string���� ã�� ���̴�.
        for ( String target : phone_book) {
            // target�� �����ϸ� �ٸ� ������ prefix �ִ��� ã�� 
            for( int i=0; i< target.length(); i++) {
                // �̰Ŷ�
            	// target.length()�� ���Եƴ��� Ȯ��! substring�޼ҵ�� �乮�ڿ����� ª�����ڿ��� �ϳ��� Ȯ���ؼ� Ű���� �ֳ� ���� ��Ȯ��
            	System.out.println(">>>" + target.substring(0, i));
                if( hm.containsKey(target.substring(0,i)) ) {
                	
                    return false;
                }
                // �̰Ŷ� ���� ���̾�.
				else if ( hm.get(target.substring(0,i)) != null) {
					return false;
				}
            }

        }
        return answer;
    }
}
