public class Customer {
    private String name;
    private EnumLevel level;
    // private ClassLevel nameLevel = new ClassLevel("Hello");
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnumLevel getLevel() {
        return level;
    }

    public void setLevel(EnumLevel level) {
        this.level = level;
    }

    // public ClassLevel getNameLevel() {
    //     System.out.println(nameLevel);
    //     return nameLevel;
    // }

    // public void setNameLevel(ClassLevel nameLevel) {
    //     this.nameLevel = nameLevel;
    // }
}
