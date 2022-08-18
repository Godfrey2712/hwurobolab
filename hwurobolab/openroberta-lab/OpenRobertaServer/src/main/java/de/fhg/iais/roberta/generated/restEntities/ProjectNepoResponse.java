/*
 * This is a class GENERATED by the TransportGenerator maven plugin. DON'T MODIFY IT.
 * IF you modify it, your work may be lost: the class will be overwritten automatically
 * when the maven plugin is re-executed for any reasons.
 */
package de.fhg.iais.roberta.generated.restEntities;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * the response for the /projectWorkflow/run and ../compileProgram REST request<br><br>
 * Version: 1<br>
 * Datum: 2020-06-15
 */
public class ProjectNepoResponse extends BaseResponse {
    protected String programName;
    protected String progXML;
    protected Map<String, JSONObject> confAnnos;
    protected String compiledCode;
    protected JSONObject configuration;

    /**
     * the response for the /projectWorkflow/run and ../compileProgram REST request
     */
    public static ProjectNepoResponse make() {
        return new ProjectNepoResponse();
    }

    /**
     * the response for the /projectWorkflow/run and ../compileProgram REST request
     */
    public static ProjectNepoResponse makeFromString(String jsonS) {
        try {
            JSONObject jsonO = new JSONObject(jsonS);
            return make(jsonO);
        } catch ( JSONException e ) {
            throw new RuntimeException("JSON parse error when parsing: " + jsonS, e);
        }
    }

    /**
     * the response for the /projectWorkflow/run and ../compileProgram REST request
     */
    public static ProjectNepoResponse makeFromProperties(
        String cmd,
        String rc,
        String message,
        String cause,
        JSONObject parameters,
        String initToken,
        long serverTime,
        String serverVersion,
        long robotWait,
        String robotBattery,
        String robotName,
        String robotVersion,
        String robotFirmwareName,
        JSONObject robotSensorvalues,
        int robotNepoexitvalue,
        String robotState,
        boolean notificationsAvailable,
        String programName,
        String progXML,
        Map<String, JSONObject> confAnnos,
        String compiledCode,
        JSONObject configuration) {
        ProjectNepoResponse entity = new ProjectNepoResponse();
        entity.setCmd(cmd);
        entity.setRc(rc);
        entity.setMessage(message);
        entity.setCause(cause);
        entity.setParameters(parameters);
        entity.setInitToken(initToken);
        entity.setServerTime(serverTime);
        entity.setServerVersion(serverVersion);
        entity.setRobotWait(robotWait);
        entity.setRobotBattery(robotBattery);
        entity.setRobotName(robotName);
        entity.setRobotVersion(robotVersion);
        entity.setRobotFirmwareName(robotFirmwareName);
        entity.setRobotSensorvalues(robotSensorvalues);
        entity.setRobotNepoexitvalue(robotNepoexitvalue);
        entity.setRobotState(robotState);
        entity.setNotificationsAvailable(notificationsAvailable);
        entity.setProgramName(programName);
        entity.setProgXML(progXML);
        entity.setConfAnnos(confAnnos);
        entity.setCompiledCode(compiledCode);
        entity.setConfiguration(configuration);
        entity.immutable();
        return entity;
    }

    /**
     * the response for the /projectWorkflow/run and ../compileProgram REST request
     */
    public static ProjectNepoResponse make(JSONObject jsonO) {
        return make().merge(jsonO).immutable();
    }

    /**
     * merge the properties of a JSON-object into this bean. The bean must be "under construction".
     * The keys of the JSON-Object must be valid. The bean remains "under construction".<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public ProjectNepoResponse merge(JSONObject jsonO) {
        try {
            for ( String key : JSONObject.getNames(jsonO) ) {
                if ( "_version".equals(key) ) {
                } else if ( "cmd".equals(key) ) {
                    setCmd(jsonO.optString(key));
                } else if ( "rc".equals(key) ) {
                    setRc(jsonO.getString(key));
                } else if ( "message".equals(key) ) {
                    setMessage(jsonO.optString(key));
                } else if ( "cause".equals(key) ) {
                    setCause(jsonO.optString(key));
                } else if ( "parameters".equals(key) ) {
                    setParameters(jsonO.optJSONObject(key));
                } else if ( "initToken".equals(key) ) {
                    setInitToken(jsonO.getString(key));
                } else if ( "server.time".equals(key) ) {
                    setServerTime(jsonO.getLong(key));
                } else if ( "server.version".equals(key) ) {
                    setServerVersion(jsonO.getString(key));
                } else if ( "robot.wait".equals(key) ) {
                    setRobotWait(jsonO.optLong(key));
                } else if ( "robot.battery".equals(key) ) {
                    setRobotBattery(jsonO.optString(key));
                } else if ( "robot.name".equals(key) ) {
                    setRobotName(jsonO.optString(key));
                } else if ( "robot.version".equals(key) ) {
                    setRobotVersion(jsonO.optString(key));
                } else if ( "robot.firmwareName".equals(key) ) {
                    setRobotFirmwareName(jsonO.optString(key));
                } else if ( "robot.sensorvalues".equals(key) ) {
                    setRobotSensorvalues(jsonO.optJSONObject(key));
                } else if ( "robot.nepoexitvalue".equals(key) ) {
                    setRobotNepoexitvalue(jsonO.optInt(key));
                } else if ( "robot.state".equals(key) ) {
                    setRobotState(jsonO.optString(key));
                } else if ( "notifications.available".equals(key) ) {
                    setNotificationsAvailable(jsonO.optBoolean(key));
                } else if ( "programName".equals(key) ) {
                    setProgramName(jsonO.optString(key));
                } else if ( "progXML".equals(key) ) {
                    setProgXML(jsonO.optString(key));
                } else if ( "confAnnos".equals(key) ) {
                    JSONObject map = jsonO.optJSONObject(key);
                    if ( map != null ) {
                        Iterator<String> it = map.keys();
                        while ( it.hasNext() ) {
                            String subKey = it.next();
                            putConfAnnos(subKey, map.getJSONObject(subKey));
                        }
                    }
                } else if ( "compiledCode".equals(key) ) {
                    setCompiledCode(jsonO.getString(key));
                } else if ( "configuration".equals(key) ) {
                    setConfiguration(jsonO.optJSONObject(key));
                } else {
                    throw new RuntimeException("JSON parse error. Found invalid key: " + key + " in " + jsonO);
                }
            }
            return this;
        } catch ( Exception e ) {
            throw new RuntimeException("JSON parse / casting error when parsing: " + jsonO, e);
        }
    }

    /**
     * moves a bean from state "under construction" to state "immutable".<br>
     * Checks whether all required fields are set. All lists are made immutable.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public ProjectNepoResponse immutable() {
        if ( this.immutable ) {
            return this;
        }
        this.immutable = true;
        return validate();
    }

    /**
     * Checks whether all required fields are set.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    private ProjectNepoResponse validate() {
        String _message = null;
        if ( !this.immutable ) {
            _message = "ProjectNepoResponse-object is already immutable: " + toString();
        }
        if ( rc == null ) {
            _message = "required property rc of ProjectNepoResponse-object is not set: " + toString();
        }
        if ( initToken == null ) {
            _message = "required property initToken of ProjectNepoResponse-object is not set: " + toString();
        }
        if ( !serverTimeDefined ) {
            _message = "required property serverTime of ProjectNepoResponse-object is not set: " + toString();
        }
        if ( serverVersion == null ) {
            _message = "required property serverVersion of ProjectNepoResponse-object is not set: " + toString();
        }
        if ( compiledCode == null ) {
            _message = "required property compiledCode of ProjectNepoResponse-object is not set: " + toString();
        }
        if ( _message != null ) {
            this.immutable = false;
            throw new RuntimeException(_message);
        }
        return this;
    }

    /**
     * GET programName. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getProgramName() {
        if ( !this.immutable ) {
            throw new RuntimeException("no programName from an object under construction: " + toString());
        }
        return this.programName;
    }

    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean programNameDefined() {
        return this.programName != null;
    }

    /**
     * SET programName. Object must be mutable.
     */
    public ProjectNepoResponse setProgramName(String programName) {
        if ( this.immutable ) {
            throw new RuntimeException("programName assigned to an immutable object: " + toString());
        }
        this.programName = programName;
        return this;
    }

    /**
     * GET progXML. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getProgXML() {
        if ( !this.immutable ) {
            throw new RuntimeException("no progXML from an object under construction: " + toString());
        }
        return this.progXML;
    }

    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean progXMLDefined() {
        return this.progXML != null;
    }

    /**
     * SET progXML. Object must be mutable.
     */
    public ProjectNepoResponse setProgXML(String progXML) {
        if ( this.immutable ) {
            throw new RuntimeException("progXML assigned to an immutable object: " + toString());
        }
        this.progXML = progXML;
        return this;
    }

    /**
     * GET confAnnos. Object must be immutable. Never return null or an undefined/default value.
     */
    public Map<String, JSONObject> getConfAnnos() {
        if ( !this.immutable ) {
            throw new RuntimeException("no confAnnos from an object under construction: " + toString());
        }
        return this.confAnnos;
    }

    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean confAnnosDefined() {
        return this.confAnnos != null;
    }

    /**
     * SET confAnnos. Object must be mutable.
     */
    public ProjectNepoResponse setConfAnnos(Map<String, JSONObject> confAnnos) {
        if ( this.immutable ) {
            throw new RuntimeException("confAnnos assigned to an immutable object: " + toString());
        }
        if ( this.confAnnos == null ) {
            this.confAnnos = new HashMap<String, JSONObject>();
        }
        {
            for ( Entry<String, JSONObject> entry : confAnnos.entrySet() ) {
                this.confAnnos.put(entry.getKey(), entry.getValue());
            }
        }
        return this;
    }

    /**
     * PUT confAnnos. Object must be mutable.
     */
    public ProjectNepoResponse putConfAnnos(String key, JSONObject value) {
        if ( this.immutable ) {
            throw new RuntimeException("confAnnos assigned to an immutable object: " + toString());
        }
        if ( this.confAnnos == null ) {
            this.confAnnos = new HashMap<String, JSONObject>();
        }
        this.confAnnos.put(key, value);
        return this;
    }

    /**
     * GET compiledCode. Object must be immutable. Never return null or an undefined/default value.
     */
    public String getCompiledCode() {
        if ( !this.immutable ) {
            throw new RuntimeException("no compiledCode from an object under construction: " + toString());
        }
        return this.compiledCode;
    }

    /**
     * SET compiledCode. Object must be mutable.
     */
    public ProjectNepoResponse setCompiledCode(String compiledCode) {
        if ( this.immutable ) {
            throw new RuntimeException("compiledCode assigned to an immutable object: " + toString());
        }
        this.compiledCode = compiledCode;
        return this;
    }

    /**
     * GET configuration. Object must be immutable. Never return null or an undefined/default value.
     */
    public JSONObject getConfiguration() {
        if ( !this.immutable ) {
            throw new RuntimeException("no configuration from an object under construction: " + toString());
        }
        return this.configuration;
    }

    /**
     * is the property defined? The property maybe undefined as it is not a required property
     *
     * @return true if the property is defined (has been set)
     */
    public boolean configurationDefined() {
        return this.configuration != null;
    }

    /**
     * SET configuration. Object must be mutable.
     */
    public ProjectNepoResponse setConfiguration(JSONObject configuration) {
        if ( this.immutable ) {
            throw new RuntimeException("configuration assigned to an immutable object: " + toString());
        }
        this.configuration = configuration;
        return this;
    }

    /**
     * generates a JSON-object from an immutable bean.<br>
     * Throws a runtime exception if inconsistencies are detected.
     */
    public JSONObject toJson() {
        if ( !this.immutable ) {
            throw new RuntimeException("no JSON from an object under construction: " + toString());
        }
        JSONObject jsonO = new JSONObject();
        try {
            jsonO.put("_version", "1");
            if ( this.cmd != null ) {
                jsonO.put("cmd", this.cmd);
            }
            jsonO.put("rc", this.rc);
            if ( this.message != null ) {
                jsonO.put("message", this.message);
            }
            if ( this.cause != null ) {
                jsonO.put("cause", this.cause);
            }
            if ( this.parameters != null ) {
                jsonO.put("parameters", this.parameters);
            }
            jsonO.put("initToken", this.initToken);
            jsonO.put("server.time", this.serverTime);
            jsonO.put("server.version", this.serverVersion);
            if ( this.robotWaitDefined ) {
                jsonO.put("robot.wait", this.robotWait);
            }
            if ( this.robotBattery != null ) {
                jsonO.put("robot.battery", this.robotBattery);
            }
            if ( this.robotName != null ) {
                jsonO.put("robot.name", this.robotName);
            }
            if ( this.robotVersion != null ) {
                jsonO.put("robot.version", this.robotVersion);
            }
            if ( this.robotFirmwareName != null ) {
                jsonO.put("robot.firmwareName", this.robotFirmwareName);
            }
            if ( this.robotSensorvalues != null ) {
                jsonO.put("robot.sensorvalues", this.robotSensorvalues);
            }
            if ( this.robotNepoexitvalueDefined ) {
                jsonO.put("robot.nepoexitvalue", this.robotNepoexitvalue);
            }
            if ( this.robotState != null ) {
                jsonO.put("robot.state", this.robotState);
            }
            if ( this.notificationsAvailableDefined ) {
                jsonO.put("notifications.available", this.notificationsAvailable);
            }
            if ( this.programName != null ) {
                jsonO.put("programName", this.programName);
            }
            if ( this.progXML != null ) {
                jsonO.put("progXML", this.progXML);
            }
            if ( this.confAnnos != null ) {
                {
                    JSONObject map = new JSONObject();
                    for ( Entry<String, JSONObject> entry : confAnnos.entrySet() ) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                    jsonO.put("confAnnos", map);
                }
            }
            jsonO.put("compiledCode", this.compiledCode);
            if ( this.configuration != null ) {
                jsonO.put("configuration", this.configuration);
            }
        } catch ( JSONException e ) {
            throw new RuntimeException("JSON unparse error when unparsing: " + this, e);
        }
        return jsonO;
    }

    @Override
    public String toString() {
        return "ProjectNepoResponse [immutable=" + this.immutable + ", cmd=" + this.cmd + ", rc=" + this.rc + ", message=" + this.message + ", cause=" + this.cause + ", parameters=" + this.parameters + ", initToken=" + this.initToken + ", serverTime=" + this.serverTime + ", serverVersion=" + this.serverVersion + ", robotWait=" + this.robotWait + ", robotBattery=" + this.robotBattery + ", robotName=" + this.robotName + ", robotVersion=" + this.robotVersion + ", robotFirmwareName=" + this.robotFirmwareName + ", robotSensorvalues=" + this.robotSensorvalues + ", robotNepoexitvalue=" + this.robotNepoexitvalue + ", robotState=" + this.robotState + ", notificationsAvailable=" + this.notificationsAvailable + ", programName=" + this.programName + ", progXML=" + this.progXML + ", confAnnos=" + this.confAnnos + ", compiledCode=" + this.compiledCode + ", configuration=" + this.configuration + " ]";
    }

    @Override
    public int hashCode() {
        throw new RuntimeException("no hashCode from transport beans!");
    }

    @Override
    public boolean equals(Object obj) {
        throw new RuntimeException("no equals from transport beans!");
    }

}
