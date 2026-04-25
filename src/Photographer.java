public class Photographer implements IToolUser{
    String fio;

    public Photographer(String fio) {
        this.fio = fio;
    }

    @Override
    public void useTool(Tool t) {
        System.out.println(fio+" фотографирует "+t+" на предметном столике");
    }
}
