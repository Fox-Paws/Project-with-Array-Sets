package arraysetpackage;

import java.util.Iterator;

public class ArraySetTester {


	public static void main(String[] args) {
		SetADT <String> mySet = new ArraySet<String>();
		SetADT <String> oSet = new ArraySet<String>();
		SetADT <Integer> intSet1 = new ArraySet<Integer>();
		SetADT <Integer> intSet2 = new ArraySet<Integer>();

		for (int i = 0; i < 12; i++)
		{
			mySet.add(new String("apple"+i));
			oSet.add(new String("apple"+i + 1));
			intSet1.add(new Integer(i));
			intSet2.add(new Integer(i));
		}
		
		System.out.println(mySet.equals(oSet));
		System.out.println(intSet1.equals(intSet2));
		System.out.println(mySet.removeRandom());
		System.out.println(mySet.equals(oSet));
		System.out.println(mySet.union(oSet));
		
		
		
		
//	Start of provided code---------------------------------------------
//		System.out.println(mySet);
//		
//		System.out.println("mysize = "+mySet.size()+ " [expect 12]");
//		mySet.add(new String ("apple0"));
//		System.out.println("mysize = "+mySet.size()+ " [expect 12]");
//		System.out.println("contains 11? = "+mySet.contains(new String("11")));
//		System.out.println("contains apple11? = "+mySet.contains(new String("apple11")));		
//		
//		try {
//			String removedItem = mySet.remove("apple7");
//			System.out.println(mySet);
//			System.out.println(removedItem+ " was removed");
//		} catch (Exception e) {
//			System.out.println("item not found, can't remove");
//		}
//		
//		try {
//			String removedItem = mySet.remove("apple17");
//			System.out.println(mySet);
//			System.out.println(removedItem+ " was removed");
//		} catch (Exception e) {
//			System.out.println("item not found, can't remove");
//		}
//		
//		Iterator<String> iter = mySet.iterator();
//		while (iter.hasNext()){
//			System.out.println(iter.next());
//		}
//
//
//
//		SetADT <String> mySet2 = new ArraySet<String>();
//
//		for (int i = 0; i < 12; i++)
//			mySet2.add(new String("orange"+i));	
//		System.out.println(mySet2);
//		
		// add code here to test methods you finish in ArraySet 
//	End of provided code---------------------------------------------------
		
		
		// after you complete the existing methods, do the Case Study
		//Case 1
//		SetADT <String> setA = new ArraySet<String>();
//		SetADT <String> setB = new ArraySet<String>();
//		boolean found = true;
//		boolean next = false;
//		
//		for (int i = 0; i < 12; i++)
//		{
//			setA.add(new String("apple"+i));
//			if (i % 2 == 0)
//			{
//				setB.add(new String("apple"+i));
//			}
//		}
//		
//		Iterator<String> iterB = setB.iterator();
//		
//		while(iterB.hasNext())
//		{
//			String temp = iterB.next();
//			Iterator<String> iterA = setA.iterator();
//			while(iterA.hasNext())
//			{
//				if (temp.equals(iterA.next()))
//				{
//					next = true;
//					break;
//				}
//			}
//			if (!next)
//			{
//				found = false;
//				break;
//			}
//		}
//		if (!found)
//		{
//			System.out.println("Set A does not contain Set B.");
//		}
//		else
//		{
//			System.out.println("Set A contains Set B.");
//		}
		
		
		// Approach 2 will be here in ArraySetTester, but you will 
//		SetADT <Integer> setA = new ArraySet<Integer>();
//		SetADT <Integer> setB = new ArraySet<Integer>();
//		
//		for (int i = 0; i < 12; i++)
//		{
//			setA.add(i);
//			if (i % 2 == 0)
//			{
//				setB.add(i);
//			}
//		}
//		
//		System.out.println(contains(setA, setB));
		
		// Approach 3 will start with uncommenting the prototype in SetADT 
		// and then creating the method in ArraySet.  Finally you will write
		// code here to test the new method
		SetADT <String> setA = new ArraySet<String>();
		SetADT <String> setB = new ArraySet<String>();
		boolean found = true;
		boolean next = false;
		
		for (int i = 0; i < 12; i++)
		{
			setA.add(new String("apple"+i));
			if (i % 2 == 0)
			{
				setB.add(new String("apple"+i));
			}
		}
		System.out.println(setA.contains(setB));
	}

//public static boolean contains(SetADT<Integer> set1, SetADT<Integer> set2)
//{
//	Iterator<Integer> iter = set2.iterator();
//	
//	while (iter.hasNext())
//	{
//		if (!set1.contains(iter.next()))
//		{
//			return false;
//		}
//	}
//	
//	return true;
//}

}
