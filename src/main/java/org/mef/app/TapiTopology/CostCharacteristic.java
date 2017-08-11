package org.mef.app.TapiTopology;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonObject;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class CostCharacteristic
{
    public String _costName = "_costName";
    public String _costAlgorithm = "_costAlgorithm" ;
    public String _costValue = "_costValue";


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        obj.set("cost-name" , _costName);
        obj.set("cost-value" , _costValue);
        obj.set("cost-algorithm" , _costAlgorithm);

        return obj;
    }
}
