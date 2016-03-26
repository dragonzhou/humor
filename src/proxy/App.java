package proxy;

public class App
{
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        Manager man = new Manager(); // 目标对象
        MethodProxy proxy = new MethodProxy(man, "say"); // 方法代理对象
        proxy.doMethod(); // 调用被代理的方法
        proxy.rebindMethod("love", "Tom", "Marry"); // 重新绑定方法
        proxy.doMethod(); // 调用被代理的方法
        proxy.rebindMethod("marry", "Tom", "Marry to", "lisa"); // 重新绑定方法
        proxy.doMethod(); // 调用被代理的方法
    }
    
}
