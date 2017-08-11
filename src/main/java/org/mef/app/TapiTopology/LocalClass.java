package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import com.sun.org.apache.xerces.internal.xs.StringList;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class LocalClass
{
    public List<ExtensionsSpec> _extensions;
    public String _localId;


    public LocalClass()
    {
        ExtensionsSpec stam = new ExtensionsSpec();
        _extensions = new Vector<ExtensionsSpec>();
        _extensions.add(stam);

        _localId = "_loclaId";

    }

    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        JsonArray arr = new JsonArray();
        for(ExtensionsSpec item  : _extensions)
        {
            arr.add(item.toJSON());
        }
        obj.set("extensions" , arr);
        obj.set("local-id" , _localId);

        return obj;
    }
}
