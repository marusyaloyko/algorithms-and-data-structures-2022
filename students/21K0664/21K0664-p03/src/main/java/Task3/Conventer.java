package Task3;

public class Conventer{
        private double dollars;
        private double euros;
        private double rubles;

        Conventer(double dollars,double euros,double rubles){
        this.dollars=dollars;
        this.euros=euros;
        this.rubles=rubles;
        }

        public void setRubles(double rubles){
        this.rubles=rubles;
        }

        public double getDollars(){
        return dollars;
        }

        public double getEuros(){
        return euros;
        }

        public double getRubles(){
        return rubles;
        }

        public void setDollars(double dollars){
        this.dollars=dollars;
        }

        public void setEuros(double euros){
        this.euros=euros;
        }
        public String CConventer(){
        return"";
        }
        public String toString(){
        return"dollars="+dollars+"thisdollarsinrublesare"+dollars*60+"thisdollarsineurosare"+dollars*0.9+

        "\n\neuros="+euros+"thiseurosinrublesare"+euros*70+"thiseurosindollarsare"+euros*1.1+

        "\n\nrubles="+rubles+"thisrublesindollarsare"+rubles/60+"thisrublesineurosare"+rubles/70
        ;
        }


        }
