import java.util.*;
public class hashmapimplement {
    static class hashmap<K,V>{
        private class node{
            K key;
            V value;
            public node(K key, V value){
                this.key = key;
                this.value = value; 
            }
        }
        private int n;
        private int N;
        private LinkedList<node> buckets[];
        public hashmap(){
            this.N = 4;
            this.buckets = new LinkedList[N];
            for (int i =0;i<N;i++){
                this.buckets[i]=new LinkedList<>();
            }

        }
        private int hashfun(K key){
            int bi = key.hashCode();
            return Math.abs(bi)%N;
        }
        private int searchinll(K key, int bi){
            LinkedList <node> ll = buckets[bi];
            for (int i = 0; i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;
                }
            }
            return -1;

        }
        private void rehash(){
            LinkedList<node> oldbucket[] = buckets;
            buckets = new LinkedList[N*2];
            for(int i = 0; i<N*2; i++){
                buckets[i]= new LinkedList<>();
                
            }
            for(int i = 0; i<oldbucket.length;i++){
                LinkedList<node> ll = oldbucket[i];
                for(int j = 0; j<ll.size();j++){
                    node nd = ll.get(j);
                    put(nd.key, nd.value);
                }
            }

        }
        public void put(K key,V value){
            int bi = hashfun(key);
            int di = searchinll(key, bi);
            if(di == -1){
                buckets[bi].add(new node(key,value));   
                n++;
            }
            else{
                node existnode = buckets[bi].get(di);
                existnode.value = value;
            }
            double lambda = (double)n/N;
            if(lambda > 2.0){
                rehash();
            } 
        }
        public V get(K key){
            int bi = hashfun(key);
            int di = searchinll(key, bi);
            if(di == -1){
                return null;
            }
            else{
                node existnode = buckets[bi].get(di);
                return existnode.value ;
            }
        }
        public boolean contains(K key){
            int bi = hashfun(key);
            int di = searchinll(key, bi);
            if (di == -1){
                return false;
            }
            else{
                return true;
            }
        }
        public V remove(K key){
            int bi = hashfun(key);
            int di = searchinll(key, bi);
            if (di == -1){
                return null;
            }
            else{
                node r = buckets[di].remove(di);
                n--;
                return r.value;
            }
        }
        public ArrayList<K> keyset(){
            ArrayList<K> keys = new ArrayList<>();
            for(int i = 0; i<buckets.length;i++){
                LinkedList<node> ll = buckets[i];
                for(int j = 0; j<ll.size(); j++){
                    node keynode = ll.get(j);
                    keys.add(keynode.key);
                }
            }
            return keys;
        }
        public boolean isEmpty(){
            return n==0;
        }
    }
    public static void main(String[] args) {
        hashmap< String , Integer> map = new hashmap<>();
        map.put("india", 190);
        map.put("srilanka", 180);
        map.put("bangladesh", 19);
        map.put("china", 132);
        ArrayList<String> keys = map.keyset();
        for (int i = 0; i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        System.out.println(map.contains("india"));
        System.out.println(map.isEmpty());
        System.out.println(map.remove("china")+" is removed...");
    }
}
