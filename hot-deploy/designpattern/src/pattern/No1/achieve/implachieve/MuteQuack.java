package mangoo.No1.achieve.implachieve;

import mangoo.No1.main.impl.QuackBehavior;

/**
 * Created by root on 14-4-1.
 */
public class MuteQuack implements QuackBehavior {
    public void quack(){
        System.out.println("<<Silence>>");
    }
}
