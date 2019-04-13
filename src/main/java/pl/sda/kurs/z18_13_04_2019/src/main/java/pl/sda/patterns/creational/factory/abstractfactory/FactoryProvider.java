package pl.sda.patterns.creational.factory.abstractfactory;

import com.google.common.collect.ImmutableMap;

import java.util.Map;

public class FactoryProvider {
    Map <String, AbstractFactory> factoryMap = ImmutableMap.of(CarItem.class.getSimpleName(), new CarFactory(), BikeItem.class.getSimpleName(), new BikeFactory());

    public AbstractFactory create(String type){
        if(type.equals("car")){
            return new CarFactory();
        }
        return new BikeFactory();
    }

    public AbstractFactory createWithoutIfs(Item item){
        return factoryMap.get(item.getClass().getSimpleName());
    }
}
