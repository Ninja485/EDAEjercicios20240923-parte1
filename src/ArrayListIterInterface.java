import java.util.Iterator;

public interface ArrayListIterInterface<E> extends Iterable<E> {

    int size();

    boolean isEmpty();

    void add(int i, E o) throws IndexOutOfBoundsException, IllegalStateException;

    E remove(int i) throws IndexOutOfBoundsException;

    E set(int i, E e) throws IndexOutOfBoundsException;

    E get(int i) throws IndexOutOfBoundsException;

    String toString();

    Iterator<E> iterator();
}
