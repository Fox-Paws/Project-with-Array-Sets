package arraysetpackage;

import java.util.Iterator;

public interface SetADT<T> {
	   public void add (T element); //Adds one element to this set, ignoring duplicates
	   public void addAll (SetADT<T> set); //Adds all elements in the parameter to this set,
	                                       // ignoring duplicates
	   public T removeRandom (); //Removes and returns a random element from this set 
	   public T remove (T element); //Removes and returns the specified element from this set
	   public SetADT<T> union (SetADT<T> set); //Returns the union of this set and the 
	                                           // parameter 
	   public boolean contains (T target); //Returns true if this set contains the parameter
	   public boolean contains(SetADT<T> set);
	   //public boolean contains(SetADT<T> Set); // Returns true if this set contains the parameter
	   public boolean equals (SetADT<T> set); //Returns true if this set and the parameter 
	                                          //contain exactly same elements 
	   public boolean isEmpty(); //Returns true if this set contains no elements
	   public int size(); //Returns the number of elements in this set   
	   public Iterator<T> iterator(); //Returns an iterator for the elements in this set 
	   public String toString(); //Returns a string representation of this set
}

