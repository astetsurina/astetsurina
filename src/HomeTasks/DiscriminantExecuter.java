package HomeTasks;

/**
 * Created by Alien on 06-Oct-15.
 */
/* ¬ три переменные a, b и c записаны три вещественных числа. —оздать программу, котора€ будет находить и выводить на экран вещественные корни квадратного уравнени€ ax?+bx+c=0, либо сообщать, что корней нет.*/

public class DiscriminantExecuter {
    double a;
    double b;
    double c;

    public DiscriminantExecuter(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getResult(){
        String result = "";
        double d = Math.pow(this.b, 2) - 4* this.a * this.c;

        if (d > 0) {
            double commandPart1 = -this.b/(2*this.a);
            double commandPart2 = Math.sqrt(d)/(2*this.a);
            double x1 = commandPart1 + commandPart2;
            double x2 = commandPart1 - commandPart2;
            result += String.valueOf(x1);
            result += " and ";
            result += String.valueOf(x2);
        }else if (d == 0){
            double x1 = -this.b/2*this.a;
            result += String.valueOf(x1);
        }else if (d < 0){
            result += "There is no any result.";
        }

        return result;
    }
}

