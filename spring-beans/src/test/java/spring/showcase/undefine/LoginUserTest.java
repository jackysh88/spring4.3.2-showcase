package spring.showcase.undefine;

import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by jacky on 2016/9/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Config.class)
public class LoginUserTest extends TestCase {
    @Autowired
    private IUser user;

    @Test
    public void loginUserNotBeNull(){
        System.out.println(user);
        assertNotNull(user);
    }
}
