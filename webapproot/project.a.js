wm.JsonRpcService.smdCache['runtimeService.smd'] = {
	"methods": [{
		"name": "delete",
		"operationType": null,
		"parameters": [{
			"name": "serviceName",
			"type": "java.lang.String"
		}, {
			"name": "typeName",
			"type": "java.lang.String"
		}, {
			"name": "objectToDelete",
			"type": "java.lang.Object"
		}],
		"returnType": null
	}, {
		"name": "echo",
		"operationType": null,
		"parameters": [{
			"name": "contents",
			"type": "java.lang.String"
		}, {
			"name": "contentType",
			"type": "java.lang.String"
		}, {
			"name": "fileName",
			"type": "java.lang.String"
		}],
		"returnType": "com.wavemaker.runtime.server.DownloadResponse"
	}, {
		"name": "getInternalRuntime",
		"operationType": null,
		"parameters": null,
		"returnType": "com.wavemaker.runtime.server.InternalRuntime"
	}, {
		"name": "getLocalHostIP",
		"operationType": null,
		"parameters": null,
		"returnType": "java.lang.String"
	}, {
		"name": "getProperty",
		"operationType": null,
		"parameters": [{
			"name": "instance",
			"type": "java.lang.Object"
		}, {
			"name": "type",
			"type": "java.lang.String"
		}, {
			"name": "propertyName",
			"type": "java.lang.String"
		}],
		"returnType": "java.lang.Object"
	}, {
		"name": "getRuntimeAccess",
		"operationType": null,
		"parameters": null,
		"returnType": "com.wavemaker.runtime.RuntimeAccess"
	}, {
		"name": "getServiceEventNotifier",
		"operationType": null,
		"parameters": null,
		"returnType": "com.wavemaker.runtime.service.events.ServiceEventNotifier"
	}, {
		"name": "getServiceManager",
		"operationType": null,
		"parameters": null,
		"returnType": "com.wavemaker.runtime.service.ServiceManager"
	}, {
		"name": "getServiceWire",
		"operationType": null,
		"parameters": [{
			"name": "serviceName",
			"type": "java.lang.String"
		}, {
			"name": "typeName",
			"type": "java.lang.String"
		}],
		"returnType": "com.wavemaker.runtime.service.ServiceWire"
	}, {
		"name": "getSessionId",
		"operationType": null,
		"parameters": null,
		"returnType": "java.lang.String"
	}, {
		"name": "getTypeManager",
		"operationType": null,
		"parameters": null,
		"returnType": "com.wavemaker.runtime.service.TypeManager"
	}, {
		"name": "insert",
		"operationType": null,
		"parameters": [{
			"name": "serviceName",
			"type": "java.lang.String"
		}, {
			"name": "typeName",
			"type": "java.lang.String"
		}, {
			"name": "objectToInsert",
			"type": "java.lang.Object"
		}],
		"returnType": "com.wavemaker.runtime.service.TypedServiceReturn"
	}, {
		"name": "read",
		"operationType": null,
		"parameters": [{
			"name": "serviceName",
			"type": "java.lang.String"
		}, {
			"name": "typeName",
			"type": "java.lang.String"
		}, {
			"name": "instance",
			"type": "java.lang.Object"
		}, {
			"name": "propertyOptions",
			"type": "com.wavemaker.runtime.service.PropertyOptions"
		}, {
			"name": "pagingOptions",
			"type": "com.wavemaker.runtime.service.PagingOptions"
		}],
		"returnType": "com.wavemaker.runtime.service.TypedServiceReturn"
	}, {
		"name": "setInternalRuntime",
		"operationType": null,
		"parameters": [{
			"name": "internalRuntime",
			"type": "com.wavemaker.runtime.server.InternalRuntime"
		}],
		"returnType": null
	}, {
		"name": "setRuntimeAccess",
		"operationType": null,
		"parameters": [{
			"name": "runtimeAccess",
			"type": "com.wavemaker.runtime.RuntimeAccess"
		}],
		"returnType": null
	}, {
		"name": "setServiceEventNotifier",
		"operationType": null,
		"parameters": [{
			"name": "serviceEventNotifier",
			"type": "com.wavemaker.runtime.service.events.ServiceEventNotifier"
		}],
		"returnType": null
	}, {
		"name": "setServiceManager",
		"operationType": null,
		"parameters": [{
			"name": "serviceManager",
			"type": "com.wavemaker.runtime.service.ServiceManager"
		}],
		"returnType": null
	}, {
		"name": "setTypeManager",
		"operationType": null,
		"parameters": [{
			"name": "typeManager",
			"type": "com.wavemaker.runtime.service.TypeManager"
		}],
		"returnType": null
	}, {
		"name": "update",
		"operationType": null,
		"parameters": [{
			"name": "serviceName",
			"type": "java.lang.String"
		}, {
			"name": "typeName",
			"type": "java.lang.String"
		}, {
			"name": "objectToUpdate",
			"type": "java.lang.Object"
		}],
		"returnType": "com.wavemaker.runtime.service.TypedServiceReturn"
	}],
	"serviceType": "JSON-RPC",
	"serviceURL": "runtimeService.json"
};
wm.JsonRpcService.smdCache['waveMakerService.smd'] = {
	"methods": [{
		"name": "echo",
		"operationType": null,
		"parameters": [{
			"name": "contents",
			"type": "java.lang.String"
		}, {
			"name": "contentType",
			"type": "java.lang.String"
		}, {
			"name": "fileName",
			"type": "java.lang.String"
		}],
		"returnType": "com.wavemaker.runtime.server.DownloadResponse"
	}, {
		"name": "getLocalHostIP",
		"operationType": null,
		"parameters": null,
		"returnType": "java.lang.String"
	}, {
		"name": "getServerTimeOffset",
		"operationType": null,
		"parameters": null,
		"returnType": "int"
	}, {
		"name": "getSessionId",
		"operationType": null,
		"parameters": null,
		"returnType": "java.lang.String"
	}, {
		"name": "remoteRESTCall",
		"operationType": null,
		"parameters": [{
			"name": "remoteURL",
			"type": "java.lang.String"
		}, {
			"name": "params",
			"type": "java.lang.String"
		}, {
			"name": "method",
			"type": "java.lang.String"
		}],
		"returnType": "java.lang.String"
	}],
	"serviceType": "JSON-RPC",
	"serviceURL": "waveMakerService.json"
};
wm.types = {
	"types": {
		"boolean": {
			"internal": true,
			"primitiveType": "Boolean"
		},
		"byte": {
			"internal": true,
			"primitiveType": "Number"
		},
		"char": {
			"internal": true,
			"primitiveType": "String"
		},
		"double": {
			"internal": true,
			"primitiveType": "Number"
		},
		"float": {
			"internal": true,
			"primitiveType": "Number"
		},
		"int": {
			"internal": true,
			"primitiveType": "Number"
		},
		"java.lang.Boolean": {
			"internal": false,
			"primitiveType": "Boolean"
		},
		"java.lang.Byte": {
			"internal": false,
			"primitiveType": "Number"
		},
		"java.lang.Character": {
			"internal": false,
			"primitiveType": "String"
		},
		"java.lang.Double": {
			"internal": false,
			"primitiveType": "Number"
		},
		"java.lang.Float": {
			"internal": false,
			"primitiveType": "Number"
		},
		"java.lang.Integer": {
			"internal": false,
			"primitiveType": "Number"
		},
		"java.lang.Long": {
			"internal": false,
			"primitiveType": "Number"
		},
		"java.lang.Short": {
			"internal": false,
			"primitiveType": "Number"
		},
		"java.lang.String": {
			"internal": false,
			"primitiveType": "String"
		},
		"java.lang.StringBuffer": {
			"internal": false,
			"primitiveType": "String"
		},
		"java.math.BigDecimal": {
			"internal": false,
			"primitiveType": "Number"
		},
		"java.math.BigInteger": {
			"internal": false,
			"primitiveType": "Number"
		},
		"java.sql.Date": {
			"internal": false,
			"primitiveType": "Date"
		},
		"java.sql.Time": {
			"internal": false,
			"primitiveType": "Date"
		},
		"java.sql.Timestamp": {
			"internal": false,
			"primitiveType": "Date"
		},
		"java.util.Date": {
			"internal": false,
			"primitiveType": "Date"
		},
		"long": {
			"internal": true,
			"primitiveType": "Number"
		},
		"short": {
			"internal": true,
			"primitiveType": "Number"
		}
	}
};
wm.Application.themeData['wm.base.widget.themes.Bootstrap'] = {"wm.Button":{"desktopHeight":"30px","margin":"0,.3em,0,6","borderColor":"#bbbbbb","width":"100px","padding":"4,12","mobileHeight":"30px"},"wm.ToggleButton":{"desktopHeight":"30px","margin":"0,.3em,0,6","borderColor":"#bbbbbb","width":"100px","padding":"4,12","mobileHeight":"30px"},"wm.PopupMenuButton":{"desktopHeight":"30px","margin":"0,.3em,0,6","borderColor":"#bbbbbb","width":"100px","padding":"4,12","mobileHeight":"30px"},"wm.TabLayers":{"borderColor":"#dddddd","border":"0","clientBorder":"1","clientBorderColor":"#dddddd","headerHeight":"26px","mobileHeaderHeight":"42px","headerWidth":"80px"},"wm.AccordionLayers":{"border":0,"borderColor":"#ffffff","clientBorder":"1","clientBorderColor":"#e5e5e5","captionHeight":"30px","captionBorder":1,"captionBorderColor":"#e5e5e5","margin":"5","arrowsOnLeft":true},"wm.FancyPanel":{"innerBorder":"1","borderColor":"#e6e6e6","labelHeight":"30"},"wm.Text":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.LargeTextArea":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.Number":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.Currency":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.SelectMenu":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.Lookup":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.FilteringLookup":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.Date":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.Time":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.DateTime":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.Checkbox":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.RadioButton":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.RichText":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.CheckboxSet":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.RadioSet":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.ListSet":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.Slider":{"mobileHeight":"40px","width":"172px","borderColor":"#e6e6e6","border":"0","desktopHeight":"30px","captionAlign":"left","editorBorder":true,"margin":"0"},"wm.AppRoot":{"borderColor":"#e6e6e6"},"wm.DojoGrid":{"border":"1","borderColor":"#e6e6e6","margin":"4"},"wm.List":{"border":"1","borderColor":"#e6e6e6","margin":"4"},"wm.dijit.ProgressBar":{"borderColor":"#e6e6e6","border":0,"desktopHeight":"24px","mobileHeight":"24px","margin":"0","padding":"0","width":"20px"},"wm.Bevel":{"borderColor":"#949494","bevelSize":"3","border":0},"wm.Splitter":{"borderColor":"#949494","bevelSize":"3","border":0},"wm.dijit.Calendar":{"desktopHeight":"260px","borderColor":"#e6e6e6"},"wm.Toast":{"border":"1","borderColor":"#e6e6e6"},"wm.ButtonBarPanel":{"padding":"14,15,15,0"},"wm.Dialog":{"borderColor":"#999999","titleBarButtonsOnRight":true,"titlebarHeight":"40","titlebarBorderColor":"#eeeeee","titlebarBorder":"0,0,1,0","mobileTitlebarHeight":"40","border":1},"wm.PageDialog":{"borderColor":"#999999","titleBarButtonsOnRight":true,"titlebarHeight":"40","titlebarBorderColor":"#eeeeee","titlebarBorder":"0,0,1,0","mobileTitlebarHeight":"40","border":1},"wm.GenericDialog":{"borderColor":"#999999","titleBarButtonsOnRight":true,"titlebarHeight":"40","titlebarBorderColor":"#eeeeee","titlebarBorder":"0,0,1,0","mobileTitlebarHeight":"40","border":1},"wm.DesignableDialog":{"borderColor":"#999999","titleBarButtonsOnRight":true,"titlebarHeight":"40","titlebarBorderColor":"#eeeeee","titlebarBorder":"0,0,1,0","mobileTitlebarHeight":"40","border":1},"wm.DojoMenu":{"border":1,"desktopHeight":"32px","borderColor":"#cccccc","padding":"4"},"wm.Dashboard":{"borderColor":"#e6e6e6"},"wm.ToggleButtonPanel":{}};
wm.componentList['example.GoogleOrgChart'] = ['wm.base.widget.Composite','common.packages.example.GoogleOrgChart'];
dojo.declare("Project6", wm.Application, {
	"disableDirtyEditorTracking": false, 
	"eventDelay": 0, 
	"hintDelay": 1500, 
	"i18n": false, 
	"isSecurityEnabled": false, 
	"main": "Main", 
	"manageHistory": true, 
	"manageURL": false, 
	"name": "", 
	"phoneGapLoginPage": "Login", 
	"phoneMain": "", 
	"projectSubVersion": "Alpha", 
	"projectVersion": 1, 
	"sessionExpirationHandler": "navigateToLogin", 
	"studioVersion": "6.6.0M2", 
	"tabletMain": "", 
	"theme": "wm.base.widget.themes.Bootstrap", 
	"toastPosition": "br", 
	"touchToClickDelay": 500, 
	"touchToRightClickDelay": 1500,
	"widgets": {
		silkIconList: ["wm.ImageList", {"colCount":39,"height":16,"iconCount":90,"url":"lib/images/silkIcons/silk.png","width":16}, {}]
	},
	_end: 0
});

Project6.extend({

	_end: 0
});
Project6.prototype._css = 'html.WMApp body .panel1 {\
background-color:#3C8DBC;\
}\
html.WMApp body .Titulo {\
font: 150;\
}\
html.WMApp body .label1 {\
font: 150% arial;\
font-weight: bold;\
color:white;\
}\
html.WMApp body .dojoMenu1 {\
background-color:transparent !important;\
color: white;\
}\
';
