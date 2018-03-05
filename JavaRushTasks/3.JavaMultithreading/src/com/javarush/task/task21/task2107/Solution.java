package com.javarush.task.task21.task2107;

import java.util.LinkedHashMap;
import java.util.Map;

/* 
Глубокое клонирование карты
*/
public class Solution implements Cloneable{

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Solution solution = new Solution();
        for (Map.Entry<String, User> entry : this.users.entrySet()){
            solution.users.put(entry.getKey(), (User) entry.getValue().clone());
        }
        return solution;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.users.put("Hubert", new User(172, "Hubert"));
        solution.users.put("Zapp", new User(41, "Zapp"));
        Solution clone = null;
        try {
            clone = (Solution) solution.clone();
            System.out.println(solution);
            System.out.println(clone);

            System.out.println(solution.users);
            System.out.println(clone.users);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace(System.err);
        }
    }

    protected Map<String, User> users = new LinkedHashMap();

    public static class User implements Cloneable{
        int age;
        String name;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof User)) return false;

            User user = (User) o;


            return age == user.age && (name == user.name || (name != null && name.equals(user.name)));
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = 37 * result + age;
            result = 37 * result + (name == null ? 0 : name.hashCode());
            return result;
        }

        public User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {

            return new User(this.age, this.name);
        }
    }
}
