package org.mef.app.TapiTopology;
import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.*;
/**
 * Created by Aboelbisher on 18/06/2017.
 */
public class TapiTopology extends ResourceSpec
{
    public List<Node> _node;
    public List<String> _layerProtocolName;
    public List<TapiLink> _link;



    public JsonObject toJSON()
    {

        JsonObject obj = super.toJSON();

        JsonArray nodesArr = new JsonArray();
        for(Node item : _node)
        {

            nodesArr.add(item.toJSON());
        }
        obj.set("node" , nodesArr);

        JsonArray layerArr = new JsonArray();
        for(String item : _layerProtocolName)
        {
            layerArr.add(item);
        }
        obj.set("layer-protocol-name" , layerArr);

        JsonArray linksArr = new JsonArray();
        for(TapiLink item : _link)
        {
            linksArr.add(item.toJSON());
        }
        obj.set("link" , linksArr);

        return obj;
    }
}
