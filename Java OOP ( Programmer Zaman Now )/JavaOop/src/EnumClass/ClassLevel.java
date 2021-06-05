public class ClassLevel {
    private String nameLevel = "Nama Level";
    private Integer numberLevel = 300;

    // public ClassLevel(String nameLevel) {
    //     this.nameLevel = nameLevel;
    // }

    public void setNameLevel(String nameLevel) {
        this.nameLevel = nameLevel;
    }

    public String getNameLevel() {
        System.out.println(nameLevel);
        return nameLevel;
    }

    public void setNumberLevel(Integer numberLevel) {
        this.numberLevel = numberLevel;
    }

    public Integer getNumberLevel() {
        System.out.println(numberLevel);
        return numberLevel;
    }
}
