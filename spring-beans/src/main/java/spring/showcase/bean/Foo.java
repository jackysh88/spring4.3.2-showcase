package spring.showcase.bean;

/**
 * Created by jacky on 2016/9/13.
 */


public class Foo {

    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void sayHello(String name){
        System.out.println("foo say hello, " +  name );
    }
}
