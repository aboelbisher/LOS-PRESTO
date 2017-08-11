package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class RiskParameterPac
{
    public List<RiskCharacteristic> _riskCharacteristic;

    public RiskParameterPac()
    {
        _riskCharacteristic = new Vector<RiskCharacteristic>();
        RiskCharacteristic stam = new RiskCharacteristic();
        _riskCharacteristic.add(stam);

    }

    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        JsonArray arr = new JsonArray();
        for(RiskCharacteristic item : _riskCharacteristic)
        {
            arr.add(item.toJSON());
        }
        obj.set("risk-characteristic" , arr);

        return obj;
    }
}
