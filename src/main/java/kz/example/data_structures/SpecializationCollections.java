package kz.example.data_structures;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.LongAdder;

public class SpecializationCollections {
    public static void main(String[] args) {
        EnumSet<Thread.State> states = EnumSet.allOf(Thread.State.class);
        states.remove(Thread.State.RUNNABLE);
        System.out.println("states = " + states);

//        EnumMap<Thread.State, LongAdder> timesInState = new EnumMap<>(Thread.State.class);
        Map<Thread.State, LongAdder> timesInState = Collections.synchronizedMap(new EnumMap<>(Thread.State.class));
        System.out.println("timesInState = " + timesInState);

        IdentityHashMap<String, Integer> map = new IdentityHashMap<>();
        map.put("Hello", 42);
        System.out.println(map.get("Hello"));

        Map<IdentityKey<String>, Integer> map1 = new ConcurrentHashMap<>();
        map1.put(new IdentityKey<>("Hello"), 42);
        System.out.println(map1.get(new IdentityKey<>("Hello")));

        Properties properties = new Properties();
        int parallelism = Integer.parseInt(System.getProperty("java.util.concurrent.ForkJoinPool.common.parallelism", "42"));
        int parallelismBetter = Integer.getInteger("java.util.concurrent.ForkJoinPool.common.parallelism", 42);
    }

    private static class IdentityKey<K> {
        private final K key;

        private IdentityKey(K ket) {
            this.key = ket;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            IdentityKey<?> that = (IdentityKey<?>) o;
            return key.equals(that.key);
        }

        @Override
        public int hashCode() {
            return System.identityHashCode(key);
//            return Objects.hash(key);
        }
    }
}
