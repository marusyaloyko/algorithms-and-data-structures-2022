package ru.mirea.workeightteen.task123;


public abstract class GenericBox<T, V, K> extends Animal<K> implements Comparable<T>, Serializable<V> {
    private final T content1;
    private final V content2;
    private final K content3;

    public GenericBox(T t, V v, K k) {
        content1 = t;
        content2 = v;
        content3 = k;
    }

    public K getContent3() {
        return content3;
    }

    public V getContent2() {
        return content2;
    }

    public T getContent1() {
        return content1;
    }


    @Override
    public String toString() {
        return "GenericBox{" + "content1=" + content1 + ", content2=" + content2 + ", content3=" + content3 + '}';
    }

}
