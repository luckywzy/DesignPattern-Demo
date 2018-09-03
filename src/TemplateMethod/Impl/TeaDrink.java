package TemplateMethod.Impl;

import TemplateMethod.AbstractDrink;

/**
 * 2018/9/3
 */
public class TeaDrink extends AbstractDrink {
    private String material;
    private String accessories;

    public TeaDrink(String material, String accessories) {
        this.accessories = accessories;
        this.material = material;
    }

    @Override
    protected void putAccessories() {
        System.out.println("put " + accessories + " into water....");
    }

    @Override
    protected void putMaterial() {
        System.out.println("put " + material + " into cup...");
    }

}
