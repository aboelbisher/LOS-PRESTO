package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;
import com.fasterxml.jackson.databind.util.JSONPObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class TransferTimingPac
{
    public List<LatencyCharacteristic> _latencyCharacteristic;


    public TransferTimingPac()
    {
        LatencyCharacteristic test = new LatencyCharacteristic();
        _latencyCharacteristic = new Vector<LatencyCharacteristic>();
        _latencyCharacteristic.add(test);
    }


    public JsonObject toJSON()
    {

        JsonArray arr = new JsonArray();
        for (LatencyCharacteristic item : _latencyCharacteristic)
        {
            arr.add(item.toJSON());
        }

        JsonObject obj = new JsonObject();
        obj.set("latency-characteristic" , arr);

        return obj;
    }

}
