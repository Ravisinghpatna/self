package string_Questions;

public class Print_WhatAreAllTheWordsPresentIn_String {

	public static void main(String[] args) {
		String str = "Hi Good Morning";
		String[] s = str.split(" ");
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
