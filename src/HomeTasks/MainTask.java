package HomeTasks;

import java.util.Scanner;

/**
 * Created by Alien on 05-Oct-15.
 */
public class MainTask {
    public MainTask() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  /*A simple text scanner which can parse primitive types and strings using
        * regular expressions.*/
        while(true) {  /* что бы зациклить приложение*/
            System.out.println("Enter a home task number: ");
            System.out.println("1. Factorial Executer");
            System.out.println("2. Near To 10 Executer");
            System.out.println("3. Discriminant Executer");
            System.out.println("4. Sum Characters");
            System.out.println("5. Winner Tickets");
            System.out.println("6. Echo Arrays");
            System.out.println("7. Sort Array");
            System.out.println("8. First Higher Element");
            System.out.println("9. Random Digits Array");
            System.out.println("10. Alphabetic Array Sorting");
            System.out.println("11. Compare Collections Executer");
            System.out.println("12. Collection Performance");

            if (sc.hasNextInt()) {
                int homeTaskNumber = sc.nextInt();
            /*if(homeTaskNumber == 1){
                StartFactorialNumberHomeTask(sc);
            }
            if(homeTaskNumber == 2){

            }
            if(homeTaskNumber == 3){

            }
            if(homeTaskNumber == 4){

            }*/
                switch (homeTaskNumber) {
                    case 1:
                        StartFactorialNumberHomeTask(sc);
                        break;
                    case 2:
                        StartNearTo10ExecuterHomeTask(sc);
                        break;
                    case 3:
                        StartDiscriminantExecuterHomeTask(sc);
                        break;
                    case 4:
                        StartSumCharactersExecuterHomeTask(sc);
                        break;
                    case 5:
                        int result = 0;
                        TicketsExecuter executer = new TicketsExecuter();
                        System.out.println(executer.getResult());
                        break;
                    case 6:
                        EchoArrayExecuter executer1 = new EchoArrayExecuter();
                        System.out.println(executer1.getResult());
                        break;
                    case 7:
                        ArraySortingExecuter executer2 = new ArraySortingExecuter();
                        System.out.println(executer2.getResult());
                        break;
                    case 8:
                        FirstHigherElementInArrayExecuter executer3 = new FirstHigherElementInArrayExecuter();
                        System.out.println(executer3.getResult());
                        break;
                    case 9:
                        System.out.println("Result for random array : ");
                        RandomDigitsArrayExecuter executer4 = new RandomDigitsArrayExecuter();
                        System.out.println(executer4.getResult());

                        System.out.println("Result for predefined array : ");
                        int[] predefinedArrayVariable = new int[] {6, 10, 20, 31};
                        executer4 = new RandomDigitsArrayExecuter(predefinedArrayVariable);
                        System.out.println(executer4.getResult());
                        break;
                    case 10:
                        ArrayAlphabeticSortingExecuter executer5 = new ArrayAlphabeticSortingExecuter();
                        System.out.println(executer5.getResult());
                        break;
                    default:
                        System.out.print("There is no any task with such number.");
                        break;
                    case 11:
                        CompareCollectionsExecuter executer6 = new CompareCollectionsExecuter();
                        System.out.println(executer6.getResult());
                        break;
                    case 12:
                        CollectionPerformanceExecuter executer7 = new CollectionPerformanceExecuter();
                        System.out.println(executer7.getResult());
                        break;
                    case 13:
                        SortingEnumExecuter executer8 = new SortingEnumExecuter();
                        System.out.println(executer8.getResult());
                        break;
                }
            } else {
                System.out.print("There is no any task with such value.");
                break;
            }
        }
    }

    public static void StartFactorialNumberHomeTask(Scanner sc){
        System.out.println("***You have selected a factorial number home task.***");
        System.out.print("Please enter a positive number: ");

        if(sc.hasNextInt()) {
            int i = sc.nextInt();
            if(i >= 0) {
                FactorialExecuter executer = new FactorialExecuter(i);
                System.out.println(executer.getResult());
            }else {
                System.out.println("You have entered a wrong number.");
            }
        } else {
            System.out.println("You have entered a wrong number.");
        }
    }

    public static void StartNearTo10ExecuterHomeTask(Scanner sc) {
        System.out.println("***You have selected a NearTo10 home task.***");
        System.out.print("Please enter the first number: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            System.out.print("Please enter the second number: ");

            if (sc.hasNextInt()) {
                int m = sc.nextInt();

                NearTo10Executer executer = new NearTo10Executer(n, m);
                System.out.print("The nearest to 10 number is:");
                System.out.println(executer.getResult());
            } else {
                System.out.println("You have entered a wrong number.");
            }
        } else {
            System.out.println("You have entered a wrong number.");
        }
    }

    public static void StartDiscriminantExecuterHomeTask(Scanner sc) {
        System.out.println("***You have selected a Discriminant home task.***");
        System.out.print("Please enter the a number: ");
        if (sc.hasNextDouble()) {
            double a = sc.nextDouble();

            System.out.print("Please enter the b number: ");
            if (sc.hasNextDouble()) {
                double b = sc.nextDouble();

                System.out.print("Please enter the c number: ");
                if (sc.hasNextDouble()) {
                    double c = sc.nextDouble();

                    DiscriminantExecuter executer = new DiscriminantExecuter(a, b, c);
                    System.out.print("The result is: ");
                    System.out.println(executer.getResult());
                }else {
                    System.out.println("You have entered a wrong number.");
                }
            } else {
                System.out.println("You have entered a wrong number.");
            }
        } else {
            System.out.println("You have entered a wrong number.");
        }
    }

    public static void StartSumCharactersExecuterHomeTask(Scanner sc){
        System.out.println("***You have selected a Sum of Characters home task.***");
        System.out.print("Please enter an integer number: ");

        if(sc.hasNextInt()) {
            int i = sc.nextInt();
            SumCharactersExecuter executer = new SumCharactersExecuter(i);
            System.out.println(executer.getResult());
        }else {
            System.out.println("You have entered a wrong number.");
        }
    }
}
