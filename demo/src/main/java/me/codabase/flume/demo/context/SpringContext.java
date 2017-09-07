package me.codabase.flume.demo.context;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by chendong on 2017/9/7.
 */

public class SpringContext {

    private static SpringContext ourInstance = new SpringContext();

    public static SpringContext getInstance() {
        return ourInstance;
    }

    private SpringContext() {
        configApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
    }

    private AnnotationConfigApplicationContext configApplicationContext;

    public AnnotationConfigApplicationContext getConfigApplicationContext() {
        return configApplicationContext;
    }

    public void setConfigApplicationContext(AnnotationConfigApplicationContext configApplicationContext) {
        this.configApplicationContext = configApplicationContext;
    }
}
