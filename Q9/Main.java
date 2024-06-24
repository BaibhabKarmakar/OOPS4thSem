// Write a problem to constructor chaining
class Parent{
    int parentValue;
    public Parent(){
        this(0);    // this line will call Parent Constructor with one integer parameter.
    }
    public Parent(int value){
        this.parentValue = value;
    }
    public int getParentValue(){
        return parentValue;
    }
}

class Child extends Parent{
    int childValue;
    public Child(){
        super();
        this.childValue = 0;
    }
    public Child(int parentValue , int childValue){
        super(parentValue);
        this.childValue = childValue;
    }
    public int getChildValue(){
        return childValue;
    }
}

public class Main {
    public static void main(String args[]){
        Child child1 = new Child();
        System.out.println(child1.getParentValue());
        System.out.println(child1.getChildValue());

        Child child2 = new Child(10 , 20);
        System.out.println(child2.getParentValue());
        System.out.println(child2.getChildValue());
        
    }
}
