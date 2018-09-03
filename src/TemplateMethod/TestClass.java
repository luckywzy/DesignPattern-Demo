package TemplateMethod;

import TemplateMethod.Impl.TeaDrink;

/**
 * 2018/9/3
 */
public class TestClass {
    public static void main(String[] args) {
        AbstractDrink drink = new TeaDrink("tea leaves", "suger");
        drink.templateMethod();
    }
}
