package dpAndGreedy;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

//abstract
public  class BaseDaoImpl <T> {
    
//    @Resource
//    private SessionFactory sessionFactory;
    //获取T的Class对象是关键，看构造方法
    private Class<T> cls = null;
    
    
    public BaseDaoImpl() {
        //为了得到T的Class，采用如下方法
        //1得到该泛型类的子类对象的Class对象
        Class clz = this.getClass();
        //2得到子类对象的泛型父类类型（也就是BaseDaoImpl<T>）
        ParameterizedType type = (ParameterizedType) clz.getGenericSuperclass();
        System.out.println(type);
        //
        Type[] types = type.getActualTypeArguments();
        
        cls = (Class<T>) types[0];
        System.out.println(cls.getSimpleName());
    }
    public static void main(String[] args) {
        new RoleDaoImpl();
        System.out.println("------");
        new UserDaoImpl();
        System.out.println("------");
        new ManagerDaoImpl();
    }
    
}
class RoleDaoImpl extends BaseDaoImpl<Role>   {
}
class UserDaoImpl extends BaseDaoImpl<User>   {
}
class ManagerDaoImpl extends BaseDaoImpl<Manager>   {
}
class Role  {
}
class User  {
}
class Manager  {
}