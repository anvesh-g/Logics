package com.designPatterns.creationalPatterns.abstractFactory.toppingFactory;

import com.designPatterns.creationalPatterns.abstractFactory.cheese.Cheese;
import com.designPatterns.creationalPatterns.abstractFactory.sauce.Sauce;

public abstract class BaseToppingFactory {
    public abstract Cheese createCheese();
    public abstract Sauce createSauce();
}
