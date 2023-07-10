public class PayrollProcessor {
    String name;
    double salary;
    double hourly_rate;
    double hours_worked;
    public void calculatePay(String name,double salary)
    {
        System.out.println("--From Salaried Employee--");
        System.out.println("name: "+name+"\nsalary: "+salary);
    }
    public void calculatePay(String name, double hourly_rate, double hours_worked)
    {
        System.out.println("--From Hourly Employee--");
        System.out.println("name: "+name+"\nsalary: "+hourly_rate*hours_worked);
    }

    public static void main(String[] args) {
        PayrollProcessor payrollProcessor =new PayrollProcessor();
        payrollProcessor.calculatePay("surya",45000);
        payrollProcessor.calculatePay("surya",105.25,2.5);
    }
}
