import com.java1234.util.MD5;
import org.junit.Test;

/**
 * Created by dell on 2016/5/9.
 */
public class Test01 {
    @Test
    public void test01(){
        String a = MD5.encodeString("123456");
        System.out.println(a);
    }
}
