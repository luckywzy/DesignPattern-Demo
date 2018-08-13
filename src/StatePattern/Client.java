package StatePattern;

import StatePattern.StateImpl.ConcreteStateAImpl;

/**
 * 2018/8/9
 */
public class Client {
    public static void main(String[] args) {
        //创建状态
        State stateA = new ConcreteStateAImpl();
        //创建环境
        Context context  = new Context();

        //将状态设置到环境中
        context.setState(stateA);
        //请求
        context.request("requestA");
    }

}
