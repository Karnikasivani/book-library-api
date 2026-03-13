//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Emp emp2 = new Emp("Karnika", 24, 4000, "Blr");
        emp2.salaryRaise(emp2.salary);

        Bankacc acc1 = new Bankacc("Karnika", 30000.00);
        acc1.withdraw(100);
        acc1.withdraw(1009);
        acc1.deposit(90000);
        acc1.withdraw(1188911);
        System.out.println(acc1.getBalance());
    }
}