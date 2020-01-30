package config;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Enviornments {

    Properties prop=new Properties();
    FileInputStream fis;
    String filepath="";

    public  Enviornments(){

       String env= System.getProperty("env");

       if(env!=null){
           filepath="C:\\Users\\pashi\\Documents\\Ashishkumar Patel\\Automation\\PracticeProject\\src\\main\\java\\config\\"+env+".properties";
       }
       else
           System.out.println("Wrong enviornment");

        try {
            fis=new FileInputStream(filepath);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            prop.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Properties readPropData(){
        return prop;
    }


}
