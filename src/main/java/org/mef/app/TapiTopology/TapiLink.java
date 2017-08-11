package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class TapiLink extends ResourceSpec
{
    public Direction _direction = Direction.BIDIRECTIONAL;
    public List<String> _layerProtocolName;
    public TransferCapacityPac _transferCapacity;
    public AdminStatePac _state ;
    public List<LinkPort> _linkPort;
    public String _node;
    public TransferIntegrityPac _transferIntegrity;
    public LayerProtocolTransitionPac _lpTransition;
    public TransferCostPac _transferCost ;
    public RiskParameterPac _riskParameter;
    public TransferTimingPac _transferTiming;
    public ValidationPac _validation;

    public TapiLink()
    {
        _direction = Direction.BIDIRECTIONAL;
        _layerProtocolName = new Vector<String>();
        _layerProtocolName.add("_layerProtocolName");
        _transferCapacity = new TransferCapacityPac();
        _state = new AdminStatePac();
        _linkPort = new Vector<LinkPort>();
        _linkPort.add(new LinkPort());
        _node = "_node";
        _transferIntegrity = new TransferIntegrityPac();
        _lpTransition = new LayerProtocolTransitionPac();
        _transferCost = new TransferCostPac();
        _riskParameter = new RiskParameterPac();
        _transferTiming = new TransferTimingPac();
        _validation = new ValidationPac();
    }

    public JsonObject toJSON()
    {
        JsonObject obj = super.toJSON();

        obj.set("direction" , "BIDIRECTIONAL");

        JsonArray arr1 = new JsonArray();
        for (String  item : _layerProtocolName)
        {
            arr1.add(item);
        }
        obj.set("layer-protocol-name" , arr1);

        obj.set("transfer-capacity" , _transferCapacity.toJSON());
        obj.set("state" , _state.toJSON());

        JsonArray arr2 = new JsonArray();
        for(LinkPort item : _linkPort)
        {
            arr2.add(item.toJSON());
        }
        obj.set("link-port" , arr2);

        obj.set("node" , _node);
        obj.set("transfer-intefrity" , _transferIntegrity.toJSON());
        obj.set("layer-protocol-transistion" , _lpTransition.toJSON());
        obj.set("transfer-cost" , _transferCost.toJSON());
        obj.set("risk-parameter" , _riskParameter.toJSON());
        obj.set("transfer-timing" , _transferTiming.toJSON());
        obj.set("validation" , _validation.toJSON());


        return obj;
    }
}
