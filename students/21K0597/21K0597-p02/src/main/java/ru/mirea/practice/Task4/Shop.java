package ru.mirea.practice.Task4;

import java.util.ArrayList;
import java.util.List;

public class Shop {

    private final List<Computer> computers;
    private int computersCount;

    public Shop() {
        computersCount = 0;
        this.computers = new ArrayList<Computer>();
    }

    public void addComputer(Computer computer) {
        computersCount++;
        computers.add(computer);
    }

    public String search(String videoCard, String motherBoard, String memory, String cpu) {
        for (int i = 0; i < computers.size(); i++) {
            if (videoCard == computers.get(i).getVideoCard() && motherBoard == computers.get(i).getMotherBoard() &&
                    memory == computers.get(i).getMemory() && cpu == computers.get(i).getCpu()) {
                return "There is such a computer in the shop\n";
            }
        }
        return "There is no such computer in the store \n";
    }

    public void deleteComputer(int computerNumber) {
        computers.remove(computerNumber);
    }
}
