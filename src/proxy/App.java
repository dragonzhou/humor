package proxy;

public class App
{
    
    /**
     * 
     * @param args
     */
    public static void main(String[] args)
    {
        Manager man = new Manager(); // Ŀ�����
        MethodProxy proxy = new MethodProxy(man, "say"); // �����������
        proxy.doMethod(); // ���ñ�����ķ���
        proxy.rebindMethod("love", "Tom", "Marry"); // ���°󶨷���
        proxy.doMethod(); // ���ñ�����ķ���
        proxy.rebindMethod("marry", "Tom", "Marry to", "lisa"); // ���°󶨷���
        proxy.doMethod(); // ���ñ�����ķ���
    }
    
}
