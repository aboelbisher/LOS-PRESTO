package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class TransferCostPac
{
    public List<CostCharacteristic> _costCharacteristic;


    public TransferCostPac()
    {
        CostCharacteristic test = new CostCharacteristic();
        _costCharacteristic = new Vector<CostCharacteristic>();
        _costCharacteristic.add(test);
    }

    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();


        JsonArray arr = new JsonArray();

        for(CostCharacteristic item : _costCharacteristic)
        {
            arr.add(item.toJSON());
        }

        obj.set("cost-characteristic" , arr);

        return obj;
    }
}
