package haugv.hast.singleton;

/**
 * @author haugv
 * @description
 * @date 2021/3/31-9:46 上午
 */
public enum EnumSingleton {

    INSTANCE;

    public void doSomething(){
        System.out.println("枚举型单利模式");
    }

}
