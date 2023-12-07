package network_technologies.ListSpeed.SpeedTest;


import java.util.*;

public class SpeedMeterArrayDeque {

    final static Random random = new Random();

    Deque <Object> listOfRandomNames;

    ArrayList<Long> ListOfNanoTimes = new ArrayList<>();

    public SpeedMeterArrayDeque(int sizeOfList) {
        this.listOfRandomNames = getListOfRandomNames(sizeOfList);
    }

    public Deque<Object> getListOfRandomNames(int sizeOfList) {
        long startOfMethodWork = System.nanoTime();

        String[] arrayOfNames = {"Андрей", "Ирина", "Полина", "Татьяна", "Сергей", "Екатерина",
                "Марина", "Николай", "Артем", "Иван", "Павел", "Елена", "Семен", "Роман", "Наталья",
                "Антон", "Александр", "Алексей", "Игорь", "Олеся"};

        listOfRandomNames = new ArrayDeque<>();

        for (int i = 0; i < sizeOfList; i++) {
            listOfRandomNames.add(arrayOfNames[random.nextInt(0,arrayOfNames.length - 1)]);
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);

        return  listOfRandomNames;
    }


    public void changeRandomElementInList() {
        long startOfMethodWork = System.nanoTime();

        String inputName = "jack";

        listOfRandomNames.add(inputName);

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);

    }


    public void getFirstFivePercentNamesOfList() {
        long startOfMethodWork = System.nanoTime();

        for (int i = 0; i < listOfRandomNames.size() * 0.05; i++) {
            listOfRandomNames.getFirst();
        }
        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }


    public void getLastFivePercentNamesOfList() {
        long startOfMethodWork = System.nanoTime();

        for (int i = listOfRandomNames.size() - 1; i < listOfRandomNames.size() * 0.95; i--) {
            listOfRandomNames.getFirst();
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }


    public void removeFirstFivePercentOfList() {
        long startOfMethodWork = System.nanoTime();

        for (int i = 0; i < listOfRandomNames.size() * 0.05; i++) {
            listOfRandomNames.remove(i);
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }


    public void removeLastFivePercentOfList() {
        long startOfMethodWork = System.nanoTime();

        for (int i = listOfRandomNames.size() - 1; i < listOfRandomNames.size() * 0.95; i--) {
            listOfRandomNames.remove(i);
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }


    public void findNameInListAndPrintToConsole() {
        long startOfMethodWork = System.nanoTime();

        String inputName = "jack";

        for (Object element : listOfRandomNames) {
            if (element.equals(inputName)){
                ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
                System.out.println("Искомое имя "+ inputName+ " найдено.");
            }
        }

    }


    public void removeNameInList() {
        long startOfMethodWork = System.nanoTime();

        String nameForRemove = "jack";

        for (Object element : listOfRandomNames) {
            if (element.equals(nameForRemove)){
                listOfRandomNames.remove(nameForRemove);
            }
        }

        ListOfNanoTimes.add(System.nanoTime() - startOfMethodWork);
    }


    public List<Long> checkOfSpeedStart() {

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
