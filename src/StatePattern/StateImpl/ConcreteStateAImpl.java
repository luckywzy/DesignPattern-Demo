package StatePattern.StateImpl;

import StatePattern.State;

/**
 * 2018/8/9
 * 状态实现类A
 */
public class ConcreteStateAImpl implements State {
    @Override
    public void handle(String params) {
        System.out.println(ConcreteStateAImpl.class+ " has  request  method  handle() with params: "+ params);
    }
}
