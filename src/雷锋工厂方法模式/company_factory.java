package 雷锋工厂方法模式;

/**
 * 功能描述：
 *
 * @Author：cqf
 * @2020/5/320:29
 * @description： TODO
 * @modifiedBy：
 * @version: 1.0
 **/
public class company_factory implements leifeng_factory {
    @Override
    public leifeng createleifeng() {
        return new company();
    }
}
