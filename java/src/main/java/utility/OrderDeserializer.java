package utility;

import com.google.gson.*;
import genericpubsub.OrderEventModel;

import java.lang.reflect.Type;

// 自定义反序列化器
public class OrderDeserializer implements JsonDeserializer<OrderEventModel> {
    @Override
    public OrderEventModel deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        JsonObject jsonObject = json.getAsJsonObject();
        OrderEventModel order = new OrderEventModel();
        order.setCreatedById(jsonObject.get("CreatedById").getAsString());
        order.setCreatedDate(jsonObject.get("CreatedDate").getAsInt());
        order.setOrderNumber(jsonObject.get("Order_Number__c").getAsString());
        order.setCity(jsonObject.get("City__c").getAsString());
        order.setAmount(jsonObject.get("Amount__c").getAsDouble());
        return order;
    }
}