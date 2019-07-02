{:namespaces
 ({:doc
   "\nThe API below was written regarding to the source code\nof different Webdriver implementations. All of them partially\ndiffer from the official W3C specification.\n\nThe standard:\nhttps://www.w3.org/TR/webdriver/\n\nChrome:\nhttps://chromium.googlesource.com/chromium/src/+/master/chrome/test/chromedriver/\n\nFirefox (Geckodriver):\nhttps://github.com/mozilla/geckodriver\nhttps://github.com/mozilla/webdriver-rust/\n\nPhantom.js (Ghostdriver)\nhttps://github.com/detro/ghostdriver/blob/\n",
   :name "etaoin.api",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.api-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj"}
  {:doc nil,
   :name "etaoin.client",
   :wiki-url
   "https://igrishaev.github.io/etaoinetaoin.client-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/d16c4c3329e798105200055f074846eadb99f094/src/etaoin/client.clj"}
  {:doc "\nA namespace to cover Chrome's devtools features.\n",
   :name "etaoin.dev",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.dev-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj"}
  {:doc
   "Some utilities to work with driver's data structure.\n\nNote: the functions below take not an atom but pure map\nto be used with swap!. Our further goal is to reduce atom usage\neverywhere it is possible.\n\nLinks for development:\n\nFirefox command line flags:\n/Applications/Firefox.app/Contents/MacOS/firefox-bin --help\n\nChrome binary path:\n/Applications/Google Chrome.app/Contents/MacOS/Google Chrome\n\nChrome CLI args:\nhttps://peter.sh/experiments/chromium-command-line-switches/\n\nChrome capabilities:\nhttps://sites.google.com/a/chromium.org/chromedriver/capabilities\n\nFirefox capabilities:\nhttps://github.com/mozilla/geckodriver/#firefox-capabilities\n\nFirefox profiles:\nhttps://support.mozilla.org/en-US/kb/profiles-where-firefox-stores-user-data\n\nSafari endpoints\nhttps://developer.apple.com/library/content/documentation/NetworkingInternetWeb/Conceptual/WebDriverEndpointDoc/Commands/Commands.html\n\nJSON Wire protocol (obsolete)\nhttps://github.com/SeleniumHQ/selenium/wiki/JsonWireProtocol\n\nSelenium Python source code for Firefox\nhttps://github.com/SeleniumHQ/selenium/blob/master/py/selenium/webdriver/firefox/options.py",
   :name "etaoin.driver",
   :wiki-url
   "https://igrishaev.github.io/etaoinetaoin.driver-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj"}
  {:doc "https://www.w3.org/TR/webdriver/#keyboard-actions",
   :name "etaoin.keys",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.keys-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/2b60f4ed83cd330cfdbcd7eb6ff3daeacd38877a/src/etaoin/keys.clj"}
  {:doc
   "A namespace that injects some missing functions\nfor legacy Clojure versions.\n\nClojure String source code:\nhttps://github.com/clojure/clojure/blob/master/src/clj/clojure/string.clj\n\nThe `with-ns` macro was taken from SO:\nhttps://stackoverflow.com/questions/27343707",
   :name "etaoin.legacy",
   :wiki-url
   "https://igrishaev.github.io/etaoinetaoin.legacy-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/07450c9ee116e04592b1d71dd5173f7cd2374b26/src/etaoin/legacy.clj"}
  {:doc nil,
   :name "etaoin.proc",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.proc-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/720bd7e716b76cb3d1d59d25c059cbd486334795/src/etaoin/proc.clj"}
  {:doc "A module to deal with querying elements.",
   :name "etaoin.query",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.query-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/e246d9677caa88a6690709335adacb35b759f3b5/src/etaoin/query.clj"}
  {:doc nil,
   :name "etaoin.util",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.util-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/720bd7e716b76cb3d1d59d25c059cbd486334795/src/etaoin/util.clj"}
  {:doc "A special module to work with XPath language.",
   :name "etaoin.xpath",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.xpath-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/51cc935815355daf6a0107e31868a9113237b55e/src/etaoin/xpath.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "absent?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1713",
   :line 1713,
   :var-type "var",
   :arglists nil,
   :doc "Opposite of `exists?`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/absent?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "accept-alert",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1613",
   :line 1613,
   :var-type "multimethod",
   :arglists nil,
   :doc "Simulates submitting an alert dialog (pressing OK button).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/accept-alert"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "back",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L368",
   :line 368,
   :var-type "function",
   :arglists ([driver]),
   :doc "Move backwards in a browser's history.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/back"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "boot-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2774",
   :line 2774,
   :var-type "function",
   :arglists ([type & [opt]]),
   :doc
   "Three-in-one: creates a driver, starts a process and creates a new\nsession. Returns the driver instance.\n\nArguments:\n\n- `type` a keyword determines a driver type.\n\n- `opt` a map of all possible parameters that `create-driver`,\n`run-driver` and `connect-driver` may accept.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/boot-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "child",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L535",
   :line 535,
   :var-type "function",
   :arglists ([driver ancestor-el q]),
   :doc "Finds a single element under given root element.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/child"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "children",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L541",
   :line 541,
   :var-type "function",
   :arglists ([driver ancestor-el q]),
   :doc "Finds multiple elements under given root element.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/children"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2802",
   :line 2802,
   :var-type "var",
   :arglists nil,
   :doc "Launches Chrome driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "chrome-headless",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2814",
   :line 2814,
   :var-type "function",
   :arglists ([& opt]),
   :doc
   "Launches headless Chrome driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/chrome-headless"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "chrome?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1678",
   :line 1678,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns true if a driver is a Chrome instance.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/chrome?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "clear",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2261",
   :line 2261,
   :var-type "function",
   :arglists ([driver q & more]),
   :doc
   "Clears an element (input, textarea) found with a query.\n\n0.1.6: multiple queries added.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/clear"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "clear-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2254",
   :line 2254,
   :var-type "function",
   :arglists ([driver el]),
   :doc "Clears an element by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/clear-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "click",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L643",
   :line 643,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Clicks on an element (a link, a button, etc).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/click"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "click-visible",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2001",
   :line 2001,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element becomes visible, then clicks on it.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/click-visible"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "close-window",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L229",
   :line 229,
   :var-type "multimethod",
   :arglists nil,
   :doc "Closes the current browser window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/close-window"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "connect-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2727",
   :line 2727,
   :var-type "function",
   :arglists ([driver & [opt]]),
   :doc
   "Connects to a running Webdriver server.\n\nCreates a new session on Webdriver HTTP server. Sets the session to\nthe driver. Returns the modified driver.\n\nArguments:\n\n- `opt`: an map of the following optional parameters:\n\n-- `:capabilities` a map of desired capabilities your\nbrowser should support;\n\n-- `:desired-capabilities`: an alias for `:capabilities`.\n\nSee https://www.w3.org/TR/webdriver/#capabilities",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/connect-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "connectable?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1634",
   :line 1634,
   :var-type "function",
   :arglists ([host port]),
   :doc
   "Checks whether it's possible to connect a given host/port pair.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/connectable?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "create-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2574",
   :line 2574,
   :var-type "function",
   :arglists ([type & [opt]]),
   :doc
   "Creates a new driver instance.\n\nReturns an atom that represents driver's state. Some functions, for\nexample creating or deleting a session may change its state.\n\nThe function does not start a process or open a window. It just\ncreates an atom without side effects.\n\nArguments:\n\n- `type` is a keyword determines what driver to use. The supported\nbrowsers are `:firefox`, `:chrome`, `:phantom` and `:safari`.\n\n- `opt` is a map with additional options for a driver. The supported\noptions are:\n\n-- `:host` is a string with either IP or hostname. Use it if the\nserver is run not locally but somethere in your network.\n\n-- `:port` is an integer value what HTTP port to use. It is taken\nfrom the `defaults` global map if is not passed. If there is no\nport in that map, a random-generated port is used.\n\n-- `:locator` is a string determs what algorithm to use by default\nwhen finding elements on a page. `default-locator` variable is used\nif not passed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/create-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "create-session",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L125",
   :line 125,
   :var-type "function",
   :arglists ([driver & [capabilities]]),
   :doc
   "Initiates a new session for a driver. Opens a browser window as a\nside-effect. All the further requests are made within specific\nsession. Some drivers may work with only one active session. Returns\na long string identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/create-session"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "delete-cookie",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1112",
   :line 1112,
   :var-type "function",
   :arglists ([driver cookie-name]),
   :doc "Deletes a cookie by its name.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/delete-cookie"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "delete-cookies",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1119",
   :line 1119,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Deletes all the cookies for all domains.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/delete-cookies"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "disconnect-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2755",
   :line 2755,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Disconnects from a running Webdriver server.\n\nCloses the current session that is stored in the driver. Removes the\nsession from the driver instance. Returns modified driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/disconnect-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "discover-port",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1651",
   :line 1651,
   :var-type "function",
   :arglists ([type host]),
   :doc
   "Finds a port for a driver type.\n\nTakes a default one from `defaults` map. If it's already taken,\ncontinues to take random ports until if finds non-busy one.\n\nArguments:\n\n- `type`: a keyword, browser type (:chrome, :firefox, etc),\n\n- `host`: a string, hostname or IP.\n\nReturns a port as an integer.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/discover-port"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "dismiss-alert",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1596",
   :line 1596,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Simulates cancelling an alert dialog (pressing cross button).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/dismiss-alert"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "dispatch-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L63",
   :line 63,
   :var-type "function",
   :arglists ([driver & _]),
   :doc
   "Returns the current driver's type. Used as dispatcher in\nmultimethods.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/dispatch-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "displayed-el?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1716",
   :line 1716,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Checks whether an element is displayed by its identifier.\n\nNote: Safari does not have native `displayed` implementation, we\nhave to check some common cases manually (CSS display, visibility,\netc).\n\nReturns true or false.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/displayed-el?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "displayed?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1743",
   :line 1743,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Checks whether an element is displayed an screen.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/displayed?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "doto-wait",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1834",
   :line 1834,
   :var-type "macro",
   :arglists ([n obj & body]),
   :doc
   "The same as doto but prepends each form with (wait n) clause.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/doto-wait"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "double-click",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L659",
   :line 659,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Performs double click on an element.\n\nNote:\n\nthe supported browsers are Chrome, and Phantom.js.\nFor Firefox and Safari, your may try to simulate it as a `click, wait, click`\nsequence.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/double-click"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "drag-and-drop",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L604",
   :line 604,
   :var-type "function",
   :arglists ([driver q-from q-to]),
   :doc
   "Performs drag and drop operation as a sequence of the following steps:\n\n1. moves mouse pointer to an element found with `q-from` query;\n2. puts down mouse button;\n3. moves mouse to an element found with `q-to` query;\n4. puts up mouse button.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q-from`: from what element to start dragging; any expression that\n`query` function may accept;\n\n- `q-to`: to what element to drag, a seach term.\n\nNotes:\n\n- does not work in Phantom.js since it does not have a virtual mouse API;\n\n- does not work in Safari.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/drag-and-drop"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "el->ref",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1152",
   :line 1152,
   :var-type "function",
   :arglists ([el]),
   :doc
   "Turns machinery-wise element ID into an object\nthat Javascript use to reference existing DOM element.\n\nThe magic constant below is taken from the standard:\nhttps://www.w3.org/TR/webdriver/#elements\n\nPassing such an object to `js-execute` automatically expands into a\nDOM node. For example:\n\n;; returns long UUID\n(def el (query driver :button-ok))\n\n;; the first argument will the an Element instance.\n(js-execute driver \"arguments[0].scrollIntoView()\", (el->ref el))\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/el->ref"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "enabled?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1762",
   :line 1762,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Checks whether an element is enabled.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/enabled?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "execute",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L78",
   :line 78,
   :var-type "function",
   :arglists ([{:keys [driver method path data result]}]),
   :doc
   "Executes an HTTP request to a driver's server. Performs the body\nwithin result data bound to the `result` clause.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `method`: a keyword represents HTTP method, e.g. `:get`, `:post`,\n`:delete`, etc.\n\n- `path`: a vector of strings/keywords represents a server's\npath. For example:\n\n`[:session \"aaaa-bbbb-cccc\" :element \"dddd-eeee\" :find]`\n\nwill turn into \"/session/aaaa-bbbb-cccc/element/dddd-eeee/find\".\n\n- `data`: any data sctructure to be sent as JSON body. Put `nil` For\n`GET` requests.\n\n- `result`: a symbol to bind the data from the HTTP response with\n`let` form before executing the body.\n\nExample:\n\n(def driver (firefox))\n(println (execute {:driver driver\n                   :method :get\n                   :path [:session (:session @driver) :element :active])))\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/execute"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "exists?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1703",
   :line 1703,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns true if an element exists on the page.\n\nKeep in mind it does not validates whether the element is visible,\nclickable and so on.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/exists?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "fill",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2193",
   :line 2193,
   :var-type "function",
   :arglists ([driver q text & more]),
   :doc
   "Fills an element found with a query with a given text.\n\n0.1.6: now the rest parameters are supported. They will\njoined using \"str\":\n\n(fill driver :simple-input \"foo\" \"baz\" 1)\n;; fills the input with  \"foobaz1\"",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "fill-active",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2188",
   :line 2188,
   :var-type "function",
   :arglists ([driver text & more]),
   :doc "Fills an active element with keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-active"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "fill-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2149",
   :line 2149,
   :var-type "multimethod",
   :arglists ([driver el text & more]),
   :doc "Fills an element with text by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "fill-human",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2241",
   :line 2241,
   :var-type "function",
   :arglists ([driver q text]),
   :doc
   "Fills text like humans do: with error, corrections and pauses.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q`: a query term, see `query` function for more info,\n\n- `text`: a string to input.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-human"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "fill-multi",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2204",
   :line 2204,
   :var-type "function",
   :arglists ([driver q-text]),
   :doc
   "Fills multiple inputs in batch.\n\n`q-text` could be:\n\n- a map of {query -> text}\n- a vector of [query1 text1 query2 text2 ...]",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-multi"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2798",
   :line 2798,
   :var-type "var",
   :arglists nil,
   :doc "Launches Firefox driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "firefox-headless",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2819",
   :line 2819,
   :var-type "function",
   :arglists ([& opt]),
   :doc
   "Launches headless Firefox driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/firefox-headless"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "firefox?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1683",
   :line 1683,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns true if a driver is a Firefox instance.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/firefox?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "forward",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L384",
   :line 384,
   :var-type "function",
   :arglists ([driver]),
   :doc "Move forwards in a browser's history.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/forward"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-alert-text",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1579",
   :line 1579,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Returns a string of text that appears in alert dialog (if present).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-alert-text"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-cookie",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1081",
   :line 1081,
   :var-type "function",
   :arglists ([driver cookie-name]),
   :doc
   "Returns the first cookie with such name.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `cookie-name`: a string/keyword witn a cookie name.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-cookie"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-cookies",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1063",
   :line 1063,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Returns all the cookies browser keeps at the moment.\n\nEach cookie is a map with structure:\n\n{:name \"cookie1\",\n:value \"test1\",\n:path \"/\",\n:domain \"\",\n:expiry nil,\n:secure false,\n:httpOnly false}\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-cookies"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-attr",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L894",
   :line 894,
   :var-type "function",
   :arglists ([driver q name]),
   :doc
   "Returns an HTTP attribute of an element (class, id, href, etc).\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q`: a query term to find an element,\n\n- `name`: either a string or a keyword with a name of an attribute.\n\nReturns: a string with the attribute value, `nil` if no such\nattribute for that element.\n\nNote: it does not split CSS classes! A single string with spaces is\nreturned.\n\nExample:\n\n(def driver (firefox))\n(get-element-attr driver {:tag :a} :class)\n>> \"link link__external link__button\" ;; see note above",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-attr"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-attrs",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L920",
   :line 920,
   :var-type "function",
   :arglists ([driver q & attrs]),
   :doc
   "Returns multiple attributes in batch. The result is a vector of\ncorresponding attributes.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-attrs"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-box",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L805",
   :line 805,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns a bounding box for an element found with a query term.\n\nThe result is a map with the following keys:\n\n- `:x1`: top left `x` coordinate;\n- `:y1`: top left `y` coordinate;\n- `:x2`: bottom right `x` coordinate;\n- `:y2`: bottom right `y` coordinate;\n- `:width`: width as a difference b/w `:x2` and `:x1`;\n- `:height`: height as a difference b/w `:y2` and `:y1`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-box"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-css",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L941",
   :line 941,
   :var-type "function",
   :arglists ([driver q prop]),
   :doc
   "Returns a CSS property of an element. The property might be both\nown or inherited.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q`: a query term,\n\n- `name`: a string/keyword with a CSS name (:font, \"background-color\", etc).\n\nReturns a string with a value, `nil` if there is no such property.\n\nNote: colors, fonts and some other properties may be represented in\ntheir own ways depending on a browser.\n\nExample:\n\n(def driver (firefox))\n(get-element-css driver {:id :content} :background-color)\n>> \"rgb(204, 204, 204)\" ;; or \"rgba(204, 204, 204, 1)\"",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-css"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-csss",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L968",
   :line 968,
   :var-type "function",
   :arglists ([driver q & props]),
   :doc
   "Returns multiple CSS properties in batch. The result is a vector of\ncorresponding properties.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-csss"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-inner-html",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L988",
   :line 988,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns element's inner HTML.\n\nFor element `el` in `<div id=\"el\"><p class=\"foo\">hello</p></div>` it will\nbe \"<p class=\"foo\">hello</p>\" string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-inner-html"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-inner-html-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L981",
   :line 981,
   :var-type "function",
   :arglists ([driver el]),
   :doc "Returns element's inner text by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-inner-html-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-properties",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L875",
   :line 875,
   :var-type "function",
   :arglists ([driver q & props]),
   :doc
   "Returns multiple properties in batch. The result is a vector of\ncorresponding properties.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-properties"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-property",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L859",
   :line 859,
   :var-type "function",
   :arglists ([driver q name]),
   :doc
   "Returns a property of an element (value, etc).\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q`: a query term to find an element,\n\n- `name`: either a string or a keyword with a name of a property.\n\nReturns: a string with the attribute value, `nil` if no such\nproperty for that element.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-property"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L770",
   :line 770,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns an element size as a map with :width and :height keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-tag",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1008",
   :line 1008,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Returns element's tag name (\"div\", \"input\", etc).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-tag"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-tag-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1001",
   :line 1001,
   :var-type "function",
   :arglists ([driver el]),
   :doc "Returns element's tag name by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-tag-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-text",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1020",
   :line 1020,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns inner element's text.\n\nFor `<p class=\"foo\">hello</p>` it will be \"hello\" string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-text"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-text-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1013",
   :line 1013,
   :var-type "function",
   :arglists ([driver el]),
   :doc "Returns element's inner text by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-text-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-element-value",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1039",
   :line 1039,
   :var-type "multimethod",
   :arglists ([driver q]),
   :doc "Returns the current element's value (input text).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-value"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-hash",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1525",
   :line 1525,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current hash fragment (nil when not set).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-hash"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-implicit-timeout",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2393",
   :line 2393,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current implicit timeout in seconds.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-implicit-timeout"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-log-types",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1429",
   :line 1429,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Returns a set of log types the browser supports.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-log-types"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-logs*",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1449",
   :line 1449,
   :var-type "multimethod",
   :arglists ([driver logtype]),
   :doc
   "Returns Javascript log entries. Each log entry is a map\nwith the following structure:\n\n{:level :warning,\n :message \"1,2,3,4  anonymous (:1)\",\n :timestamp 1511449388366,\n :source nil,\n :datetime #inst \"2017-11-23T15:03:08.366-00:00\"}\n\nEmpirical knowledge about browser differences:\n\n* Chrome:\n- Returns all recorded logs.\n- Clears the logs once they have been read.\n- JS console logs have `:console-api` for `:source` field.\n- Entries about errors will have SEVERE level.\n\n* PhantomJS:\n- Return all recorded logs since the last URL change.\n- Does not clear recorded logs on subsequent invocations.\n- JS console logs have nil for `:source` field.\n- Entries about errors will have WARNING level, as coded here:\n    https://github.com/detro/ghostdriver/blob/be7ffd9d47c1e76c7bfa1d47cdcde9164fd40db8/src/session.js#L494",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-logs*"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-page-load-timeout",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2388",
   :line 2388,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current page load timeout in seconds.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-page-load-timeout"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-script-timeout",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2383",
   :line 2383,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current script timeout in seconds.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-script-timeout"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-scroll",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1326",
   :line 1326,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Returns the current scroll position as a map\nwith `:x` and `:y` keys and integer values.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-scroll"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-source",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1141",
   :line 1141,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns browser's current HTML markup as a string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-source"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-status",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L116",
   :line 116,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Returns the current Webdriver status info. The content depends on\nspecific driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-status"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-title",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L402",
   :line 402,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current window's title.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-title"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-url",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L395",
   :line 395,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current URL string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-url"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-window-handle",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L173",
   :line 173,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Returns the current active window handler as a string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-handle"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-window-handles",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L190",
   :line 190,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Returns a vector of all window handlers.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-handles"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-window-position",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L279",
   :line 279,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc
   "Returns a window position relative to your screen as a map with\n`:x` and `:y` keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-position"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "get-window-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L258",
   :line 258,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc
   "Returns a window size a map with `:width` and `:height` keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "go",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L354",
   :line 354,
   :var-type "function",
   :arglists ([driver url]),
   :doc
   "Open the URL the current window.\n\nExample:\n\n(def ff (firefox))\n(go ff \"http://google.com\")\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/go"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "has-alert?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1802",
   :line 1802,
   :var-type "function",
   :arglists ([driver]),
   :doc "Checks if there is an alert dialog opened on the page.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/has-alert?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "has-class?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1794",
   :line 1794,
   :var-type "function",
   :arglists ([driver q class]),
   :doc "Checks whether an element has a specific class.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/has-class?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "has-no-alert?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1809",
   :line 1809,
   :var-type "var",
   :arglists nil,
   :doc "Opposite to `has-alert?`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/has-no-alert?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "has-no-class?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1799",
   :line 1799,
   :var-type "var",
   :arglists nil,
   :doc "Opposite to `has-class?`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/has-no-class?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "has-text?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1769",
   :line 1769,
   :var-type "function",
   :arglists ([driver text] [driver q text]),
   :doc
   "Returns true if a passed text appears anywhere on a page.\nWith a leading query expression, finds a text inside the first\nelement that matches the query.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/has-text?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "headless?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1698",
   :line 1698,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Returns true if a driver is run in headless mode (without UI window).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/headless?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "intersects?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L828",
   :line 828,
   :var-type "function",
   :arglists ([driver q1 q2]),
   :doc
   "Determines whether two elements intersects in geometry meaning.\n\nThe implementation compares bounding boxes for each element\nanalyzing their arrangement.\n\nArguments:\n\n- `q1` and `q2` are query terms to find elements to check for\nintersection.\n\nReturns true or false.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/intersects?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "invisible?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1754",
   :line 1754,
   :var-type "var",
   :arglists nil,
   :doc "Oppsite to `visible?`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/invisible?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "join-path",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2482",
   :line 2482,
   :var-type "function",
   :arglists ([p1 p2 & more]),
   :doc
   "Joins two and more path components into a single file path OS-wisely.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/join-path"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "js-async",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1222",
   :line 1222,
   :var-type "multimethod",
   :arglists ([driver script & args]),
   :doc
   "Executes an asynchronous script in the browser and returns the result.\nAn asynchronous script is a such one that performs any kind of IO operations,\nsay, AJAX request to the server. When running such kind of a script, you cannot\njust use the `return` statement like you do in ordinary scripts. Instead, the\ndriver passes a special handler as the last argument that should be called\nto return the final result.\n\n*Note:* calling this function requires the `script` timeout to be set properly,\nmeaning non-zero positive value. See `get-script-timeout`, `get-script-timeout`\nand `with-script-timeout` functions/macroses.\n\nExample of a script:\n\n// the `arguments` would be an array of something like:\n// [1, 2, true, ..., <special callback>]\n\nvar callback = arguments[arguments.length-1];\n\n// so the main script would look like:\n$.ajax({url: '/some/url', success: function(result) {\n  if (isResultOk(result)) {\n    callback({ok: getProgressData(result)});\n  }\n  else {\n    callback({error: getErrorData(result)});\n  }\n}});\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `script`: a string with the code to execute.\n\n- `args`: additional arguments for your code. Any data that might be\nserialized into JSON.\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/js-async"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "js-execute",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1172",
   :line 1172,
   :var-type "multimethod",
   :arglists ([driver script & args]),
   :doc
   "Executes Javascript code in browser synchronously.\n\nThe code is sent as a string (might be multi-line). Under the hood,\na browser wraps your code into a function so avoid using `function`\nclause at the top level.\n\nDon't forget to add `return <something>` operator if you are\ninterested in the result value.\n\nYou may access arguments through the built-in `arguments`\npseudo-array from your code. You may pass any data structures that\nare JSON-compatible (scalars, maps, vectors).\n\nThe result value is also returned trough JSON encode/decode\npipeline (JS objects turn to Clojure maps, arrays into vectors and\nso on).\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `script`: a string with the code to execute.\n\n- `args`: additional arguments for your code. Any data that might be\nserialized into JSON.\n\nExample:\n\n(def driver (chrome))\n(js-execute driver \"return arguments[0] + 1;\" 42)\n>> 43\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/js-execute"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "left-click",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L697",
   :line 697,
   :var-type "function",
   :arglists ([driver]),
   :doc "A shortcut for `mouse-click` with the left button.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/left-click"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "left-click-on",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L722",
   :line 722,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "\nLeft mouse click on an element. Probably don't need\nthat one, use `click` instead.\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/left-click-on"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "make-url",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2568",
   :line 2568,
   :var-type "function",
   :arglists ([host port]),
   :doc "Makes an Webdriver URL from a host and port.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/make-url"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "maximize",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L239",
   :line 239,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Makes the browser window as wide as your screen allows.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/maximize"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "middle-click",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L707",
   :line 707,
   :var-type "function",
   :arglists ([driver]),
   :doc "A shortcut for `mouse-click` with the middle button.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/middle-click"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "middle-click-on",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L738",
   :line 738,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "\nMove pointer to an element found with a query\nand middle click on it. Useful for opening links\nin a new tab.\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/middle-click-on"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "mouse-btn-down",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L551",
   :line 551,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Puts down a button of a virtual mouse.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/mouse-btn-down"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "mouse-btn-up",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L563",
   :line 563,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Puts up a button of a virtual mouse.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/mouse-btn-up"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "mouse-click",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L673",
   :line 673,
   :var-type "multimethod",
   :arglists ([driver btn]),
   :doc
   "\nClick on a mouse button using the *current* mouse position.\nThe `btn` is a mouse button code. See `keys/mouse-*` constants.\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/mouse-click"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "mouse-click-on",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L712",
   :line 712,
   :var-type "function",
   :arglists ([driver btn q]),
   :doc
   "\nMouse click on a specific element and a button.\nMoves the mouse pointer to the element first.\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/mouse-click-on"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "mouse-move-to",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L575",
   :line 575,
   :var-type "multimethod",
   :arglists ([driver q] [driver x y]),
   :doc
   "Moves a virtual mouse pointer either to an element\nor by `x` and `y` offset.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/mouse-move-to"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2806",
   :line 2806,
   :var-type "var",
   :arglists nil,
   :doc "Launches Phantom.js driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "phantom?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1688",
   :line 1688,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns true if a driver is a Phantom.js instance.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/phantom?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "postmortem-handler",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2491",
   :line 2491,
   :var-type "function",
   :arglists
   ([driver {:keys [dir dir-src dir-img dir-log date-format]}]),
   :doc
   "Internal postmortem handler that creates files.\nSee the `with-postmortem`'s docstring below for more info.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/postmortem-handler"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "process-log",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1441",
   :line 1441,
   :var-type "function",
   :arglists ([entry]),
   :doc "Remaps some of the log's fields.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/process-log"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "query",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L480",
   :line 480,
   :var-type "function",
   :arglists ([driver q] [driver q & more]),
   :doc
   "Finds an element on a page.\n\nA query might be:\n\n- a string with an XPath expression;\n- a keyword `:active` that means to get the current active element;\n- any other keyword which stands for an element's ID attribute;\n- a map with either `:xpath` or `:css` key with a string value\n  of corresponding selector type (XPath or CSS);\n- any other map that will be expanded into XPath term (see README.md);\n- a vector of any expressions mentioned above. In that case, each next\n  term is searched from the previous one.\n\nReturns a element's unique identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/query"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "query-all",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L515",
   :line 515,
   :var-type "function",
   :arglists ([driver q] [driver q & more]),
   :doc
   "Finds multiple elements on a page.\nSee `query` function for incoming params.\nReturns a vector of element identifiers.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/query-all"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "quit",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2790",
   :line 2790,
   :var-type "function",
   :arglists ([driver]),
   :doc "Closes the current session and stops the driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/quit"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "refresh",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L375",
   :line 375,
   :var-type "function",
   :arglists ([driver]),
   :doc "Reloads the current window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/refresh"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "right-click",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L702",
   :line 702,
   :var-type "function",
   :arglists ([driver]),
   :doc "A shortcut for `mouse-click` with the right button.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/right-click"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "right-click-on",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L730",
   :line 730,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "\nMove pointer to an element found with a query\nand right click on it.\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/right-click-on"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "run-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2618",
   :line 2618,
   :var-type "function",
   :arglists
   ([driver
     &
     [{:keys
       [dev
        env
        url
        args
        size
        prefs
        profile
        headless
        log-level
        args-driver
        path-driver
        download-dir
        path-browser
        load-strategy]}]]),
   :doc
   "Runs a driver process locally.\n\nCreates a UNIX process with a Webdriver HTTP server. Host and port\nare taken from a `driver` argument. Updates a driver instance with\nnew fields with process information. Returns modified driver.\n\nArguments:\n\n- `driver` is an atom created with `create-driver` function.\n\n- `opt` is an optional map with the following possible parameters:\n\n-- `:path-driver` is a string path to the driver's binary file. When\nnot passed, it is taken from defaults.\n\n-- `:path-browser` is a string path to the browser's binary\nfile. When not passed, the driver discovers it by its own.\n\n-- `:size` is a vector of two integers specifying initial window size.\n\n-- `:url` is a string with the default URL opened by default (FF only for now).\n\n-- `:log-level` a keyword to set browser's log level. Used when fetching\nbrowser's logs. Possible values are: `:off`, `:debug`, `:warn`, `:info`,\n`:error`, `:all`. When not passed, `:all` is set.\n\n-- `:profile` is a string path that points on profile folder.\nSee the `Setting browser profile` section in `README.md` to know\nhow to do it properly.\n\n-- `:load-strategy` is a string or keyword with specifying\nwhat strategy to use when load a page. Might be `:none`, `:eager`\nor :`normal` (default). To not wait the page being loaded completely,\nspecify `:none`. The `:eager` option is still under development\nin most of the browser.\n\n-- `headless` is a boolean flag to run the browser in headless mode\n(i.e. without GUI window). Useful when running tests on CI servers\nrather than local machine. Currently, only FF and Chrome support headless mode.\nPhantom.js is headless by its nature.\n\n-- `:args` is a vector of additional command line arguments\nto the browser's process.\n\n-- `:prefs` is a map of browser-specific preferences.\n\n-- `:args-driver` is a vector of additional arguments to the\ndriver's process.\n\n-- `:env` is a map with system ENV variables. Keys are turned into\nupper-case strings.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/run-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "running?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1645",
   :line 1645,
   :var-type "function",
   :arglists ([driver]),
   :doc "Check whether a driver runs HTTP server.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/running?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2810",
   :line 2810,
   :var-type "var",
   :arglists nil,
   :doc "Launches Safari driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "safari?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1693",
   :line 1693,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns true if a driver is a Safari instance.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/safari?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "screenshot",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2430",
   :line 2430,
   :var-type "multimethod",
   :arglists ([driver file]),
   :doc
   "Takes a screenshot of the current page. Saves it in a *.png file on disk.\nRises exception if a screenshot was empty.\n\nArguments:\n\n- `driver`: driver instance,\n\n- `file`: either a path to a file or a native `java.io.File` instance.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/screenshot"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1296",
   :line 1296,
   :var-type "function",
   :arglists ([driver x y] [driver {:keys [x y]}]),
   :doc
   "Scrolls the window into absolute position (jumps to exact place).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-bottom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1338",
   :line 1338,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Scrolls to bottom of the page keeping current horizontal position.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-bottom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-by",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1303",
   :line 1303,
   :var-type "function",
   :arglists ([driver x y] [driver {:keys [x y]}]),
   :doc
   "Scrolls the window by offset (relatively the current position).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-by"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-down",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1356",
   :line 1356,
   :var-type "function",
   :arglists ([driver offset] [driver]),
   :doc
   "Scrolls the page down by specific number of pixels.\nThe `scroll-offset` constant is used when not passed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-down"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-left",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1364",
   :line 1364,
   :var-type "function",
   :arglists ([driver offset] [driver]),
   :doc
   "Scrolls the page left by specific number of pixels.\nThe `scroll-offset` constant is used when not passed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-left"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-offset",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1345",
   :line 1345,
   :var-type "var",
   :arglists nil,
   :doc "Default scroll offset in pixels.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-offset"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-query",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1310",
   :line 1310,
   :var-type "function",
   :arglists ([driver q] [driver q param]),
   :doc
   "Scrolls to the first element found with a query.\n\nInvokes element's `.scrollIntoView()` method. Accepts extra `param`\nargument that might be either boolean or object for more control.\n\nSee this page for details:\nhttps://developer.mozilla.org/en-US/docs/Web/API/Element/scrollIntoView\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-query"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-right",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1372",
   :line 1372,
   :var-type "function",
   :arglists ([driver offset] [driver]),
   :doc
   "Scrolls the page right by specific number of pixels.\nThe `scroll-offset` constant is used when not passed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-right"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-top",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1332",
   :line 1332,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Scrolls to top of the page keeping current horizontal position.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-top"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "scroll-up",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1348",
   :line 1348,
   :var-type "function",
   :arglists ([driver offset] [driver]),
   :doc
   "Scrolls the page up by specific number of pixels.\nThe `scroll-offset` constant is used when not passed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/scroll-up"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "set-cookie",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1096",
   :line 1096,
   :var-type "function",
   :arglists ([driver cookie]),
   :doc
   "Sets a new cookie.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `cookie`: a map with structure described in `get-cookies`. At\nleast `:name` and `:value` fields should be populated.\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-cookie"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "set-hash",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1516",
   :line 1516,
   :var-type "function",
   :arglists ([driver hash]),
   :doc
   "Sets a new hash fragment for the current page.\nDon't include the leading # symbol. Useful when navigating\non single page applications.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-hash"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "set-implicit-timeout",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2361",
   :line 2361,
   :var-type "multimethod",
   :arglists ([driver sec]),
   :doc "Sets timeout that is used when finding elements on the page.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-implicit-timeout"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "set-page-load-timeout",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2346",
   :line 2346,
   :var-type "multimethod",
   :arglists ([driver sec]),
   :doc "Sets timeout for loading pages.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-page-load-timeout"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "set-script-timeout",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2336",
   :line 2336,
   :var-type "multimethod",
   :arglists ([driver sec]),
   :doc "Sets timeout for executing JS sctipts.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-script-timeout"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "set-window-position",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L342",
   :line 342,
   :var-type "function",
   :arglists ([driver {:keys [x y]}] [driver x y]),
   :doc
   "Sets new position for a window. Absolute precision is not\nguaranteed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-window-position"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "set-window-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L318",
   :line 318,
   :var-type "function",
   :arglists ([driver {:keys [width height]}] [driver width height]),
   :doc
   "Sets new size for a window. Absolute precision is not guaranteed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-window-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "stop-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2766",
   :line 2766,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Stops the driver's process. Removes proces's data from the driver\ninstance. Returns a modified driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/stop-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "submit",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2305",
   :line 2305,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Sends Enter button value to an element found with query.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/submit"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "supports-logs?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1495",
   :line 1495,
   :var-type "function",
   :arglists ([driver]),
   :doc "Checks whether a driver supports getting console logs.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/supports-logs?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "switch-frame",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1392",
   :line 1392,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Switches to an (i)frame quering the page for it.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/switch-frame"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "switch-frame*",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1384",
   :line 1384,
   :var-type "function",
   :arglists ([driver id]),
   :doc
   "Switches to an (i)frame by its index or an element reference.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/switch-frame*"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "switch-frame-first",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1398",
   :line 1398,
   :var-type "function",
   :arglists ([driver]),
   :doc "Switches to the first (i)frame.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/switch-frame-first"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "switch-frame-parent",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1403",
   :line 1403,
   :var-type "function",
   :arglists ([driver]),
   :doc "Switches to the parent of the current (i)frame.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/switch-frame-parent"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "switch-frame-top",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1410",
   :line 1410,
   :var-type "function",
   :arglists ([driver]),
   :doc "Switches to the most top of the page.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/switch-frame-top"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "switch-window",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L208",
   :line 208,
   :var-type "multimethod",
   :arglists ([driver handle]),
   :doc "Switches a browser to another window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/switch-window"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "upload-file",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2273",
   :line 2273,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Attaches a local file to a file input field.\n\nArguments:\n\n- `q` is a query term that refers to a file input;\n- `file` is either a string or java.io.File object\nthat references a local file. The file should exist.\n\nUnder the hood, it sends the file's name as a sequence of keys\nto the input.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/upload-file"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "visible?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1748",
   :line 1748,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Checks whether an element is visible on the page.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/visible?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1819",
   :line 1819,
   :var-type "function",
   :arglists ([driver sec] [sec]),
   :doc "Sleeps for N seconds.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-absent",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1887",
   :line 1887,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element is absent.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-absent"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-disabled",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1939",
   :line 1939,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element is disabled (usually an input element).\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-disabled"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-enabled",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1927",
   :line 1927,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element is enabled (usually an input element).\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-enabled"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-exists",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1875",
   :line 1875,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element exists on a page (but may not be visible though).\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-exists"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-has-alert",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1951",
   :line 1951,
   :var-type "function",
   :arglists ([driver & [opt]]),
   :doc
   "Waits until an alert dialog appears on the screen.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-has-alert"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-has-class",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1979",
   :line 1979,
   :var-type "function",
   :arglists ([driver q class & [opt]]),
   :doc
   "Waits until an element has specific class.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `class`: a class to search as string;\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-has-class"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-has-text",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1963",
   :line 1963,
   :var-type "function",
   :arglists ([driver q text & [opt]]),
   :doc
   "Waits until an element has text anywhere inside it (including inner HTML).\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `text`: a string to search;\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-has-text"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-invisible",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1915",
   :line 1915,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element presents but not visible.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-invisible"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-predicate",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1840",
   :line 1840,
   :var-type "function",
   :arglists ([pred] [pred opt]),
   :doc
   "Sleeps continuously calling a predicate until it returns true.\nRises a slingshot exception when timeout is reached.\n\nArguments:\n\n- `pred`: a zero-argument predicate to call;\n- `opt`: a map of optional parameters:\n-- `:timeout` wait limit in seconds, 20 by default;\n-- `:interval` how long to wait b/w calls, 0.33 by default;\n-- `:message` a message that becomes a part of exception when timeout is reached.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-predicate"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "wait-visible",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1901",
   :line 1901,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element presents and is visible.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-visible"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2110",
   :line 2110,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc
   "Executes the body only if the driver is Chrome.\n\nExample:\n\n(def driver (chrome))\n(when-chrome driver\n  (println \"It's Chrome!\")",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2127",
   :line 2127,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Firefox.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-headless",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2137",
   :line 2137,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc
   "Executes the body only if the driver is run in headless mode.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-headless"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-not-chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2079",
   :line 2079,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if a browser is NOT Chrome.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-not-firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2089",
   :line 2089,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if a browser is NOT Firefox.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-not-headless",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2099",
   :line 2099,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc
   "Executes the body only if a browser is NOT run in headless mode.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-headless"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-not-phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2084",
   :line 2084,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if a browser is NOT Phantom.js.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-not-safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2094",
   :line 2094,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if a browser is NOT Safari.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2122",
   :line 2122,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Phantom.js.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-predicate",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2104",
   :line 2104,
   :var-type "macro",
   :arglists ([predicate & body]),
   :doc "Executes the body only if a predicate returns true.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-predicate"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "when-safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2132",
   :line 2132,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Safari.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2861",
   :line 2861,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Chrome session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-chrome-headless",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2882",
   :line 2882,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with headless Chrome session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-chrome-headless"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2824",
   :line 2824,
   :var-type "macro",
   :arglists ([type opt bind & body]),
   :doc
   "Performs the body within a driver session.\n\nLaunches a driver of a given type. Binds the driver instance to a\npassed `bind` symbol. Executes the body once the driver has\nstarted. Shutdowns the driver finally (even if an exception\noccurred).\n\nArguments:\n\n- `type` is a keyword what driver type to start.\n\n- `opt` is a map with driver's options. See `boot-driver` for more\ndetails.\n\n- `bind` is a symbol to bind a driver reference.\n\nExample:\n\n(with-driver :firefox {} driver\n  (go driver \"http://example.com\"))",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2854",
   :line 2854,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Firefox session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-firefox-headless",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2889",
   :line 2889,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with headless Firefox session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-firefox-headless"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-frame",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1415",
   :line 1415,
   :var-type "macro",
   :arglists ([driver q & body]),
   :doc
   "Switches to the (i)frame temporary while executing the body\nreturning the result of the last expression.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-frame"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-mouse-btn",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L594",
   :line 594,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Performs the body keeping mouse botton pressed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-mouse-btn"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2868",
   :line 2868,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Phantom.js session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-postmortem",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2526",
   :line 2526,
   :var-type "macro",
   :arglists ([driver opt & body]),
   :doc
   "Wraps the body with postmortem handler. If any error occurs,\nit will save a screenshot, the page's source code and console logs\n(if supported) on disk before rising an exception. Having them\ncould help you to discover what happened.\n\nNote: do not use it in test's fixtures. The standard `clojure.test`\nframework has its own way of handling exceptions, so wrapping a fixture\nwith `(with-postmortem...)` would be in vain.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `opt`: a map of options, where:\n\n-- `:dir` path to a directory where to store artifacts by default.\nWhen not passed, the current working directory (`pwd`) is used.\n\n-- `:dir-img`: path to a directory where to store `.png`\nfiles (screenshots). If `nil`, `:dir` value is used.\n\n-- `:dir-src`: path to a directory where to store `.html`\nfiles (page source). If `nil`, `:dir` value is used.\n\n-- `:dir-log`: path to a directory where to store `.json`\nfiles with console logs. If `nil`, `:dir` value is used.\n\n-- `:date-format`: a string represents date(time) pattern to make\nfilenames unique. Default is \"yyyy-MM-dd-HH-mm-ss\". See Oracle\nJava `SimpleDateFormat` class manual for more patterns.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-postmortem"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2875",
   :line 2875,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Safari session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-script-timeout",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L2398",
   :line 2398,
   :var-type "macro",
   :arglists ([driver sec & body]),
   :doc
   "Performs the body setting the script timeout temporary.\nUseful for async JS scripts.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-script-timeout"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj",
   :name "with-wait",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/api.clj#L1826",
   :line 1826,
   :var-type "macro",
   :arglists ([n & body]),
   :doc
   "Executes the body waiting for n seconds before each form.\nReturns a value of the last form. Use that macros to perform\na bunch of actions slowly. Some SPA applications need extra time\nto re-render the content.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-wait"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/d16c4c3329e798105200055f074846eadb99f094/src/etaoin/client.clj",
   :name "default-timeout",
   :file "src/etaoin/client.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/d16c4c3329e798105200055f074846eadb99f094/src/etaoin/client.clj#L12",
   :line 12,
   :var-type "var",
   :arglists nil,
   :doc
   "HTTP timeout in seconds. The current value may seems to high,\nbut according to my experience with SPA application full of React\nmodules even 20 seconds could not be enough for a driver to process\nyour request.",
   :namespace "etaoin.client",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.client-api.html#etaoin.client/default-timeout"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "ajax?",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L143",
   :line 143,
   :var-type "function",
   :arglists ([request]),
   :doc "\nWhether it's an XHR request.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/ajax?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "build-request",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L122",
   :line 122,
   :var-type "function",
   :arglists ([logs]),
   :doc
   "\nTakes a vector of request logs of the same ID\nand builda request map.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/build-request"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "get-ajax",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L209",
   :line 209,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "\nReturn a list of XHR (Ajax) HTTP requests made by a browser.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/get-ajax"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "get-performance-logs",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L188",
   :line 188,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "\nGet a seq of special `performance` logs that come from\na dev console. Works only when a special `perfLoggingPrefs`\nwas set (see the `:dev` key when running a driver).\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/get-performance-logs"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "get-requests",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L199",
   :line 199,
   :var-type "function",
   :arglists ([driver]),
   :doc "\nReturn a list of HTTP requests made by a browser.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/get-requests"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "group-requests",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L60",
   :line 60,
   :var-type "function",
   :arglists ([logs]),
   :doc "\nGroup a set of request logs by their ID.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/group-requests"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "log->request",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L71",
   :line 71,
   :var-type "function",
   :arglists ([acc log]),
   :doc
   "\nA helper for a further reduce (see below).\nAcc is an accumulation map.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/log->request"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "logs->ajax",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L151",
   :line 151,
   :var-type "function",
   :arglists ([logs]),
   :doc
   "\nThe same as `logs->requests` but return only AJAX requests.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/logs->ajax"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "logs->requests",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L131",
   :line 131,
   :var-type "function",
   :arglists ([logs]),
   :doc "\nFrom a list of log entries, create a list of requests.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/logs->requests"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "parse-method",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L23",
   :line 23,
   :var-type "function",
   :arglists ([method]),
   :doc
   "\nTurns a string like 'Network.SomeAction'\ninto a keyword :network/someaction.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/parse-method"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "process-log",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L36",
   :line 36,
   :var-type "function",
   :arglists ([log]),
   :doc
   "\nTakes a log map, parses its message and merges\nthe message into the map.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/process-log"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "request-done?",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L161",
   :line 161,
   :var-type "function",
   :arglists ([request]),
   :doc
   "\nWhether a request has been done. It doesn't necessarily\nmean it was successful though.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/request-done?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "request-failed?",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L170",
   :line 170,
   :var-type "function",
   :arglists ([request]),
   :doc "\nTrue if a request has been failed.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/request-failed?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "request-success?",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L178",
   :line 178,
   :var-type "var",
   :arglists nil,
   :doc "True when a request has been finished and not failed.",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/request-success?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj",
   :name "request?",
   :file "src/etaoin/dev.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/dev.clj#L52",
   :line 52,
   :var-type "function",
   :arglists ([log]),
   :doc "\nTrue if a log entry belongs to a network domain.\n",
   :namespace "etaoin.dev",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.dev-api.html#etaoin.dev/request?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj",
   :name "set-browser-log-level",
   :file "src/etaoin/driver.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj#L391",
   :line 391,
   :var-type "multimethod",
   :arglists ([driver binary]),
   :doc "Sets browser logging level.",
   :namespace "etaoin.driver",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.driver-api.html#etaoin.driver/set-browser-log-level"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj",
   :name "set-options-args",
   :file "src/etaoin/driver.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj#L130",
   :line 130,
   :var-type "function",
   :arglists ([driver args]),
   :doc
   "Adds command line arguments for a browser binary (not a driver).",
   :namespace "etaoin.driver",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.driver-api.html#etaoin.driver/set-options-args"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj",
   :name "set-path",
   :file "src/etaoin/driver.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj#L53",
   :line 53,
   :var-type "function",
   :arglists ([driver path]),
   :doc "Sets path to the driver's binary file.",
   :namespace "etaoin.driver",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.driver-api.html#etaoin.driver/set-path"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj",
   :name "set-perf-logging",
   :file "src/etaoin/driver.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj#L406",
   :line 406,
   :var-type "function",
   :arglists
   ([driver
     &
     [{:keys [level network? page? categories interval],
       :or
       {level :all,
        network? true,
        page? false,
        categories [:devtools.network],
        interval 1000}}]]),
   :doc
   "\ncategories example:\n[:browser :devtools :devtools.timeline]\n",
   :namespace "etaoin.driver",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.driver-api.html#etaoin.driver/set-perf-logging"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj",
   :name "set-port",
   :file "src/etaoin/driver.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj#L70",
   :line 70,
   :var-type "multimethod",
   :arglists ([driver port]),
   :doc "Updates driver's map with the given port added to the args.",
   :namespace "etaoin.driver",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.driver-api.html#etaoin.driver/set-port"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj",
   :name "set-url",
   :file "src/etaoin/driver.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj#L201",
   :line 201,
   :var-type "multimethod",
   :arglists ([driver url]),
   :doc
   "Sets the default URL that the browser should open by default.",
   :namespace "etaoin.driver",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.driver-api.html#etaoin.driver/set-url"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj",
   :name "set-window-size",
   :file "src/etaoin/driver.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/bf6187464393da85fa6ea7e20f66bfe38033b5cf/src/etaoin/driver.clj#L176",
   :line 176,
   :var-type "multimethod",
   :arglists ([driver w h]),
   :doc
   "Adds browser's command line arguments for setting initial window size.",
   :namespace "etaoin.driver",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.driver-api.html#etaoin.driver/set-window-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/e246d9677caa88a6690709335adacb35b759f3b5/src/etaoin/query.clj",
   :name "->Query",
   :file "src/etaoin/query.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/e246d9677caa88a6690709335adacb35b759f3b5/src/etaoin/query.clj#L10",
   :line 10,
   :var-type "function",
   :arglists ([locator term]),
   :doc "Positional factory function for class etaoin.query.Query.",
   :namespace "etaoin.query",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.query-api.html#etaoin.query/->Query"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/e246d9677caa88a6690709335adacb35b759f3b5/src/etaoin/query.clj",
   :name "map->Query",
   :file "src/etaoin/query.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/e246d9677caa88a6690709335adacb35b759f3b5/src/etaoin/query.clj#L10",
   :line 10,
   :var-type "function",
   :arglists ([m#]),
   :doc
   "Factory function for class etaoin.query.Query, taking a map of keywords to field values.",
   :namespace "etaoin.query",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.query-api.html#etaoin.query/map->Query"}
  {:name "Query",
   :var-type "record",
   :namespace "etaoin.query",
   :arglists nil,
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.query-api.html#etaoin.query/Query",
   :source-url nil,
   :raw-source-url nil,
   :file nil}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/720bd7e716b76cb3d1d59d25c059cbd486334795/src/etaoin/util.clj",
   :name "defmethods",
   :file "src/etaoin/util.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/720bd7e716b76cb3d1d59d25c059cbd486334795/src/etaoin/util.clj#L15",
   :line 15,
   :var-type "macro",
   :arglists ([multifn dispatch-vals & fn-tail]),
   :doc
   "Declares multimethods in batch. For each dispatch value from\ndispatch-vals, creates a new method.",
   :namespace "etaoin.util",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.util-api.html#etaoin.util/defmethods"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/720bd7e716b76cb3d1d59d25c059cbd486334795/src/etaoin/util.clj",
   :name "random-port",
   :file "src/etaoin/util.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/720bd7e716b76cb3d1d59d25c059cbd486334795/src/etaoin/util.clj#L38",
   :line 38,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a random port skiping the first 1024 ones.",
   :namespace "etaoin.util",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.util-api.html#etaoin.util/random-port"})}
