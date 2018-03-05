package com.javarush.task.task17.task1713;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/* 
Общий список
*/

public class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    @Override
    public synchronized int size()
    {
        return original.size();
    }

    public void trimToSize() {
        original.trimToSize();
    }

    public void ensureCapacity(int minCapacity) {
        original.ensureCapacity(minCapacity);
    }

    @Override
    public synchronized boolean isEmpty()
    {
        return original.isEmpty();
    }

    @Override
    public synchronized boolean contains(Object o)
    {
        return original.contains(o);
    }

    @Override
    public synchronized Iterator<Long> iterator()
    {
        return original.iterator();
    }

    @Override
    public synchronized Object[] toArray()
    {
        return original.toArray();
    }

    @Override
    public synchronized  <T> T[] toArray(T[] a)
    {
        return original.toArray(a);
    }

    @Override
    public synchronized boolean add(Long aLong)
    {
        return original.add(aLong);
    }

    @Override
    public synchronized boolean remove(Object o)
    {
        return original.remove(o);
    }

    @Override
    public synchronized boolean containsAll(Collection<?> c)
    {
        return original.containsAll(c);
    }

    @Override
    public String toString() {
        return original.toString();
    }

    @Override
    public Stream<Long> stream() {
        return original.stream();
    }

    @Override
    public Stream<Long> parallelStream() {
        return original.parallelStream();
    }

    public static <E> List<E> of() {
        return List.of();
    }

    public static <E> List<E> of(E e1) {
        return List.of(e1);
    }

    public static <E> List<E> of(E e1, E e2) {
        return List.of(e1, e2);
    }

    public static <E> List<E> of(E e1, E e2, E e3) {
        return List.of(e1, e2, e3);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4) {
        return List.of(e1, e2, e3, e4);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5) {
        return List.of(e1, e2, e3, e4, e5);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6) {
        return List.of(e1, e2, e3, e4, e5, e6);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7) {
        return List.of(e1, e2, e3, e4, e5, e6, e7);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8) {
        return List.of(e1, e2, e3, e4, e5, e6, e7, e8);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9) {
        return List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9);
    }

    public static <E> List<E> of(E e1, E e2, E e3, E e4, E e5, E e6, E e7, E e8, E e9, E e10) {
        return List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9, e10);
    }

    @SafeVarargs
    public static <E> List<E> of(E... elements) {
        return List.of(elements);
    }

    @Override
    public synchronized boolean addAll(Collection<? extends Long> c)
    {
        return original.addAll(c);
    }

    @Override
    public synchronized boolean addAll(int index, Collection<? extends Long> c)
    {
        return original.addAll(index,c);
    }

    @Override
    public synchronized boolean removeAll(Collection<?> c)
    {
        return original.removeAll(c);
    }

    @Override
    public synchronized boolean retainAll(Collection<?> c)
    {
        return original.retainAll(c);
    }

    @Override
    public synchronized void clear()
    {
        original.clear();
    }

    @Override
    public synchronized Long get(int index)
    {
        return original.get(index);
    }

    @Override
    public synchronized Long set(int index, Long element)
    {
        return original.set(index, element);
    }

    @Override
    public synchronized void add(int index, Long element)
    {
        original.add(index, element);
    }

    @Override
    public synchronized Long remove(int index)
    {
        return original.remove(index);
    }

    @Override
    public synchronized int indexOf(Object o)
    {
        return original.indexOf(o);
    }

    @Override
    public synchronized int lastIndexOf(Object o)
    {
        return original.lastIndexOf(o);
    }

    @Override
    public Object clone() {
        return original.clone();
    }

    @Override
    public synchronized ListIterator<Long> listIterator()
    {
        return original.listIterator();
    }

    @Override
    public synchronized ListIterator<Long> listIterator(int index)
    {
        return original.listIterator(index);
    }

    @Override
    public synchronized List<Long> subList(int fromIndex, int toIndex)
    {
        return original.subList(fromIndex, toIndex);
    }

    @Override
    public void forEach(Consumer<? super Long> action) {
        original.forEach(action);
    }

    @Override
    public Spliterator<Long> spliterator() {
        return original.spliterator();
    }

    @Override
    public boolean removeIf(Predicate<? super Long> filter) {
        return original.removeIf(filter);
    }

    @Override
    public void replaceAll(UnaryOperator<Long> operator) {
        original.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Long> c) {
        original.sort(c);
    }

    @Override
    public boolean equals(Object o) {
        return original.equals(o);
    }

    @Override
    public int hashCode() {
        return original.hashCode();
    }
}
