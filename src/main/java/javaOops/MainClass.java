package javaOops;

public class MainClass {

    public static void main(String[] args) {

        MethodClass obj = new MethodClass(); // Arun

        int age = obj.getAge();

        String name = obj.getName();


        System.out.println(name);
        System.out.println(age);

        MethodClass obj1 = new MethodClass();

        obj1.setName("Veera");
        System.out.println(obj.getName()); // Arun
        System.out.println(obj1.getName()); // Veera

    }


}
