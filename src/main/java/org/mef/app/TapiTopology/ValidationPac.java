package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.eclipsesource.json.JsonValue;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class ValidationPac
{
    public List<ValidationMechanism> _validationMechanism;


    public ValidationPac()
    {
        ValidationMechanism test = new ValidationMechanism();
        _validationMechanism = new Vector<ValidationMechanism>();
        _validationMechanism.add(test);
    }


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();
        JsonArray arr = new JsonArray();
        for (ValidationMechanism item : _validationMechanism)
        {
            arr.add(item.toJSON());
        }
        obj.set("validation-mechanism" , arr);
        return obj;
    }
}
