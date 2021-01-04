package comp2402a2;

import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Collections;

public class FastMinStack<T> implements MinStack<T> {

  protected Comparator<? super T> comp;
  private List <T> ar = new ArrayList<T>();
  private List <T> ar3  = new ArrayList<T>();

//  private T minValue = null;

  public FastMinStack() {
    this(new DefaultComparator<T>());
  }

  public FastMinStack(Comparator<? super T> comp) {
    this.comp = comp;

  }

  public void push(T x) {
    if(ar3.isEmpty() || this.comp.compare(ar3.get(ar3.size()-1),x) >= 0 ){
      //this.minValue = x;
      ar3.add(x);
    }

    ar.add(x);

  }

  public T pop() {
    if (ar3.isEmpty() && ar.isEmpty()) return null;
    if(ar.get(ar.size()-1).equals(ar3.get(ar3.size()-1))){
      ar3.remove(ar3.size()-1);
      //ar.pop()
    }
     //ar3.pop();
    return ar.remove(ar.size()-1);

  }

  public T min() {
    return ar3.isEmpty() ? null : ar3.get(ar3.size()-1);
  }

  public int size() {
    return ar.size();
  }

  public Iterator<T> iterator() {
    return ar.iterator();
  }

  public ListIterator<T> listIterator() {
    return ar.listIterator();
  }

  public Comparator<? super T> comparator() {
    return comp;
  }
}
