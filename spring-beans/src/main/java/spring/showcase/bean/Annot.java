package spring.showcase.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by jacky on 2016/9/14.
 */
@Component
public class Annot {

    @Autowired
    private Foo foo;

    public void sayHello(String name){
        this.foo.sayHello(name);
    }
}
