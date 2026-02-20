package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isMarried;
    private double height;
    private String favNumber;

    public Person(String firstName,String lastName,int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    };

    public Person(String firstName,String lastName,int age,boolean isMarried,double height,String favNumber){
        this(firstName,lastName,age);
        this.isMarried = isMarried;
        this.height = height;
        this.favNumber = favNumber;
    };

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public int getAge(){
        return age;
    }

    public boolean isTeen(){
        if(this.age>=13 && this.age<=19){
            return true;
        }else {
            return false;
        }
    }

}
