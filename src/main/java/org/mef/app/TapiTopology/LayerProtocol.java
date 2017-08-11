package org.mef.app.TapiTopology;

import com.eclipsesource.json.JsonObject;

/**
 * Created by Aboelbisher on 19/06/2017.
 */
public class LayerProtocol extends LocalClass
{
    public String _terminationState = "_terminationState";
    public Layerprotocolname _layerProtocolName = Layerprotocolname.OCH;
    public Terminationdirection _terminationDirection; // UNDEFINED_OR_UNKNOWN


    public JsonObject toJSON()
    {

        JsonObject obj = super.toJSON();

        obj.set("termination-state" ,_terminationState );
        obj.set("layer-protocol-name" , "OCH");
        obj.set("termination-direction" , "UNDEFINED_OR_UNKNOWN");


        return obj;

    }

}
