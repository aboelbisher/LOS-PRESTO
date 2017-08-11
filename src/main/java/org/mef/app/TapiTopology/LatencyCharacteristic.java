package org.mef.app.TapiTopology;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class LatencyCharacteristic
{
    public String _trafficPropertyQueingLatency = "_trafficPropertyQueingLatency";
    public String _wanderCharacteristic = "_wanderCharacteristic";
    public String _fixedLatencyCharacteristic = "_fixedLatencyCharacteristic";
    public String _trafficPropertyName = "_trafficPropertyName";
    public String _jitterCharacteristic = "_jitterCharacteristic";



    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        obj.set("fixed-latency-characteristic" , _fixedLatencyCharacteristic);
        obj.set("jitter-characteristic" , _jitterCharacteristic);
        obj.set("wander-characteristic" , _wanderCharacteristic);
        obj.set("traffic-property-name" , _trafficPropertyName);
        obj.set("traffic-property-queing-latency" , _trafficPropertyQueingLatency);

        return obj;


    }
}
