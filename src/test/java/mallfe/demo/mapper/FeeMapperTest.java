package mallfe.demo.mapper;

import mallfe.demo.pojo.Fee;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FeeMapperTest {
    @Autowired
    private FeeMapper feeMapper;
    
    @Test
    public void testQuery(){
        Fee fee = feeMapper.selectByPrimaryKey(4);
        System.out.println("fee = " + fee);
    }
}