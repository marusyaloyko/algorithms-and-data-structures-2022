package Task78;

public class BookShelf {
    int Amount;
    Book[]Arr;

    BookShelf(int Amount)
    {
        this.Amount = Amount;
        this.Arr=new Book[Amount];
    }

    BookShelf(){}

    public int getAmount()
    {
        return this.Amount;
    }

    public Book[] getShelf()
    {
        return this.Arr;
    }
    public int getFirstYear()
    {
        for(int i=0;;){
            for(int j=1;;){
                if(Arr[i].getYear()>Arr[j].getYear())
                {
                    i=j;
                    if(j==Amount-1){
                        return Arr[i].getYear();
                    }
                }else{
                    if(j==Amount-1){
                        return Arr[i].getYear();
                    }
                    j++;
                }
            }
        }
    }
    public int getLastYear()
    {
        for(int i=0;;){
            for(int j=1;;){
                if(Arr[i].getYear()<Arr[j].getYear())
                {
                    i=j;
                    if(j==Amount-1){
                        return Arr[i].getYear();
                    }
                }else{
                    if(j==Amount-1){
                        return Arr[i].getYear();
                    }
                    j++;
                }
            }
        }
    }

    public void sort()
    {
        for(int i=0;i<Amount-1;){
            for(int j=1;j<Amount;){
                if(Arr[i].getYear()>Arr[j].getYear())
                {
                    Book c=Arr[j];
                    Arr[j]=Arr[i];
                    Arr[i]=c;
                }else{
                    j++;
                }
            }
            i++;
        }
    }

    public void setAmount(int Amount)
    {
        this.Amount=Amount;
    }
    public void setShelf(Book B,int Number)
    {
        this.Arr[Number]=B;
    }

    public String toString()
    {
        for(int k=0;k<this.Amount;k++){
            System.out.println(Arr[k]+"\n");
        }
        return "";
    }
}