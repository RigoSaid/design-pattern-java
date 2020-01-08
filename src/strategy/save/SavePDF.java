package strategy.save;

public class SavePDF implements ISave {
    @Override
    public void save() {
        System.out.println("Enregistrer PDF");
    }
}
