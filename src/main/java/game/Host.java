package game;

/**
 * Created by Gilmar-Filho on 04/10/2017.
 */
public class Host {
    public String play(int num){
        if(num % 5 == 0){
            if(num % 3 == 0){
                return "fizz buzz";
            }else{
                return "buzz";
            }
        }else{
            if(num % 3 == 0){
                return "fizz";
            }
        }
        return "" + num;
    }
}
