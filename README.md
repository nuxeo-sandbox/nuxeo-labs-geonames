# About

This plugin provides a wrapper for the [Geonames Webservice API](http://www.geonames.org/export/web-services.html).

# Installation

* Edit `nuxeo.conf` and add your Geonames user name

```
org.geonames.api.username=your_user_name
```

* Install `geonames-1.1.13.jar` on the server (not available via Maven :( )

# Requirements

Build requires the following software:

* git
* maven
 
# Build

```
git clone https://github.com/nuxeo-sandbox/nuxeo-labs-geonames.git
cd nuxeo-labs-geonames
mvn clean install
```

# Deploy

Install the marketplace package from the admin center or using nuxeoctl.

## Support

**These features are not part of the Nuxeo Production platform.**

These solutions are provided for inspiration and we encourage customers to use them as code samples and learning resources.

This is a moving project (no API maintenance, no deprecation process, etc.) If any of these solutions are found to be useful for the Nuxeo Platform in general, they will be integrated directly into platform, not maintained here.

# License
[Apache License, Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)
 
# About Nuxeo
The [Nuxeo Platform](http://www.nuxeo.com/products/content-management-platform/) is an open source customizable and extensible content management platform for building business applications. It provides the foundation for developing [document management](http://www.nuxeo.com/solutions/document-management/), [digital asset management](http://www.nuxeo.com/solutions/digital-asset-management/), [case management application](http://www.nuxeo.com/solutions/case-management/) and [knowledge management](http://www.nuxeo.com/solutions/advanced-knowledge-base/). You can easily add features using ready-to-use addons or by extending the platform using its extension point system.
 
The Nuxeo Platform is developed and supported by Nuxeo, with contributions from the community.
 
Nuxeo dramatically improves how content-based applications are built, managed and deployed, making customers more agile, innovative and successful. Nuxeo provides a next generation, enterprise ready platform for building traditional and cutting-edge content oriented applications. Combining a powerful application development environment with
SaaS-based tools and a modular architecture, the Nuxeo Platform and Products provide clear business value to some of the most recognizable brands including Verizon, Electronic Arts, Sharp, FICO, the U.S. Navy, and Boeing. Nuxeo is headquartered in New York and Paris.
More information is available at [www.nuxeo.com](http://www.nuxeo.com).