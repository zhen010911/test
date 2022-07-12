package dao;

public class TestDaoimpl implements TestDao{
    @Override
    public void sayHello() {
        System.out.println("Hello,Spring!");
    }
}
