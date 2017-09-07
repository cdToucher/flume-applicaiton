package me.codabase.flume.demo.entry;

import org.apache.flume.node.Application;

/**
 * Created by chendong on 2017/9/7.
 */
public class BootApplication {

    public static void main(String[] args) {
        setEnvVarivable();
        setSelfLog();

        Application.main(parseArgs(args));
    }

    private static String[] parseArgs(String[] args) {
        return args;
    }


    private static void setEnvVarivable() {
        System.setProperty("test", "test");
    }

    private static void setSelfLog() {

    }

}
