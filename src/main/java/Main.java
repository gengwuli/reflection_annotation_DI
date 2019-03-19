import service.Service;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Service service = new Service();
        // 1. 根据注解读取数据库配置
        // 2. 从注册中心拿到对应的数据库对象实例
        // 3. 将对象实例注入到service对象中
        service.checkConnection();
    }
}
