package com.javarush.task.task21.task2104;

import java.util.HashSet;
import java.util.Set;

/* 
Equals and HashCode
*/
public class Solution {
    private final String first, last;

    public Solution(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public boolean equals(Object n) {
        if (n == this)
            return true;
        if (n == null)
            return false;

        if (!(n instanceof Solution))
            return false;

        Solution s = (Solution) n;

        return (first == s.first ||(first != null && first.equals(s.first))) && (last == s.last || (last != null && last.equals(s.last)));

    }

    public int hashCode() {
        int result = 17;
        result = 37 * result + (first == null ? 0 : first.hashCode());
        result = 37 * result + (last == null ? 0 : last.hashCode());

        return result;
    }

    public static void main(String[] args) {
        Set<Solution> s = new HashSet<>();
        s.add(new Solution("Donald", "Duck"));
        System.out.println(s.contains(new Solution("Donald", "Duck")));
    }
}
