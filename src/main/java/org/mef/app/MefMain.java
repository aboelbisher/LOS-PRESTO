/*
 * Copyright 2017-present Open Networking Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mef.app;


import org.apache.felix.scr.annotations.Activate;
import org.apache.felix.scr.annotations.Component;
import org.apache.felix.scr.annotations.Deactivate;
import org.apache.felix.scr.annotations.Service;
import org.mef.app.TapiTopology.Node;
import org.mef.app.TapiTopology.*;
import org.onosproject.net.topology.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;




import org.apache.felix.scr.annotations.Reference;
import org.apache.felix.scr.annotations.ReferenceCardinality;
import org.onosproject.core.ApplicationId;
import org.onosproject.net.Host;
import org.onosproject.net.HostId;
import org.onosproject.net.PortNumber;
import org.onosproject.core.CoreService;
import org.onosproject.net.flow.DefaultTrafficSelector;
import org.onosproject.net.flow.DefaultTrafficTreatment;
import org.onosproject.net.flow.TrafficSelector;
import org.onosproject.net.flow.TrafficTreatment;
import org.onlab.util.GuavaCollectors;
import org.onosproject.event.ListenerService;
import org.onosproject.net.ConnectPoint;
import org.onosproject.net.DeviceId;
import org.onosproject.net.DisjointPath;
import org.onosproject.net.Link;
//import org.onosproject.net.Path;
import org.onosproject.net.host.HostService;
import org.onosproject.net.intent.HostToHostIntent;
import org.onosproject.net.intent.IntentService;
import org.onosproject.net.packet.DefaultOutboundPacket;
import org.onosproject.net.packet.InboundPacket;
import org.onosproject.net.packet.OutboundPacket;
import org.onosproject.net.packet.PacketContext;
import org.onosproject.net.packet.PacketProcessor;
import org.onosproject.net.packet.PacketService;


import org.onlab.packet.Ethernet;

import javax.validation.constraints.Null;


@Component(immediate = true)
@Service
public class MefMain implements MefService
{

    private final Logger log = LoggerFactory.getLogger(getClass());


    // topology information
    @Reference(cardinality = ReferenceCardinality.MANDATORY_UNARY)
    public TopologyService topologyService;




    
    @Activate
    protected void activate()
    {
        log.info("**Activate**");

        if (topologyService != null)
        {
            Topology topoDesc =  topologyService.currentTopology();
        }
        else
        {
            log.info("topology service ERROR !!");
        }
    }
    
    @Deactivate
    protected void deactivate()
    {
        log.info("**Deactivate**");
    }



    //MefService implementation
    @Override
    public TapiTopology getTopologyDetails()
    {
        if (topologyService != null)
        {
            Topology topoDesc =  topologyService.currentTopology();

            TopologyGraph graph =  topologyService.getGraph(topoDesc);

            TapiTopology topo = new TapiTopology();


            Vector<Node> nodes = new Vector<Node>();
            for ( TopologyVertex vertex : graph.getVertexes()) 
            {
                Node node = new Node();
                node._uuid = vertex.toString();
                nodes.add(node);
//                log.info("node Name : " + vertex.toString()); //Integer.toString(link.getID()));
            }
            

            log.info("finished printing links description");

            // List<Node> nodeList = topoDesc.getNode();
            // List<Link> linkList = topoDesc.getLink();

            Vector<TapiLink> links = new Vector<TapiLink>();

            for(TopologyEdge edge : graph.getEdges())
            {
                TapiLink link = new TapiLink();
                link._uuid = edge.toString();
                links.add(link);
            }

            topo._link = links;
            topo._node = nodes;

            // log.info("finished printing links description");


            return topo;

        }


        return new TapiTopology();

    }
    
}
