/**
 * Rest calls to the server related to the robot.
 *
 * @module rest/program
 */
define(["require", "exports", "comm"], function (require, exports, COMM) {
    Object.defineProperty(exports, "__esModule", { value: true });
    exports.setRobot = exports.setToken = exports.updateFirmware = void 0;
    /**
     * Update firmware of the robot.
     *
     */
    function updateFirmware(successFn) {
        COMM.json('/admin/updateFirmware', {
            cmd: 'updateFirmware',
        }, successFn, 'update firmware');
    }
    exports.updateFirmware = updateFirmware;
    /**
     * Set token for paring with the robot.
     *
     * @param token
     *            {String} - token for paring
     */
    function setToken(token, successFn) {
        COMM.json('/admin/setToken', {
            cmd: 'setToken',
            token: token,
        }, successFn, "set token '" + token + "'");
    }
    exports.setToken = setToken;
    /**
     * Set robot type
     *
     * @param robot
     *            {String} - robot type
     */
    function setRobot(robot, successFn) {
        return COMM.json('/admin/setRobot', {
            cmd: 'setRobot',
            robot: robot,
        }, successFn, "set robot '" + robot + "'");
    }
    exports.setRobot = setRobot;
});
