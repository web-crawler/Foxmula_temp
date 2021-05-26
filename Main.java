class Time{
    private int hour, min, sec;
    Time(int h, int m, int s){
        hour=h;
        min=m;
        sec=s;
    }
    Time(){
        hour=0; min=0; sec=0;
    }
    Time add(Time t1){
        Time t=new Time();
        t.sec=this.sec+t1.sec;
        if(t.sec>60){
            t.sec=t.sec-60;
            t.min++;
        }
        t.min = t.min+t1.min;
        if(t1.min>60){
            t.min= t.min-60;
            t.hour++;
        }
        if(t.hour>24){
            t.hour=t.hour-24;
        }
        return t;
    }
    void display(String str){
        System.out.println(str+" "+hour+":"+min+":"+sec);
    }
public class Main{    
    public static void main(String[] args){
    Time ta=new Time(5,23,12);
    Time tb=new Time(6,38,50);
    Time tc=ta.add(tb);
    ta.display("Time 1: ");
    tb.display("Time 2: ");
    tc.display("Time after addition");
    }
}
}
