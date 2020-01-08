package strategy;

import strategy.save.ISave;
import strategy.save.SaveDefaultFormat;

public class ContextWord {
    private ISave strategySave;
    public ContextWord () {
        this.strategySave = new SaveDefaultFormat();
    }

    public void setStrategySave(ISave strategySave) {
        this.strategySave = strategySave;
    }
    public void doSave() {
        System.out.println("Start save .....");
        this.strategySave.save();
        System.out.printf("End save .....");
    }
}
