package com.example.my_maven_project;

import java.io.InputStream;
import java.util.Properties;

public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	System.out.println( "Hello World! - Fixed" );

        InputStream input = App.class.getClassLoader().getResourceAsStream("config.properties");
        Properties prop = new Properties();
        prop.load(input);

        System.out.println("App Name: " + prop.getProperty("app.name"));
        System.out.println("App Version: " + prop.getProperty("app.version"));
    }
}