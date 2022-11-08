package Shop;

public class Computer {
    private int vcardClass;
    private double frequency;
    private int RAM;
    private int HDD;

    public Computer(int vcardClass, double frequency, int RAM, int HDD) {
        this.vcardClass = vcardClass;
        this.frequency = frequency;
        this.RAM = RAM;
        this.HDD = HDD;
    }

    public int getVcardClass() {
        return vcardClass;
    }

    public void setVcardClass(int vcardClass) {
        this.vcardClass = vcardClass;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "vcardClass=" + vcardClass +
                ", frequency=" + frequency +
                ", RAM=" + RAM +
                ", HDD=" + HDD +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Computer comp = (Computer) obj;
        return this.vcardClass == comp.vcardClass && this.frequency == comp.frequency &&
                this.RAM == comp.RAM && this.HDD == comp.HDD;
    }
}
