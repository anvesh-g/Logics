package com.designPatterns.creationalPatterns.abstractFactory.toppingFactory;

import com.designPatterns.creationalPatterns.abstractFactory.cheese.Cheese;
import com.designPatterns.creationalPatterns.abstractFactory.cheese.MozarellaCheese;
import com.designPatterns.creationalPatterns.abstractFactory.sauce.Sauce;
import com.designPatterns.creationalPatterns.abstractFactory.sauce.TomatoSauce;

public class SicilianToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new MozarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }
}
