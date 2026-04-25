public class ToolBox {
    private int capacity;
    private Tool[] tools;
    private int counter = 0;

    public ToolBox(int capacity) {
        this.capacity = capacity;
        tools= new Tool[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isEmpty(){
        return counter==0;
    }

    public boolean isFull(){
        return counter == capacity;
    }

    public int getCounter() {
        return counter;
    }

    public void add(Tool t){
        if( !isFull()){
            tools[counter] = t; // ? переделать, если будет возможность удаления элементов
            counter++;
        }
        else
            System.out.println("мест нет, ящик не резиновый");
    }

    //я хочу предоставить метод перебора всех инструментов в ящике, но заранее не знаю, что с ними будут делать

    //мы будем перебирать инструменты только в присутствии того, кто умеет с ними работать
    //"я знаю, что ты знаешь"
    public void useAllTools(IToolUser user){
        System.out.println(user + " получил доступ к "+counter+" инструментов");
        for (Tool t: this.tools)
            user.useTool(t);
    }
}
