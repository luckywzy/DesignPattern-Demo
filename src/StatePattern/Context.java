package StatePattern;

/**
 * 2018/8/9
 * 环境角色
 */
public class Context {

    //持有（易变）状态对象的引用
    private  State state;

    public void setState(State state) {
        this.state = state;
    }

    //外界需要调用的方法
    public void request(String params){
        //实际执行的角色
        state.handle(params);
    }
}
