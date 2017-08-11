package org.mef.app.TapiTopology;


import com.eclipsesource.json.JsonObject;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class LinkPort
{
    public String _nodeEdgePoint = "_nodeEdgePoint";
    public Direction _direction = Direction.BIDIRECTIONAL;
    public Role _role = Role.LEAF;


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        obj.set("node-edge-point" , _nodeEdgePoint);
        obj.set("direction" , "BIDIRECTIONAL");
        obj.set("role" ,"LEAF");

        return obj;
    }

}
