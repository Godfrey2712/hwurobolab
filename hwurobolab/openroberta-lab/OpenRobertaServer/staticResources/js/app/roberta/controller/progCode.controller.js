define(["require", "exports", "message", "util", "guiState.controller", "program.controller", "program.model", "blockly", "codeflask", "jquery"], function (require, exports, MSG, UTIL, GUISTATE_C, PROG_C, PROGRAM, Blockly, CodeFlask, $) {
    Object.defineProperty(exports, "__esModule", { value: true });
    exports.setCodeLanguage = exports.setCode = exports.init = void 0;
    var INITIAL_WIDTH = 0.5;
    var blocklyWorkspace;
    var flask;
    /**
     *
     */
    function init() {
        blocklyWorkspace = GUISTATE_C.getBlocklyWorkspace();
        flask = new CodeFlask('#codeContent', {
            language: 'java',
            lineNumbers: true,
            readonly: true,
        });
        initEvents();
    }
    exports.init = init;
    function setCode(sourceCode) {
        flask.updateCode(sourceCode);
    }
    exports.setCode = setCode;
    function setCodeLanguage(language) {
        var langToSet;
        switch (language) {
            case 'py':
                langToSet = 'python';
                break;
            case 'java':
                langToSet = 'java';
                break;
            case 'ino':
            case 'nxc':
            case 'cpp':
                langToSet = 'clike';
                break;
            case 'json':
                langToSet = 'js';
                break;
            default:
                langToSet = 'js';
        }
        flask.updateLanguage(langToSet);
    }
    exports.setCodeLanguage = setCodeLanguage;
    function initEvents() {
        $('#codeButton').off('click touchend');
        $('#codeButton').onWrap('click touchend', function (event) {
            toggleCode();
            return false;
        });

        $('#runCode').onWrap('click', function (event) {

 
        var filename = GUISTATE_C.getProgramName();
            
            const robotID = $("#robotID").val();


            if(!navigator.onLine){
	            alert("You can run this this program while you're offline.");
                return;
            }

            if(!robotID){
                alert("Provide Robot ID  to run this program.");
                return;
            }



            const fileName = `${filename}_${robotID}.${GUISTATE_C.getSourceCodeFileExtension()}`;


            const postData = async ({ file, fileName }) => {
                //node js server configuration
                fetch("http://164.92.217.119:5001/file-saver", {
                  method: "POST",
                  headers: {
                    "Content-Type": "application/json",
                  },
                  body: JSON.stringify({
                    file,
                    fileName,
                  }),
                })
                  .then((res) => console.log(res, "response"))
                  .catch((err) => console.log(err, "error"));
              };
              
              postData({fileName, file:`${GUISTATE_C.getProgramSource()}`})

            //UTIL.download(filename, GUISTATE_C.getProgramSource());
            console.log(GUISTATE_C.getProgramSource());
            
            
            MSG.displayMessage('MENU_MESSAGE_DOWNLOAD', 'TOAST', filename);
        }, 'codeDownload clicked');

        // $('#codeDownload').onWrap('click', function (event) {

        //     //const test = require("fs");
        //     //test.readFile("proCode.controller.js", function(error, data){console.log(data)});

        //     const currentDate = new Date();
        //     const hours = currentDate.getHours();
        //     const minutes = currentDate.getMinutes();
        //     const seconds = currentDate.getSeconds();
        //     const timestamp = currentDate.getTime();
        //     const datestamp = currentDate.getDate();

        //     //var filename = GUISTATE_C.getProgramName() + hours + ':' + '0' + minutes + ':' + seconds + '.' + GUISTATE_C.getSourceCodeFileExtension();

        //     var filename = GUISTATE_C.getProgramName() + '.' + GUISTATE_C.getSourceCodeFileExtension();
            
        //     const postData = async ({ file, fileName }) => {
        //         //server configuration
        //         fetch("http://localhost:5001/file-saver", {
        //           method: "POST",
        //           headers: {
        //             "Content-Type": "application/json",
        //           },
        //           body: JSON.stringify({
        //             file,
        //             fileName,
        //           }),
        //         })
        //           .then((res) => console.log(res, "response"))
        //           .catch((err) => console.log(err, "error"));
        //       };
              
        //       postData({fileName: filename, file:`${GUISTATE_C.getProgramSource()}`})

        //     //UTIL.download(filename, GUISTATE_C.getProgramSource());
        //     console.log(GUISTATE_C.getProgramSource());
            
            
        //     MSG.displayMessage('MENU_MESSAGE_DOWNLOAD', 'TOAST', filename);
        // }, 'codeDownload clicked');

        $('#codeRefresh').onWrap('click', function (event) {
            event.stopPropagation();
            var dom = Blockly.Xml.workspaceToDom(blocklyWorkspace);
            var xmlProgram = Blockly.Xml.domToText(dom);
            var xmlConfiguration = GUISTATE_C.getConfigurationXML();
            var isNamedConfig = !GUISTATE_C.isConfigurationStandard() && !GUISTATE_C.isConfigurationAnonymous();
            var configName = isNamedConfig ? GUISTATE_C.getConfigurationName() : undefined;
            var xmlConfigText = GUISTATE_C.isConfigurationAnonymous() ? GUISTATE_C.getConfigurationXML() : undefined;
            var language = GUISTATE_C.getLanguage();
            PROGRAM.showSourceProgram(GUISTATE_C.getProgramName(), configName, xmlProgram, xmlConfigText, PROG_C.SSID, PROG_C.password, language, function (result) {
                PROG_C.reloadProgram(result, true);
                if (result.rc == 'ok') {
                    GUISTATE_C.setState(result);
                    flask.updateCode(result.sourceCode);
                    GUISTATE_C.setProgramSource(result.sourceCode);
                }
                else {
                    MSG.displayInformation(result, result.message, result.message, result.parameters);
                }
            });
        }, 'code refresh clicked');
    }
    function toggleCode() {
        Blockly.hideChaff();
        if ($('#codeButton').hasClass('rightActive')) {
            $('#blockly').closeRightView();
        }
        else {
            var dom = Blockly.Xml.workspaceToDom(blocklyWorkspace);
            var xmlProgram = Blockly.Xml.domToText(dom);
            var isNamedConfig = !GUISTATE_C.isConfigurationStandard() && !GUISTATE_C.isConfigurationAnonymous();
            var configName = isNamedConfig ? GUISTATE_C.getConfigurationName() : undefined;
            var xmlConfigText = GUISTATE_C.isConfigurationAnonymous() ? GUISTATE_C.getConfigurationXML() : undefined;
            var language = GUISTATE_C.getLanguage();
            PROGRAM.showSourceProgram(GUISTATE_C.getProgramName(), configName, xmlProgram, xmlConfigText, PROG_C.SSID, PROG_C.password, language, function (result) {
                PROG_C.reloadProgram(result);
                if (result.rc == 'ok') {
                    GUISTATE_C.setState(result);
                    flask.updateCode(result.sourceCode);
                    // TODO change javaSource to source on server
                    GUISTATE_C.setProgramSource(result.sourceCode);
                    $('#blockly').openRightView('code', INITIAL_WIDTH);
                }
                else {
                    MSG.displayInformation(result, result.message, result.message, result.parameters);
                }
            });
        }
    }
});
