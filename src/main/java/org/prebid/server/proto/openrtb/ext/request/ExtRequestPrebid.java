package org.prebid.server.proto.openrtb.ext.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.node.ObjectNode;
import lombok.Builder;
import lombok.Value;
import org.prebid.server.auction.model.PaaFormat;
import org.prebid.server.floors.model.PriceFloorRules;
import org.prebid.server.json.deserializer.IntegerFlagDeserializer;

import java.util.List;
import java.util.Map;

/**
 * Defines the contract for bidrequest.ext.prebid
 */
@Builder(toBuilder = true)
@Value
public class ExtRequestPrebid {

    /**
     * Defines the contract for bidrequest.ext.prebid.debug
     */
    @JsonDeserialize(using = IntegerFlagDeserializer.class)
    Integer debug;

    /**
     * Defines the contract for bidrequest.ext.prebid.returnallbidstatus
     */
    Boolean returnallbidstatus;

    /**
     * Defines the contract for bidrequest.ext.prebid.trace
     */
    TraceLevel trace;

    /**
     * Defines the contract for bidrequest.ext.prebid.aliases
     */
    Map<String, String> aliases;

    /**
     * Defines the contract for bidrequest.ext.prebid.aliasgvlids
     */
    Map<String, Integer> aliasgvlids;

    /**
     * Defines the contract for bidrequest.ext.prebid.bidadjustmentfactors
     */
    ExtRequestBidAdjustmentFactors bidadjustmentfactors;

    /**
     * Defines the contract for bidrequest.ext.prebid.bidadjustments
     */
    ObjectNode bidadjustments;

    /**
     * Defines the contract for bidrequest.ext.prebid.currency
     */
    ExtRequestCurrency currency;

    /**
     * Defines the contract for bidrequest.ext.prebid.targeting
     */
    ExtRequestTargeting targeting;

    /**
     * Defines the contract for bidrequest.ext.prebid.supportdeals
     */
    Boolean supportdeals;

    /**
     * Defines the contract for bidrequest.ext.prebid.storedrequest
     */
    ExtStoredRequest storedrequest;

    /**
     * Defines the contract for bidrequest.ext.prebid.storedauctionresponse
     */
    @JsonProperty("storedauctionresponse")
    ExtStoredAuctionResponse storedAuctionResponse;

    /**
     * Defines the contract for bidrequest.ext.prebid.cache
     */
    ExtRequestPrebidCache cache;

    /**
     * Defines the contract for bidrequest.ext.prebid.data
     */
    ExtRequestPrebidData data;

    /**
     * Defines the contract for bidrequest.ext.prebid.bidderconfig
     */
    List<ExtRequestPrebidBidderConfig> bidderconfig;

    /**
     * Defines the contract for bidrequest.ext.prebid.events
     */
    ObjectNode events;

    /**
     * Defines the contract for bidrequest.ext.prebid.schains
     */
    List<ExtRequestPrebidSchain> schains;

    /**
     * Defines the contract for bidrequest.ext.prebid.nosale
     */
    List<String> nosale;

    /**
     * Defines the contract for bidrequest.ext.prebid.auctiontimestamp
     */
    Long auctiontimestamp;

    /**
     * Defines the contract for bidrequest.ext.prebid.bidders
     */
    ObjectNode bidders;

    /**
     * Defines the contract for bidrequest.ext.prebid.biddercontrols
     */
    ObjectNode biddercontrols;

    /**
     * Defines the contract for bidrequest.ext.prebid.amp
     */
    ExtRequestPrebidAmp amp;

    /**
     * Defines the contract for bidrequest.ext.prebid.adservertargeting
     */
    List<ExtRequestPrebidAdservertargetingRule> adservertargeting;

    /**
     * Defines the contract for bidrequest.ext.prebid.integration
     */
    String integration;

    /**
     * Defines the contract for bidrequest.ext.prebid.channel
     */
    ExtRequestPrebidChannel channel;

    /**
     * Defines the contract for bidrequest.ext.prebid.multibid
     */
    List<ExtRequestPrebidMultiBid> multibid;

    /**
     * Defines the contract for bidrequest.ext.prebid.analytics
     */
    JsonNode analytics;

    /**
     * Defines the contract for bidrequest.ext.prebid.server
     */
    ExtRequestPrebidServer server;

    /**
     * Defines the contract for bidrequest.ext.prebid.bidderparams
     */
    ObjectNode bidderparams;

    /**
     * Defines the contract for bidrequest.ext.prebid.floors
     */
    PriceFloorRules floors;

    /**
     * Defines the contract for bidrequest.ext.prebid.passthrough
     */
    JsonNode passthrough;

    @JsonProperty("createtids")
    Boolean createTids;

    /**
     * Defines the contract for bidrequest.ext.prebid.sdk
     */
    ExtRequestPrebidSdk sdk;

    /**
     * Defines the contract for bidrequest.ext.prebid.paaformat
     */
    @JsonProperty("paaformat")
    PaaFormat paaFormat;

    @JsonProperty("alternatebiddercodes")
    ExtRequestPrebidAlternateBidderCodes alternateBidderCodes;
}
