package com.javarush.task.task19.task1905;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {
        String res = "+38(050)123-45-67";
        System.out.println(res.replaceAll("[()-]", ""));

    }

    public static class DataAdapter implements RowItem{
        private Customer customer;
        private Contact contact;


        public DataAdapter(Customer customer, Contact contact) {
            this.customer = customer;
            this.contact = contact;
        }

        @Override
        public String getCountryCode() {
            String str = "";
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getValue().equals(this.customer.getCountryName()))
                    str = entry.getKey();
            }
            return str;
        }

        @Override
        public String getCompany() {
            return this.customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() {
            String[] strings = splitName(this.contact.getName());

            return strings[1];
        }

        @Override
        public String getContactLastName() {
            String[] strings = splitName(this.contact.getName());

            return strings[0];
        }

        @Override
        public String getDialString() {
            return "callto://"+ deleteCharsFromNumber(this.contact.getPhoneNumber());
        }

        private String[] splitName(String s){
            return s.split(", ");
        }

        private String deleteCharsFromNumber(String s){
            String res = "";
            res = s.replaceAll("[()-]", "");

            return res;
        }


    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.
        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan
        String getPhoneNumber();        //example +38(050)123-45-67
    }
}