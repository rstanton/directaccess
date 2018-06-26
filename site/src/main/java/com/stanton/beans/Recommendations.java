package com.stanton.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoCompound;
import java.util.Calendar;

@HippoEssentialsGenerated(internalName = "directaccess:Recommendations")
@Node(jcrType = "directaccess:Recommendations")
public class Recommendations extends HippoCompound {
    @HippoEssentialsGenerated(internalName = "directaccess:publication")
    public String getPublication() {
        return getProperty("directaccess:publication");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:date")
    public Calendar getDate() {
        return getProperty("directaccess:date");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:extract")
    public String getExtract() {
        return getProperty("directaccess:extract");
    }
}
