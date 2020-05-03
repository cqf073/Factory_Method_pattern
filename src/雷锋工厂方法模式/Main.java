package 雷锋工厂方法模式;

public class Main {

    public static void main(String[] args) {
        leifeng_factory leifeng_factory = new undergraduate_factory();
       leifeng lei= leifeng_factory.createleifeng();
       lei.buy_friut();
       lei.clean();
       lei.sweep();
    }
}
