package Task2;

//Задание 4.2
public enum clothSize {
    XXS(32),
    XS(34),
    S(36){
        public String getDescription(){
            return "Детский размер";
        }
    },
    M(38),
    L(40);
    private final int euroSize;
    private clothSize(int euroSize){
        this.euroSize = euroSize;
    }
    public int euroSize(){
        return this.euroSize;
    }
    public String getDescription(){
        return "Взрослый размер";
    }

    public static void allSize() {
        for (clothSize s : clothSize.values()){
            System.out.println(s);
        }
    }
}