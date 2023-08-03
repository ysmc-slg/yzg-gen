package com.github.davidfantasy.mybatisplustools.example.entity;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
/**
 * <p>
 * 
 * </p>
 *
 * @author 
 * @since 2023-08-03
 */
@TableName("d_fuwu_order")
public class FuwuOrder implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 店铺id
     */
    private String shopId;

    /**
     * 店铺名称
     */
    private String shopName;

    /**
     * 充值类型（0:7天体验 1:1个月 2:3个月 3:6个月 4:一年）
     */
    private String rechargeType;

    /**
     * 充值标题
     */
    private String rechargeTitle;

    /**
     * 充值总金额
     */
    private String rechargeTotalcost;

    /**
     * 优惠价格
     */
    private String discount;

    /**
     * 创建时间
     */
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getRechargeType() {
        return rechargeType;
    }

    public void setRechargeType(String rechargeType) {
        this.rechargeType = rechargeType;
    }

    public String getRechargeTitle() {
        return rechargeTitle;
    }

    public void setRechargeTitle(String rechargeTitle) {
        this.rechargeTitle = rechargeTitle;
    }

    public String getRechargeTotalcost() {
        return rechargeTotalcost;
    }

    public void setRechargeTotalcost(String rechargeTotalcost) {
        this.rechargeTotalcost = rechargeTotalcost;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "FuwuOrder{" +
        ", id=" + id +
        ", shopId=" + shopId +
        ", shopName=" + shopName +
        ", rechargeType=" + rechargeType +
        ", rechargeTitle=" + rechargeTitle +
        ", rechargeTotalcost=" + rechargeTotalcost +
        ", discount=" + discount +
        ", createTime=" + createTime +
        "}";
    }
}
