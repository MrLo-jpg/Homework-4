public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 10; i >= (-10); i--) {
            System.out.println(i);
        }
        System.out.println();

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }
        System.out.println();

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);}
            System.out.println();

            for (int b = 1; b <= 512; b = b * 2) {
                System.out.println(b);
            }
            System.out.println();

            int contribution = 29000;
            int saving = 0;
            for (int a = 1; a <= 12; a = a + 1) {
                saving = saving + contribution;
                System.out.println("Месяц " + a + " сумма накоплений" +
                        " равна " + saving + "рублей");
            }
            System.out.println();

            contribution = 29000;
            saving = 0;
            for (int a = 1; a <= 12; a = a + 1) {
                contribution = contribution + contribution / 100;
                saving = saving + contribution;
                System.out.println("Месяц " + a + " сумма накоплений" +
                        " равна " + saving + " рублей");
            }
            System.out.println();

            int v =0;
            for (int a=1; a<=10; a++){ v=a*2;
                System.out.println(" 2*" + a + "=" + v);}

    }
}




