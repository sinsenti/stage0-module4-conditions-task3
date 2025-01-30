package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        if (month >= 1 && month <= 12) {
            if(month==12 || month<=2)
            {
                System.out.println("Winter");
            }
            if(month>2 && month<=5)
            {
                System.out.println("Spring");
            }
            if(month>5 && month<=8)
            {
                System.out.println("Summer");
            }
            if(month>8 && month<=11){
                System.out.println("Autumn");
            }

        } else {
            System.out.println("wrong number!");
        }

    }
}
