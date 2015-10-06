package HomeTasks;

/**
 * Created by Alien on 05-Oct-15.
 */
public class FactorialExecuter {
    long number;

    public FactorialExecuter(long number) {
        this.number = number;
    }

    public long getResult(){
        long result = 1;
        for (long i = 1; i <= this.number; i++){
            result *= i; //result = result*i;
        }

        return result;
    }
}
