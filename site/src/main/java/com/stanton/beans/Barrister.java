package com.stanton.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import java.util.Calendar;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoHtml;
import java.util.List;
import com.stanton.beans.Specialisms;
import com.stanton.beans.Recommendations;
import org.hippoecm.hst.content.beans.standard.HippoBean;
import com.stanton.beans.Imageset;

@HippoEssentialsGenerated(internalName = "directaccess:barrister")
@Node(jcrType = "directaccess:barrister")
public class Barrister extends BaseDocument {
    @HippoEssentialsGenerated(internalName = "directaccess:name")
    public String getName() {
        return getProperty("directaccess:name");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:calldate")
    public Calendar getCalldate() {
        return getProperty("directaccess:calldate");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:overview")
    public HippoHtml getOverview() {
        return getHippoHtml("directaccess:overview");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:Specialisms")
    public List<Specialisms> getSpecialisms() {
        return getChildBeansByName("directaccess:Specialisms",
                Specialisms.class);
    }

    @HippoEssentialsGenerated(internalName = "directaccess:expertise")
    public HippoHtml getExpertise() {
        return getHippoHtml("directaccess:expertise");
    }

    @HippoEssentialsGenerated(internalName = "directaccess:Recommendations")
    public List<Recommendations> getRecommendations() {
        return getChildBeansByName("directaccess:Recommendations",
                Recommendations.class);
    }

    @HippoEssentialsGenerated(internalName = "directaccess:chambers")
    public HippoBean getChambers() {
        return getLinkedBean("directaccess:chambers", HippoBean.class);
    }

    @HippoEssentialsGenerated(internalName = "directaccess:imagelink")
    public Imageset getImagelink() {
        return getLinkedBean("directaccess:imagelink", Imageset.class);
    }
}
