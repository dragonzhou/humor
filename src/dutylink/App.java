package dutylink;

import dutylink.request.RaiseMoneyReq;
import dutylink.request.Request;

/**
 * ʹ��������л��ᴦ�����󣬴Ӷ���������ķ����ߺͽ�����֮�����Ϲ�ϵ������Щ��������һ������ ���������������ݸ�����ֱ����һ����������Ϊֹ�� ��һģʽ���뷨�ǣ������������һ������Ļ��ᣬ�Ӷ�������ߺͽ�����.
 * 
 * @author: zhoujinlong2014169
 * @version: yamen_v3.0
 * @time: 2014-10-16
 */
public class App
{
    
    public static void main(String[] args)
    {
        Manager manager = new CommonManager("����");
        Manager director = new Director("�ܼ�");
        Manager generalManager = new GeneralManager("�ܾ���");
        
        manager.setSuperior(director);
        director.setSuperior(generalManager);
        
        RaiseMoneyReq requestOne = new RaiseMoneyReq("��н", RequestTypeEnum.RAISE_MONEY, 2, 300);
        // Request requestTwo = new Request("��н", RequestTypeEnum.RAISE_MONEY, 400);
        // Request requestThree = new Request("��н", RequestTypeEnum.RAISE_MONEY, 600);
        // Request requestFive = new Request("��н", RequestTypeEnum.RAISE_MONEY, 2000);
        // Request requestSix = new Request("��н", RequestTypeEnum.PROMOTION, 2000);
        //
        manager.doRequest(requestOne);
        // System.out.println();
        // manager.doRequest(requestTwo);
        // System.out.println();
        // manager.doRequest(requestThree);
        // System.out.println();
        // manager.doRequest(requestFive);
        // System.out.println();
        // manager.doRequest(requestSix);
        
    }
    
}
