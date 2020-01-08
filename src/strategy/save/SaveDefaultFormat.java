package strategy.save;

public class SaveDefaultFormat implements ISave{
    @Override
    public void save() {
        System.out.println("Default format to save");
    }
}
