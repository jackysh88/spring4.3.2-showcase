package spring.showcase.bean;

/**
 * Created by jacky on 2016/9/13.
 */
public class HelloWorldBean {

    private String name;
    private String text;

    public String getName() {
        return name;
    }

    public HelloWorldBean(){
        this.name = "Nono";
        this.text = "None";
    }

    public HelloWorldBean(String text) {
        this.text = text;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void sayHello() {
        System.out.println("name: " + getName() + " text:　" + this.text);
    }
}
