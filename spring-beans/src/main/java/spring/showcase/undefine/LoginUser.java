package spring.showcase.undefine;

import org.springframework.stereotype.Component;

/**
 * Created by jacky on 2016/9/14.
 */
@Component
public class LoginUser implements IUser {

    public String getName() {
        return "Jacky";
    }
}
