package me.codabase.flume.demo.common.predef;

/**
 * Created by chendong on 2017/9/7.
 */
public interface Basic {

    default void println() {
        System.out.println("test");
    }

}
