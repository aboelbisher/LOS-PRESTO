package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class ExtensionsSpec
{
    public List<String> _extensionsSpecTarget; //
    public String _extensionsSpecification = "";


    public ExtensionsSpec()
    {
        _extensionsSpecTarget = new Vector<String>();
        _extensionsSpecTarget.add("extension-spec-target-value-1");
        _extensionsSpecification = "_extensionsSpecification";
    }


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();
        JsonArray arr = new JsonArray();
        for(String item : _extensionsSpecTarget)
        {
            arr.add(item);
        }

        obj.set("extension-spec-target" , arr);
        obj.set("extensions-specification" , _extensionsSpecification);



        return obj;
    }



}
