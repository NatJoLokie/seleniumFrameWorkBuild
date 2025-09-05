package javaOops;

public class ConstructorClass {

    private String name;
    private int age;


    public ConstructorClass() {
        System.out.println("Default Constructor");
    }

    public ConstructorClass(String name) {
        this();
        this.name = name;
        System.out.println("print 1 Parameter Constructor : " + name);
    }

    public ConstructorClass(String name, int age) {
        this("Harish");
        this.name = name;
        this.age = age;
        System.out.println("print 2 Parameter Constructor : " + name+" age :"+age);
    }


//    public void getName() {
//        System.out.println("getName");
//
//    }

}
