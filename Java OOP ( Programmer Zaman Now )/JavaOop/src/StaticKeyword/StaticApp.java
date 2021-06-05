import FolderB.ParentB.ChildB.Say;

// import jdk.vm.ci.meta.Constant;
// import static StaticKeyword.Apps;
// import static StaticKeyword.Constant.*;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(Constant.APPLICATION);
        System.out.println(Constant.VERSION);

        System.out.println(
            MathUtil.sum(1,1,1,1,1)
        );

        Country.City city = new Country.City();
        city.setName("Subang");

        System.out.println(city.getName());

        System.out.println(Apps.PROCESSORS);

        Say say = new Say();
        say.Say1();
        
        // Employee e = new Employee("Dede");
        // e.sayHello("Dede");
    }
}
