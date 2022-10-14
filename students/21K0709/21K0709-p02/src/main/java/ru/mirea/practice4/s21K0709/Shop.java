package ru.mirea.practice4.s21K0709;
import java.util.*;
public class Shop
{
    private ArrayList<String> computers = new ArrayList<String>();

    public void setComputers(ArrayList<String> computers) {
        this.computers = computers;
    }

    public ArrayList<String> getComputers() {
        return computers;
    }
    public String SearchComp(Shop c1, String namecomp)
    {

        for (String name: c1.getComputers())
        {
            if (name.equals(namecomp))
            {
                return name + " - найден в списке";
            }
        }
        return "Нет в наличии";
    }
    public void DeleteComp(Shop c1, int index)
    {
        Iterator<String> iter = c1.getComputers().iterator();
        int j = 0;
        while(iter.hasNext())
        {
            iter.next();
            if(j==index) {
                iter.remove();
            }
            j++;
        }
    }
    public void AddComp(Shop c1, String namecomp){
        c1.getComputers().add(namecomp);
    }
}
