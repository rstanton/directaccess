package com.stanton.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoCompound;

@HippoEssentialsGenerated(internalName = "directaccess:Specialisms")
@Node(jcrType = "directaccess:Specialisms")
public class Specialisms extends HippoCompound {
    @HippoEssentialsGenerated(internalName = "directaccess:specialism")
    public String getSpecialism() {
        return getProperty("directaccess:specialism");
    }
}
