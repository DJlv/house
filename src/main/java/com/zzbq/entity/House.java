package com.zzbq.entity;


import lombok.Data;

@Data
public class House {
   private Integer id;                      //序号
   private String storagelocation;          //库位
   private String stocknumber;              //物料编号
   private String materialname;             //物料名称
   private String specifications;           //规格型号
   private String brand;                    //品牌
   private String unit;                     //单位
   private String quantity;                 //库存数量
   private String totalamount;              //金额总计
   private String minimumstock;             //最低库存
   private String quality;                  //保质期限
   private String spare;                    //备件属性
   private String category;                 //备件类别
   private String remarks;                  //备注

   public House(Integer id, String storagelocation, String stocknumber, String materialname, String specifications, String brand, String unit, String quantity, String totalamount, String minimumstock, String quality, String spare, String category, String remarks) {
      this.id = id;
      this.storagelocation = storagelocation;
      this.stocknumber = stocknumber;
      this.materialname = materialname;
      this.specifications = specifications;
      this.brand = brand;
      this.unit = unit;
      this.quantity = quantity;
      this.totalamount = totalamount;
      this.minimumstock = minimumstock;
      this.quality = quality;
      this.spare = spare;
      this.category = category;
      this.remarks = remarks;
   }

    public House() {

    }
}
