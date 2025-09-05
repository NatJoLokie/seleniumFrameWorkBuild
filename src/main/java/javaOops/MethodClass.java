package javaOops;

public class MethodClass {

    private String name = "Arun" ;
    private int age ;

    public String getName() {
        if (name == null) {
            return null;
        } else {
            return name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
