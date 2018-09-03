package TemplateMethod;

/**
 * 2018/9/3
 */
public abstract class AbstractDrink {

    /*模板方法
        其中包含的是做某件事的流程
     */
    public final void templateMethod(){
        this.boilWater();
        this.putMaterial();
        this.watering();
        this.putAccessories();
    }

    //加辅料（糖或牛奶）需要覆写
    protected abstract void putAccessories();

    // 加水
    protected void watering(){
        System.out.println("watering...");
    }

    //加原料（茶叶或咖啡）需要覆写
    protected abstract void putMaterial();

    //烧水
    protected void boilWater(){
        System.out.println("boil water......");
    }

}
