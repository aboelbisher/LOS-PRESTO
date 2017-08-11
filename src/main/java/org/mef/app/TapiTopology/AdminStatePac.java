package org.mef.app.TapiTopology;


import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class AdminStatePac
{
    public String _administrativeState = "_administrativeState"; //administrative-state
    public String _operationalState = "_operationalState"; // operational-state
    public String _lifecycleState = "_lifecycleState"; // lifecycle-state


    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        obj.set("administrative-state" , _administrativeState);
        obj.set("operational-state" , _operationalState );
        obj.set("lifecycle-state" , _lifecycleState);

        return obj;
    }


}
