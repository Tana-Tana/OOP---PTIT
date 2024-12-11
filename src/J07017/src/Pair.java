//public class Pair<K, V> {
//    private K key;
//    private V value;
//
//    public Pair(K key, V value) {
//        this.key = key;
//        this.value = value;
//    }
//
//    public K getKey() {
//        return key;
//    }
//
//    public void setKey(K key) {
//        this.key = key;
//    }
//
//    public V getValue() {
//        return value;
//    }
//
//    public void setValue(V value) {
//        this.value = value;
//    }
//
//    public boolean isPrime() {
//        if(Prime((Integer) key) && Prime((Integer) value)) return true;
//        return false;
//    }
//
//    private boolean Prime(int i){
//        if(i<2) return false;
//        for(int j=2;j<=Math.sqrt(i);++j){
//            if(i % j == 0) return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return (Integer)key + " " + (Integer) value;
//    }
//}
