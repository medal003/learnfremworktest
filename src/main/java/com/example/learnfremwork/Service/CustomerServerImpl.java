package com.example.learnfremwork.Service;

import com.example.learnfremwork.model.po.CustomerPo;
import com.example.learnfremwork.model.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author meideng.zh <br/>
 * date: 2020/2/16/0016 18:00 <br/>
 * comment:
 */
@Service
public class CustomerServerImpl implements CustomerServer {

    @Qualifier("customerRepo")
    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public List<CustomerPo> getAllCustomers() {
        return (List<CustomerPo>) customerRepo.findAll();
    }
    public static void main(String[] args){
        try {
            test1();
        } catch (Exception e) {
            System.out.println("e.printStackTrace();");
        } finally {
            System.out.println("fff");
        }
    }

    private static void test1() {
        try {
            throw new RuntimeException("测试");
        }catch (Exception e) {
            System.out.println("异常捕获");

            throw new RuntimeException("异常测试1");
        }finally {
            System.out.println("finally 测试");
        }
    }


}
