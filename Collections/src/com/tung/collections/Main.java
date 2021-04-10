package com.tung.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> names = new ArrayList<>();
//        names.add("Tung");
//        names.add("Thanh");
//        names.add("Trang");
//        System.out.println(names.get(0));
//        System.out.println(names.size());
////        names.remove("Tung");
////        names.remove(0);
//        System.out.println(names.get(0));
//        System.out.println(names.indexOf("Trang1"));
//        names.removeAll(names);
//        System.out.println(names.isEmpty());
//        System.out.println(names.get(0));

//        for (String name : names) {
//            System.out.println(name);
//        }

//        for (int i = 0; i < names.size(); i++) {
//            System.out.println(names.get(i));
//        }
//
//        Map<String, String> emailList = new HashMap<>();
//        emailList.put("Tung", "tung@gmail.com");
//        emailList.put("Thanh", "thanh@gmail.com");
//        System.out.println(emailList.size());
//        System.out.println(emailList.get("Tung"));
//        System.out.println(emailList.get("Thanh"));
//        emailList.remove("Tung");
//        System.out.println(emailList.size());
//        System.out.println(emailList.containsKey("Tung"));
//        System.out.println(emailList.containsValue("thanh@gmail.com"));
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("Huynh Thien Tung", 1));
        students.add(new Student("Le Thi Thanh Thanh", 2));
        students.add(new Student("Nguyen Van Teo", 3));

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }
}
