package proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ����������
 * 
 * @author rongxinhua
 * 
 */
public class MethodProxy
{
    
    private Class clazz; // ������������
    
    private Object target; // Ŀ�����
    
    private Method method; // Ŀ�귽��
    
    private Object[] params; // ��������
    
    @SuppressWarnings("unchecked")
    public MethodProxy(Object target, String methodName, Object... params)
    {
        rebindTarget(target, methodName, params); // ����Ŀ������뷽��
    }
    
    /**
     * ��������Ŀ������뷽��
     * 
     * @param target
     * @param methodName
     * @param params
     */
    public void rebindTarget(Object target, String methodName, Object... params)
    {
        this.target = target;
        this.clazz = target.getClass();
        rebindMethod(methodName, params); // ����Ŀ�귽��
    }
    
    /**
     * ��������Ŀ�귽��
     * 
     * @param methodName
     * @param params
     */
    public void rebindMethod(String methodName, Object... params)
    {
        this.params = params;
        int paramLength = params.length;
        Class[] paramTypes = new Class[paramLength];
        for (int i = 0; i < paramLength; i++)
        {
            paramTypes[i] = params[i].getClass();
        }
        try
        {
            this.method = clazz.getMethod(methodName, paramTypes);
        }
        catch (SecurityException e)
        {
            e.printStackTrace();
        }
        catch (NoSuchMethodException e)
        {
            e.printStackTrace();
        }
    }
    
    /**
     * ��̬�����Ѱ󶨵ķ���
     */
    public void doMethod()
    {
        try
        {
            this.method.invoke(target, params);
        }
        catch (IllegalArgumentException e)
        {
            e.printStackTrace();
        }
        catch (IllegalAccessException e)
        {
            e.printStackTrace();
        }
        catch (InvocationTargetException e)
        {
            e.printStackTrace();
        }
    }
    
}