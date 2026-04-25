import java.util.Objects;

public class Tool {
    String name;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tool tool = (Tool) o;
        return Objects.equals(name, tool.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public Tool(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Tool{" +
                "name='" + name + '\'' +
                '}';
    }
}
