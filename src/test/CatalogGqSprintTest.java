//package test;
//
//import javax.annotation.Resource;
//
//import org.junit.Test;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
//
//import com.xiaoerzuche.biz.card.dao.CardStateManagementDao;
//import com.xiaoerzuche.biz.card.model.CardStateManagement;
//import com.xiaoerzuche.biz.payment.dao.WechatRedPackSendLogDao;
//import com.xiaoerzuche.biz.pubnumber.service.WechatInfoService;
//@ContextConfiguration(locations = { "classpath:applicationContext-junit.xml","classpath:application-web.xml"})  
//public class CatalogGqSprintTest extends AbstractJUnit4SpringContextTests{
//    @Resource  
//    WechatInfoService wechatInfoService;  
//    @Resource
//    CardStateManagementDao cardStateManagementDao;
//    @Resource
//    WechatRedPackSendLogDao wechatRedPackSendLogDao;
//    private static Logger logger = LoggerFactory.getLogger(CatalogGqSprintTest.class);  
//  
//    @Test  
//    public void registerTest() {  
//        logger.info("测试开始............");  
//        System.out.println(cardStateManagementDao);  
//    }   
//}
