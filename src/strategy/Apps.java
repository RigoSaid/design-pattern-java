package strategy;

import strategy.save.ISave;

import java.util.Scanner;

public class Apps {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ContextWord contextWord = new ContextWord();
        boolean fin = false;
        Scanner scanner = new Scanner(System.in);
        String strategy;

        while (!fin) {
            System.out.printf("Set your strategy to save docs (SaveDocx, SavePDF or SaveDoc) => ");
            strategy = scanner.nextLine();
            if (strategy!= null && !strategy.equals("") && strategy.isEmpty()) {
                ISave strategyOfSave = (ISave) Class.forName(strategy).newInstance();
                contextWord.setStrategySave(strategyOfSave);
            }
            contextWord.doSave();
        }

    }
}
