package chapter11.JavaProxy.invocationHandler;

import chapter11.JavaProxy.PersonBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/*
    proxy.setHotOrNotRating(9); ->
    invoke(Object proxy, Method method, Object[] args); ->
    proxy is proxy class, method is setHotOrNotRating and args is 9.
 */

public class OwnerInvocationHandler implements InvocationHandler {
    private PersonBean person;

    public OwnerInvocationHandler(PersonBean person) {
        this.person = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (method.getName().startsWith("get")) {
                return method.invoke(person, args);
            } else if (method.getName().equals("setHotOrNotRating")) {
                throw new IllegalAccessException();
            } else if (method.getName().startsWith("set")) {
                return method.invoke(person, args);
            }
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return null;
    }
}
