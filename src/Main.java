import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

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

        Photographer vasya = new Photographer("Вася");
        box1.useAllTools(vasya);
        box1.useAllTools(new IToolUser() {
            @Override
            public void useTool(Tool t) {
                System.out.println("нечто подбрасывает "+t+" в воздух");
            }

        });

        box1.useAllTools(t-> System.out.println("описываем словами "+t.name));
        //Аналогично происходит в стандартных коллекциях, только там и сами классы коллекций, и интерфейсы ОБОБЩЕННЫЕ
        List<Tool> list1 = new ArrayList<>(2);
        list1.add(o);
        list1.add(p);
        list1.add(m);
        list1.forEach(new Consumer<Tool>() {
            @Override
            public void accept(Tool tool) {
                System.out.println("стираем пыль с "+tool.name);
            }
        });
    }
}
