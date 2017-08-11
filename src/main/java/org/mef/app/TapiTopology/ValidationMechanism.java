package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonObject;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class ValidationMechanism
{
    public String _layerProtocolAdjacencyValidated = "_layerProtocolAdjacencyValidated";
    public String _validationMechanism = "_validationMechanism";
    public String _validationRobustness = "_validationRobustness";

    public JsonObject toJSON()
    {
        JsonObject json = new JsonObject();

        json.set("layer-protocol-adjacency-validated" , _layerProtocolAdjacencyValidated);
        json.set("validation-mechanism" , _validationMechanism);
        json.set("validation-robustness" , _validationRobustness);

        return json;

    }
}
