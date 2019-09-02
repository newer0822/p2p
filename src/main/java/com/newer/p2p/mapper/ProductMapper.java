package com.newer.p2p.mapper;

import com.newer.p2p.domain.Investment;
import com.newer.p2p.domain.Product;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductMapper {

    @Select("select pid,puid,p_uids,title,synopsis,borrowing_balance,Payment_method,annual_interest_rate," +
            "residue_money,product_plan,pro_remark,recommend,deadline,product_status," +
            "starttime,endtime,pby,pby1 from product where pro_remark='1'")
    public List<Product> showProduct();

    @Select("select pid,puid,p_uids,title,synopsis,borrowing_balance,Payment_method,annual_interest_rate," +
            "residue_money,product_plan,pro_remark,recommend,deadline,product_status," +
            "starttime,endtime,pby,pby1 from product where pid=#{pid}")
    public Product findById(@Param("pid") Integer pid);

    @Update("update product set residue_money=#{residue_money} where pid=#{pid}")
    public int updPro(Product product);


    @Insert("insert into investment (ipid,uiid,Investment_money,Investment_date,iby,iby1,title,interest,annual_interest_rate) values(#{ipid}," +
            "#{uiid},#{Investment_money},#{Investment_date},#{iby},#{iby1},#{title},#{interest},#{annual_interest_rate})")
    public int insertIn(Investment investment);


    @Select("select id,ipid,uiid,title,Investment_money,Investment_date," +
            "iby,iby1,interest,annual_interest_rate from investment where uiid =#{uiid}")
    public List<Investment> findByUiid(Integer uiid);

}