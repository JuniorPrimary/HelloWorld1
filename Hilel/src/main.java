//public class main {
//    public static void main(String[] args) {
//        int i = 1;
//
//        switch (i) {
//            case 1: {
//                i++;
//                break;
//            }
//            case 2: {
//                i++;
//                break;
//            }
//            default: {
//                System.out.println("клнец");
//            }
//        }
//        System.out.println(i);
//    }
//}
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Ввести оценку в 12-бальной шкале: ");
//
//
//        if (scanner.hasNextDouble()) {
//          int a = (int) scanner.nextDouble();
//
//           int result = switch (a){
//                case 4,5,6 -> 3;
//                case 7,8,9 -> 4;
//
//
//                default -> -1;
//           };
//            System.out.println("Ваша оценка " + result);
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Ввести оценку в 12-бальной шкале: ");
//
//        double a;
//        if (scanner.hasNextDouble()) {
//            a = scanner.nextDouble();
//
//            switch ((int) a){
//                case 4:
//                case 5:
//                case 6:{
//                    System.out.println("это 3");
//                    break;
//                }
//                default:{
//                    System.out.println("неправльный ввод");
//                }
//            }
//            if (a == 4 || a == 5 || a == 6) {
//                System.out.println("это 3");
//
//            }
//            if (a == 7 || a == 8 || a == 9) {
//                System.out.println("это 4");
//
//            }
//            if (a == 10 || a == 11 || a == 12) {
//                System.out.println("это 5");
//
//            }else {
//                System.out.println("Неправильная оценка");
//            }
//public class main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//
//        System.out.print("Ввести кол-во подходов ");
//
//        if (scanner.hasNextDouble()) {
//            int train = (int) scanner.nextDouble();
//            int count = 0;
//            int timer = 0;
//            int countTime = 5;
//            for (int i = 1; i <= train; i++) {
//                count+=i;
//                do {
//                    timer += countTime;
//                }
//                while (timer > 60);
//
//            }
//            System.out.println("кол-во повторений " + count);
//            System.out.println("время " + timer);
//        }
//    }
//}
//            do {
//                train ++;
//                 int i = time + 5;
//
//                System.out.println("кол-во подтягиваний" + train);
//            } while (time > 60);
//            System.out.println("end");
//
//        }
//    }
//}
//public class main {
//    public static void main(String[] args) {
//
//
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("задайте диапазон массива до ");
//
//        if (scanner.hasNextDouble()) {
//
//            int diaTo = (int) scanner.nextDouble();
//            int[] tabelTo = new int[diaTo];
//
//            int a = 50;
//            int b = -50;
//            int range = a - b + 1;
//            int min = -51;
//            int max = 51;
//            int sum = 0;
//            int avg = 0;
//
//            for (int i = 0; i < tabelTo.length; i++) {
//                tabelTo[i] = (int) (Math.random() * range) + b;
//                sum +=tabelTo[i];
//                avg = (sum%tabelTo.length);
//
//                if (tabelTo[i] > min)
//               {
//                  max = tabelTo[i];
//
//               }
//                if (tabelTo[i]< max)
//                {
//                    min = tabelTo[i];
//
//                }
//
//
//            }
//            System.out.println("сумма всех " + sum );
//            System.out.println("среднее " + avg );
//            System.out.println("минимальное значение " + min );
//            System.out.println("максимальное значение " + max );
//
//    }
//}}

//урок 6
//public class main{
//    public static void main(String[] args) {
//
//        Scanner scanner = new Scanner(System.in);
//        int a = getFromConsole(scanner);
//        int b = getFromConsole(scanner);
//        char c = getOperation(scanner);
//
//
//
//
//        System.out.println(plus(a,b,c));
//    }
//
//    public static String plus(int a, int b, char c) {
//
//        int result = 0;
//
//        switch (c){
//            case '+':
//                result = a+b;
//                break;
//            case '-':
//                result = a-b;
//                break;
//            case '*':
//                result = a*b;
//                break;
//            case '/':
//                result = a/b;
//                break;
//            default:
//                System.out.println("Операция не распознана. Повторите ввод.");
//            }
//        return ("Результат " + result);
//
//    };
//
//    public static int getFromConsole(Scanner scanner) {
//        do {
//            System.out.print("Ввести целое число ");
//            if (scanner.hasNextInt()) {
//                return scanner.nextInt();
//            } else{
//        }
//    } while(true);
//};
//    public static char getOperation(Scanner scanner) {
//        do {
//            System.out.print("Введите операцию ");
//            if (scanner.hasNext()) {
//                return scanner.next().charAt(0);
//            } else{
//            }
//        } while(true);
//    };
//    }

//    public static void main(String[] args) {
////        int a = 1;
////        method(a);
//
//
//        customInteger i = new customInteger();
//
//        i.setI(1);
//        method(i);
//        System.out.println(i.getI());
//    }
//    public static void method (customInteger i) {
//
//        i.setI(2);
//        System.out.println(i.getI());
//
//        }};

//урок 7
//public class main {
//    public static void main(String[] args) {
////        int array = fibbonace(10);
//
//        System.out.println(Arrays.toString(fibbonace(10)));
//    }
//    public static int[] fibbonace(int p)
//    {
//        int[]result = new int[p];
//        result[0]=0;
//        result[1]=1;
//        for (int i = 2; i < result.length; i ++)
//        {
//            result [i] = result[i-1] + result[i-2];
//        }
//            return result;
//
//    }
//}
//урок 8
public class main {
    public static void main(String[]args){

        singleton warehouse = singleton.getInstance();
        warehouse.addSize(100);
        System.out.println(warehouse.getSize());
//        Student student = new Student("Valera", 1 );
        //        Student student = new Student();

//        for (int i = 0; i > 5; i++)
//        {
//            int len = (int) Math.random();
//            int lon = (int) Math.random();
//            int height = (int) Math.random();
//        }

        int a = 1; // Начальное значение диапазона - "от"
        int b = 10; // Конечное значение диапазона - "до"



        Volume volume = new Volume();//создаем бокс1
        Volume volume2 = new Volume();//бокс 2
        //box1
        volume.setLen(a + (int) (Math.random() * b));
        volume.setLon(a + (int) (Math.random() * b));
        volume.setHeight(a + (int) (Math.random() * b));
        //box2
        volume2.setLen(a + (int) (Math.random() * b));
        volume2.setLon(a + (int) (Math.random() * b));
        volume2.setHeight(a + (int) (Math.random() * b));


        System.out.println(volume.getVolume());
        System.out.println(volume2.getVolume());



//        System.out.println(student.getStudentId());
//        System.out.println(student.getName().trim());
//        System.out.println(student.getMarks().length);
    }
}
