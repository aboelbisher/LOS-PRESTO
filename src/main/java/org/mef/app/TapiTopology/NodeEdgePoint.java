package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class NodeEdgePoint extends ResourceSpec
{
    public List<LayerProtocol> _layerProtocol;
    public Direction _direction = Direction.BIDIRECTIONAL;
    public AdminStatePac _state;
    public List<String> _clientNodeEdgePoint;
    public List<String> _mappedServiceEndPoint;


    public NodeEdgePoint()
    {
        LayerProtocol stamName = new LayerProtocol();
        _layerProtocol = new Vector<LayerProtocol>();
        _layerProtocol.add(stamName);

        _direction = Direction.BIDIRECTIONAL;

        _state = new AdminStatePac();

        _clientNodeEdgePoint = new Vector<String>();
        _clientNodeEdgePoint.add("_clientNodeEdgePoint");

        _mappedServiceEndPoint = new Vector<String>();
        _mappedServiceEndPoint.add("_mappedServiceEndPoint");


    }


    public JsonObject toJSON()
    {
        JsonObject obj = super.toJSON();

        JsonArray layerProtArr = new JsonArray();
        for(LayerProtocol item : _layerProtocol)
        {
            layerProtArr.add(item.toJSON());
        }
        obj.set("layer-protocol" , layerProtArr);

        obj.set("direction" , "BIDIRECTIONAL");

        obj.set("state" , _state.toJSON());

        JsonArray nodeEdgePointarr = new JsonArray();
        for(String item : _clientNodeEdgePoint)
        {
            nodeEdgePointarr.add(item);
        }
        obj.set("client-node-edge-point" , nodeEdgePointarr);

        JsonArray mappedServiceArr = new JsonArray();
        for(String item : _mappedServiceEndPoint)
        {
            mappedServiceArr.add(item);
        }
        obj.set("mapped-service-interface-point" , mappedServiceArr);

        return obj;
    }
}
