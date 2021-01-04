package comp2402a2;

import java.util.Comparator;
import java.util.List;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Iterator;

public class FastMinDeque<T> implements MinDeque<T> {

  protected Comparator<? super T> comp;

  protected FastMinStack<T> fs, bs;

  private class FastMinDequeIterator<T> implements Iterator<T>{
    Iterator<T> fsIt;
    ListIterator<T> bsIt;

    public FastMinDequeIterator(FastMinStack<T> fs, FastMinStack<T> bs){
      this.fsIt = fs.iterator();
      this.bsIt = bs.listIterator();

      // Moves bsIt to end
      while(this.bsIt.hasNext()) this.bsIt.next();
    }

    public T next(){
      return this.bsIt.hasPrevious() ? this.bsIt.previous() : this.fsIt.next();
    }

    public boolean hasNext(){
      return this.bsIt.hasPrevious() || this.fsIt.hasNext();
    }
  }

  public FastMinDeque() {
    this(new DefaultComparator<T>());
  }

  public FastMinDeque(Comparator<? super T> comp) {
    this.comp = comp;
    this.fs = new FastMinStack<>();
    this.bs = new FastMinStack<>();
  }

  public void addFirst(T x) {
    this.bs.push(x);

  }

  public void addLast(T x) {
    this.fs.push(x);
  }

  public T removeFirst() {
    if (this.bs.size() == 0) {
        while (this.fs.size() > 0) {
            this.bs.push(this.fs.pop());
        }
    }
    return this.bs.pop();
  }

  public T removeLast() {
    if (this.fs.size() == 0) {
        while (this.bs.size() > 0) {
            this.fs.push(this.bs.pop());
        }
    }
    return this.fs.pop();
  }

  public T min() {
    T frontMin = this.fs.min();
    T backMin = this.bs.min();

    if (frontMin == null && backMin == null) {
      return null;
    }

    if (frontMin == null) {
      return backMin;
    }

    if (backMin == null) {
      return frontMin;
    }

    return this.comp.compare(backMin, frontMin) > 0 ? frontMin : backMin;
  }

  public int size() {
    return this.fs.size() + this.bs.size();
  }

  public Iterator<T> iterator() {
    return new FastMinDequeIterator<>(this.fs, this.bs);
  }

  public Comparator<? super T> comparator() {
    return comp;
  }

}
