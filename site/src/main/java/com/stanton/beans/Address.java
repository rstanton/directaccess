package com.stanton.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoCompound;

@HippoEssentialsGenerated(internalName = "directaccess:Address")
@Node(jcrType = "directaccess:Address")
public class Address extends HippoCompound {
    @HippoEssentialsGenerated(internalName = "directaccess:buildingname")
    public String getBuildingname() {
        return getProperty("directaccess:buildingname");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:buildingnumber")
    public String getBuildingnumber() {
        return getProperty("directaccess:buildingnumber");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:Street")
    public String getStreet() {
        return getProperty("directaccess:Street");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:Town")
    public String getTown() {
        return getProperty("directaccess:Town");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:county")
    public String getCounty() {
        return getProperty("directaccess:county");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:country")
    public String getCountry() {
        return getProperty("directaccess:country");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:postcode")
    public String getPostcode() {
        return getProperty("directaccess:postcode");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:latlong")
    public String getLatlong() {
        return getProperty("directaccess:latlong");
    }
}
