package spring.showcase.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by jacky on 2016/9/14.
 */
@Configuration
public class Conf {

    @Bean
    public Bar bar(){
        return new Bar();
    };

    @Bean
    public NoDef noDef(){
        return new NoDef();
    }

}
