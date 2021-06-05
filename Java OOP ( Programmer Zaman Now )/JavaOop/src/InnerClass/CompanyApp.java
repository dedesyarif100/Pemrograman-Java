public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Programmer Zaman Now");

        Company.Employees employee = company.new Employees();
        employee.setName("Eko");
        employee.Perusahaan();

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());

        Company companies = new Company();
        companies.setName("Belum Ada");

        Company.Employees employees = companies.new Employees();
        employees.setName("Dede");

        // System.out.println(employees.get());
        employees.get();
        System.out.println(employees.getName());
        System.out.println(employees.getCompany());
    }
}
