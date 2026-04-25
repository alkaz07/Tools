public class Main {
    public static void main() {
        Tool o = new Tool("Отвертка");
        Tool m = new Tool("Молоток");
        ToolBox box1 = new ToolBox(2);
        System.out.println("box1.getCounter() = " + box1.getCounter());
        box1.add(m);
        System.out.println("box1.getCounter() = " + box1.getCounter());
        box1.add(o);
        System.out.println("box1.getCounter() = " + box1.getCounter());
        Tool p = new Tool("Пила");
        box1.add(p);
        System.out.println("box1.getCounter() = " + box1.getCounter());
    }
}
