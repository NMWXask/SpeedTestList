package network_technologies.ListSpeed.SpeedTest;

import java.util.List;

public interface ListMethods {
    List<String> getListOfRandomNames (int sizeOfList);
    void changeRandomElementInList ();
    void getFirstFivePercentNamesOfList ();
    void getLastFivePercentNamesOfList ();
    void removeFirstFivePercentOfList ();
    void removeLastFivePercentOfList ();
    void findNameInListAndPrintToConsole ();
    void removeNameInList ();
    List<Long> checkOfSpeedStart();

}
