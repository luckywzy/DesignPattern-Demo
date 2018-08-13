package StatePattern;

/**
 * 抽象状态接口
 */
public interface State {
    //处理对应状态抽象
    public void handle(String params);
}
