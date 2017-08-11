package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonObject;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class TransferIntegrityPac
{
    public String _errorCharacteristic = "_errorCharacteristic";
    public String _repeatDeliveryCharacteristic = "_repeatDeliveryCharacteristic";
    public String _lossCharacteristic = "_lossCharacteristic" ;
    public String _unavailableTimeCharacteristic = "_unavailableTimeCharacteristic" ;
    public String _deliveryOrderCharacteristic = "_deliveryOrderCharacteristic" ;
    public String _serverIntegrityProcessCharacteristic = "_serverIntegrityProcessCharacteristic";


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        obj.set("error-characteristic" , _errorCharacteristic);
        obj.set("loss-characteristic" , _lossCharacteristic);
        obj.set("repeat-delivery-characteristic" , _repeatDeliveryCharacteristic);
        obj.set("delivery-order-characteristic" , _deliveryOrderCharacteristic);


        return obj;

    }



}
