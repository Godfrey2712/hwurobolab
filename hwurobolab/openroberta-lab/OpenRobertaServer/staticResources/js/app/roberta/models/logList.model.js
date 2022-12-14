/**
 * Rest calls to the server related to program operations (save, delete,
 * share...)
 *
 * @module rest/program
 */
define(["require", "exports", "comm"], function (require, exports, COMM) {
    Object.defineProperty(exports, "__esModule", { value: true });
    exports.loadExampleList = exports.loadProgList = void 0;
    /**
     * Refresh program list
     */
    function loadProgList(successFn) {
        COMM.json('/program/listing/names', {}, successFn, 'load program list');
    }
    exports.loadProgList = loadProgList;
    /**
     * Refresh example list
     */
    function loadExampleList(successFn) {
        COMM.json('/program/examples/names', {}, successFn, 'load example list');
    }
    exports.loadExampleList = loadExampleList;
});
