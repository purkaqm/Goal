package test;

import java.lang.annotation.*;
import java.lang.reflect.*;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {
    String str();
    int val();
}


class Meta {

    @MyAnno(str = "Test01", val = 100)
    static void myMeth() {
        Meta ob = new Meta();

        try {
            Class<?> c = ob.getClass();

            Method m = c.getMethod("myMeth");

            MyAnno anno = m.getAnnotation(MyAnno.class);

            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {
            System.out.println("Method is not found");
        }

    }

    public static void main(String[] args) {
        myMeth();
    }
}


