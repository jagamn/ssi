package org.test.annotation;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author jianghm
 * @date 2015/4/16
 */
public class UseCaseTracker {

    public static void traceUseCases(List<Integer> useCases, Class<?> clazz) {
        //获取指定类中所有声明的方法
        for (Method m : clazz.getDeclaredMethods()) {
            //获取方法上指定类型的注解
            UseCase uc = m.getAnnotation(UseCase.class);
            if (uc != null) {
                System.out.println("Found Use Case:" + uc.id() + " " + uc.description());
                useCases.remove(new Integer(uc.id()));
            }
        }
        for (int i : useCases) {
            System.out.println("Warning: Missing use case-" + i);
        }
    }

    public static void main(String[] args) {
        List<Integer> useCases = new ArrayList<Integer>();
        Collections.addAll(useCases, 47, 48, 49, 50, 51, 52);
        traceUseCases(useCases, PasswordUtils.class);
    }
}
