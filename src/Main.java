public class Main {
    public static void main(String[] args) {
        int age = 18;
        if (age >= 18) {
            System.out.println("конгратюлейшн с 18 летием!");
        }
        if (age < 18) {
            System.out.println("ути-пути, кто у нас тут такой малыш?");
        }
        //задание 2
        int age2 = 20;
        if (age2 >= 7 && age2 < 18) {
            System.out.println("ребёнок ходит в школу");
        }
        if (age2 >= 18 && age2 < 24) {
            System.out.println("Школа окончена пора и в универ");
        }
        if (age2 >= 24) {
            System.out.println("Опять за работу?!");
        }
        // задание 3
        int totalMest = 102;
        int sidMest = 60;
        int stMest = totalMest - sidMest;
        int edetSt = 60;
        int edetSid = 66;
        if (edetSt < stMest) {
            System.out.println("осталось " + (stMest - edetSt) + " свободных мест");
        }
        if (edetSid < stMest) {
            System.out.println("осталось " + (sidMest - edetSid) + " свободных мест");
        }
        if (edetSt > stMest) {
            System.out.println("свободных мест для проезда стоя нет");
        }
        if (edetSid > stMest) {
            System.out.println("чвободных мест для проезда сидя нет");
        }


        // задание 4
        int age5 = 17;
        if (age5 >= 18) {
            System.out.println("конгратюлейшн с 18 летием!");
        } else {
            System.out.println("ути-пути, кто у нас тут такой малыш?");
        }
        // задание 5
        int age3 = 20;
        if (age3 >= 7 && age3 < 18) {
            System.out.println("ребёнок ходит в школу");
        }
        else if (age3 >= 18 && age3 < 24) {
            System.out.println("Школа окончена пора и в универ");
        }
        else if (age3 >= 24) {
            System.out.println("Опять за работу?!");
        }
        // задание 6
        int totalMest2 = 102;
        int sidMest2 = 60;
        int stMest2 = totalMest2 - sidMest2;
        int edetSt2 = 60;
        int edetSid2 = 40;
        if (edetSt2 < stMest2) {
            System.out.println("осталось " + (stMest2 - edetSt2) + " свободных мест для проезда сидя");
        }
        else if (edetSid2 < stMest2) {
            System.out.println("осталось " + (sidMest2 - edetSid2) + " свободных мест для проезда стоя");
        }
        else if (edetSt2 > stMest2) {
            System.out.println("свободных мест для проезда стоя нет");
        }
        else if (edetSid2 > stMest2) {
            System.out.println("чвободных мест для проезда сидя нет");
        }
        // задание 7
        int vozrast = 16;
        if (vozrast >= 2 && vozrast <=6) {
            System.out.println("Если возраст человека равен " + vozrast + " , то ему нужно ходить в сад");
        }
        else if (vozrast > 7 && vozrast <=18) {
            System.out.println("Если возраст человека равен " + vozrast + " , то ему нужно ходить в школу");
        }
        else if (vozrast > 19 && vozrast <=24) {
            System.out.println("Если возраст человека равен " + vozrast + " , то ему нужно ходить в университет");
        }
        else if (vozrast > 24) {
            System.out.println("Если возраст человека равен " + vozrast + " , то ему нужно ходить на работу");
        }
        // задание 8
        int age7 = 18;
        boolean netVeselya = age7 <= 5;
        if (netVeselya) {
            System.out.println("Нельзя кататься на аттракционе");
        }
        boolean netVeselya2 = age7 > 5 && age7 <=14;
        if (netVeselya2) {
            System.out.println("Кататься на аттракционе можно в сопровождении взрослого");
        }
        boolean netVeselya3 = age7 > 14;
        if (netVeselya3) {
            System.out.println("Кататьсяя на аттракционе можно одному");
        }
        // задание 9
        int one = 10;
        int two = 100;
        int free = 3;
        if (one > two && one >free) {
            System.out.println(one + " самое больщое число");
        }
        else if (two > one && two > free) {
            System.out.println( two + " самое большое число");
        }
        else if (free > one &&  free > two) {
            System.out.println( free + " самое большое число");
        }

    }
}