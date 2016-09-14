package spring.showcase.bean;

/**
 * Created by jacky on 2016/9/13.
 */
public class Bar {

    private Foo foo;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Foo getFoo() {
        return foo;
    }

    public void setFoo(Foo foo){
        this.foo = foo;
    }

    public void performace(){
        foo.sayHello(this.name);
    }
}
