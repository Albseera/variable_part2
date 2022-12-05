public class Main {
    public static void main(String[] args) {
        System.out.println("Задание №1");
        int number =7;
        byte recive =56;
        short valume=200;
        long data=2500;
        float temp= 36.6F;
        double way=500.6;
        System.out.println("Значение переменной number с типом int равно "+number);
        System.out.println("Значение переменной recive с типом byte равно "+recive);
        System.out.println("Значение переменной valume с типом short равно "+valume);
        System.out.println("Значение переменной data с типом long равно "+data);
        System.out.println("Значение переменной temp с типом float равно "+temp);
        System.out.println("Значение переменной way с типом double равно "+way);

        System.out.println("Задание №2");
        float temperature= 27.12F;
        long curs=987678965549L;
        double rider=2.786;
        boolean status=false;
        char single=569;
        short num=-159;
        int posit=27897;
        byte chars=67;

        System.out.println("Задание №3");

        int ludmilaPavlova=23;
        int annaSergeevna=27;
        int ekaterinaAndreevna=30;
        int totalSheet=480;
        int totalStudent=ludmilaPavlova+annaSergeevna+ekaterinaAndreevna;
        int studentSheet=totalSheet/totalStudent;
        System.out.println("На каждого ученика рассчитано "+studentSheet+" листов бумаги.");

        System.out.println("Задание №4");

        int  prodPerMinute=16/2;

        int prodPer20min=prodPerMinute*20;
        int prodPerDay=prodPerMinute*1440;
        int prodPer3Day=prodPerMinute*1440*3;
        int prodPerMonth=prodPerMinute*1440*30;

        System.out.println("За  20 минут машина произвела бутылок "+prodPer20min+" штук ");
        System.out.println("За  сутки машина произвела бутылок "+prodPerDay+" штук ");
        System.out.println("За  3 дня машина произвела бутылок "+prodPer3Day+" штук ");
        System.out.println("За  месяц машина произвела бутылок "+prodPerMonth+" штук ");

        System.out.println("Задание №5");

        int TotalPaint=120;
        int classPaint=2+4;
        int countClass=TotalPaint/classPaint;
        int whitePaint=countClass*2;
        int brownPaint=countClass*4;
        System.out.println("В школе, где  "+countClass+" классов, нужно "+whitePaint+" банок белой краски и "+brownPaint+" банок коричневой краски");

        System.out.println("Задание №6");

        int weightBanan=5*80;
        int weightMilk=(200*105)/100;
        int weightCream=2+100;
        int weightEgg=4*70;
        int totalWeight=weightBanan+weightMilk+weightCream+weightEgg;
        float totalWeightKg=totalWeight/1000F;
        System.out.println("Вес спорт-завтрака составил "+totalWeightKg+ " кг");

        System.out.println("Задание №7");

        float dumpPerDay1= 250/1000F;
        float dumpPerDay2=500/1000F;


        int countDay1= (int) (7/dumpPerDay1);
        int countDay2= (int) (7/dumpPerDay2);
        int countMidlDay= (countDay1+countDay2)/2;

        System.out.println("При режиме 250 спортсмену потребуется " +countDay1+ " дней  на похудение");
        System.out.println("При режиме 500 спортсмену потребуется " +countDay2+ " дней  на похудение");
        System.out.println("В среднем спортсмену потребуется " +countMidlDay+ " дней  на похудение");

        System.out.println("Задание №8");

        int incomeMashaPerMonth=67760;
        int incomeDenisPerMonth=83690;
        int incomeKrestinaPerMonth=76230;

        int incomeMashaPerYear=67760*12;
        int incomeDenisPerYear=83690*12;
        int incomeKrestinaPerYear=76230*12;


        float riseMashaPerMonth=67760+(67760*0.1F);
        float riseDenisPerMonth=83690+(83690*0.1F);
        float riseKrestinaPerMonth=76230+(76230*0.1F);

        float riseMashaPerYear=riseMashaPerMonth*12;
        float riseDenisPerYear=riseDenisPerMonth*12;
        float riseKrestinaPerYear=riseKrestinaPerMonth*12;

        float deltaMashaPerYear=riseMashaPerYear-incomeMashaPerYear;
        float deltaDenisPerYear=riseDenisPerYear-incomeDenisPerYear;
        float deltaKrestinaPerYear=riseKrestinaPerYear-incomeKrestinaPerYear;

        System.out.println("Маша теперь получает "+riseMashaPerMonth +" рублей. Годовой доход вырос на рублей "+deltaMashaPerYear);
        System.out.println("Денис теперь получает "+riseDenisPerMonth +" рублей. Годовой доход вырос на рублей "+deltaDenisPerYear);
        System.out.println("Крестина теперь получает "+riseKrestinaPerMonth +" рублей. Годовой доход вырос на рублей "+deltaKrestinaPerYear);


    }
}