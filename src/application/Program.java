package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new  Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		
			
		System.out.print("How many Students for course A? ");
		int students = sc.nextInt();
		for(int i = 0 ; i<students; i++) {
			int id = sc.nextInt();
			a.add(id);
		}
		
		System.out.print("How many Students for course B? ");
		students = sc.nextInt();
		for(int i = 0; i<students; i++) {
			int	id = sc.nextInt();
			b.add(id);
		}
		
		System.out.print("How many Students for course C? ");
		students = sc.nextInt();
		for (int i = 0; i<students; i++) {
			int id = sc.nextInt();
			c.add(id);
		}
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total Students: " + total.size());
		
		
			}
		
	}


