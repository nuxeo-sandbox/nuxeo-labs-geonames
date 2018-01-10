package org.nuxeo.labs.geonames.services;

import static org.junit.Assert.assertNotNull;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.nuxeo.ecm.platform.test.PlatformFeature;
import org.nuxeo.runtime.RuntimeService;
import org.nuxeo.runtime.api.Framework;
import org.nuxeo.runtime.test.runner.Deploy;
import org.nuxeo.runtime.test.runner.Features;
import org.nuxeo.runtime.test.runner.FeaturesRunner;

import com.google.inject.Inject;

@RunWith(FeaturesRunner.class)
@Features({PlatformFeature.class})
@Deploy("org.nuxeo.labs.geonames.core.nuxeo-labs-geonames-core")
public class TestGeoNamesService {

  @Inject
  protected GeoNames geonames;

  @Test
  public void isNuxeoStarted() {
    Assert.assertNotNull("Runtime is not available", Framework.getRuntime());
  }

  @Test
  public void isComponentLoaded() {
    RuntimeService runtime = Framework.getRuntime();
    assertNotNull("Component is not available",runtime.getComponent("org.nuxeo.labs.geonames.services.GeoNames"));
  }

  @Test
  public void testService() {
    assertNotNull(geonames);
  }
}
