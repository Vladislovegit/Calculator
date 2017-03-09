package model;

import javax.persistence.*;

@Entity
@Table(name = "USERS_DATA", schema = "calculator")
public class DataSet {
    private Long id;
    private Integer period;
    private Integer revenueFromSale;
    private Integer nonOperatingRevenue;
    private Boolean isEmployed;
    private Boolean hasBenefits;
    private Integer childrenAmount;
    private Integer invalidChildrenAmount;
    private Integer dependentsAmount;
    private Integer insuranceCosts;
    private Integer educationCosts;
    private Integer housingCosts;
    private Integer businessCosts;
    private Double resultTax;
    private Boolean isRaisingAlone;

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "period")
    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    @Basic
    @Column(name = "revenueFromSale")
    public Integer getRevenueFromSale() {
        return revenueFromSale;
    }

    public void setRevenueFromSale(Integer revenueFromSale) {
        this.revenueFromSale = revenueFromSale;
    }

    @Basic
    @Column(name = "nonOperatingRevenue")
    public Integer getNonOperatingRevenue() {
        return nonOperatingRevenue;
    }

    public void setNonOperatingRevenue(Integer nonOperatingRevenue) {
        this.nonOperatingRevenue = nonOperatingRevenue;
    }

    @Basic
    @Column(name = "isEmployed")
    public Boolean getIsEmployed() {
        return isEmployed;
    }

    public void setIsEmployed(Boolean isEmployed) {
        this.isEmployed = isEmployed;
    }

    @Basic
    @Column(name = "hasBenefits")
    public Boolean getHasBenefits() {
        return hasBenefits;
    }

    public void setHasBenefits(Boolean hasBenefits) {
        this.hasBenefits = hasBenefits;
    }

    @Basic
    @Column(name = "childrenAmount")
    public Integer getChildrenAmount() {
        return childrenAmount;
    }

    public void setChildrenAmount(Integer childrenAmount) {
        this.childrenAmount = childrenAmount;
    }

    @Basic
    @Column(name = "invalidChildrenAmount")
    public Integer getInvalidChildrenAmount() {
        return invalidChildrenAmount;
    }

    public void setInvalidChildrenAmount(Integer invalidChildrenAmount) {
        this.invalidChildrenAmount = invalidChildrenAmount;
    }

    @Basic
    @Column(name = "dependentsAmount")
    public Integer getDependentsAmount() {
        return dependentsAmount;
    }

    public void setDependentsAmount(Integer dependentsAmount) {
        this.dependentsAmount = dependentsAmount;
    }

    @Basic
    @Column(name = "insuranceCosts")
    public Integer getInsuranceCosts() {
        return insuranceCosts;
    }

    public void setInsuranceCosts(Integer insuranceCosts) {
        this.insuranceCosts = insuranceCosts;
    }

    @Basic
    @Column(name = "educationCosts")
    public Integer getEducationCosts() {
        return educationCosts;
    }

    public void setEducationCosts(Integer educationCosts) {
        this.educationCosts = educationCosts;
    }

    @Basic
    @Column(name = "housingCosts")
    public Integer getHousingCosts() {
        return housingCosts;
    }

    public void setHousingCosts(Integer housingCosts) {
        this.housingCosts = housingCosts;
    }

    @Basic
    @Column(name = "businessCosts")
    public int getBusinessCosts() {
        return businessCosts;
    }

    public void setBusinessCosts(int businessCosts) {
        this.businessCosts = businessCosts;
    }

    @Basic
    @Column(name = "resultTax")
    public Double getResultTax() {
        return resultTax;
    }

    public void setResultTax(Double resultTax) {
        this.resultTax = resultTax;
    }

    @Basic
    @Column(name = "isRaisingAlone")
    public Boolean getIsRaisingAlone() {
        return isRaisingAlone;
    }

    public void setIsRaisingAlone(Boolean isRaisingAlone) {
        this.isRaisingAlone = isRaisingAlone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataSet dataSet = (DataSet) o;

        if (id != null ? !id.equals(dataSet.id) : dataSet.id != null) return false;
        if (!period.equals(dataSet.period)) return false;
        if (!revenueFromSale.equals(dataSet.revenueFromSale)) return false;
        if (!nonOperatingRevenue.equals(dataSet.nonOperatingRevenue)) return false;
        if (!isEmployed.equals(dataSet.isEmployed)) return false;
        if (hasBenefits != null ? !hasBenefits.equals(dataSet.hasBenefits) : dataSet.hasBenefits != null) return false;
        if (childrenAmount != null ? !childrenAmount.equals(dataSet.childrenAmount) : dataSet.childrenAmount != null)
            return false;
        if (invalidChildrenAmount != null ? !invalidChildrenAmount.equals(dataSet.invalidChildrenAmount) : dataSet.invalidChildrenAmount != null)
            return false;
        if (dependentsAmount != null ? !dependentsAmount.equals(dataSet.dependentsAmount) : dataSet.dependentsAmount != null)
            return false;
        if (insuranceCosts != null ? !insuranceCosts.equals(dataSet.insuranceCosts) : dataSet.insuranceCosts != null)
            return false;
        if (educationCosts != null ? !educationCosts.equals(dataSet.educationCosts) : dataSet.educationCosts != null)
            return false;
        if (housingCosts != null ? !housingCosts.equals(dataSet.housingCosts) : dataSet.housingCosts != null)
            return false;
        if (!businessCosts.equals(dataSet.businessCosts)) return false;
        if (resultTax != null ? !resultTax.equals(dataSet.resultTax) : dataSet.resultTax != null) return false;
        return isRaisingAlone != null ? isRaisingAlone.equals(dataSet.isRaisingAlone) : dataSet.isRaisingAlone == null;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + period.hashCode();
        result = 31 * result + revenueFromSale.hashCode();
        result = 31 * result + nonOperatingRevenue.hashCode();
        result = 31 * result + isEmployed.hashCode();
        result = 31 * result + (hasBenefits != null ? hasBenefits.hashCode() : 0);
        result = 31 * result + (childrenAmount != null ? childrenAmount.hashCode() : 0);
        result = 31 * result + (invalidChildrenAmount != null ? invalidChildrenAmount.hashCode() : 0);
        result = 31 * result + (dependentsAmount != null ? dependentsAmount.hashCode() : 0);
        result = 31 * result + (insuranceCosts != null ? insuranceCosts.hashCode() : 0);
        result = 31 * result + (educationCosts != null ? educationCosts.hashCode() : 0);
        result = 31 * result + (housingCosts != null ? housingCosts.hashCode() : 0);
        result = 31 * result + businessCosts.hashCode();
        result = 31 * result + (resultTax != null ? resultTax.hashCode() : 0);
        result = 31 * result + (isRaisingAlone != null ? isRaisingAlone.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "DataSet{" +
                "period=" + period +
                ", revenueFromSale=" + revenueFromSale +
                ", nonOperatingRevenue=" + nonOperatingRevenue +
                ", isEmployed=" + isEmployed +
                ", hasBenefits=" + hasBenefits +
                ", isRaisingAlone=" + isRaisingAlone +
                ", childrenAmount=" + childrenAmount +
                ", invalidChildrenAmount=" + invalidChildrenAmount +
                ", dependentsAmount=" + dependentsAmount +
                ", insuranceCosts=" + insuranceCosts +
                ", educationCosts=" + educationCosts +
                ", housingCosts=" + housingCosts +
                ", businessCosts=" + businessCosts +
                ", resultTax=" + resultTax +
                '}';
    }
}
