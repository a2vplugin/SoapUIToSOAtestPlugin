# SOAtest Converter Plugin

Use the SOAtest Converter Plugin to convert SoapUI projects into SOAtest projects. This plugin requires SoapUI Pro and has been validated against version 5.1.2.

## Installation
1. Build the project and export to a java jar file
1. Open SoapUI Pro 5.1.2
1. In the tool bar, click "Configures SoapUI Plugins". A dialog will appear
<br/>![](https://raw.githubusercontent.com/a2vplugin/SoapUIToSOAtestPlugin/master/readme-resources/ConfiguresSoapUIPlugins.png "Click 'Configures SoapUI Plugins'")
1. Click "Load plugin from file" and select the SOAtest Converter Plugin jar file. Once successfully loaded you will see the SOAtest Converter Plugin in the list of installed plugins.
<br/>![](https://raw.githubusercontent.com/a2vplugin/SoapUIToSOAtestPlugin/master/readme-resources/LoadPluginFromFile.png "Entry shown when successfully loaded")
1. In the tool bar, click "Sets Global SoapUI Preference" to configure global properties
<br/>![](https://raw.githubusercontent.com/a2vplugin/SoapUIToSOAtestPlugin/master/readme-resources/SetGlobalSoapUIPreferences.png "Click 'Sets Global SoapUI Preferences'")
<br/>![](https://raw.githubusercontent.com/a2vplugin/SoapUIToSOAtestPlugin/master/readme-resources/GlobalProperties.png "Choose 'Global Properties'")
1. Configure the following properties to allow the plugin to communicate with your SOAtest server
   * soatest.api.url: Points to your SOAtest server. For example: `http://192.168.24.95:9080`
   * soatest.api.log.level: Indicates the level of logging in the "SoapUI Log" view. Possible values are error, warn, info, and debug
   * soatest.api.username: Your SOAtest server user name
   * soatest.api.password: Your SOAtest server password
1. Right-click the project node in SoapUI and choose "Convert to SOAtest" on the popup menu

## Limits and Implemented Features
### Structure Implementation Details
* __SOAP Interface__
   * Interface converts to .tst file
   * Operator converts to test suite
   * Request converts to SOAP Client
* __REST Interface__
   * Interface converts to .tst file
   * Resource converts to test suite; supports recursion
   * Method and request converts to REST tool
* __TestSuite__
   * Test Suite converts to folder
   * Test Case converts to .tst file
   * Test Steps and Test Step converts to tool
* __Soap Mock__
   * Only basic support. Does not support correlations.
   * Interface converts to .pva file
   * Operator converts to responder suite
   * Response converts to Message Responder
* __Rest Mock__
   * Only basic support. Does not support correlations.
   * Interface converts to .pva file
   * Method converts to responder suite
   * Response converts to Message Responder
* __API Security__
   * Global preference in SoapUI
   * soatest.api.username=admin
   * soatest.api.password=admin
* __Log Level__
   * Global preference in SoapUI
   * soatest.api.log.level=error|warn|info|debug
* __Server URL__
   * Global preference in SoapUI
   * soatest.api.url=`http://localhost:9080`
* __Data Source Loop__
   * All steps in data loop will be packed as a test suite

### Client Implementation Details
* __SOAP Client__
   * Supports headers
   * Supports basic security authentication
   * Supports TestStep properties
   * Supports using values from previous tests
   * Supports using values from previous test with namespaces declared
   * Supports using values from previous test with a default namespace declared
* __REST Client__
   * Implementation is similar to SOAP Clients
* __HTTP Client__
   * Not implemented
* __AMF__
   * Not implemented
* __JDBC__
   * JDBC jar files must be added manually
* __Assert__
   * Supports SoapFault
   * Supports NotSoapFault
   * Others not yet supported
* __Properties__
   * Only basic support
* __Property Transfer__
   * Not implemented
* __Data Source__
   * Supports excel data sources
   * Other data sources convert to placeholder excel data sources
   
## Known Issues
1. Converter does not support any SoapUI model names that contain a forward slash "/"
