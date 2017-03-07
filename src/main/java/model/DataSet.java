package model;

public class DataSet {
    private Integer id;
    private Integer period;
    private Integer revenueFromSale;
    private Integer nonOperatingRevenue;
    private Boolean isEmployed;
    private Boolean hasBenefits;
    private Boolean isRaisingAlone;
    private Integer childrenAmount;
    private Integer invalidChildrenAmount;
    private Integer dependentsAmount;
    private Integer insuranceCosts;
    private Integer educationCosts;
    private Integer housingCosts;
    private Integer businessCosts;

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
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DataSet dataSet = (DataSet) o;

        if (!period.equals(dataSet.period)) return false;
        if (!revenueFromSale.equals(dataSet.revenueFromSale)) return false;
        if (!nonOperatingRevenue.equals(dataSet.nonOperatingRevenue)) return false;
        if (!isEmployed.equals(dataSet.isEmployed)) return false;
        if (hasBenefits != null ? !hasBenefits.equals(dataSet.hasBenefits) : dataSet.hasBenefits != null) return false;
        if (isRaisingAlone != null ? !isRaisingAlone.equals(dataSet.isRaisingAlone) : dataSet.isRaisingAlone != null)
            return false;
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
        return businessCosts.equals(dataSet.businessCosts);
    }

    @Override
    public int hashCode() {
        int result = period.hashCode();
        result = 31 * result + revenueFromSale.hashCode();
        result = 31 * result + nonOperatingRevenue.hashCode();
        result = 31 * result + isEmployed.hashCode();
        result = 31 * result + (hasBenefits != null ? hasBenefits.hashCode() : 0);
        result = 31 * result + (isRaisingAlone != null ? isRaisingAlone.hashCode() : 0);
        result = 31 * result + (childrenAmount != null ? childrenAmount.hashCode() : 0);
        result = 31 * result + (invalidChildrenAmount != null ? invalidChildrenAmount.hashCode() : 0);
        result = 31 * result + (dependentsAmount != null ? dependentsAmount.hashCode() : 0);
        result = 31 * result + (insuranceCosts != null ? insuranceCosts.hashCode() : 0);
        result = 31 * result + (educationCosts != null ? educationCosts.hashCode() : 0);
        result = 31 * result + (housingCosts != null ? housingCosts.hashCode() : 0);
        result = 31 * result + businessCosts.hashCode();
        return result;
    }

    public Integer getPeriod() {
        return period;
    }

    public Integer getRevenueFromSale() {
        return revenueFromSale;
    }

    public Integer getNonOperatingRevenue() {
        return nonOperatingRevenue;
    }

    public Boolean isEmployed() {
        return isEmployed;
    }

    public Boolean hasBenefits() {
        return hasBenefits;
    }

    public Boolean isRaisingAlone() {
        return isRaisingAlone;
    }

    public Integer getChildrenAmount() {
        return childrenAmount;
    }

    public Integer getInvalidChildrenAmount() {
        return invalidChildrenAmount;
    }

    public Integer getDependentsAmount() {
        return dependentsAmount;
    }

    public Integer getInsuranceCosts() {
        return insuranceCosts;
    }

    public Integer getEducationCosts() {
        return educationCosts;
    }

    public Integer getHousingCosts() {
        return housingCosts;
    }

    public Integer getBusinessCosts() {
        return businessCosts;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    public void setRevenueFromSale(Integer revenueFromSale) {
        this.revenueFromSale = revenueFromSale;
    }

    public void setNonOperatingRevenue(Integer nonOperatingRevenue) {
        this.nonOperatingRevenue = nonOperatingRevenue;
    }

    public void setEmployed(Boolean employed) {
        isEmployed = employed;
    }

    public void setHasBenefits(Boolean hasBenefits) {
        this.hasBenefits = hasBenefits;
    }

    public void setRaisingAlone(Boolean raisingAlone) {
        isRaisingAlone = raisingAlone;
    }

    public void setChildrenAmount(Integer childrenAmount) {
        this.childrenAmount = childrenAmount;
    }

    public void setInvalidChildrenAmount(Integer invalidChildrenAmount) {
        this.invalidChildrenAmount = invalidChildrenAmount;
    }

    public void setDependentsAmount(Integer dependentsAmount) {
        this.dependentsAmount = dependentsAmount;
    }

    public void setInsuranceCosts(Integer insuranceCosts) {
        this.insuranceCosts = insuranceCosts;
    }

    public void setEducationCosts(Integer educationCosts) {
        this.educationCosts = educationCosts;
    }

    public void setHousingCosts(Integer housingCosts) {
        this.housingCosts = housingCosts;
    }

    public void setBusinessCosts(Integer businessCosts) {
        this.businessCosts = businessCosts;
    }
}
