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
private getCookie1()		{ 'x-amzn-dat-gui-client-v=1.24.204141.0; aws-ubid-main=477-6886115-7675244; aws-target-static-id=1515155664508-989184; aws-target-data=%7B%22support%22%3A%221%22%7D; s_fid=1D31599F9475125F-0898CD44D8C8C08C; aws-session-id=146-2329803-0212767; aws-session-id-time=2145875692l; regStatus=registered; csrf=814714357; aws-business-metrics-last-visit=1516845127502; __utmv=194891197.%22YiWFB4zpVGcpJ0y18erh8qdqNdKFS1%3FW%22;' }
private getCookie2()		{ 'ubid-main=132-4757015-2246050; _mkto_trk=id:365-EFI-026&token:_mch-amazon.com-1527203055432-78078; skin=noskin; __utmc=194891197; AMCVS_4A8581745834114C0A495E2B%40AdobeOrg=1; s_cc=true; appstore-devportal-locale=en_US; aws-priv=eyJ2IjoxLCJldSI6MCwic3QiOjB9; aws_lang=en; x-wl-uid=1DWi+rNdXVs934+6s2RP2eZkHKHiB67VwNLMmvMwzbn9hk5tOf53pBAA0yapZTDeaDGQqtKU3CPZxk9FdFRHA3H/dNeIl19LlE5NYjhIutYNvBo7Qvesh7TioEikKh9o3iwcaoZHhWXc=; session-id=140-7292554-3767924; session-id-time=2082787201l; ' }
private getCookie3()		{ 'sid="VT2sqKz4J2Fkp+wtVCKsKA==|k1Va+I5/Gx12T4wYla2xr5APc2sADG6t3Op4BOlOxG0="; aws-mkto-trk=id%3A112-TZM-766%26token%3A_mch-amazon.com-1527203055432-78078; s_evar1=chat; s_ev22=%5B%5B%27chat%27%2C%271537064469196%27%5D%5D; lc-main=en_US; s_vnum=1958337005567%26vn%3D9; s_ppv=64; ' }
private getCookie4()		{ 'sst-main=Sst1|PQHB7Mvf7f72fU1mp0vk73mQC-HohapiyfFVrGDb6Z8MifgALMbG1JLU2nphDBJ8H1mJ1hJglPRh76_9FEUZnYoMRosJtiwCVNPQjnYlc_LKWyoo1lB7zrpJuQ2S0BDUuwjNL3Gj3yvX2PfOp5jhC_0nxcwVyxqDNG1eCplhFGw9TrXH_ApJzJ_yV1RxW9AGpAF8rn3XIBkOWUou9Hz2BQpLcA2pTkEmLQ6on3TyvClRhkIlEYoFGNPGGxvZtS4N6Tb6gSJ42vlZ2eOhqs8byuXORyqzIW6JzYLcYu26OkfwmrEdRdMVW3piDcrOYDLPGcecPLk-MYGqq6PDz0M_Nh7Vhg; aws-target-visitor-id=1515155664513-662159.28_32; ' }
private getCookie5()		{ 'AMCV_4A8581745834114C0A495E2B%40AdobeOrg=-330454231%7CMCIDTS%7C17817%7CMCMID%7C17922887831233164530867876419254160062%7CMCOPTOUT-1539313770s%7CNONE%7CMCAID%7CNONE%7CvVersion%7C3.1.2; s_vn=1546691665435%26vn%3D45; s_dslv=1539310084516; __utma=194891197.379500693.1515126610.1539196960.1539310087.81; __utmz=194891197.1539310087.81.53.utmccn=(referral)|utmcsr=console.aws.amazon.com|utmcct=/console/home|utmcmd=referral; ' }
private getCookie6()		{ 'aws-session-token="Qif/WTUCsPEhj8LmFoTra9NHztUqgsnrnS4KF3kZtf2yHTy/oHfUl7kS7yYpPqpbfkg/D+CXIgxmt8fU7j5/zX3/lWIcvu2iBn2OPYJLvxOkrUd4JgmzYXnM03t3D+1sSkpG2wKPVSd8Ei5T7AbJLkfTKITRbz79g4RTPRsqYMWXd8OzfJgh5dSTdmvDN+O72SCKirZnotssXRsNb2eqFwhLIQ6VpViEZvYs+Zcsvd0="; aws-x-main="ge?wSZGvjHxTLM9cr4lr5G1yfjtEyRPF"; ' }
private getCookie7()		{ 'aws-at-main=Atza|IwEBIJFwWL-1gXXTVU4cqAyQYj2L56Rn1R5TtDRsp-EbQ599WdprIax1AsJguelabRRhSS1SytqaE6kMPQZhbjpPVIaxgvaxIpgyWxTHEgpNthuEIHu0KDkQ8N87IIPiI6bxwMUOJM5U9XwF_z61Om_dLJGUT0RnDCPQ_XhoN7PTOdyFWQuANOCoKxDEsw39jFKk6Jm_SRoxViSM9vOSoxaQoQ9SAtIzfzZYnB_nXioZbjcd2c42QnSfBX- ' }
private getCookie8()		{ 'lR5_ZWjC3fgu3ktR6LHJpQpKWBciHX5RkFPXao8gzjny8z09ufeZML4VbHHbgJ3CwuKIqFgo2dqFpbmHIJHcvcEg7R5uOjKvHwLfy3MFXN4v4O7mdVYE_0nMrRlh1xNCWYnsm0Q9wcXaq8I0PEa5PBMBke0aBX7B3goQtyDXXe8v0d7Wwh7d_ww; sess-aws-at-main="7twIGTwXGmldITyDLIRa7aASKd3FP+P8Es9VdYMnmUw="; ' }
private getCookie9()		{ 'aws-userInfo=%7B%22arn%22%3A%22arn%3Aaws%3Aiam%3A%3A539060706355%3Aroot%22%2C%22alias%22%3A%22%22%2C%22username%22%3A%22Jason%2520%2526%2520Wendi%2520Headley%22%2C%22keybase%22%3A%22RDl9D6TsC6KdkZP7wkHuMwbvhSzOjsGt7vyqOm%2BusEY%5Cu003d%22%2C%22issuer%22%3A%22https%3A%2F%2Fwww.amazon.com%2Fap%2Fsignin%22%7D;  ' }
private getCookie10()		{ 'referrer_session={%22full_referrer%22:%22https://developer.amazon.com/alexa/console/ask/build/custom/amzn1.ask.skill.7330ab0e-bd9f-484f-a467-8f47a5c1df15/development/en_US/json-editor%22}; s_sq=amzna2z%3D%2526pid%253D%25252Falexa%25252Fconsole%25252Fask%2526pidt%253D1%2526oid%253Dfunction%252528%252529%25257BdismissNotification%252528toast%252529%25253B%25257D%2526oidt%253D2%2526ot%253DI; s_nr=1539310743578-Repeat; s_lv=1539310743580; x-main="ewiuc2K0tnTUENKZWaDE3v4Vrt9@@PLc"; at-' }
private getCookie11()		{ 'main=Atza|IwEBIGneWTg2NuDrzTCceZy0wtbzoqnhs7HX6fNZKwzcYAr85RO1ypr5f94au3-pPN-jerkgA4buCcbHOSOEcfAQiQ9n6_NujsBPq3T8ZQOE7JZ0Lyx8oj13Y2tO2Isg5FimTv23UR5lRTWzS8i7W9tSKUaz6W8MTG5YeZjyUUez0486hqBaIndrQ6kqQ3AX4dUtmYwGyq6uXzimiIAC6dv5UZMQwsW61Ge3kknZbTdZOruy5yhaIrygVaKbRcYRvPDf5bCH-OkbCeRJDUljN3AS6CJcrv9Y-EOXovGs8ZlaU_ARbZMMHLnbM6_jfP7F60sn_U1oZznBpHz189VFxhiLtA7V9p_dKXP5CEs5GYwe90OYqwf6HgLZ3F4FISo2J2Bgx0ixVQTgao0qcH1GZapGGtJS;  ' }
private getCookie12()		{ 'sess-at-main="c4ohCT+LQPwqCiwNB2XeBgSj7Xc3IJDYJc0RcYGtNo4="; session-token="V9Yht598R/zpqUh/wEvidvM6fUN054KgVTj6a6vPqYO82uicTkbsF6nBbhf5nIbDYSo78up+3V+wj69upeFwI3OGbDainO0hAi2YWGICnQ6UxZbbw5siWSuX8pEgxB1TTKHqgHkWUDIJsuNC+hCI5WtE0/pblEKWED9bipV3ZY31EBy0pcwStWxtR1rUU2HN3s8FV2TkAmUcy+yYh3GJEA== ' }

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
    page(name: "alexaPage")
}
page name: "main"
def main() {
    dynamicPage (name: "main", title: "", install: true, uninstall: uninstalled) {  
        section("Create and Manage Zones") {
            href "messages", title: "Configure Your Communications Zones", description: mRoomsD(), state: mRoomsS(), 
            image: "https://raw.githubusercontent.com/BamaRayne/SmartMessageControl/master/Icons/Zones.png"
            }
        section("Alexa Devices", uninstall: false) {
            href "alexaPage", title: "Manage Your Amazon Alexa Devices", description: mBlocksD(), state: mBlocksS(),
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
        
page name: "uninstallPage"
    def uninstallPage() {
    	dynamicPage (name: "uninstallPage", title: "Clicking on the BIG RED BUTTON below will completely remove $app.label and all Routines!", install: true, uninstall: true) {
    		section("Please ensure you are ready to take this step, there is no coming back from the brink!"){
            }
		}
    }    

page name: "alexaPage"
    def alexaPage() {
    	dynamicPage (name: "alexaPage", title: "Manage Amazon Alexa Devices for Announcements", install: false, uninstall: installed) {
        section("Please select your country") {
            input "alexaCountry", "enum", multiple: false, required: true, options: ["United States", "Canada", "United Kingdom"], default: "United States", submitOnChange: true
        	}
            if (alexaCountry) {
                section("Please select devices to create Alexa TTS child devices for") {
                href "pageTwo", title: "Select Devices"
                //	input "update", "bool", title: "Select to update device selection", defaultValue: "off", required: false, submitOnChange: true
                //    	if (update) {
                //        	getDevices() 
                //            def update = off
                //            }

            	//	input "alexaDevices", "enum", multiple: true, required: false //, options: getDevices()
        		}  
			}
        }
    }    

page name: "pageTwo"
	def pageTwo() {
	dynamicPage (name: "pageTwo", title: "Amazon Alexa Device Selection", install: false, uninstall: installed, nextPage: "pageThree") {  
        section("Please select devices to create Alexa TTS child devices for") {
            input "alexaDevices", "enum", multiple: true, required: false, options: getDevices()
        }  
    }
}    

page name: "pageThree"
	def pageThree() {
    dynamicPage (name: "pageThree", title: "Alexa child devices being created", install: false, uninstall: installed, nextPage: "main") {
    try {
        settings.alexaDevices.each {alexaName->
            def childDevice = null
            if(childDevices) {
                childDevices.each {child->
                    if (child.deviceNetworkId == "AlexaTTS${app.id}-${alexaName}") {
                        childDevice = child
                        log.debug "Child AlexaTTS-${alexaName} already exists"
                        section ("") {
                        	paragraph "Child AlexaTTS-${alexaName} already exists"
                    	}
                    }
                }
            }
            if (childDevice == null) {
                createChildDevice(alexaName)
                log.debug "Child AlexaTTS-${alexaName} has been created"
                section ("") {
                	paragraph "Child AlexaTTS-${alexaName} has been created"
                }    
            }
        }
    }
    catch (e) {
        log.error "Error in updated() routine, error = ${e}"
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

def uninstalled() {
	childDevices.each { deleteChildDevice(it.deviceNetworkId) }
}

def updated() { 
	if (debug) log.debug "Updated with settings: ${settings}"
//    log.debug "Parent App Version: ${textVersion()} | Release: ${release()}"
	unsubscribe()
    initialize()
}
def initialize() {
        //Other Apps Events
        subscribe(location, "EchoSistantMsg", zone)
        subscribe(location, "RemindRevent", zone)
        subscribe(location, "House Fan Controller", zone) 
        subscribe(location, "Logic Rulz", zone)
}

public getSMCZones(){
	return getChildApps()*.getLabel()
}

/************************************************************************************************************
	PAGE CONFIGURATIONS
************************************************************************************************************/
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
    if (childDevices?.size()) {
    	result = "complete"	
    }
    result
}
def mBlocksD() {
    def text = "No Zones have been configured. Tap here to begin"
    def ch = childDevices?.size()     
    if (ch == 1) {
        text = "One Alexa Device has been created. Tap here to view and change"
    }
    else {
    	if (ch > 1) {
        text = "${ch} Alexa Devices have been created. Tap here to view and change"
     	}
    }
    text
}                     

/************************************************************************************************************
	ZONE DISCOVERY
************************************************************************************************************/
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

/************************************************************************************************************
	DISCOVER ALEXA CHILD DEVICES
************************************************************************************************************/
def getDevices() {
	log.info "getDevices method called"
    if ("${alexaCookie}" == null) {
        log.debug "No cookie yet"
        return}
    try{
        def alexaCookie = 'x-amzn-dat-gui-client-v=1.24.204206.0; aws-ubid-main=477-6886115-7675244; aws-target-static-id=1515155664508-989184; aws-target-data=%7B%22support%22%3A%221%22%7D; s_fid=1D31599F9475125F-0898CD44D8C8C08C; aws-session-id=146-2329803-0212767; aws-session-id-time=2145875692l; regStatus=registered; csrf=814714357; aws-business-metrics-last-visit=1516845127502; __utmv=194891197.%22YiWFB4zpVGcpJ0y18erh8qdqNdKFS1%3FW%22; ubid-main=132-4757015-2246050; _mkto_trk=id:365-EFI-026&token:_mch-amazon.com-1527203055432-78078; skin=noskin; __utmc=194891197; AMCVS_4A8581745834114C0A495E2B%40AdobeOrg=1; s_cc=true; appstore-devportal-locale=en_US; aws-priv=eyJ2IjoxLCJldSI6MCwic3QiOjB9; aws_lang=en; x-wl-uid=1DWi+rNdXVs934+6s2RP2eZkHKHiB67VwNLMmvMwzbn9hk5tOf53pBAA0yapZTDeaDGQqtKU3CPZxk9FdFRHA3H/dNeIl19LlE5NYjhIutYNvBo7Qvesh7TioEikKh9o3iwcaoZHhWXc=; sid="VT2sqKz4J2Fkp+wtVCKsKA==|k1Va+I5/Gx12T4wYla2xr5APc2sADG6t3Op4BOlOxG0="; aws-mkto-trk=id%3A112-TZM-766%26token%3A_mch-amazon.com-1527203055432-78078; s_evar1=chat; s_ev22=%5B%5B%27chat%27%2C%271537064469196%27%5D%5D; s_vnum=1958337005567%26vn%3D9; s_ppv=64; s_campaign=ps%7Cacquisition_US%7Cgoogle%7CACQ-P%7CPS-GO%7CBrand%7CDesktop%7CSU%7CCompute%7CLightsail%7CUS%7CEN%7CText%7CGeneral%7Clightsail%7Cacquisition%7CUS%7CNAMER%7Cps_a131L000005Of2gQAC; s_eVar60=ps_a131L000005Of2gQAC; c_m=undefinedwww.google.comSearch%20Engine; lc-main=en_US; __utma=194891197.379500693.1515126610.1540532724.1540580890.84; __utmz=194891197.1540580890.84.56.utmccn=(referral)|utmcsr=console.aws.amazon.com|utmcct=/console/home|utmcmd=referral; aws-session-token="QD7Bqblv7vqVRHy+g3Aq/8KCLbk1v2PxiSE4fhQJK+zEkwR3CTmXnuvbAcCZVY2wjwGggbs9Jw9ehUNDGt2x9aFjTn69ZlqiWoRUk0a+2HOkZAQRQRs9E1ZiEQSB709x1zBgaH5j3ql6SdK8rL1o2OXxT/WgNaETK5+PzWoZgZcu31ijaeD6bLdXteCXRAUshqMImlOgfIaaQfzW2Iv/3woohY/54wwwAdI+PyQhEY4="; aws-x-main="8?CR0MBTV3gY5Dz5?b@Pn?He2YiIEwZ9"; aws-at-main=Atza|IwEBIHLTJ1iLhpUYxzel0YwQgLOIqn_8WHA43jQVNlq3prmur1gWg67mDNBA3x3eXm1BeA8TWGvpJge8C6Z3GcEmCuW8-Jjw4WyKLkfpz7kK_2fw-JTCS6BxmIM9jbeXNiUMs1XqdF5xPt0ptmnAOGRWteI9xK1ZOiXFHYgrvpdNfzvxolsN2xZ5C13jACYbv7S1nf3PqERomuXw2MhlDch_bVmrWOL6yuVDaLu-wGD9kFfEHLnDSoFR3o4zYoJBW2q9pkl4QoRVEtMwZ0Ny1nVQRTZJHEnl8nQzmlPBGJC8Yk9Yanh7YH9GJ3mgSs5faMLv4lBkM17BncaqZkr3usM1Mc0VrQMz6T7h26Jpj6885YnofN7hJYWpjI8mX0_oWP1mGxd_BCqwP16rFlPqfthVKYZi88dAzLUbxkZn5UndCM-avg; sess-aws-at-main="g9QQMtw/3v5G63b+z9gA9iQH+cDI8IMPqbKJl4P0Rrg="; aws-userInfo=%7B%22arn%22%3A%22arn%3Aaws%3Aiam%3A%3A539060706355%3Aroot%22%2C%22alias%22%3A%22%22%2C%22username%22%3A%22Jason%2520%2526%2520Wendi%2520Headley%22%2C%22keybase%22%3A%22N5iInERsF0XcxHjQxfEPvM4kCn9i6P9FSwDI1W6NZ80%5Cu003d%22%2C%22issuer%22%3A%22https%3A%2F%2Fwww.amazon.com%2Fap%2Fsignin%22%7D; s_vn=1546691665435%26vn%3D50; aws-target-visitor-id=1515155664513-662159.28_32; s_dslv=1540597687561; s_sq=%5B%5BB%5D%5D; sst-main=Sst1|PQE2xnpZ1SOOClUN9c9k4GidC_JfOoQUdYGGVoLvqo9BsOjuBb3s0Y64idzYE0IhYpEcy02F1ztfSpINIWcaRd4-ExXOYu0U0nTp9btKrfNlOwn_T5aI59R0tiHa5qqMEG0r8LmsTiilhoO9EhXoa8LSUUeDj0slXubRaAkYrVUIMYwtn4NBwAW4qqoGLUhSdQxvwyMg7iQrwJv21f5Q9V1Qsd0bY-rULV6R75tXoDFHmXU_nEMOIFuzSTp6tOa3tOLnI_hTtW0rK6TiHhYsvfSPp6iNVL0ruI6pUjMlXi2eF56vDeGYQrT2f52CxUnZ0DR9Mn-zBs9plCAYOOAdT5FMMQ; session-id=137-1293851-7556358; x-main="rStpD1RzTpBwGJBbL60DFwzmnsodw@s9"; at-main=Atza|IwEBILjhjQ60vf8Dx6wvcItFhKonLUexwZwQocLTvCZ5Q2GxhayTZmjUR04tgC6M4NXNhWHVfj7wL67u5ctN0nOwy9meB5ZUhYSYtm8SGpL6NxBRat876kAbWF6djlGym1d2UJSKZMjI_eqTNrh4McLaJVnR_LbLrxkPqn-v8QrWTOubh0MR6ppLTCDtTxCW5uCYXCaQD2WCtqdvH_qZjUyc-hG3mRfpuobefwXUqbz6Zk7wYAfEbv25HC1YAn-ttq4UzDHxygKMu7prbMaKxQbRBkq6pVDZ50q8GSTV_3Tup--QfvatMyPodkAnlSY9h28Eg8ygDAAf8yqaePl5hvs4GYIK-sGmywcQ2Ut-H-R2XwwNcQh45lAMZP2n50expjs5ABD_RppZ_ucdumjZqFai1TxI; sess-at-main="q2UfANN4rt80If2YlquX1esNJHXR0F4TOCfApKbQPDI="; devportal-session="OX+uX8P2AOIY3SHQ7Mc6fSp7vxmFZDhpuSkg9Bscg8Yw9wYPrTkgnHmXMcRKVb++qMGV18W3h9CrdwILGYbY0uFAov1ZKXKHHIpUEKEwVPNqzQY1dGMLnboiDPPvVQQMoMUAUp8wCa5rM5OL9wqFQn6RPB88PSdZpSSQ7OcMTMluN3PaQ2WbtDZW5j1N5uWDG9hgjty4k+h0D87zHFhdMfZeou8MNBRDVLzsdwm+alXY69pvehhXsOF7i+A42RUwuLxO4C/17apaH1/j/nosy0g4USXIUEgH5NfNlcdoKhjKO6sPiW2H7g=="; session-id-time=2082787201l; AMCV_4A8581745834114C0A495E2B%40AdobeOrg=-330454231%7CMCIDTS%7C17832%7CMCMID%7C06208290246401928255521902319102653492%7CMCOPTOUT-1540629361s%7CNONE%7CMCAID%7CNONE%7CvVersion%7C3.1.2; referrer_session={%22full_referrer%22:%22https://developer.amazon.com/alexa/console/ask/build/custom/amzn1.ask.skill.03fbb672-e056-4255-9b62-c57627f6399e/development/en_US/dashboard%22}; s_nr=1540626523098-Repeat; s_lv=1540626523099; session-token="x5nNDPO3/Y8i/oTcRWpHalLGg0aMGyhXcAIfE+r231aHvsGUyeeIvNx07LzlVSgzJPc6fCTWpG9LI0eIX0iy7tDFjQ6IuduV0rQ4JiQPZW9iHrOb2qfmT8W4dDTi2j4YOdRbEXQ4Rh9mxgjuGIG7JOLOczsbc/JjOecLIhL9A27ZvZREpziJbgtRVJpGDrAWhZB0VdtDpbOOSbFF2ybaLt3vRZt9UYO5f2z3mLCbjS+1GLiNp3MZQG8fJ2cuFrS+0RkL1EAC9zqcTrksv5CfDw=='

        //def alexaCookie = getCookie1()+getCookie2()+getCookie3()+getCookie4()+getCookie5()+getCookie6()+getCookie7()+getCookie8()+getCookie9()+getCookie10()+getCookie11()+getCookie12()
        def csrf = (alexaCookie =~ "csrf=(.*?);")[0][1]
        def params = [uri: "https://alexa.amazon.com/api/devices-v2/device?cached=false",
                      headers: ["Cookie":"""${alexaCookie}""",
                                "Referer": "https://getAmazon()/spa/index.html",
                                "Origin": "https://getAmazon()",
                                "csrf": "${csrf}",
                                "Connection": "keep-alive",
                                "DNT":"1"],
                      requestContentType: "application/json; charset=UTF-8"
                     ]
        httpGet(params) { resp ->
            if ((resp.status == 200) && (resp.contentType == "application/json")) {
                def validDevices = []
                atomicState.alexaJSON = resp.data
                //log.debug state.alexaJSON.devices.accountName
                atomicState.alexaJSON.devices.each {it->
                    if (it.deviceFamily in ["ECHO", "ROOK", "KNIGHT", "THIRD_PARTY_AVS_SONOS_BOOTLEG", "TABLET"]) {
                        //log.debug "${it.accountName} is valid"
                        validDevices << it.accountName
                    }
                    if (it.deviceFamily == "THIRD_PARTY_AVS_MEDIA_DISPLAY" && it.capabilities.contains("AUDIBLE")) {
                        validDevices << it.accountName
                    }
                }
                return validDevices
            }
            else {
                log.error "Encountered an error. http resp.status = '${resp.status}'. http resp.contentType = '${resp.contentType}'. Should be '200' and 'application/json'. Check your cookie string!"
                return "error"
            }
        }
    }
    catch (e) {
        //    log.error "httpGet() error = ${e}"
    }
}

/************************************************************************************************************
	UPDATE ALEXA CHILD DEVICES
************************************************************************************************************/
def updateDevices() {
    try {
        settings.alexaDevices.each {alexaName->
            def childDevice = null
            if(childDevices) {
                childDevices.each {child->
                    if (child.deviceNetworkId == "AlexaTTS${app.id}-${alexaName}") {
                        childDevice = child
                        log.debug "Child ${app.label}-${alexaName} already exists"
                    }
                }
            }
            if (childDevice == null) {
                createChildDevice(alexaName)
                log.debug "Child ${app.label}-${alexaName} has been created"
            }
        }
    }
    catch (e) {
        log.error "Error in updated() routine, error = ${e}"
		}
	}   

/************************************************************************************************************
	CREATE ALEXA CHILD DEVICES
************************************************************************************************************/
private void createChildDevice(String deviceName) {
    
    log.debug "'createChildDevice()': Creating Child Device '${deviceName}'"
        
    try {
        def child = addChildDevice("Echo", "Child Alexa TTS", "AlexaTTS${app.id}-${deviceName}", null, [name: "AlexaTTS-${deviceName}", label: "AlexaTTS ${deviceName}", completedSetup: true]) 
    } catch (e) {
       	log.error "Child device creation failed with error = ${e}"
    }
}

/************************************************************************************************************
	AMAZON COUNTRY SELECTION
************************************************************************************************************/
def getAlexa() {
    switch ("${alexaCountry}") {
        case "United States": 
                return "pitangui.amazon.com"
            break
        case "Canada": 
                return "alexa.amazon.ca"
            break
        case "United Kingdom": 
                return "layla.amazon.co.uk"
            break
        default: 
            log.error "getAlexa Unknown country = ${alexaCountry}"
    }
    return "error: Unknown country"
}

def getAmazon() {
    switch ("${alexaCountry}") {
        case "United States":
                return "alexa.amazon.com" 
            break
        case "Canada": 
                return "alexa.amazon.ca"
             break
        case "United Kingdom": 
                return "amazon.co.uk" 
           break
//        default: 
//            log.error "getAmazon Unknown country = ${alexaCountry}"
    }
    return //"error: Unknown country"
}

def getLanguage() {
    switch ("${alexaCountry}") {
        case "United States":
                return "en-US"
            break
        case "Canada": 
                return "en-US"
            break
        case "United Kingdom": 
                return "en-GB"
            break
        default: 
            log.error "getLanguage Unknown country = ${alexaCountry}"
    }
    return "error: Unknown country"
}

/************************************************************************************************************
	ALEXA DEVICE SPEAK COMMAND STRUCTURE
************************************************************************************************************/
def speakMessage(String message, String device) {
    log.debug "Sending '${message}' to '${device}"
    try{    
        atomicState.alexaJSON.devices.each {it->
            if (it.accountName == device) {
                //      log.debug "account name : ${it.accountName}, device type : ${it.deviceType}, serial number : ${it.serialNumber}, device owner : ${it.deviceOwnerCustomerId}"
                //def alexaCookie = getCookie1()+getCookie2()+getCookie3()+getCookie4()+getCookie5()+getCookie6()+getCookie7()+getCookie8()+getCookie9()+getCookie10()+getCookie11()+getCookie12()
				def alexaCookie = 'x-amzn-dat-gui-client-v=1.24.204206.0; aws-ubid-main=477-6886115-7675244; aws-target-static-id=1515155664508-989184; aws-target-data=%7B%22support%22%3A%221%22%7D; s_fid=1D31599F9475125F-0898CD44D8C8C08C; aws-session-id=146-2329803-0212767; aws-session-id-time=2145875692l; regStatus=registered; csrf=814714357; aws-business-metrics-last-visit=1516845127502; __utmv=194891197.%22YiWFB4zpVGcpJ0y18erh8qdqNdKFS1%3FW%22; ubid-main=132-4757015-2246050; _mkto_trk=id:365-EFI-026&token:_mch-amazon.com-1527203055432-78078; skin=noskin; __utmc=194891197; AMCVS_4A8581745834114C0A495E2B%40AdobeOrg=1; s_cc=true; appstore-devportal-locale=en_US; aws-priv=eyJ2IjoxLCJldSI6MCwic3QiOjB9; aws_lang=en; x-wl-uid=1DWi+rNdXVs934+6s2RP2eZkHKHiB67VwNLMmvMwzbn9hk5tOf53pBAA0yapZTDeaDGQqtKU3CPZxk9FdFRHA3H/dNeIl19LlE5NYjhIutYNvBo7Qvesh7TioEikKh9o3iwcaoZHhWXc=; sid="VT2sqKz4J2Fkp+wtVCKsKA==|k1Va+I5/Gx12T4wYla2xr5APc2sADG6t3Op4BOlOxG0="; aws-mkto-trk=id%3A112-TZM-766%26token%3A_mch-amazon.com-1527203055432-78078; s_evar1=chat; s_ev22=%5B%5B%27chat%27%2C%271537064469196%27%5D%5D; s_vnum=1958337005567%26vn%3D9; s_ppv=64; s_campaign=ps%7Cacquisition_US%7Cgoogle%7CACQ-P%7CPS-GO%7CBrand%7CDesktop%7CSU%7CCompute%7CLightsail%7CUS%7CEN%7CText%7CGeneral%7Clightsail%7Cacquisition%7CUS%7CNAMER%7Cps_a131L000005Of2gQAC; s_eVar60=ps_a131L000005Of2gQAC; c_m=undefinedwww.google.comSearch%20Engine; lc-main=en_US; __utma=194891197.379500693.1515126610.1540532724.1540580890.84; __utmz=194891197.1540580890.84.56.utmccn=(referral)|utmcsr=console.aws.amazon.com|utmcct=/console/home|utmcmd=referral; aws-session-token="QD7Bqblv7vqVRHy+g3Aq/8KCLbk1v2PxiSE4fhQJK+zEkwR3CTmXnuvbAcCZVY2wjwGggbs9Jw9ehUNDGt2x9aFjTn69ZlqiWoRUk0a+2HOkZAQRQRs9E1ZiEQSB709x1zBgaH5j3ql6SdK8rL1o2OXxT/WgNaETK5+PzWoZgZcu31ijaeD6bLdXteCXRAUshqMImlOgfIaaQfzW2Iv/3woohY/54wwwAdI+PyQhEY4="; aws-x-main="8?CR0MBTV3gY5Dz5?b@Pn?He2YiIEwZ9"; aws-at-main=Atza|IwEBIHLTJ1iLhpUYxzel0YwQgLOIqn_8WHA43jQVNlq3prmur1gWg67mDNBA3x3eXm1BeA8TWGvpJge8C6Z3GcEmCuW8-Jjw4WyKLkfpz7kK_2fw-JTCS6BxmIM9jbeXNiUMs1XqdF5xPt0ptmnAOGRWteI9xK1ZOiXFHYgrvpdNfzvxolsN2xZ5C13jACYbv7S1nf3PqERomuXw2MhlDch_bVmrWOL6yuVDaLu-wGD9kFfEHLnDSoFR3o4zYoJBW2q9pkl4QoRVEtMwZ0Ny1nVQRTZJHEnl8nQzmlPBGJC8Yk9Yanh7YH9GJ3mgSs5faMLv4lBkM17BncaqZkr3usM1Mc0VrQMz6T7h26Jpj6885YnofN7hJYWpjI8mX0_oWP1mGxd_BCqwP16rFlPqfthVKYZi88dAzLUbxkZn5UndCM-avg; sess-aws-at-main="g9QQMtw/3v5G63b+z9gA9iQH+cDI8IMPqbKJl4P0Rrg="; aws-userInfo=%7B%22arn%22%3A%22arn%3Aaws%3Aiam%3A%3A539060706355%3Aroot%22%2C%22alias%22%3A%22%22%2C%22username%22%3A%22Jason%2520%2526%2520Wendi%2520Headley%22%2C%22keybase%22%3A%22N5iInERsF0XcxHjQxfEPvM4kCn9i6P9FSwDI1W6NZ80%5Cu003d%22%2C%22issuer%22%3A%22https%3A%2F%2Fwww.amazon.com%2Fap%2Fsignin%22%7D; s_vn=1546691665435%26vn%3D50; aws-target-visitor-id=1515155664513-662159.28_32; s_dslv=1540597687561; s_sq=%5B%5BB%5D%5D; sst-main=Sst1|PQE2xnpZ1SOOClUN9c9k4GidC_JfOoQUdYGGVoLvqo9BsOjuBb3s0Y64idzYE0IhYpEcy02F1ztfSpINIWcaRd4-ExXOYu0U0nTp9btKrfNlOwn_T5aI59R0tiHa5qqMEG0r8LmsTiilhoO9EhXoa8LSUUeDj0slXubRaAkYrVUIMYwtn4NBwAW4qqoGLUhSdQxvwyMg7iQrwJv21f5Q9V1Qsd0bY-rULV6R75tXoDFHmXU_nEMOIFuzSTp6tOa3tOLnI_hTtW0rK6TiHhYsvfSPp6iNVL0ruI6pUjMlXi2eF56vDeGYQrT2f52CxUnZ0DR9Mn-zBs9plCAYOOAdT5FMMQ; session-id=137-1293851-7556358; x-main="rStpD1RzTpBwGJBbL60DFwzmnsodw@s9"; at-main=Atza|IwEBILjhjQ60vf8Dx6wvcItFhKonLUexwZwQocLTvCZ5Q2GxhayTZmjUR04tgC6M4NXNhWHVfj7wL67u5ctN0nOwy9meB5ZUhYSYtm8SGpL6NxBRat876kAbWF6djlGym1d2UJSKZMjI_eqTNrh4McLaJVnR_LbLrxkPqn-v8QrWTOubh0MR6ppLTCDtTxCW5uCYXCaQD2WCtqdvH_qZjUyc-hG3mRfpuobefwXUqbz6Zk7wYAfEbv25HC1YAn-ttq4UzDHxygKMu7prbMaKxQbRBkq6pVDZ50q8GSTV_3Tup--QfvatMyPodkAnlSY9h28Eg8ygDAAf8yqaePl5hvs4GYIK-sGmywcQ2Ut-H-R2XwwNcQh45lAMZP2n50expjs5ABD_RppZ_ucdumjZqFai1TxI; sess-at-main="q2UfANN4rt80If2YlquX1esNJHXR0F4TOCfApKbQPDI="; devportal-session="OX+uX8P2AOIY3SHQ7Mc6fSp7vxmFZDhpuSkg9Bscg8Yw9wYPrTkgnHmXMcRKVb++qMGV18W3h9CrdwILGYbY0uFAov1ZKXKHHIpUEKEwVPNqzQY1dGMLnboiDPPvVQQMoMUAUp8wCa5rM5OL9wqFQn6RPB88PSdZpSSQ7OcMTMluN3PaQ2WbtDZW5j1N5uWDG9hgjty4k+h0D87zHFhdMfZeou8MNBRDVLzsdwm+alXY69pvehhXsOF7i+A42RUwuLxO4C/17apaH1/j/nosy0g4USXIUEgH5NfNlcdoKhjKO6sPiW2H7g=="; session-id-time=2082787201l; AMCV_4A8581745834114C0A495E2B%40AdobeOrg=-330454231%7CMCIDTS%7C17832%7CMCMID%7C06208290246401928255521902319102653492%7CMCOPTOUT-1540629361s%7CNONE%7CMCAID%7CNONE%7CvVersion%7C3.1.2; referrer_session={%22full_referrer%22:%22https://developer.amazon.com/alexa/console/ask/build/custom/amzn1.ask.skill.03fbb672-e056-4255-9b62-c57627f6399e/development/en_US/dashboard%22}; s_nr=1540626523098-Repeat; s_lv=1540626523099; session-token="x5nNDPO3/Y8i/oTcRWpHalLGg0aMGyhXcAIfE+r231aHvsGUyeeIvNx07LzlVSgzJPc6fCTWpG9LI0eIX0iy7tDFjQ6IuduV0rQ4JiQPZW9iHrOb2qfmT8W4dDTi2j4YOdRbEXQ4Rh9mxgjuGIG7JOLOczsbc/JjOecLIhL9A27ZvZREpziJbgtRVJpGDrAWhZB0VdtDpbOOSbFF2ybaLt3vRZt9UYO5f2z3mLCbjS+1GLiNp3MZQG8fJ2cuFrS+0RkL1EAC9zqcTrksv5CfDw=='
				def SEQUENCECMD = "Alexa.Speak"
                def DEVICETYPE = "${it.deviceType}"
                def DEVICESERIALNUMBER = "${it.serialNumber}"
                def MEDIAOWNERCUSTOMERID = "${it.deviceOwnerCustomerId}"
                def TTS= ",\\\"textToSpeak\\\":\\\"${message}\\\""
                //            log.debug "tts : $TTS"
                def command = "{\"behaviorId\":\"PREVIEW\",\"sequenceJson\":\"{\\\"@type\\\":\\\"com.amazon.alexa.behaviors.model.Sequence\\\",\\\"startNode\\\":{\\\"@type\\\":\\\"com.amazon.alexa.behaviors.model.OpaquePayloadOperationNode\\\",\\\"type\\\":\\\"${SEQUENCECMD}\\\",\\\"operationPayload\\\":{\\\"deviceType\\\":\\\"${DEVICETYPE}\\\",\\\"deviceSerialNumber\\\":\\\"${DEVICESERIALNUMBER}\\\",\\\"locale\\\":\\\"${getLanguage()}\\\",\\\"customerId\\\":\\\"${MEDIAOWNERCUSTOMERID}\\\"${TTS}}}}\",\"status\":\"ENABLED\"}"
                def csrf = (alexaCookie =~ "csrf=(.*?);")[0][1]

                def params = [uri: "https://alexa.amazon.com/api/behaviors/preview",
                              headers: ["Cookie":"""${alexaCookie}""",
                                        "Referer": "https://" + getAmazon() + "/spa/index.html",
                                        "Origin": "https://" + getAmazon(),
                                        "csrf": "${csrf}",
                                        "Connection": "keep-alive",
                                        "DNT":"1"],
                              body: command
                             ]
                httpPost(params) { resp ->
                }

            }
        } 
    }
    catch (e) {
        //    log.error "httpGet() error = ${e}"
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