package genericpubsub;


public class OrderEventModel {
    // 映射 CreatedDate 字段
//    @SerializedName("CreatedDate")
    private long createdDate;

    // 映射 CreatedById 字段
//    @SerializedName("CreatedById")
    private String createdById;

    // 映射 Order_Number__c 字段
//    @SerializedName("Order_Number__c")
    private String orderNumber;

    // 映射 City__c 字段
//    @SerializedName("City__c")
    private String city;

    // 映射 Amount__c 字段
//    @SerializedName("Amount__c")
    private double amount;

    // Getter 方法
    public long getCreatedDate() {
        return createdDate;
    }

    public String getCreatedById() {
        return createdById;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public String getCity() {
        return city;
    }

    public double getAmount() {
        return amount;
    }

    //setter方法
    public void setCreatedDate(long createdDate) {
        this.createdDate = createdDate;
    }
    public void setCreatedById(String createdById) {
        this.createdById = createdById;
    }
    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderEventModel{" +
                "createdDate=" + createdDate +
                ", createdById='" + createdById + '\'' +
                ", orderNumber='" + orderNumber + '\'' +
                ", city='" + city + '\'' +
                ", amount=" + amount +
                '}';
    }
}
