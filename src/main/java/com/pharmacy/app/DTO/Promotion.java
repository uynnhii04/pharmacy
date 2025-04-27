/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pharmacy.app.DTO;

import java.util.Date;

/**
 *
 * @author Giai Cuu Li San
 */
public class Promotion {
     private String promotionId;
    private String programName;
    private String promotionType;
    private String product;
    private Double discountPercent;
    private Integer minAccumulatedPoints;
    private Double discountAmount;
    private Date startDate;
    private Date endDate;

    // Constructor không tham số
    public Promotion() {}

    // Constructor đầy đủ tham số
    public Promotion(String promotionId, String programName, String promotionType, String product, 
                     Double discountPercent, Integer minAccumulatedPoints, Double discountAmount, 
                     Date startDate, Date endDate) {
        this.promotionId = promotionId;
        this.programName = programName;
        this.promotionType = promotionType;
        this.product = product;
        this.discountPercent = discountPercent;
        this.minAccumulatedPoints = minAccumulatedPoints;
        this.discountAmount = discountAmount;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    // Getters & Setters
    public String getPromotionId() {
        return promotionId;
    }

    public void setPromotionId(String promotionId) {
        this.promotionId = promotionId;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public String getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(String promotionType) {
        this.promotionType = promotionType;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(Double discountPercent) {
        this.discountPercent = discountPercent;
    }

    public Integer getMinAccumulatedPoints() {
        return minAccumulatedPoints;
    }

    public void setMinAccumulatedPoints(Integer minAccumulatedPoints) {
        this.minAccumulatedPoints = minAccumulatedPoints;
    }

    public Double getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    // Phương thức hiển thị thông tin khuyến mãi
    @Override
    public String toString() {
        return "Promotion{" +
                "promotionId='" + promotionId + '\'' +
                ", programName='" + programName + '\'' +
                ", promotionType='" + promotionType + '\'' +
                ", product='" + product + '\'' +
                ", discountPercent=" + discountPercent +
                ", minAccumulatedPoints=" + minAccumulatedPoints +
                ", discountAmount=" + discountAmount +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}
