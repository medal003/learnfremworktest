package com.example.learnfremwork.model.repo;

import com.example.learnfremwork.model.po.CustomerPo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author: meideng.zh <br/>
 * date: 2020/2/9/0009 12:39 <br/>
 * comment:
 */
@Repository
public interface CustomerRepo extends CrudRepository<CustomerPo, Long> {

    /**
     * comment: 查询测试 <br/>
     * @author meideng.zh <br/>
     * date:  2020/2/9/0009 12:44 <br/>
     * teststatus: 未测试
     *
     * @param lastName pCmt
     * @return java.util.List<com.example.learnfremwork.po.CustomerPo>
     */
    List<CustomerPo> findByLastName(String lastName);

    /**
     * comment: 测试 <br/>
     * @author meideng.zh <br/>
     * date:  2020/2/9/0009 12:44 <br/>
     * teststatus: 未测试
     *
     * @param id pCmt
     * @return com.example.learnfremwork.po.CustomerPo
     */
    CustomerPo findById(long id);
}
