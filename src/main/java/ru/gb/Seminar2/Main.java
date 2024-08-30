package ru.gb.Seminar2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        // Получаем класс String через метод Class.forName или String.class
        Class<String> stringClass = String.class;

        // Получаем все методы класса String
        Method[] methods = stringClass.getDeclaredMethods();

        // Выводим информацию о каждом методе
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
            System.out.println("Return type: " + method.getReturnType().getName());
            System.out.println("Parameter types: ");

            // Получаем параметры метода и выводим их типы
            Class<?>[] parameterTypes = method.getParameterTypes();
            for (Class<?> paramType : parameterTypes) {
                System.out.println("    " + paramType.getName());
            }
            System.out.println();
        }
    }
}
