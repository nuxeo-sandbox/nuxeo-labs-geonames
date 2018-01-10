package org.nuxeo.labs.geonames.core.operations;

import org.apache.commons.lang3.StringUtils;
import org.nuxeo.ecm.automation.core.Constants;
import org.nuxeo.ecm.automation.core.annotations.Context;
import org.nuxeo.ecm.automation.core.annotations.Operation;
import org.nuxeo.ecm.automation.core.annotations.OperationMethod;
import org.nuxeo.ecm.automation.core.annotations.Param;
import org.nuxeo.ecm.core.api.CoreSession;
import org.nuxeo.ecm.core.api.DocumentModel;
import org.nuxeo.ecm.core.api.PathRef;
import org.nuxeo.labs.geonames.core.GeoNamesConstants;

import java.util.HashMap;

/**
 *
 */
@Operation(id = FindNearbyPostalCodesOp.ID, category = Constants.CAT_SERVICES, label = "Find Nearby Postal Codes", description = "Use GeoNames API to find nearby postal codes. Pass either postalcode or lat and lng.")
public class FindNearbyPostalCodesOp {

  public static final String ID = "GeoNames.FindNearbyPostalCodesOp";

  @Context
  protected CoreSession session;

  @Param(name = GeoNamesConstants.PARAM_POSTALCODE, required = false)
  protected String postalcode;

  @Param(name = GeoNamesConstants.PARAM_COUNTRY, required = false)
  protected String country;

  @Param(name = GeoNamesConstants.PARAM_RADIUS, required = false)
  protected String radius;

  @Param(name = GeoNamesConstants.PARAM_MAXROWS, required = false)
  protected String maxRows;

  @Param(name = GeoNamesConstants.PARAM_LAT, required = false)
  protected String lat;

  @Param(name = GeoNamesConstants.PARAM_LNG, required = false)
  protected String lng;

  @Param(name = GeoNamesConstants.PARAM_STYLE, required = false)
  protected String style;

  @Param(name = GeoNamesConstants.PARAM_LOCALCOUNTRY, required = false)
  protected String localCountry;

  @OperationMethod
  public DocumentModel run() {
    HashMap<String, String> apiParams = new HashMap<String, String>();


    if (!StringUtils.isBlank(postalcode)) {
      // Use postalcode search
      apiParams.put(GeoNamesConstants.PARAM_POSTALCODE, postalcode);
      apiParams.put(GeoNamesConstants.PARAM_COUNTRY, country);
      apiParams.put(GeoNamesConstants.PARAM_RADIUS, radius);
      apiParams.put(GeoNamesConstants.PARAM_MAXROWS, maxRows);

      return session.getRootDocument();
    } else {
      // Use lat + lng search
      apiParams.put(GeoNamesConstants.PARAM_LAT, lat);
      apiParams.put(GeoNamesConstants.PARAM_LNG, lng);
      apiParams.put(GeoNamesConstants.PARAM_RADIUS, radius);
      apiParams.put(GeoNamesConstants.PARAM_MAXROWS, maxRows);
      apiParams.put(GeoNamesConstants.PARAM_STYLE, style);
      apiParams.put(GeoNamesConstants.PARAM_COUNTRY, country);
      apiParams.put(GeoNamesConstants.PARAM_LOCALCOUNTRY, localCountry);

      return session.getDocument(new PathRef(postalcode));
    }
  }
}
