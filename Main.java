//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Calculator calc = Calculator.instance.get();

        //int a = calc.plus.apply(10, 2);
        //int b = calc.minus.apply(2, 1);
        //int c = calc.devide.apply(a, b);
        //calc.println.accept(c);
        //}

        Worker.OnTaskDoneListener listener = System.out::println;
        Worker worker = new Worker(listener);
        worker.start();
    }
}