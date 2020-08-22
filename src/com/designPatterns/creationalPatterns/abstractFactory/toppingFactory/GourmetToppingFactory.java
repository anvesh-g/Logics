package com.designPatterns.creationalPatterns.abstractFactory.toppingFactory;

import com.designPatterns.creationalPatterns.abstractFactory.cheese.Cheese;
import com.designPatterns.creationalPatterns.abstractFactory.cheese.GoatCheese;
import com.designPatterns.creationalPatterns.abstractFactory.sauce.CaliforniaOilSauce;
import com.designPatterns.creationalPatterns.abstractFactory.sauce.Sauce;

public class GourmetToppingFactory extends BaseToppingFactory {
    @Override
    public Cheese createCheese() {
        return new GoatCheese();
    }

    @Override
    public Sauce createSauce() {
        return new CaliforniaOilSauce();
    }
}
