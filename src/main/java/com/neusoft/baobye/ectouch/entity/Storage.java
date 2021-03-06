package com.neusoft.baobye.ectouch.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Storage {

    @Id
    private Long storageId;

    /**
     *  1  入库申请  2 出库申请
     */
    private int type;

    /**
     * 原因 1正常出入库   2退货   3换货  4损耗 5其他
     */
    private int reasonType;

    /**
     * 除了入库，全部与订单关联，必填
     */
    private Long orderId;

    /**
     * 申请人
     */
    private Long applySysId;

    /**
     * 申请日期
     */
    private String applyDate;

    /**
     * 处理人
     */
    private int handleSysId;

    /**
     * 处理日期
     */
    private String handleDate;

    /**
     * 0实体库房 1云库房
     */
    private int assetsType;

    /**
     * 申请状态  0未处理  1已通过  2驳回
     */
    private int status;

    /**
     * 删除状态 0正常 1删除
     */
    private int isDel;

    @OneToMany(mappedBy = "storageId")
    private Set<StorageGoods> storageGoods = new HashSet<StorageGoods>();

    public Long getStorageId() {
        return storageId;
    }

    public void setStorageId(Long storageId) {
        this.storageId = storageId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getReasonType() {
        return reasonType;
    }

    public void setReasonType(int reasonType) {
        this.reasonType = reasonType;
    }

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public Long getApplySysId() {
        return applySysId;
    }

    public void setApplySysId(Long applySysId) {
        this.applySysId = applySysId;
    }

    public String getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(String applyDate) {
        this.applyDate = applyDate;
    }

    public int getHandleSysId() {
        return handleSysId;
    }

    public void setHandleSysId(int handleSysId) {
        this.handleSysId = handleSysId;
    }

    public String getHandleDate() {
        return handleDate;
    }

    public void setHandleDate(String handleDate) {
        this.handleDate = handleDate;
    }

    public int getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(int assetsType) {
        this.assetsType = assetsType;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getIsDel() {
        return isDel;
    }

    public void setIsDel(int isDel) {
        this.isDel = isDel;
    }

    public Set<StorageGoods> getStorageGoods() {
        return storageGoods;
    }

    public void setStorageGoods(Set<StorageGoods> storageGoods) {
        this.storageGoods = storageGoods;
    }
}
