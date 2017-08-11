package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

import java.util.List;
import java.util.Vector;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class TransferCapacityPac
{
    public List<Capacity> _capacityAssignedToUserView;
    public Capacity _availableCapacity;
    public Capacity _totalPotentialCapacity;
    public String _capacityInteractionAlgorithm;



    public TransferCapacityPac()
    {
        _availableCapacity = new Capacity();
        _totalPotentialCapacity = new Capacity();

        Capacity stam = new Capacity();

        _capacityAssignedToUserView = new Vector<Capacity>();
        _capacityAssignedToUserView.add(stam);

        _capacityInteractionAlgorithm = "_capacityInteractionAlgorithm";
    }


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        JsonArray arr = new JsonArray();

        for(Capacity item : _capacityAssignedToUserView)
        {
            arr.add(item.toJSON());
        }

        obj.set("total-potential-capacity" , _totalPotentialCapacity.toJSON());
        obj.set("available-capacity" , _availableCapacity.toJSON());
        obj.set("capacity-assigned-to-user-view" , arr);
        obj.set("capacity-interaction-algorithm" , _capacityInteractionAlgorithm);

        return obj;
    }


}
