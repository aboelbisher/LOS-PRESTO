package org.mef.app.TapiTopology;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.naming.Name;
import java.util.*;

/**
 * Created by Aboelbisher on 18/06/2017.
 */
public class GlobalClass
{
    public List<ExtensionsSpec> _extensions;
    public String _uuid ;
    public List<NameAndValue> _name;
    public List<NameAndValue> _label;


    private final Logger log = LoggerFactory.getLogger(getClass());


    public GlobalClass()
    {
        _extensions = new Vector<ExtensionsSpec>();
        ExtensionsSpec stam = new ExtensionsSpec();
        _extensions.add(stam);

        _uuid = "uuid";

        NameAndValue stamNameAndValue = new NameAndValue();
        _name = new Vector<NameAndValue>();
        _name.add(stamNameAndValue);

        _label = new Vector<NameAndValue>();
        _label.add(stamNameAndValue);

    }


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        JsonArray arr1 = new JsonArray();
        for(ExtensionsSpec item : _extensions)
        {
            arr1.add(item.toJSON());
        }
        obj.set("extensions" , arr1);

        log.info("uuid is : " + _uuid.toString());


        obj.set("uuid" , _uuid);

        JsonArray arr2 = new JsonArray();
        for(NameAndValue item : _name)
        {
            arr2.add(item.toJSON());
        }
        obj.set("name" , arr2);

        JsonArray arr3 = new JsonArray();
        for(NameAndValue item : _label)
        {
            arr3.add(item.toJSON());
        }
        obj.set("label" , arr3);

        return obj;
    }


}
