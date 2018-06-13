package chapter11.JavaProxy;

import chapter11.JavaProxy.invocationHandler.NonOwnerInvocationHandler;
import chapter11.JavaProxy.invocationHandler.OwnerInvocationHandler;
import java.lang.reflect.Proxy;
import java.util.HashMap;

public class MatchMakingTestDrive {

    HashMap<String, PersonBean> datingDB = new HashMap<>();

    public MatchMakingTestDrive() {
        init();
    }

    public static void main (String args[]) {
        MatchMakingTestDrive testDrive = new MatchMakingTestDrive();
        testDrive.drive();
    }

    private void drive() {
        PersonBean guy = getPersonFromDatabase("foo");
        PersonBean ownerProxy = getOwnerProxy(guy);
        System.out.println("Name is " + ownerProxy.getName());
        ownerProxy.setInterests("lacrosse");
        System.out.println("Interests set from owner proxy");
        try {
            ownerProxy.setHotOrNotRating(10);
        } catch (Exception e) {
            System.out.println("Can't set rating from owner proxy");
        }
        System.out.println("Rating is " + ownerProxy.getHotOrNotRating());

        PersonBean nonOwnerProxy = getNonOwnerProxy(guy);
        System.out.println("Name is " + nonOwnerProxy.getName());
        try {
            nonOwnerProxy.setInterests("babes");
        } catch (Exception e) {
            System.out.println("Can't set interests from non owner proxy");
        }
        nonOwnerProxy.setHotOrNotRating(3);
        System.out.println("Rating set from non owner proxy");
        System.out.println("Rating is " + nonOwnerProxy.getHotOrNotRating());
    }

    // Java's Dynamic proxy
    private PersonBean getOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new OwnerInvocationHandler(person));
    }

    // Java's Dynamic proxy
    private PersonBean getNonOwnerProxy(PersonBean person) {
        return (PersonBean) Proxy.newProxyInstance(person.getClass().getClassLoader(),
                person.getClass().getInterfaces(),
                new NonOwnerInvocationHandler(person));
    }

    PersonBean getPersonFromDatabase(String name) {
        return (PersonBean)datingDB.get(name);
    }

    private void init() {
        PersonBean guy = new PersonBeanImpl();
        guy.setName("foo");
        guy.setInterests("soccer, painting");
        guy.setHotOrNotRating(10);
        datingDB.put(guy.getName(), guy);

        PersonBean girl = new PersonBeanImpl();
        girl.setName("fii");
        girl.setInterests("cars, dancing");
        girl.setHotOrNotRating(10);
        datingDB.put(girl.getName(), girl);
    }


}
