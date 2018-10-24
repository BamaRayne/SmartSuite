/*  
 * Smart Suite    
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
 *  Includes the following SmartThings Apps:
 *	RemindR V2
 *	House Fan Controller
 *	Logic Rulz
 *
 
 ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
/**********************************************************************************************************************************************/
definition(
    name		: "Smart Suite",
    namespace	: "Echo",
    author		: "Jason Headley",
    description	: "The smart way to make your home smarter.",
    category	: "My Apps",
	iconUrl			: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/SMC.png",
	iconX2Url		: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/SMC2x.png",
	iconX3Url		: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/SMCx.png")

/**********************************************************************************************************************************************/
private def version() { 
    	def text = "Smart Suite Ver 1.0 / R.0.0.1, \n" +
        "Current Release date: in development \n" +
        "Initial Release Date: not released" 
	}

preferences {
    page(name: "main")
    page(name: "messages")
    page(name: "controls")
    page(name: "reminders")
    page(name: "ventilation")
}
page name: "main"
def main() {
    dynamicPage (name: "main", title: "", install: true, uninstall: uninstalled) {  
        section("Communications") {
            href "messages", title: "Send messages where they matter most", 
            image: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/Zones.png"
            }
        section("Controls",  uninstall: false){
            href "controls", title: "Simple controls for your complex world", 
            image: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/Control.png"
            }
        section("Alerts and Reminders") {
        	href "reminders", title: "Know what's going on when it happens", 
            image: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/Pause.png"
        	}
        section("Ventilation") {
        	href "ventilation", title: "Keep your home Healthy",
            image: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/Settings.jpg"
            }
        section("Uninstall") {
        	href "uninstallPage", title: "Click here to remove $app.label",
            image: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/Warn.png"
            }
    }
}

/******************************************************************************
	Communications
******************************************************************************/
def messages() {
    dynamicPage (name: "messages", title: "You have created (${childApps?.size()}) Communication Zones", install: false, uninstall: installed) {
        section(""){
            app(name: "Smart Message Control", appName: "Smart Message Control", title: "Smart Message Control", namespace: "Echo", multiple: false,  uninstall: false,
            image: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/SMC.png")
        }
    }
}

/******************************************************************************
	Controls
******************************************************************************/
def controls() {
    dynamicPage (name: "controls", title: "Simple control of your complicated world", install: true, uninstall: installed) {
        section("Logic Rulz"){
            app(name: "LogicRulz", appName: "LogicRulz", title: "LogicRulz", namespace: "Echo", multiple: false,  uninstall: false, 
            image : "https://raw.githubusercontent.com/jasonrwise77/My-SmartThings/master/LogicRulz%20Icons/LogicRulz.png")
        }
    }
}


/******************************************************************************
	Reminders and Alerts
******************************************************************************/
def reminders() {
    dynamicPage (name: "reminders", title: "Know what's going on now", install: true, uninstall: installed) {
        section(""){
            app(name: "RemindR2", appName: "RemindR2", title: "RemindR2", namespace: "Echo", multiple: false,  uninstall: false,
            image: "https://raw.githubusercontent.com/BamaRayne/Echosistant/master/smartapps/bamarayne/echosistant.src/app-RemindR.png")
        }
    }
}


/******************************************************************************
	Ventilation
******************************************************************************/
def ventilation() {
    dynamicPage (name: "ventilation", title: "Keep the air in your home moving", install: true, uninstall: installed) {
    	section("Room Air Circulation"){
        	app(name: "Air Circulator", appName: "Air Circulator", title: "Air Circulator", namespace: "tonesto7", multiple: false,  uninstall: false, image: appImg())
        }
    	section("House Fan Controller"){
        	app(name: "House Fan Controller", appName: "House Fan Controller", title: "House Fan Controller", namespace: "Echo", multiple: false,  uninstall: false, image: "https://raw.githubusercontent.com/BamaRayne/SmartSuite/master/Icons/Main.png")
        }
    }
}

page name: "settingsPage"
	def settingsPage() {
    	dynamicPage (name: "settingsPage", title: "Tap here to configure settings") {
        section("App Details") {
            paragraph "${version()}"
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
}

// APP IMAGES FOR AIR CIRCULATOR APP
def appImg() { return "https://d1nhio0ox7pgb.cloudfront.net/_img/g_collection_png/standard/256x256/fan.png" }
def appInfoSect()	{
    def str = ""
    str += "${app?.name}"
    str += "\n• Version: ${appVer()}"
    str += "\n• Updated: ${appDate()}"
    section() {
        paragraph "${str}", image: appImg()	
    }
}

