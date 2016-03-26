package annotation;

import java.lang.reflect.Field;

import annotation.FruitColor.Color;

public class Apple {
    
    @FruitName("apple")
    private String appleName;


    public static void main(String[] args) throws ClassNotFoundException {
    	Apple apple=null;
    	
    	Class c=Class.forName("annotation.Apple");
    	try {
			apple=(Apple)c.newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(apple.getAppleName());
    	c.isAnnotationPresent(FruitColor.class);
    	Field[] fields=c.getFields();
    	for(Field field:fields)
    	{
    		java.lang.annotation.Annotation[] as=field.getAnnotations();
    		System.out.println(as.toString());
    	}
	}

    
    
    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }
    public String getAppleName() {
        return appleName;
    }
    
    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }

    
}
