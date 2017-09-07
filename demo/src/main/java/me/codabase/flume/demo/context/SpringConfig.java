package me.codabase.flume.demo.context;

import me.codabase.flume.demo.common.predef.Basic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by chendong on 2017/9/7.
 */
@Configuration
public class SpringConfig implements Basic{

    @Bean
    public void getMysql() {
        println();
    }

}
