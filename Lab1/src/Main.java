
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int i = 0;
        int j;
        int k = 0;
        System.out.println(i);
        float x = 3.211111111111111111111111111f;
        double y = 3.222222222222222222222222222222d;
        System.out.println(x);
        System.out.println(y);

        x = (float) y;
        Double z1 = 2.2d;
        double z2 = 2.2d;
        System.out.println(Double.valueOf(z2));

        int month_days[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String months[] = {"January", "February", "March", "April", "May", "June", "July",
                "August", "September", "October", "November", "December"};
        String shortmonths[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul",
                "Aug", "Sep", "Oct", "Nov", "Dec"};
        for (j = 0; j < months.length; j++) {
            System.out.println("Luna " + months[j] + " are " + month_days[j] + " de zile");
        }
        System.out.println("Luni cu 31 de zile:");
        for(j = 0;j < months.length; j++)
        {
            if(month_days[j]==31)
                System.out.println(months[j]);
        }
        System.out.println("Luni cu mai putin de 31 de zile si numarul lor de zile: ");
        for( j = 0; j < months.length; j++)
        {
            if(month_days[j]!=31)
                System.out.println(months[j] +" "+ month_days[j]);
        }
        for(j = 0;j < months.length; j++)
        {
            if(month_days[j]!=31)
                k+=month_days[j];

        }
        System.out.println(k + " zile");
        for(j = 0;j < shortmonths.length; j++)
        {
            System.out.println("Luna " + shortmonths[j] + " are " + month_days[j] + " de zile");
        }
    }
}