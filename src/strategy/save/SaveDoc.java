package strategy.save;

public class SaveDoc  implements ISave{
    @Override
    public void save() {
        System.out.println("Enregistrer doc");
    }
}
