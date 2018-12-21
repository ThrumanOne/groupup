package test;

import com.thruman.Api;
import com.thruman.dao.TestDao;
import com.thruman.pojo.ProductEntity;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 类说明
 * <p>
 *
 * @author niexiang
 * @version 1.0.0
 * @date 2018/12/10
 */
@SpringBootTest(classes = Api.class)
@RunWith(SpringRunner.class)
public class SpringTest {

    @Autowired
    TestDao testDao;

    @Test
    public void test(){

        ProductEntity id = testDao.getProduct(1);
        System.out.print(id);


    }

}
