package exercise2;

public class PartTimeGameTester extends GameTester{

    public PartTimeGameTester(){
        this.status = false;
    }

    @Override
    public void determineSalary() {
        this.salary = 20;
    }
}
