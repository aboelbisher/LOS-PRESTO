package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class LayerProtocolTransitionPac
{
    public List<String> _nodeEdgePoint;
    public List<String> _transitionedLayerProtocolName;


    public LayerProtocolTransitionPac()
    {
        _nodeEdgePoint = new Vector<String>();
        _nodeEdgePoint.add("_nodeEdgePoint");

        _transitionedLayerProtocolName = new Vector<String>();
        _transitionedLayerProtocolName.add("_transitionedLayerProtocolName");

    }


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        JsonArray nodeEdgeArr = new JsonArray();
        for(String item : _nodeEdgePoint)
        {
            nodeEdgeArr.add(item);
        }
        obj.set("node-edge-point" , nodeEdgeArr);


        JsonArray transArr = new JsonArray();
        for(String item : _transitionedLayerProtocolName)
        {
            transArr.add(item);
        }
        obj.set("transitioned-layer-protocol-name" , transArr);


        return obj;
    }
}
