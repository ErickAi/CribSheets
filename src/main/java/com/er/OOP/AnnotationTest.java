package com.er.OOP;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;

public final class AnnotationTest {
@Inherited
    @interface ChangedBy {
        String author();
        long time() default 0;
    }

    @ChangedBy(author = "neo")
    public void test() {
        @ChangedBy(author = "neo", time = 1)
        Class clazz = this.getClass();
        Annotation[] annotations = clazz.getAnnotations();
    }

    public static void main(String[] args) {

        System.out.println();
    }
}