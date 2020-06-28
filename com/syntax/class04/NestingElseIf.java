package com.syntax.class04;

public class NestingElseIf {
			public static void main(String[] args) {
				
				boolean completed = true;
				int score = 82;
				
				if(completed) {
					System.out.println("We will check score");
				
					if(score >90) {
						System.out.println("A, Great job!");
					}
						if(score> 80) {
						System.out.println("B,Well done!");
						}
						if(score > 70)	{
						System.out.println("C, Just passed. ");
						}
						}else {
					System.out.println("F, You Fail!");
					
					}
					}
}
