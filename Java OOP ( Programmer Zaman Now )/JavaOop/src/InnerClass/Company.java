public class Company {
    private int ID;
    private String name;
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employees { // Inner Class
        private String name;

        public void get() {
            System.out.println("From Method GET : " + Company.this.name);
            System.out.println("From Method GET : " + Company.this.getName());
        }

        public String getCompany() {
            // return Company.this.name;
            return Company.this.getName(); // Cara mengakses Method dari Outer Class
        }

        public void Perusahaan() {
            System.out.println("Perusahaan");
        }

        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    }
}
