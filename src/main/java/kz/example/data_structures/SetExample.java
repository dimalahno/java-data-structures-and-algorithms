package kz.example.data_structures;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = Set.of(1,2,3,4); // ImmutableCollections.SetN
        System.out.println(set);
        Set<Integer> oddBelowTen = new HashSet<>();
        oddBelowTen.add(1);
        oddBelowTen.add(3);
        oddBelowTen.add(5);
        oddBelowTen.add(7);
        oddBelowTen.add(9);
        System.out.println("oddBelowTen = " + oddBelowTen);

        Set<Integer> evenBelowTen = new HashSet<>();
        evenBelowTen.add(0);
        evenBelowTen.add(2);
        evenBelowTen.add(4);
        evenBelowTen.add(6);
        evenBelowTen.add(8);
        System.out.println("evenBelowTen = " + evenBelowTen);

        Set<Integer> numbersBelowTen = new HashSet<>(oddBelowTen);
        numbersBelowTen.addAll(evenBelowTen);
        System.out.println("numbersBelowTen = " + numbersBelowTen);

        Set<Integer> primesBelowTen = new HashSet<>();
        primesBelowTen.add(2);
        primesBelowTen.add(3);
        primesBelowTen.add(5);
        primesBelowTen.add(7);
        System.out.println("primesBelowTen = " + primesBelowTen);

        Set<Integer> intersectionPrimesAndEven = new HashSet<>(primesBelowTen);
        intersectionPrimesAndEven.retainAll(evenBelowTen);
        System.out.println("intersectionPrimesAndEven = " + intersectionPrimesAndEven);

        Set<Integer> primesLessOdds = new HashSet<>(primesBelowTen);
        primesLessOdds.removeAll(oddBelowTen);
        System.out.println("primesLessOdds = " + primesLessOdds);
    }
}
