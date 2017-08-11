package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonObject;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class NameAndValue
{
    public String _value = "_value";
    public String _valueName = "_valueName";


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        obj.set("value" , _value);
        obj.set("value-name" , _valueName);

        return obj;
    }




}
