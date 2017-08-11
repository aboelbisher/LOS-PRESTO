package org.mef.app.TapiTopology;

/**
 * Created by Aboelbisher on 19/06/2017.
 */

import com.eclipsesource.json.JsonArray;
import com.eclipsesource.json.JsonObject;


public class Capacity
{
    public String _committedInformationRate = "_committedInformationRate";
    public Packetbwprofiletype _packetBwProfileType; //NOT_APPLICABLE;
    public Totalsize _totalSize; // NOT_APPLICABLE;
    public String _committedBurstSize = "_committedBurstSize" ;
    public String _peakBurstSize = "_peakBurstSize";
    public String _peakInformationRate = "_peakInformationRate";
    public boolean _couplingFlag = false;
    public boolean _colorAware = false;



    public JsonObject toJSON()
    {
        JsonObject obj = new JsonObject();

        obj.set("committed-information-rate" , _committedInformationRate);
        obj.set("total-size" , "NOT_APPLICABLE");
        obj.set("committed-burst-size" , _committedBurstSize);
        obj.set("packet-bw-profile-type" , "NOT_APPLICABLE");
        obj.set("peak-information-rate" , _peakInformationRate);
        obj.set("peak-burst-size" , _peakBurstSize);
        obj.set("color-aware" , _colorAware);
        obj.set("coupling-flag" , _couplingFlag);

        return obj;
    }




}

