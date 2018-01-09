package org.nuxeo.labs.geonames.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.ecm.platform.test.PlatformFeature;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;

import com.google.inject.Inject;

@RunWith(FeaturesRunner.class)
@Features({ PlatformFeature.class })
@Deploy("org.nuxeo.labs.geonames.core.nuxeo-labs-geonames-core")
public class TestGeoNames {

    @Inject
    protected GeoNames geonames;

    @Test
    public void testService() {
        assertNotNull(geonames);
    }
}
