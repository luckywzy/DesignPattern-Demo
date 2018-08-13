package StatePattern.StateImpl;

import StatePattern.State;

/**
 * 2018/8/9
 *  状态实现类B
 */
public class ConcreteStateBImpl implements State {
    @Override
    public void handle(String params) {
        System.out.println(ConcreteStateBImpl.class+ "has  request  method  handle() with params: "+ params);
    }
}

