/***
 Using generic to recreate the python print function in java. 
***/
package osas.python;

public class Python {

    public static <T> T print(T value) {
        System.out.println(value);
        return value;
    }

}
