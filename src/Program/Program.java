package Program;

import Deal.Deal;

import static Program.Input.input;
import static Program.DealOut.output;


public class Program {

    private static Deal[] deals = new Deal[10];
    private static int tail = 0;

    public static void main(String[] args) {
        Deal d = input();
        deals[tail] = d;
        tail++;
        output(d);

    }

}
