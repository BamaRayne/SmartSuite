/*  
 * Smart Message Control    
 *
 *	10/16/2018		ver 1.0 R.0.0.1		Initial Release
 *
 *
 *  Copyright 2018 Jason Headley
 *
 *  Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License. You may obtain a copy of the License at:
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software distributed under the License is distributed
 *  on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License
 *  for the specific language governing permissions and limitations under the License.
 *

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 *  Supported by the following SmartThings Apps
 *	RemindR V2
 *	House Fan Controller
 *	Logic Rulz
 
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
/**********************************************************************************************************************************************/
definition(
    name		: "Smart Message Control",
    namespace	: "Echo",
    author		: "bamarayne",
    description	: "The smart way to make and send messages in your home.",
    category	: "My Apps",
	iconUrl			: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/SMC.png",
	iconX2Url		: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/SMC2x.png",
	iconX3Url		: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/SMCx.png")

/**********************************************************************************************************************************************/
private def version() { 
    	def text = "Smart Message Control Ver 1.0 / R.0.0.1, \n" +
        "Current Release date: in development \n" +
        "Initial Release Date: not released" 
	}

preferences {
    page(name: "main")
    page(name: "statusPage")
    page(name: "settingsPage")
    page(name: "weatherPage")
    page(name: "messages")
}
page name: "main"
def main() {
    dynamicPage (name: "main", title: "", install: true, uninstall: uninstalled) {  
        section("Create and Manage Zones") {
            href "messages", title: "Configure Your Communications Zones", description: mRoomsD(), state: mRoomsS(), 
            image: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/Zones.png"
            }
        section("Zone Details",  uninstall: false){
            href "statusPage", title: "View the details of your Zones", description: mBlocksD(), state: mBlocksS(),
            image: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/Details.png"
            }
        section("Pause Communications") {
        	input "aPause", "bool", title: "Turn off this toggle to pause ALL Communication Zones", defaultValue: true, submitOnChange: true,
            	image: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/Pause.png"
            input "kSwitch", "capability.switch", title: "or, use this switch as a kill-switch", multiple: false, required: false, submitOnChange: true,
            	image: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/Kill.png"
            	if (kSwitch) input "kSwitchCmd", "enum", title: "Stop all Communications when this switch is", options: ["on":"On","off":"Off"], multiple: false, required: true, submitOnChange: true
            }
        section("Settings") {
        	href "settingsPage", title: "Configure Settings", description: mSettingsD(), state: mSettingsS(),
            image: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/Settings.jpg"
            }
        section("Uninstall") {
        	href "uninstallPage", title: "Click here to remove $app.label",
            image: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/Warn.png"
            }
    }
}

/******************************************************************************
	COMMUNICATION ZONES
******************************************************************************/
def messages() {
    dynamicPage (name: "messages", title: "You have created (${childApps?.size()}) Communication Zones", install: true, uninstall: installed) {
        section(""){
            app(name: "Smart Message Control Zone", appName: "Smart Message Control Zone", title: "Create a new messaging Zone", namespace: "Echo", displayChildApps: true, multiple: true,  uninstall: false)
        }
    }
}

page name: "settingsPage"
	def settingsPage() {
    	dynamicPage (name: "settingsPage", title: "Tap here to configure settings") {
        section("") {
            input "debug", "bool", title: "Enable Debug Logging", default: true, submitOnChange: true
        	input "trace", "bool", title: "Enable Trace Logging", default: false, submitOnChange: true
            paragraph "Debug logging is for normal use, Trace logging is for when we have a problem"
			}
        section("App Details") {
            paragraph "${version()}"
     		}
        }    
	}
        
page name: "statusPage"
    def statusPage() {
    	dynamicPage (name: "statusPage", title: "You have created (${childApps?.size()}) Communication Zones", install: true, uninstall: installed) {
    		section("Paused Communication Zones"){
         //   paragraph runningAppsFalse()  
            }
            section("Active Communication Zones") {
         //   paragraph runningAppsTrue()
            }
        }
    }    
page name: "uninstallPage"
    def uninstallPage() {
    	dynamicPage (name: "uninstallPage", title: "Clicking on the BIG RED BUTTON below will completely remove $app.label and all Routines!", install: true, uninstall: true) {
    		section("Please ensure you are ready to take this step, there is no coming back from the brink!"){
            }
		}
    }    


/************************************************************************************************************
		Base Process
************************************************************************************************************/
def installed() {
	if (debug) log.debug "Installed with settings: ${settings}"
//    log.debug "Parent App Version: ${textVersion()} | Release: ${release()}"
    initialize()
}
def updated() { 
	if (debug) log.debug "Updated with settings: ${settings}"
//    log.debug "Parent App Version: ${textVersion()} | Release: ${release()}"
	unsubscribe()
    initialize()
}
def initialize() {
        //Other Apps Events	
        subscribe(location, "RemindRevent", zone)
        subscribe(location, "House Fan Controller", zone) 
        subscribe(location, "Logic Rulz", zone)
}

public getSMCZones(){
	return getChildApps()*.getLabel()
}

/** Configure Settings Pages **/
def mSettingsS(){
    def result = ""
    if (debug == true && trace == true) {
    	result = "complete"	
    }
    result
}
def mSettingsD() {
    def text = "Settings have not been configured. Tap here to begin"
    if ("$debug" == true) { debug = "Debug Logging is Active" }
    if ("$debug" == false) { debug = "Dubug Logging is not Active" }
    if ("$trace" == true) { trace = "Trace Logging is Active" }
    if ("$trace" == false) { trace = "Trace Logging is not Active" }
    	text = "Debug Logging is $debug \n" +
        	"Trace Logging is $trace "
}                     
def mRoomsS(){
    def result = ""
    if (childApps?.size()) {
    	result = "complete"	
    }
    result
}
def mRoomsD() {
    def text = "No Zones have been configured. Tap here to begin"
    def ch = childApps?.size()     
    if (ch == 1) {
        text = "One Zone has been configured. Tap here to view and change"
    }
    else {
    	if (ch > 1) {
        text = "${ch} Zones have been configured. Tap here to view and change"
     	}
    }
    text
}                     
def getProfileList(){
		return getChildApps()*.label
}

def mBlocksS(){
    def result = ""
    if (state.runBlock > 0) {
    	result = "complete"	
    }
    result
}
def mBlocksD() {
    def text = "Zones have not been created. Tap here to begin"
    	text = "There are $state.runZones activated Zones \n" +
        	"and $state.pauseZones deactivated Zones. "
}                     


// FIND ZONES TO ACTIVATE
def zone(evt) {
    if (aPause == false) {
    	log.warn "Smart Message Control Communications have been paused in the Parent app by the user"
        return
        }
    if (debug) log.info "event received from $evt.name with the following message --> $evt.descriptionText"
    def msg = evt.descriptionText
    if (kSwitch) {
        def status = kSwitch?.currentValue("switch")
        if (status == kSwitchCmd){
            log.warn "The kill switch has been activated and messages have been stopped" 
        }
        else if (status != kSwitchCmd) {
            def result
            childApps.each {child ->
                def ch = child.label.toLowerCase()
                if (ch) { 
                    if (debug) log.debug "Activating Zone: $ch"
                    result = child.ttsActions(evt) 
                }
                else {
                    log.debug "Could not find a zone to activate"
                }
            }
        }
    }
    else{
        def result
        childApps.each {child ->
            def ch = child.label.toLowerCase()
            if (ch) {
            if (debug) log.debug "Activating Zone: $ch"
                result = child.ttsActions(evt) 
            	}
            else {
                log.debug "Could not find a zone to activate"
            }
        }
    }
}
            
            
/*****************************************************************************************
    CODE REQUIRED FOR 3RD PARTY INTEGRATION
    
    IF YOUR APP IS A PARENT/CHILD APP, PLACE ALL
    CODE IN THE CHILD APP.
    
    ALL MESSAGE DATA MUST BE CHANGED TO "${message}" --> example --> def message = tts
******************************************************************************************


/////PLACE THIS IN THE PARENT APP \\\\\\\\\\	

--- INITIALIZE ---
subscribe(location, "SMC", SMCZones)

def listSMCZones() {
log.warn "child requesting Smart Message Control Zones"
log.info "Smart Message Control Zones List = $state.zones"
	return state.zones = state.zones ? state.zones : []
}


def SMCZones(evt) {
	def result
    log.warn "received Zones List from Smart Message Control: $evt.data"
	switch (evt.value) {
		case "refresh":
		state.zones = evt.jsonData && evt.jsonData?.zones ? evt.jsonData.zones : []
			break
		case "runReport":
			def zones = evt.jsonData
            	result = runReport(zones)
            break	
    }
    return result
}


//////////// GIVE USER OPTION TO SEND MESSAGES TO SMC IN CHILD APP \\\\\\\\\\\\\\\\

section ("Send Messages to Smart Message Control") {
   	input "smc", "bool", title: "Send Messages to Smart Message Control"
    	if (smc) {
    		input "SMCZones", "enum", title: "Send a message to this Smart Message Zone", options:  parent.listSMCZones(), multiple: true, required: false
    		}
        }    

/////////// PLACE THIS CODE WHERE YOU WOULD CALL YOUR MESSAGES HANDLER. \\\\\\\\\

if(SMCZones) {
	sendToSMC(evt)
	}


******************************************************************************************************
   SEND TO SMART MESSAGE CONTROL HANDLER
******************************************************************************************************
def sendToSMC(evt) {
	log.debug "sending to SMC Zone(s): $zone"
    def message = YOUR MESSAGE VARIABLE
    SMCZones.each {zone ->
    sendLocationEvent(name: "YOUR PARENT APP NAME", value: zone, descriptionText: message)}
    log.trace "SMC Zone event details: name = LogicRulz, msg = $message, zone = $evt.value, descriptionText = $evt.descriptionText"
	}

*/