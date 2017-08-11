package org.mef.app.TapiTopology;

import com.eclipsesource.json.Json;
import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class Node extends ResourceSpec
{
    public List<String> _layerProtocolName;
    public AdminStatePac _state;
    public TransferTimingPac _transferTiming;
    public List<NodeEdgePoint> _ownedNodeEdgePoint;
    public String _encapTopology;
    public TransferCapacityPac _transferCapacity;
    public TransferCostPac _transferCost;
    public List<String> _aggregatedNodeEdgePoint;
    public TransferIntegrityPac _transferIntegrity;


    private final Logger log = LoggerFactory.getLogger(getClass());

    public Node()
    {
        _layerProtocolName = new Vector<String>();
        _layerProtocolName.add("_layerProtocolName");
        _state = new AdminStatePac();
        _transferTiming = new TransferTimingPac();
        _ownedNodeEdgePoint = new Vector<NodeEdgePoint>();
        NodeEdgePoint nodeStam = new NodeEdgePoint();
        _ownedNodeEdgePoint.add(nodeStam);
        _encapTopology = "_encapTopology";
        _transferCapacity = new TransferCapacityPac();
        _transferCost = new TransferCostPac();
        _aggregatedNodeEdgePoint = new Vector<String>();
        _transferIntegrity = new TransferIntegrityPac();
    }

    public JsonObject toJSON()
    {
        log.info("here1 ");
        JsonObject obj = super.toJSON();

        log.info("after calling super " + obj.toString());

        JsonArray layerProtocolNameArr = new JsonArray();
        for(String item : _layerProtocolName)
        {
            layerProtocolNameArr.add(item);
        }
        obj.set("layer-protocol-name" , layerProtocolNameArr);
        obj.set("state" , _state.toJSON());
        obj.set("transfer-timing" , _transferTiming.toJSON());

        JsonArray ownededgePintArr = new JsonArray();
        for(NodeEdgePoint edgePoint : _ownedNodeEdgePoint)
        {
            ownededgePintArr.add(edgePoint.toJSON());
        }
        obj.set("owned-node-edge-point" , ownededgePintArr);

        obj.set("encap-topology" , _encapTopology);

        obj.set("transfer-capacity" , _transferCapacity.toJSON());

        obj.set("transfer-cost" , _transferCost.toJSON());

        JsonArray aggregatedArr = new JsonArray();
        for(String item : _aggregatedNodeEdgePoint)
        {
            aggregatedArr.add(item);
        }
        obj.set("aggregated-edge-point" , aggregatedArr);

        obj.set("transfer-integrity" , _transferIntegrity.toJSON());


        return obj;
    }


}
