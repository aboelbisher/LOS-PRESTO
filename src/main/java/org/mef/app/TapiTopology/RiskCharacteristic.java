package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class RiskCharacteristic
{
    public List<String> _riskIdentifierList;
    public String _riskCharacteristicName;


    public RiskCharacteristic()
    {
        _riskIdentifierList = new Vector<String>();
        _riskIdentifierList.add("_riskIdentifierList");

        _riskCharacteristicName = "_riskCharacteristicName";
    }

    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        JsonArray arr = new JsonArray();
        for(String item : _riskIdentifierList)
        {
            arr.add(item);
        }
        obj.set("risk-identifier-list" , arr);

        obj.set("risk-characteristic-name" , _riskCharacteristicName);

        return obj;
    }
}
