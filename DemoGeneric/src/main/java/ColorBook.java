public class ColorBook<V, K, I> extends Color<K,V>{

    private I info;
    public ColorBook(K key, V value) {
        super(key, value);
    }

    public I getInfo() {
        return info;
    }

    public void setInfo(I info) {
        this.info = info;
    }

    public ColorBook(K key, V value, I info) {
        super(key, value);
        this.info = info;
    }
}
