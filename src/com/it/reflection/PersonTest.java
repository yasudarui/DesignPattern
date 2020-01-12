package com.it.reflection;

import org.junit.Test;

public class PersonTest {
    /**
     * newInstance 方法 创建运行类的对象,调用运行时类的无参构造放方法
     * @throws Exception
     */

    @Test
    public  void test01() throws  Exception {
        Class<?> aClass = Class.forName("com.it.reflection.Person");
        System.out.println(aClass);
        Person person = new Person();
        Class aClass1 = person.getClass();
        System.out.println("+++++++++++++++++"+person);
        System.out.println(aClass1);
        Person person2 = new Person();
        Class aClass2= person2.getClass();
        System.out.println("______________"+person2);
        System.out.println(aClass2);
        Class<Person> personClass = Person.class;
        System.out.println(personClass);
        ClassLoader classLoader = PersonTest.class.getClassLoader();
        Object o = aClass.newInstance();
        System.out.println(o.equals(person));
        Object o1 = aClass1.newInstance();
        System.out.println(o1.equals(o));
    }

}
