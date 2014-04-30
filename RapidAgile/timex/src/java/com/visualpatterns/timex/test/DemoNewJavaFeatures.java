package com.visualpatterns.timex.test;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

// DEMO: Static import
import static java.lang.Integer.*;

public class DemoNewJavaFeatures
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        // DEMO: Autoboxing (no need for "new Integer(1)")
        list.add(1);
        list.add(2);

        demoStaticImport();
        demoGenerics(list);
        demoForLoop(list);
        demoEnums();

        demoVarargs("Rapid Java Development", new Date(), 1800 );
    }

    // DEMO: Static Import
    public static void demoStaticImport()
    {
        // No need to use this as Integer.MAX_VALUE
        System.out.println(MAX_VALUE);
    }

    // DEMO: Generics - no need for runtime typecasting
    public static void demoGenerics(Collection<Integer> c)
    {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Testing");
        System.out.println(arrayList.get(0));
        // arrayList.add(new Integer(1)); // compile error
    }

    // DEMO: Enhanced "for" loop
    public static void demoForLoop(Collection<Integer> c)
    {
        // using new style for loop
        for (Integer i : c)
            System.out.println(i);
    }

    // DEMO: Enums
    enum BookName
    {
        RAPID, JAVA, DEVELOPMENT
    };

    public static void demoEnums()
    {
        for (BookName bookName : BookName.values())
            System.out.println(bookName);
    }

    // DEMO: Varargs
    public static void demoVarargs(Object... args)
    {
        String result = MessageFormat.format("I''m working on {0}"
                + " on {1}" + " at {2} hours.", args);
        System.out.println(result);
    }
}
