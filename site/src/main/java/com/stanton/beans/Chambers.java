package com.stanton.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import com.stanton.beans.Address;

@HippoEssentialsGenerated(internalName = "directaccess:Chambers")
@Node(jcrType = "directaccess:Chambers")
public class Chambers extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "directaccess:name")
    public String getName() {
        return getProperty("directaccess:name");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:Address")
    public Address getAddress() {
        return getBean("directaccess:Address", Address.class);
    }
}
