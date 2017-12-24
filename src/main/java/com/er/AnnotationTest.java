package com.er;

import java.lang.annotation.Annotation;

public final class AnnotationTest {

    @interface ChangedBy {
        String author();

        long time() default 0;
    }

    //@ChangedBy
    public void test() {
        @ChangedBy(author = "neo", time = 1)
        Class<?> clazz = this.getClass();
        Annotation[] annotations = clazz.getAnnotations();
    }
}

