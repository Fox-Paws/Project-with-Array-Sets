package arraysetpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

public class ArraySet<T> implements SetADT<T> {
	private static final int DEFAULT_SIZE = 20;
	private int count;
	private T[] setValues;
	private Random rand;
	
	public ArraySet (){
		this(DEFAULT_SIZE);
	} // end of constructor
	
	public ArraySet (int size){
		count = 0;
		setValues = (T[]) new Object[size];
		rand = new Random();
	} // end of constructor	

	
	public void add(T element) {
		if (contains(element))
			return;
		if (count == setValues.length) {
			T[]  temp = (T[]) new Object[setValues.length*2];
			for (int i = 0; i < setValues.length; i++) {
				temp[i] = setValues[i];
			}
			setValues = temp;
		}
		setValues[count] = element;
		count++;
	}

	public void addAll(SetADT<T> set)
	{ 
		Iterator<T> iter = set.iterator();
		while (iter.hasNext())
		{
			add(iter.next());
		}
		
	}
 
	public boolean contains(T target) {
		for (int i = 0; i < count; i++ )
			if (setValues[i].equals(target))
				return true;
		return false;
	}
	
	public boolean contains(SetADT<T> set)
	{
		Iterator<T> iter = set.iterator();
		boolean found = false;
		T temp;
		
		while (iter.hasNext())
		{
			temp = iter.next();
			for (int i = 0; i < count; i++)
			{
				if (setValues[i].equals(temp))
				{
					found = true;
					break;
				}
			}
			if (!found)
			{
				return false;
			}
		}
		
		return true;
	}
	
	public String toString () {
		String toReturn = "[";
		for (int i = 0; i < count; i++) {
			toReturn += setValues[i] + " ";
		}
		toReturn +="]";
		return toReturn;
	}
	


	public boolean equals(SetADT<T> set)
	{
		Iterator<T> iter = set.iterator();
		T temp;
		for (int i = 0; i < count; i++)
		{
			if (!iter.hasNext())
			{
				return false;
			}
			temp = iter.next();
			if (!setValues[i].equals(temp))
			{
				return false;
			}
		}
		if (iter.hasNext())
		{
			return false;
		}
		return true;
	}
	
	public boolean isEmpty() { 
		return count==0;
	}
 
	public Iterator<T> iterator() {
		return new ArraySetIterator<T>(setValues,count);
	}
 
	public T remove(T element) { 
		for (int i = 0; i < count; i++ ) {
			if (setValues[i].equals(element)) {
				T toReturn = setValues[i];
				setValues[i] = setValues[count-1];
				count--;
				return toReturn;
			}
		}
		throw new NoSuchElementException("not present");
	}

 
	public T removeRandom()
	{ 
		rand = new Random();
		int index = rand.nextInt(count);
		T tempVal = setValues[index];
		T[]  tempArr = (T[]) new Object[count - 1];
		for (int i = 0; i < index; i++)
		{
			if (i != index)
			{
				tempArr[i] = setValues[i];
			}
		}
		for (int i = index; i < (count - 1); i++)
		{
			tempArr[i] = setValues[i + 1];
		}
		setValues = tempArr;
		count--;
		return tempVal;
	}
	 
	public int size() { 
		return count;
	}
	 
	public SetADT<T> union(SetADT<T> set)
	{ 
		SetADT<T> toReturn = new ArraySet<T>(this.count);
		Iterator<T> iter = set.iterator();
		Iterator<T> thisIter = this.iterator();
		while (thisIter.hasNext())
		{
			toReturn.add(thisIter.next());
		}
		while (iter.hasNext())
		{
			toReturn.add(iter.next());
		}
		return toReturn;
	}

}
