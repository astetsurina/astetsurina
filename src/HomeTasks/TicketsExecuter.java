package HomeTasks;

/**
 * Created by Alien on 06-Oct-15.
 */
public class TicketsExecuter {
    public TicketsExecuter() {
    }
    public int getResult(){
        int result = 0;
        for (int i = 1000; i <= 999999; i++){
            String formatedTicketNumber = String.format("%06d", i);
            int sum1 = sumCharacters(formatedTicketNumber.substring(0, 3));
            int sum2 = sumCharacters(formatedTicketNumber.substring(3, 6));
            if (sum1 == sum2){
                result += 1;
            }
        }
        return result;
    }

    public int sumCharacters(String valueString){
        int result = 0;
        for (int i = 0; i < valueString.length(); i++) {
            char digitChar = valueString.charAt(i); /* return a char code of the value */
            int digit = Character.getNumericValue(digitChar); /* Returns the {@code int} value that the specified Unicode
     * character represents. For example, the character*/
            result += digit; /*result = result + value*/
        }
        return result;
    }
}

