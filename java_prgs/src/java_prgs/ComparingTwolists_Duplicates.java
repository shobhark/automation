package java_prgs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;

public class ComparingTwolists_Duplicates {

	public static void main(String[] args) {
//comparing two arrays and finding duplicates		
		
//		int[] arr1 = {5,8,6,13,56,98};
//		int[] arr2 = {34,12,13,6,5,67,89};
//		
//		
//		HashSet<Integer> hs = new HashSet<Integer>();
//		for(int val : arr1)
//		{
//			hs.add(val);
//		}
//		for(int val : arr2)
//		{
//			if(hs.contains(val))
//			{
//				System.out.println(val);
//			}
//		}
//	=====================================================================
		
		
//comparing two arrays and finding duplicates using Arraylists
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		ArrayList<Integer> all = new ArrayList<Integer>();
	
		al.add(38);
		al.add(10);
		al.add(13);
		al.add(54);
		al.add(67);
		
		all.add(15);
		all.add(398);
		all.add(40);
		all.add(63);
		all.add(54);
		all.add(67);
		System.out.println("1st list :"+al);
		System.out.println("2nd list :"+all);
	
		HashSet<Integer> hs = new HashSet<Integer>();
		for(int val : al)
		{
			hs.add(val);
		}
		
		for(int val : all)
		{
			if(hs.contains(val))
			{
				System.out.print(" "+val);
			}
		}
		System.out.println();
//==================================================================		
//comparing two arrays and finding duplicates using Linkedlists	
		
		LinkedList<Integer> ll = new LinkedList<Integer>();
 		
		LinkedList<Integer> ll1 = new LinkedList<Integer>();
		
		ll.add(23);
		ll.add(46);
		ll.add(67);
		ll.add(678);
		ll.add(3);
		ll.add(9);
		ll.add(78);
		ll.add(99);
		ll.add(40);
		ll.add(12);
		
		System.out.println(ll);
		
		ll1.add(23);
		ll1.add(46);
		ll1.add(67);
		ll1.add(678);
		ll1.add(13);
		ll1.add(9);
		ll1.add(43);
		ll1.add(40);
		ll1.add(121);
		ll1.add(403);
		ll1.add(673);
		
		System.out.println(ll1);
		
		
		for(int val:ll)
		{
			hs.add(val);
		}
		
		for(int val:ll1)
		{
			if(hs.contains(val))
				System.out.print(" "+val);
		}
		
	}

	
}
