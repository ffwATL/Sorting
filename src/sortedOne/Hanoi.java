package sortedOne;


import java.util.Stack;

public class Hanoi {
    static Stack<Integer> from = new Stack<>();
    static Stack<Integer> help = new Stack<>();
    static Stack<Integer> to = new Stack<>();

    public static void main(String[]args) {
        /*from.push(4);*/
        from.push(3);
        from.push(2);
        from.push(1);
       /* System.out.println(from);*/
        new Hanoi().exchange(from, help, to, from.size());
       /* System.out.println(to);*/
    }

    private void exchange(Stack<Integer> from,
                                 Stack<Integer> help,
                                 Stack<Integer> to, int count){
        System.out.println("from: "+this.from);
        System.out.println("help: "+this.help);
        System.out.println("to: "+this.to);
        System.out.println("*******");
        if(count > 0){
            exchange(from, to, help, --count);
            int biggest = from.pop();
            to.push(biggest);
            exchange(help, from, to, count);
        }

    }
}
