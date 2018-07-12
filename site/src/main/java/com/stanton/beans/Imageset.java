package com.stanton.beans;

import org.onehippo.cms7.essentials.dashboard.annotations.HippoEssentialsGenerated;
import org.hippoecm.hst.content.beans.Node;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageSet;
import org.hippoecm.hst.content.beans.standard.HippoGalleryImageBean;

@HippoEssentialsGenerated(internalName = "directaccess:imageset")
@Node(jcrType = "directaccess:imageset")
public class Imageset extends HippoGalleryImageSet {
    @HippoEssentialsGenerated(internalName = "directaccess:smallsquare")
    public HippoGalleryImageBean getSmallsquare() {
        return getBean("directaccess:smallsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "directaccess:mediumsquare")
    public HippoGalleryImageBean getMediumsquare() {
        return getBean("directaccess:mediumsquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "directaccess:largesquare")
    public HippoGalleryImageBean getLargesquare() {
        return getBean("directaccess:largesquare", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "directaccess:small")
    public HippoGalleryImageBean getSmall() {
        return getBean("directaccess:small", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "directaccess:large")
    public HippoGalleryImageBean getLarge() {
        return getBean("directaccess:large", HippoGalleryImageBean.class);
    }

    @HippoEssentialsGenerated(internalName = "directaccess:banner")
    public HippoGalleryImageBean getBanner() {
        return getBean("directaccess:banner", HippoGalleryImageBean.class);
    }
}
