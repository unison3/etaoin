{:namespaces
 ({:doc
   "\nThe API below was written regarding to the source code\nof different Webdriver implementations. All of them partially\ndiffer from the official W3C specification.\n\nThe standard:\nhttps://www.w3.org/TR/webdriver/\n\nChrome:\nhttps://github.com/bayandin/chromedriver/\n\nFirefox (Geckodriver):\nhttps://github.com/mozilla/webdriver-rust/\n\nPhantom.js (Ghostdriver)\nhttps://github.com/detro/ghostdriver/blob/\n",
   :name "etaoin.api",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.api-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj"}
  {:doc nil,
   :name "etaoin.client",
   :wiki-url
   "https://igrishaev.github.io/etaoinetaoin.client-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/d69386be8590f2390952770999fad09d632c7670/src/etaoin/client.clj"}
  {:doc "https://www.w3.org/TR/webdriver/#keyboard-actions",
   :name "etaoin.keys",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.keys-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/96eb261742e5ec4fad818fb9ff4f8ead54494b09/src/etaoin/keys.clj"}
  {:doc nil,
   :name "etaoin.proc",
   :wiki-url "https://igrishaev.github.io/etaoinetaoin.proc-api.html",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/96eb261742e5ec4fad818fb9ff4f8ead54494b09/src/etaoin/proc.clj"}),
 :vars
 ({:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "back",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L365",
   :line 365,
   :var-type "function",
   :arglists ([driver]),
   :doc "Move backwards in a browser's history.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/back"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "boot-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2078",
   :line 2078,
   :var-type "function",
   :arglists ([type & [opt]]),
   :doc
   "Three-in-one: creates a driver, starts a process and creates a new\nsession. Returns the driver instance.\n\nArguments:\n\n- `type` a keyword determines a driver type.\n\n- `opt` a map of all possible parameters that `create-driver`,\n`run-driver` and `connect-driver` may accept.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/boot-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2107",
   :line 2107,
   :var-type "var",
   :arglists nil,
   :doc "Launches Chrome driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "clear",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1817",
   :line 1817,
   :var-type "function",
   :arglists ([driver q & more]),
   :doc
   "Clears an element (input, textarea) found with a query.\n\n0.1.6: multiple queries added.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/clear"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "clear-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1810",
   :line 1810,
   :var-type "function",
   :arglists ([driver el]),
   :doc "Clears an element by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/clear-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "click",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L688",
   :line 688,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Clicks on an element (a link, button, etc).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/click"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "click-visible",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1593",
   :line 1593,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element becomes visible, then clicks on it.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/click-visible"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "close-window",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L230",
   :line 230,
   :var-type "multimethod",
   :arglists nil,
   :doc "Closes the current browser window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/close-window"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "connect-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2036",
   :line 2036,
   :var-type "function",
   :arglists ([driver & [opt]]),
   :doc
   "Connects to a running Webdriver server.\n\nCreates a new session on Webdriver HTTP server. Sets the session to\nthe driver. Returns the modified driver.\n\nArguments:\n\n- `opt`: an map of the following optional parameters:\n\n-- `:desired-capabilities` a map of desired capabilities your\nbrowser should support.\n\nSee https://www.w3.org/TR/webdriver/#capabilities",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/connect-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "connectable?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1260",
   :line 1260,
   :var-type "function",
   :arglists ([host port]),
   :doc
   "Checks whether it's possible to connect a given host/port pair.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/connectable?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "create-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1954",
   :line 1954,
   :var-type "function",
   :arglists ([type & [opt]]),
   :doc
   "Creates a new driver instance.\n\nReturns an atom that represents driver's state. Some functions, for\nexample creating or deleting a session may change its state.\n\nThe function does not start a process or open a window. It just\ncreates an atom without side effects.\n\nArguments:\n\n- `type` is a keyword determines what driver to use. The supported\nbrowsers are `:firefox`, `:chrome`, `:phantom` and `:safari`.\n\n- `opt` is a map with additional options for a driver. The supported\noptions are:\n\n-- `:host` is a string with either IP or hostname. Use it if the\nserver is run not locally but somethere in your network.\n\n-- `:port` is an integer value what HTTP port to use. It is taken\nfrom the `default-ports` global map if is not passed. If there is no\nport in that map, a random-generated port is used.\n\n-- `:locator` is a string determs what algorithm to use by default\nwhen finding elements on a page. `default-locator` variable is used\nif not passed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/create-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "create-session",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L135",
   :line 135,
   :var-type "function",
   :arglists ([driver & [capabilities]]),
   :doc
   "Initiates a new session for a driver. Opens a browser window as a\nside-effect. All the further requests are made within specific\nsession. Some drivers may work with only one active session. Returns\na long string identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/create-session"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "default-paths",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L35",
   :line 35,
   :var-type "var",
   :arglists nil,
   :doc "Default commands to launch a driver process.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/default-paths"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "default-ports",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L42",
   :line 42,
   :var-type "var",
   :arglists nil,
   :doc "Default ports to launch a driver process.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/default-ports"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "defmethods",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L56",
   :line 56,
   :var-type "macro",
   :arglists ([multifn dispatch-vals & fn-tail]),
   :doc
   "Declares multimethods in batch. For each dispatch value from\ndispatch-vals, creates a new method.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/defmethods"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "delete-cookie",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1041",
   :line 1041,
   :var-type "function",
   :arglists ([driver cookie-name]),
   :doc "Deletes a cookie by its name.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/delete-cookie"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "delete-cookies",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1048",
   :line 1048,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Deletes all the cookies for all domains.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/delete-cookies"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "disconnect-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2059",
   :line 2059,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Disconnects from a running Webdriver server.\n\nCloses the current session that is stored in the driver. Removes the\nsession from the driver instance. Returns modified driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/disconnect-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "discover-port",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1277",
   :line 1277,
   :var-type "function",
   :arglists ([type host]),
   :doc
   "Finds a port for a driver type.\n\nTakes a default one from `default-ports` map. If it's already taken,\ncontinues to take random ports until if finds non-busy one.\n\nArguments:\n\n- `type`: a keyword, browser type (:chrome, :firefox, etc),\n\n- `host`: a string, hostname or IP.\n\nReturns a port as an integer.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/discover-port"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "dispatch-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L73",
   :line 73,
   :var-type "function",
   :arglists ([driver & _]),
   :doc
   "Returns the current driver's type. Used as dispatcher in\nmultimethods.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/dispatch-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "displayed-el?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1323",
   :line 1323,
   :var-type "multimethod",
   :arglists nil,
   :doc
   "Checks whether an element is displayed by its identifier.\n\nNote: Safari does not have native `displayed` implementation, we\nhave to check some common cases manually (CSS display, visibility,\netc).\n\nReturns true or false.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/displayed-el?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "displayed?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1353",
   :line 1353,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Checks whether an element is displayed an screen.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/displayed?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "double-click",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L701",
   :line 701,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Performs double click on an element.\n\nNote:\n\nthe supported browsers are Chrome and Phantom.js. For Firefox and\nSafari, your may try to simulate it as a `click, wait, click`\nsequence.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/double-click"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "drag-and-drop",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L651",
   :line 651,
   :var-type "function",
   :arglists ([driver q-from q-to]),
   :doc
   "Performs drag and drop operation as a sequence of the following steps:\n\n1. moves mouse pointer to an element found with `q-from` query;\n2. puts down mouse button;\n3. moves mouse to an element found with `q-to` query;\n4. puts up mouse button.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q-from`: from what element to start dragging; any expression that\n`query` function may accept;\n\n- `q-to`: to what element to drag, a seach term.\n\nNotes:\n\n- does not work in Phantom.js since it does not have a virtual mouse API;\n\n- does not work in Safari.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/drag-and-drop"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "enabled?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1371",
   :line 1371,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Checks whether an element is enabled.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/enabled?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "fill",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1749",
   :line 1749,
   :var-type "function",
   :arglists ([driver q text & more]),
   :doc
   "Fills an element found with a query with a given text.\n\n0.1.6: now the rest parameters are supported. They will\njoined using \"str\":\n\n(fill driver :simple-input \"foo\" \"baz\" 1)\n;; fills the input with  \"foobaz1\"",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "fill-active",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1734",
   :line 1734,
   :var-type "function",
   :arglists ([driver text & more]),
   :doc "Fills an active element with keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-active"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "fill-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1739",
   :line 1739,
   :var-type "function",
   :arglists ([driver el text]),
   :doc "Fills an element with text by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "fill-human",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1797",
   :line 1797,
   :var-type "function",
   :arglists ([driver q text]),
   :doc
   "Fills text like humans do: with error, corrections and pauses.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q`: a query term, see `query` function for more info,\n\n- `text`: a string to input.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-human"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "fill-multi",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1760",
   :line 1760,
   :var-type "function",
   :arglists ([driver q-text]),
   :doc
   "Fills multiple inputs in batch.\n\n`q-text` could be:\n\n- a map of {query -> text}\n- a vector of [query1 text1 query2 text2 ...]",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/fill-multi"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2103",
   :line 2103,
   :var-type "var",
   :arglists nil,
   :doc "Launches Firefox driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "forward",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L379",
   :line 379,
   :var-type "function",
   :arglists ([driver]),
   :doc "Move forwards in a browser's history.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/forward"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-cookie",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1010",
   :line 1010,
   :var-type "function",
   :arglists ([driver cookie-name]),
   :doc
   "Returns the first cookie with such name.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `cookie-name`: a string/keyword witn a cookie name.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-cookie"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-cookies",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L990",
   :line 990,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Returns all the cookies browser keeps at the moment.\n\nEach cookie is a map with structure:\n\n{:name \"cookie1\",\n :value \"test1\",\n :path \"/\",\n :domain \"\",\n :expiry nil,\n :secure false,\n :httpOnly false}",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-cookies"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-attr",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L827",
   :line 827,
   :var-type "function",
   :arglists ([driver q name]),
   :doc
   "Returns an HTTP attribute of an element (class, id, href, etc).\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q`: a query term to find an element,\n\n- `name`: either a string or a keyword with a name of an attribute.\n\nReturns: a string with the attribute value, `nil` if no such\nattribute for that element.\n\nNote: it does not split CSS classes! A single string with spaces is\nreturned.\n\nExample:\n\n(def driver (firefox))\n(get-element-attr driver {:tag :a} :class)\n>> \"link link__external link__button\" ;; see note above",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-attr"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-attrs",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L859",
   :line 859,
   :var-type "function",
   :arglists ([driver q & names]),
   :doc
   "Returns multiple attributes in batch. The result is a vector of\ncorresponding attributes.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-attrs"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-box",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L771",
   :line 771,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns a bounding box for an element found with a query term.\n\nThe result is a map with the following keys:\n\n- `:x1`: top left `x` coordinate;\n- `:y1`: top left `y` coordinate;\n- `:x2`: bottom right `x` coordinate;\n- `:y2`: bottom right `y` coordinate;\n- `:width`: width as a difference b/w `:x2` and `:x1`;\n- `:height`: height as a difference b/w `:y2` and `:y1`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-box"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-css",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L879",
   :line 879,
   :var-type "function",
   :arglists ([driver q name]),
   :doc
   "Returns a CSS property of an element. The property might be both\nown or inherited.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `q`: a query term,\n\n- `name`: a string/keyword with a CSS name (:font, \"background-color\", etc).\n\nReturns a string with a value, `nil` if there is no such property.\n\nNote: colors, fonts and some other properties may be represented in\ntheir own ways depending on a browser.\n\nExample:\n\n(def driver (firefox))\n(get-element-css driver {:id :content} :background-color)\n>> \"rgb(204, 204, 204)\" ;; or \"rgba(204, 204, 204, 1)\"",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-css"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-csss",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L911",
   :line 911,
   :var-type "function",
   :arglists ([driver q & names]),
   :doc
   "Returns multiple CSS properties in batch. The result is a vector of\ncorresponding properties.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-csss"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L735",
   :line 735,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns an element size as a map with :width and :height keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-tag",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L950",
   :line 950,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Returns element's tag name (\"div\", \"input\", etc).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-tag"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-tag-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L941",
   :line 941,
   :var-type "function",
   :arglists ([driver el]),
   :doc "Returns element's tag name by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-tag-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-text",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L964",
   :line 964,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Returns inner element's text.\n\nFor `<p class=\"foo\">hello</p>` it will be \"hello\" string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-text"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-text-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L955",
   :line 955,
   :var-type "function",
   :arglists ([driver el]),
   :doc "Retuns element's inner text by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-text-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-value",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L981",
   :line 981,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Returns element's value set with `value` attribute.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-value"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-element-value-el",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L972",
   :line 972,
   :var-type "function",
   :arglists ([driver el]),
   :doc "Returns element's value by its identifier.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-element-value-el"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-source",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1070",
   :line 1070,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns browser's current HTML markup as a string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-source"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-status",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L126",
   :line 126,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Returns the current Webdriver status info. The content depends on\nspecific driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-status"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-title",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L398",
   :line 398,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current window's title.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-title"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-url",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L390",
   :line 390,
   :var-type "function",
   :arglists ([driver]),
   :doc "Returns the current URL string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-url"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-window-handle",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L182",
   :line 182,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Returns the current active window handler as a string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-handle"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-window-handles",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L203",
   :line 203,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Returns a vector of all window handlers.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-handles"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-window-position",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L280",
   :line 280,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc
   "Returns a window position relative to your screen as a map with\n`:x` and `:y` keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-position"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "get-window-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L258",
   :line 258,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc
   "Returns a window size a map with `:width` and `:height` keys.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/get-window-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "go",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L352",
   :line 352,
   :var-type "function",
   :arglists ([driver url]),
   :doc
   "Open the URL the current window.\n\nExample:\n\n(def ff (firefox))\n(go ff \"http://google.com\")",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/go"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "intersects?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L794",
   :line 794,
   :var-type "function",
   :arglists ([driver q1 q2]),
   :doc
   "Determines whether two elements intersects in geometry meaning.\n\nThe implementation compares bounding boxes for each element\nanalyzing their arrangement.\n\nArguments:\n\n- `q1` and `q2` are query terms to find elements to check for\nintersection.\n\nReturns true or false.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/intersects?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "js-execute",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1083",
   :line 1083,
   :var-type "multimethod",
   :arglists ([driver script & args]),
   :doc
   "Executes Javascript code in browser synchronously.\n\nThe code is sent as a string (might be multi-line). Under the hood, a\nbrowser wraps your code into a function so avoid `function` clause\nat on the top level.\n\nDon't forget to add `return <something>` operator if your are\ninterested in the result value.\n\nYou may access arguments through the built-in `arguments`\npseudo-array from your code. You may pass any data structures that\nare JSON-compatible (scalars, maps, vectors).\n\nThe result value is also returned trough JSON encode/decode\npipeline (Js objects turn to Clojure maps, arrays into vectors and\nso on).\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `script`: a string with the code to execute.\n\n- `args`: additinal arguments for your code.\n\nExample:\n\n(def driver (chrome))\n(js-execute driver \"return arguments[0] + 1;\" 42)\n>> 43\n",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/js-execute"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "make-url",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1935",
   :line 1935,
   :var-type "function",
   :arglists ([host port]),
   :doc "Makes an Webdriver URL from a host and port.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/make-url"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "maximize",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L240",
   :line 240,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Makes the browser window as wide as your screen allows.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/maximize"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "mouse-btn-down",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L603",
   :line 603,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Puts down a button of a virtual mouse.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/mouse-btn-down"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "mouse-btn-up",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L614",
   :line 614,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc "Puts up a button of a virtual mouse.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/mouse-btn-up"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "mouse-move-to",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L625",
   :line 625,
   :var-type "multimethod",
   :arglists ([driver q] [driver x y]),
   :doc
   "Moves a virtual mouse pointer either to an element\nor by `x` and `y` offset.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/mouse-move-to"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2111",
   :line 2111,
   :var-type "var",
   :arglists nil,
   :doc "Launches Phantom.js driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "port-args",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1940",
   :line 1940,
   :var-type "multimethod",
   :arglists ([driver]),
   :doc
   "Returns a vector of port arguments specific for each driver type.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/port-args"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "postmortem-handler",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1870",
   :line 1870,
   :var-type "function",
   :arglists ([driver opt]),
   :doc
   "Internal postmortem handler that creates files. See\n`with-postmortem` for more info.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/postmortem-handler"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "q-expand",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L443",
   :line 443,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Expands a query expression into a pair of `[locator, term]` values\nto pass them into low-level HTTP API. Throws a Slingshot exception\nin case of unsupported clause.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/q-expand"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "q-xpath",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L410",
   :line 410,
   :var-type "function",
   :arglists ([q]),
   :doc
   "Turns a map into an XPath clause. The rules are:\n\n- `:tag` value becomes a tag name, otherwise `*` is used;\n\n- `:index` becomes a `[x]` at the end of expression if passed;\n\n- any other key-value pair becomes an attribute filter as follows:\n`{:foo \"one\" :baz \"two\"}` => `\"[@foo='one'][@bar='two']\"`.\n\n- the final XPath is always relative (started with `.//`) to make it\nwork with nested expressions.\n\nExample:\n\n(q-xpath {:tag :a :class :large :index 2 :target :_blank})\n> \".//a[@class='large'][@target='_blank'][2]\"",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/q-xpath"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "query",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L526",
   :line 526,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Finds an element on a page.\n\nA query might be:\n\n- a string, so the current browser's locator will be used. Examples:\n\n//div[@id='content'] for XPath,\ndiv.article for CSS selector\n\n- a keyword `:active` that means the current active element\n\n- any keyword `value` that is converted to XPath `.//*[@id='<value>']`\n\n- a map with either :xpath or :css keys with a string term, e.g:\n{:xpath \"//div[@id='content']\"} or\n{:css \"div.article\"}\n\n- a map that will turn into an XPath expression:\n{:tag :div} => .//div\n{:id :container} => .//*[@id='container']\n{:tag :a :class :external :index 2} => .//a[@class='external'][2]\n\n- a vector of any clause mentioned above. In that case,\nevery next term is searched inside the previous one. Example:\n[{:id :footer} {:tag :a}] => finds the first hyperlink\ninside a div with id 'footer'.\n\nReturns an element's unique identifier as a string.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/query"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "query-all",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L574",
   :line 574,
   :var-type "function",
   :arglists ([driver q]),
   :doc
   "Finds multiple elements by a single query.\n\nIf a query is a vector, it finds the first element for all the terms\nexcept the last one, then all the elements for the last term from\nthe element got from the previous terms.\n\nSee `query` function for more info.\n\nReturns a vector of element identifiers.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/query-all"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "quit",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2095",
   :line 2095,
   :var-type "function",
   :arglists ([driver]),
   :doc "Closes the current session and stops the driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/quit"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "random-port",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L63",
   :line 63,
   :var-type "function",
   :arglists ([]),
   :doc "Returns a random port skiping the first 1024 ones.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/random-port"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "refresh",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L372",
   :line 372,
   :var-type "function",
   :arglists ([driver]),
   :doc "Reloads the current window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/refresh"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "run-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1997",
   :line 1997,
   :var-type "function",
   :arglists ([driver & [opt]]),
   :doc
   "Runs a driver process locally.\n\nCreates a UNIX process with a Webdriver HTTP server. Host and port\nare taken from a `driver` argument. Updates a driver instance with\nnew fields with process information. Returns modified driver.\n\nArguments:\n\n- `driver` is an atom created with `create-driver` function.\n\n- `opt` is an optional map with the following possible parameters:\n\n-- `:path` is a string path to a binary file to\nlaunch. `default-paths` global map is used for lookup when not\npassed.\n\n-- `:args` is a vector of additional arguments passed when starting\na process.\n\n-- `:env` is a map with system ENV variables. Keys are turned to\nupper-case strings.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/run-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "running?",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1271",
   :line 1271,
   :var-type "function",
   :arglists ([driver]),
   :doc "Check whether a driver runs HTTP server.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/running?"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2115",
   :line 2115,
   :var-type "var",
   :arglists nil,
   :doc "Launches Safari driver. A shortcut for `boot-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "screenshot",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1842",
   :line 1842,
   :var-type "multimethod",
   :arglists ([driver filename]),
   :doc
   "Takes a screenshot of the current page. Saves it in a *.png file on disk.\nRises exception if a screenshot is empty.\n\nArguments:\n\n- `driver`: driver instance,\n\n- `filename`: full path to a file.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/screenshot"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "set-cookie",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1025",
   :line 1025,
   :var-type "function",
   :arglists ([driver cookie]),
   :doc
   "Sets a new cookie.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `cookie`: a map with structure described in `get-cookies`. At\nleast `:name` and `:value` fields should be populated.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-cookie"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "set-window-position",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L340",
   :line 340,
   :var-type "function",
   :arglists ([driver {:keys [x y]}] [driver x y]),
   :doc
   "Sets new position for a window. Absolute precision is not\nguaranteed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-window-position"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "set-window-size",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L318",
   :line 318,
   :var-type "function",
   :arglists ([driver {:keys [width height]}] [driver width height]),
   :doc
   "Sets new size for a window. Absolute precision is not guaranteed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/set-window-size"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "stop-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2070",
   :line 2070,
   :var-type "function",
   :arglists ([driver]),
   :doc
   "Stops the driver's process. Removes proces's data from the driver\ninstance. Returns a modified driver.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/stop-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "submit",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1829",
   :line 1829,
   :var-type "function",
   :arglists ([driver q]),
   :doc "Sends Enter button value to an element found with query.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/submit"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "switch-window",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L222",
   :line 222,
   :var-type "function",
   :arglists ([driver handle]),
   :doc "Switches a browser to another window.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/switch-window"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1426",
   :line 1426,
   :var-type "function",
   :arglists ([driver sec] [sec]),
   :doc "Sleeps for N seconds.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-absent",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1479",
   :line 1479,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element is absent.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-absent"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-disabled",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1531",
   :line 1531,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element is disabled (usually an input element).\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-disabled"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-enabled",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1519",
   :line 1519,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element is enabled (usually an input element).\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-enabled"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-exists",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1467",
   :line 1467,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element exists on a page (bur may not be visible though).\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-exists"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-has-alert",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1543",
   :line 1543,
   :var-type "function",
   :arglists ([driver & [opt]]),
   :doc
   "Waits until an alert dialog appears on the screen.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-has-alert"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-has-class",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1571",
   :line 1571,
   :var-type "function",
   :arglists ([driver q class & [opt]]),
   :doc
   "Waits until an element has specific class.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `class`: a class to search as string;\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-has-class"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-has-text",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1555",
   :line 1555,
   :var-type "function",
   :arglists ([driver q text & [opt]]),
   :doc
   "Waits until an element has text anywhere inside it (including inner HTML).\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `text`: a string to search;\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-has-text"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-invisible",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1507",
   :line 1507,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element presents but not visible.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-invisible"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-predicate",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1433",
   :line 1433,
   :var-type "function",
   :arglists ([pred] [pred opt]),
   :doc
   "Sleeps continuously calling a predicate until it returns true.\nRises a slingshot exception when timeout is reached.\n\nArguments:\n\n- `pred`: a zero-argument predicate to call;\n- `opt`: a map of optional parameters:\n-- `:timeout` wait limit in seconds, 20 by default;\n-- `:interval` how long to wait b/w calls, 0.33 by default;\n-- `:message` a message that becomes a part of exception when timeout is reached.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-predicate"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "wait-visible",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1493",
   :line 1493,
   :var-type "function",
   :arglists ([driver q & [opt]]),
   :doc
   "Waits until an element presents and is visible.\n\nArguments:\n\n- `driver`: a driver instance;\n- `q`: a query term (see `query`);\n- `opt`: a map of options (see `wait-predicate`).",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/wait-visible"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1689",
   :line 1689,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc
   "Executes the body only if the driver is Chrome.\n\nExample:\n\n(def driver (chrome))\n(when-chrome driver\n  (println \"It's Chrome!\")",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1706",
   :line 1706,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Firefox.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-not-chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1663",
   :line 1663,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if a browser is NOT Chrome.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-not-firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1673",
   :line 1673,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if a browser is NOT Firefox.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-not-phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1668",
   :line 1668,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if a browser is NOT Phantom.js.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-not-safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1678",
   :line 1678,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if a browser is NOT Safari.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-not-safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1701",
   :line 1701,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Phantom.js.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-predicate",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1683",
   :line 1683,
   :var-type "macro",
   :arglists ([predicate & body]),
   :doc "Executes the body only if a predicate returns true.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-predicate"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "when-safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1711",
   :line 1711,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Executes the body only if the driver is Safari.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/when-safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "with-chrome",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2156",
   :line 2156,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Chrome session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-chrome"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "with-driver",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2119",
   :line 2119,
   :var-type "macro",
   :arglists ([type opt bind & body]),
   :doc
   "Performs the body within a driver session.\n\nLaunches a driver of a given type. Binds the driver instance to a\npassed `bind` symbol. Executes the body once the driver has\nstarted. Shutdowns the driver finally (even if an exception\noccurred).\n\nArguments:\n\n- `type` is a keyword what driver type to start.\n\n- `opt` is a map with driver's options. See `boot-driver` for more\ndetails.\n\n- `bind` is a symbol to bind a driver reference.\n\nExample:\n\n(with-driver :firefox {} driver\n  (go driver \"http://example.com\"))",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-driver"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "with-firefox",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2149",
   :line 2149,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Firefox session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-firefox"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "with-mouse-btn",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L641",
   :line 641,
   :var-type "macro",
   :arglists ([driver & body]),
   :doc "Performs the body keeping mouse botton pressed.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-mouse-btn"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "with-phantom",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2163",
   :line 2163,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Phantom.js session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-phantom"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "with-postmortem",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L1901",
   :line 1901,
   :var-type "macro",
   :arglists ([driver opt & body]),
   :doc
   "Wraps the body with postmortem handler. If any error occurs,\nit will save a screenshot and the page's source code on disk before\nrising an exception so it could help you to discover what happened.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `opt`: a map of options, where:\n\n-- `:dir` path to a directory where to store both `.png` and `.html`\nfiles. Might not exist, will be created otherwise.\n\n-- `:dir-img`: path to a directory where to store `.png`\nfiles (screenshots). If `nil`, `:dir` value is used.\n\n-- `:dir-src`: path to a directory where to store `.html`\nfiles (page source). If `nil`, `:dir` value is used.\n\n-- `:date-format`: a string represents date(time) pattern to make\nfilenames unique. Default is \"yyyy-MM-dd-hh-mm-ss\". See Oracle\nJava `SimpleDateFormat` class manual for more patterns.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-postmortem"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "with-resp",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L83",
   :line 83,
   :var-type "macro",
   :arglists ([driver method path data result & body]),
   :doc
   "Executes an HTTP request to a driver's server. Performs the body\nwithin result data bound to the `result` clause.\n\nArguments:\n\n- `driver`: a driver instance,\n\n- `method`: a keyword represents HTTP method, e.g. `:get`, `:post`,\n`:delete`, etc.\n\n- `path`: a vector of strings/keywords represents a server's\npath. For example:\n\n`[:session \"aaaa-bbbb-cccc\" :element \"dddd-eeee\" :find]`\n\nwill turn into \"/session/aaaa-bbbb-cccc/element/dddd-eeee/find\".\n\n- `data`: any data sctructure to be sent as JSON body. Put `nil` For\n`GET` requests.\n\n- `result`: a symbol to bind the data from the HTTP response with\n`let` form before executing the body.\n\nExample:\n\n(def driver (firefox))\n(with-resp driver :get\n  [:session (:session @driver) :element :active]\n  nil resp\n  (print resp))",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-resp"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj",
   :name "with-safari",
   :file "src/etaoin/api.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/30f54206d6804575fbf260c8dfb5f11f146a3a18/src/etaoin/api.clj#L2170",
   :line 2170,
   :var-type "macro",
   :arglists ([opt bind & body]),
   :doc
   "Performs the body with Safari session. A shortcut for\n`with-driver`.",
   :namespace "etaoin.api",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.api-api.html#etaoin.api/with-safari"}
  {:raw-source-url
   "https://github.com/igrishaev/etaoin/raw/d69386be8590f2390952770999fad09d632c7670/src/etaoin/client.clj",
   :name "timeout",
   :file "src/etaoin/client.clj",
   :source-url
   "https://github.com/igrishaev/etaoin/blob/d69386be8590f2390952770999fad09d632c7670/src/etaoin/client.clj#L12",
   :line 12,
   :var-type "var",
   :arglists nil,
   :doc
   "HTTP timeout in seconds. The current value may seems to high,\nbut according to my experience with SPA application full of React\nmodules even 20 seconds could not be enough for a driver to process\nyour request.",
   :namespace "etaoin.client",
   :wiki-url
   "https://igrishaev.github.io/etaoin/etaoin.client-api.html#etaoin.client/timeout"})}
