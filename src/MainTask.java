import java.util.Scanner;

public class MainTask {

        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            //Task 1
            System.out.println("Your name, please!");
            String name = scanner.next();
            System.out.println("Hello "+name+"!");

            // Task 2
            char[] nameReverse = name.toCharArray();
            System.out.println("Your reverse name: ");
            for(int i=nameReverse.length-1; i>=0;i--){
                System.out.print(nameReverse[i]);
            }
            System.out.println();


            // Task 3
            System.out.println("Enter five numbers:");
            int numbers [] = new int[5];
            for (int i=0; i<numbers.length; i++){
                numbers[i]=scanner.nextInt();
            }
            System.out.print("Numbers in one line: ");
            for (int number : numbers ){
                System.out.print(number);
            }
            System.out.println();
            System.out.println("Numbers in one column");
            for (int number : numbers ){
                System.out.println(number);
            }

            // Task 4
            int sum=0;
            int multi=1;
            for (int number :numbers){
                sum+=number;
                multi*=number;
            }
            System.out.println("Sum = "+sum);
            System.out.println("Multiplication = "+multi);


            //Task 5
            System.out.println("Enter the number of a month (1-12)");
            int month;
            if(scanner.hasNextInt()){
                month = scanner.nextInt();
                if (month<1){
                    System.out.println("Wrong number, try again.");
                }else if(month <13){
                    switch (month){
                        case(1): System.out.println("January"); break;
                        case(2): System.out.println("February"); break;
                        case(3): System.out.println("March"); break;
                        case(4): System.out.println("April"); break;
                        case(5): System.out.println("May"); break;
                        case(6): System.out.println("June"); break;
                        case(7): System.out.println("July"); break;
                        case(8): System.out.println("August"); break;
                        case(9): System.out.println("September"); break;
                        case(10): System.out.println("October"); break;
                        case(11): System.out.println("November"); break;
                        case(12): System.out.println("December"); break;
                    }
                }else{
                    System.out.println("Wrong number, try again.");
                }
            }else{
                System.out.println("Wrong number, try again.");
            }


            scanner.close();
        }
}


