

public class PolimorfismeApp {
    Integer[][] arrayInteger = {
        {1,2,3,4,5},
        {6,7,8,9,10},
        {11,12,13,14,15,16,17,18,19,20},
    };
    public static void main(String[] args) {
        // Polimorfisme ------------------------------------------------------------------
        Employee employee = new Employee("Eko");
        employee.sayHello("Budi");

        employee = new ManagerInheritance("Eko");
        employee.sayHello("Budi");

        employee = new VP("Hend");
        employee.sayHello("Budi");

        employee = new Internship("123");
        employee.sayHello("Dede");

        sayHello(new Employee("Eko"));
        sayHello(new ManagerInheritance("Joko"));
        sayHello(new VP("Budi"));

        PolimorfismeApp polimorfisme = new PolimorfismeApp();
        polimorfisme.applyAllDataType();
    }

    public Integer methodInteger(Integer a) {
        System.out.println("APPLY METHOD INTEGER : " + a);
        return a;
    }

    public String methodString(String b) {
        System.out.println("APPLY METHOD STRING : " + b);
        return b;
    }

    public Boolean methodBoolean(Boolean c) {
        System.out.println("APPLY METHOD BOOLEAN : " + c);
        return c;
    }

    public Double methodDouble(Double d) {
        System.out.println("APPLY METHOD DOUBLE : " + d);
        return d;
    }

    public Integer[][] methodArrayInt(Integer[][] arrayInteger) {
        for (int i = 0; i < arrayInteger.length; i++) {
            for (int j = 0; j < arrayInteger[i].length; j++) {
                System.out.println("APPLY METHOD ARRAY : " + arrayInteger[i][j] + ", ");
            }
        }
        return arrayInteger;
    }

    public void applyAllDataType() {
        PolimorfismeApp polimorfisme = new PolimorfismeApp();
        polimorfisme.methodInteger(123456);
        polimorfisme.methodString("INI STRING METHOD");
        polimorfisme.methodBoolean(true);
        polimorfisme.methodDouble(9.5);
        polimorfisme.methodArrayInt(arrayInteger);
        System.out.println("Hello Guys");
    }

    public static void sayHello(Employee employee) {
        // Type Check & Casts ----------------------------------------------------------
        if (employee instanceof VP) {
            VP vicePresident = (VP) employee;
            System.out.println("Hello VP " + vicePresident.name);
        } else if (employee instanceof ManagerInheritance) {
            ManagerInheritance manager = (ManagerInheritance) employee;
            System.out.println("Hello Manager " + manager.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
