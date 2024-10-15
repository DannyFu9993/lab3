package exercise2;

public class FullTimeGameTester extends GameTester{

    public FullTimeGameTester(){
        this.status = true;
    }

    @Override
    public void determineSalary() {
        this.salary = 3000;
    }
}
