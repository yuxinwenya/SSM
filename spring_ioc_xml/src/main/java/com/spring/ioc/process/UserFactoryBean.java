package com.spring.ioc.process;

import com.spring.ioc.entity.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author 余欣文
 *
 * FactoryBean是Spring提供的一种整合第三方框架的常用机制。和普通的bean不同，配置一个
 * FactoryBean类型的bean，在获取bean的时候得到的并不是class属性中配置的这个类的对象，而是
 * getObject()方法的返回值。通过这种机制，Spring可以帮我们把复杂组件创建的详细过程和繁琐细节都
 * 屏蔽起来，只把最简洁的使用界面展示给我们。
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }
}
