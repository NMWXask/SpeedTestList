package network_technologies.ListSpeed.SpeedTest;

import network_technologies.ListSpeed.SpeedTest.ListMethods;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SpeedMeterArrayList implements ListMethods {

    final static Random random = new Random();

    List <String> listOfRandomNames;

    ArrayList<Long> ListOfNanoTimes = new ArrayList<>();

    public SpeedMeterArrayList (int sizeOfList){
        this.listOfRandomNames = getListOfRandomNames(sizeOfList);
    }

    public List<String> getListOfRandomNames (int sizeOfList) {

        long startOfMethodWork = System.nanoTime();

        String[] arrayOfNames = {"Андрей", "Ирина", "Полина", "Татьяна", "Сергей", "Екатерина",
                "Марина", "Николай", "Артем", "Иван", "Павел", "Елена", "Семен", "Роман", "Наталья",
                "Антон", "Александр", "Алексей", "Игорь", "Олеся"};

        List <String> listOfRandomNames = new ArrayList<>();

        for (int i = 0; i < sizeOfList; i++) {
            listOfRandomNames.add(arrayOfNames[random.nextInt(0, arrayOfNames.length- 1)]);
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);

        return listOfRandomNames;
    }

    public void changeRandomElementInList () {

        long startOfMethodWork = System.nanoTime();

        String inputName = "jack";

        listOfRandomNames.set (random.nextInt(0,listOfRandomNames.size() - 1), inputName);

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);

    }

    public void getFirstFivePercentNamesOfList () {

        long startOfMethodWork = System.nanoTime();

        for (int i = 0; i < listOfRandomNames.size() * 0.05; i++) {
            listOfRandomNames.get(i);
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }

    public void getLastFivePercentNamesOfList () {
        long startOfMethodWork = System.nanoTime();

        for (int i = listOfRandomNames.size() - 1; i < listOfRandomNames.size() * 0.95; i++) {
            listOfRandomNames.get(i);
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }

    public void removeFirstFivePercentOfList () {
        long startOfMethodWork = System.nanoTime();

        for (int i = 0; i < listOfRandomNames.size() * 0.05; i++) {
            listOfRandomNames.remove(i);
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }

    public void removeLastFivePercentOfList () {
        long startOfMethodWork = System.nanoTime();

        for (int i = listOfRandomNames.size() - 1; i < listOfRandomNames.size() * 0.95; i--) {
            listOfRandomNames.remove(i);
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }

    public void findNameInListAndPrintToConsole () {
        long startOfMethodWork = System.nanoTime();

        String nameForSearch = "jack";

        for (int i = 0; i < listOfRandomNames.size(); i++) {
            if (listOfRandomNames.get(i).equals(nameForSearch)) {
                System.out.println("Искомое имя :" + nameForSearch + " найдено.");
            }
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }

    public void removeNameInList () {
        long startOfMethodWork = System.nanoTime();

        String nameForRemove = "jack";

        for (int i = 0; i < listOfRandomNames.size(); i++) {
            if (listOfRandomNames.get(i).equals(nameForRemove)) {
                listOfRandomNames.remove(nameForRemove);
            }
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }

    public List<Long>  checkOfSpeedStart() {

        for (int i = 0; i < 3; i++) {

        changeRandomElementInList();
        getFirstFivePercentNamesOfList();
        getLastFivePercentNamesOfList();
        removeFirstFivePercentOfList();
        removeLastFivePercentOfList();
        findNameInListAndPrintToConsole();
        removeNameInList();
        System.out.println();
        }
        return ListOfNanoTimes;
    }
}
